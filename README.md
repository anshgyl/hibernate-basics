# Hibernate Basics Tutorial

## Setting Up

The project in configured to work with both ```hibernate.properties``` and ```hibernate.cfg.xml```.

Kindly update your database properties in the respective file which can be located at ```/src/main/resources```

By default the Application is configured to work with ```hibernate.properties```, if you wish to use ```hibernate.cfg.xml``` kindly uncomment ```configuration.configure();``` (Line 20) in ```com.anshgyl.util.SessionUtil```

## Dependencies (Maven)

### MySQL Connector
```
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.18</version>
</dependency>
```

### Hibernate
```
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.5.Final</version>
</dependency>
```

## References
* https://github.com/hibernate/hibernate-orm/tree/master/etc
* https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/session-configuration.html

