# Connection Pool

<i>A connection pool <b>is a cache of database connections maintained</b> so that the connections can be <b>reused</b> when future requests to the database are required.
</i>
Connection pools are used to enhance the performance of executing commands on a database.
Opening and maintaining a database connection for each user, especially requests made to a dynamic database-driven website application, is costly and wastes resources. In connection pooling, after a connection is created, it is placed in the pool and it is used again so that a new connection does not have to be established.
If all the connections are being used, a new connection is made and is added to the pool. Connection pooling also cuts down on the amount of time a user must wait to establish a connection to the database.

<b>JDBC Connection Pooling</b>

Database connection life cycle:
- Opening a connection to the database using the database driver.
- Opening a TCP socket or reading/writing data
- Reading/writing data over the socket
- Closing the connection
- Closing the socket
To facilitate connection reuse, a memory cache of database connections, called a connection pool, is maintained by a connection pooling module as a layer on top of any standard JDBC driver product.
Connection pooling is performed in the background and does not affect how an application is coded; however, the application must use a DataSource object (an object implementing the DataSource interface) to obtain a connection instead of using the DriverManager class. A class implementing the DataSource interface may or may not provide connection pooling. A DataSource object registers with a JNDI naming service. Once a DataSource object is registered, the application retrieves it from the JNDI naming service in the standard way.

Source
- https://www.progress.com/tutorials/jdbc/jdbc-jdbc-connection-pooling#:~:text=Connection%20pooling%20means%20that%20connections,any%20standard%20JDBC%20driver%20product.