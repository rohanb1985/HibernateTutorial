Output:

May 17, 2020 6:03:54 PM org.hibernate.annotations.common.Version <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {4.0.1.Final}
May 17, 2020 6:03:54 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {4.1.6.Final}
May 17, 2020 6:03:54 PM org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
May 17, 2020 6:03:54 PM org.hibernate.cfg.Environment buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : javassist
May 17, 2020 6:03:54 PM org.hibernate.cfg.Configuration configure
INFO: HHH000043: Configuring from resource: /hibernate.cfg.xml
May 17, 2020 6:03:54 PM org.hibernate.cfg.Configuration getConfigurationInputStream
INFO: HHH000040: Configuration resource: /hibernate.cfg.xml
May 17, 2020 6:03:54 PM org.hibernate.cfg.Configuration doConfigure
INFO: HHH000041: Configured SessionFactory: null
May 17, 2020 6:03:54 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000402: Using Hibernate built-in connection pool (not for production use!)
May 17, 2020 6:03:54 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000115: Hibernate connection pool size: 20
May 17, 2020 6:03:54 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000006: Autocommit mode: false
May 17, 2020 6:03:54 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000401: using driver [com.mysql.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/rohan_test]
May 17, 2020 6:03:54 PM org.hibernate.service.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000046: Connection properties: {user=root, password=****}
May 17, 2020 6:03:54 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
May 17, 2020 6:03:54 PM org.hibernate.engine.transaction.internal.TransactionFactoryInitiator initiateService
INFO: HHH000399: Using default transaction strategy (direct JDBC transactions)
May 17, 2020 6:03:54 PM org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory <init>
INFO: HHH000397: Using ASTQueryTranslatorFactory
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.SchemaUpdate execute
INFO: HHH000228: Running hbm2ddl schema update
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.SchemaUpdate execute
INFO: HHH000102: Fetching database metadata
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.SchemaUpdate execute
INFO: HHH000396: Updating schema
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000261: Table found: rohan_test.laptop
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000037: Columns: [lname, student_rollno, lid]
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000108: Foreign keys: [fk873be1fafd90fe99]
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000126: Indexes: [primary, fk873be1fafd90fe99]
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000261: Table found: rohan_test.student
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000037: Columns: [name, rollno]
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000108: Foreign keys: []
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.TableMetadata <init>
INFO: HHH000126: Indexes: [primary]
May 17, 2020 6:03:56 PM org.hibernate.tool.hbm2ddl.SchemaUpdate execute
INFO: HHH000232: Schema update complete
Hibernate: select student0_.rollNo as rollNo0_1_, student0_.name as name0_1_, laptop1_.student_rollNo as student3_0_3_, laptop1_.lid as lid3_, laptop1_.lid as lid1_0_, laptop1_.lname as lname1_0_, laptop1_.student_rollNo as student3_1_0_ from Student student0_ left outer join Laptop laptop1_ on student0_.rollNo=laptop1_.student_rollNo where student0_.rollNo=?
Student [rollNo=1, name=Tikum]
