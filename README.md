# Getting Started

### Environment
* OpenJDK 1.8.0_265
* Maven 3.6.3

### Configurations
* Change package of generated classes in xjb file

### Commands
* Generate jaxb mapping classes for cXML.dtd: **mvn clean jaxb2:xjc -Pcxml**
* Generate jaxb mapping classes for Fulfill.dtd: **mvn clean jaxb2:xjc -Pfulfill**
* Run: **mvn clean spring-boot:run**

### APIs
* POST http://localhost:8080/api/cxml/po
* GET http://localhost:8080/api/fulfill/ack

