Output:

May 17, 2020 5:26:45 PM org.hibernate.annotations.common.Version <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {4.0.1.Final}
May 17, 2020 5:26:45 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {4.1.6.Final}
May 17, 2020 5:26:45 PM org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
May 17, 2020 5:26:45 PM org.hibernate.cfg.Environment buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : javassist
May 17, 2020 5:26:45 PM org.hibernate.cfg.Configuration configure
INFO: HHH000043: Configuring from resource: /hibernate.cfg.xml
May 17, 2020 5:26:45 PM org.hibernate.cfg.Configuration getConfigurationInputStream
INFO: HHH000040: Configuration resource: /hibernate.cfg.xml
May 17, 2020 5:26:45 PM org.hibernate.cfg.Configuration doConfigure
INFO: HHH000041: Configured SessionFactory: null
May 17, 2020 5:26:45 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000402: Using Hibernate built-in connection pool (not for production use!)
May 17, 2020 5:26:45 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000115: Hibernate connection pool size: 20
May 17, 2020 5:26:45 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000006: Autocommit mode: false
May 17, 2020 5:26:45 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000401: using driver [com.mysql.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/rohan_test]
May 17, 2020 5:26:45 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000046: Connection properties: {user=root, password=****}
May 17, 2020 5:26:45 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
May 17, 2020 5:26:45 PM org.hibernate.engine.transaction.internal.TransactionFactoryInitiator initiateService
INFO: HHH000399: Using default transaction strategy (direct JDBC transactions)
May 17, 2020 5:26:45 PM org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory <init>
INFO: HHH000397: Using ASTQueryTranslatorFactory
May 17, 2020 5:26:47 PM org.hibernate.tool.hbm2ddl.SchemaExport execute
INFO: HHH000227: Running hbm2ddl schema export
Hibernate: alter table Laptop drop foreign key FK873BE1FAFD90FE99
May 17, 2020 5:26:47 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Laptop drop foreign key FK873BE1FAFD90FE99
May 17, 2020 5:26:47 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: Table 'rohan_test.laptop' doesn't exist
Hibernate: drop table if exists Laptop
Hibernate: drop table if exists Student
Hibernate: create table Laptop (lid integer not null, lname varchar(255), student_rollNo integer, primary key (lid))
Hibernate: create table Student (rollNo integer not null, name varchar(255), primary key (rollNo))
Hibernate: alter table Laptop add index FK873BE1FAFD90FE99 (student_rollNo), add constraint FK873BE1FAFD90FE99 foreign key (student_rollNo) references Student (rollNo)
May 17, 2020 5:26:47 PM org.hibernate.tool.hbm2ddl.SchemaExport execute
INFO: HHH000230: Schema export complete
Hibernate: insert into Laptop (lname, student_rollNo, lid) values (?, ?, ?)
Hibernate: insert into Student (name, rollNo) values (?, ?)
