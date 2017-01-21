# spring-mybatis-combine

a demo of the combination use of spring, mybatis and mysql.

## Usage

1\. clone the source code:

```shell
git clone https://github.com/xitongjiagoushi/spring-mybatis-combine.git
$ cd spring-mybatis-combine
```

2\. install and run [MySQL](https://www.mysql.com)(omitted here), create the database use db.sql:

```shell
$ mysql -p < db.sql
```

3\. import the source code to your IDE as a maven project, or just use maven to pack:

```shell
mvn package -Plocal
```

4\. deploy the .war package in your web container, here we use [Tomcat](http://tomcat.apache.org/) and default configuration:

```shell
curl http://localhost:8080/spring-mybatis-combine/article/all
```


## TODO List
- [ ] Basic CRUD API

## Any Problems
[mail to me](mailto:root@brctl.com)
