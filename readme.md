#ssh整合
##基本步骤
* 1.基本目录  
---src  
   &emsp;---main  
      &emsp;&emsp;---java  
      &emsp;&emsp;---resources  
      &emsp;&emsp;---webapp  
   &emsp;---test  
---pom.xml

* 2.pom.xml配置  
spring核心依赖  
hibernate依赖  
mysql依赖  
druid阿里连接池
jackjson
commons-fileupload  
以上依赖均必须,否则配置文件会找不到相关的类


* 3.spring,springmvc,hibernate配置与整合  
---spring.xml:核心配置文件,与spring-mybatis.xml搭配,这里扫描service层  
---spring-mvc.xml:控制层配置,扫描controller层  
---spring-hibernate.xml:配置数据库  




