# SPRING CLOUD

_This notes from the course [Microservice](https://www.linkedin.com/learning/microservices-foundations) and [Spring cloud](https://www.linkedin.com/learning/microservices-foundations)_

## Microservice

### History of service-based architectures

1. Monolithic application
   - tightly coupling cause code issues
   - offen package deployments for large J2EE application servers using EAR files
   - agility and maintainability and scalibility suffer dramatically
2. SOA
   - services are designed to communicate with each other across different languages and platforms using a strategy called loose coupling
   - use enterprise service bus (ESB) to communicate between the different services
3. Microservices
   - Make the architecture at a component level
   - decompose the problem into smaller problems
   - All communication between individual services in a microservices architecture is over HTTP using ReST based services
   - distribution tax: the cost associated with remote calls for most operations in microservices architectures

### Core concepts

- polyglot development support
- Protocol-aware Heterogeneous Interoperability services are bound to a protocol and execute communication over that protocol in a way that works in a mixed, or heterogeneous environment
- Distribution: each service is accessed over remote network call, regardless of being in a local or remote data center
- Bounded contexts
  - Core concept is investigate working system and determine the domains → break services up accordingly
  - helps to reduce cross-domain calls where appropriate
- Asynchronous communication: event-driven microservices is one of a way to support.
  - Stream data platform: events is written to a central message broker. These events then trigger listener operations that take action on that data if it applies to them
- Logging and tracing
  - is more challenging in MS because of larger volume of artifacts and different teams (different logging strategies)
  - log aggregators:
  - tracing: is based of the concept of creating a unique token, called a trace, and using that trace in all internal logging events for that call stacks. Each service uses the trace, and then passes it downstream to all of the service calls it makes
- Design consideration

  - CI/CD should be the first aspects of design (achieve agility )
  - Logging and tracing should be the second aspect
  - Control latency

  | Strengths                                                                                                                                                                                                                                                                                                                                                                                                                                         | Challenges                                                                                                                                                                                                                  |
  | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | **agility** : each team can build the services in a language native to them, then expose those services for others to consume using ReST → but problems since each service can call any other services, there’s no clear delineation of who is calling you → so each service must maintain a certain level of passivity of their APIs or there’s risk of system failure. Could have a solid versioning strategy along with strong passivity rules | **latency**: every service invocation in microservice architecture is over remote network call. there’s connection setup, tear down and wire latency on every single call → can cause gridlock → build with strong timeouts |
  |                                                                                                                                                                                                                                                                                                                                                                                                                                                   | **Data transaction**: No ACID. In microservices embrace BASE and strive for eventual consistency, aim for a situation where, eventually achieve the end state in all nodes of the distributed datastore                     |

## Terminologies

1. EAR, JAR, WAR files
   - .ear extension for Java EE-based enterprise applications. It’s required a fully Java Platform, Java EE or Jakata Enterprise Edition and must have an application.xml file within a folder named META-INF
   - .war for web applications. It requires a Java EE Web Profile-compliant application server to run, and a web.xml file contained within a WEB-INF
   - .jar for stand-alone Java applications and linkable libraries. It only requires a Java installation
2. Twelve-factor methodologies
3. ACID

   - Atomic either succeeds completely or fails completely
   - Consistent: constraints of underlying datastore are enforced
   - Isolated cannot be read by other transactions until in a specific state based on isolation rules
   - Durable: once saved, guranteed to be in the datastore permanently until modified
   - → help to guarantee of states
4. Edge services

