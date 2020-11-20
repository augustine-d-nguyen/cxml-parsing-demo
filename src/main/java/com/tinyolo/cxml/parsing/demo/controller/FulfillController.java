package com.tinyolo.cxml.parsing.demo.controller;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.CXML;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.Header;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.From;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.To;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.Correspondent;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.Contact;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.Credential;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.Extrinsic;
import com.tinyolo.cxml.parsing.demo.jaxb.fulfill.Identity;

@RestController
@RequestMapping(value = "/api/fulfill")
class FulfillController {

    @GetMapping("/info")
    String info() {
      return "Fulfill API v1.0";
    }

    @GetMapping(value = "/ack", produces = MediaType.APPLICATION_XML_VALUE)
    CXML receive() {

        final Contact contact = new Contact();
        contact.setRole("Administration");
        contact.setAddressID("Augustine D. Nguyen");
        contact.setAddressIDDomain("tinyolo.com");

        final Correspondent corr = new Correspondent();
        corr.setPreferredLanguage("en");
        corr.getContact().add(contact);

        final Identity ident = new Identity();
        ident.getContent().add("55665566");

        final Credential cred = new Credential();
        cred.setDomain("88998899");
        cred.setIdentity(ident);

        final From from = new From();
        from.getCredential().add(cred);
        from.setCorrespondent(corr);

        final Header head = new Header();
        head.setFrom(from);

        final CXML ack = new CXML();
        ack.getHeaderOrMessageOrRequestOrResponse().add(head);

        return ack;
    }
}