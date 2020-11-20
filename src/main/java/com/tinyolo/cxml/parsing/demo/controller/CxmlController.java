package com.tinyolo.cxml.parsing.demo.controller;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinyolo.cxml.parsing.demo.jaxb.cxml.CXML;
import com.tinyolo.cxml.parsing.demo.jaxb.cxml.Header;
import com.tinyolo.cxml.parsing.demo.jaxb.cxml.From;
import com.tinyolo.cxml.parsing.demo.jaxb.cxml.Credential;

@RestController
@RequestMapping(value = "/api/cxml")
class CxmlController {

    @GetMapping("/info")
    String info() {
      return "CXML API v1.0";
    }

    @PostMapping(value = "/po", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Map<String, Object> receive(@RequestBody CXML po) {
        final Map<String, Object> result = new HashMap<String, Object>();
        result.put("message", "Received a PO with some info");

        final List<Object> contents = po.getHeaderOrMessageOrRequestOrResponse();
        if (null != contents) {
            contents.forEach(content -> {
                if (Header.class.isInstance(content)) {
                    final Header header = Header.class.cast(content);
                    final From from = header.getFrom();
                    final List<Credential> credentials = from.getCredential();

                    if (null != credentials) {
                        credentials.forEach(cre -> {
                            result.put("header.from.credential.domain", cre.getDomain());
                            result.put("header.from.credential.identity", cre.getIdentity().getContent());
                        });
                    }
                }
            });
        }

        return result;
    }
}