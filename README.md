Support Mybatis version >= 3.1

Basic usage -->  [here](https://github.com/miemiedev/mybatis-paginator/blob/master/src/test/java/com/github/miemiedev/mybatis/paginator/PaginatorTester.java)

Plugin config -->  [here](https://github.com/miemiedev/mybatis-paginator/blob/master/src/test/resources/mybatis-config.xml)

Use in Spring+Mybatis -->  [spring-mybaits-template](https://github.com/miemiedev/spring-mybaits-template)

BTW： [中文文档](http://my.oschina.net/miemiedev/blog/135516)

Downloading from the Maven central repository
```xml
<dependencies>
  ...
    <dependency>
        <groupId>com.github.miemiedev</groupId>
        <artifactId>mybatis-paginator</artifactId>
        <version>1.2.17</version>
    </dependency>
 ...
</dependencies>
```


Thanks for [rapid-framework](https://code.google.com/p/rapid-framework) and [plum](https://github.com/yfyang/plum) author.

+ 解决了未设置分页数或者设置最大分页数为Integer.MAX_VALUE时，返回PageList的paginator为null的问题
+ jdk版本设定到1.8
