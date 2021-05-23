2021-05-23
## SOAP - SIMPLE OBJECT ACCESS PROTOCOL
The main idea: ensure __programs built on different platforms and programming languages could exchange data__ in an easy manner.
- SOAP was designed with specification.
- Is an XML-based protocol that lets you exchange info over a particular protocol (can be HTTP or SMTP, for example) between applications.
- It includes a __WSDL Web Services Description Language.__ file which has the required information on what the web service does in addition to the location of the web service. The WSDL file provides the client with the necessary information which can be used to understand what services the web service can offer.
- _WSDL is an XML format for __describing network services as a set of endpoints operating on messages__ containing either document-oriented or procedure-oriented information._ The operations and messages are described abstractly, and then bound to a concrete network protocol and message format to define an endpoint. Related concrete endpoints are combined into abstract endpoints (services). WSDL is extensible to allow description of endpoints and their messages regardless of what message formats or network protocols are used to communicate, however, the only bindings described in this document describe how to use WSDL in conjunction with SOAP 1.1, HTTP GET/POST, and MIME.

_Compare to: REST is an architecture style of networked systems. REST is not a standard itself, but does use standards such as HTML, URL, XML_

## References
- [Producing a SOAP web service with SPRING](https://spring.io/guides/gs/producing-web-service/)
- [Consuming a SOAP web service with SPRING](https://spring.io/guides/gs/consuming-web-service/#initial)