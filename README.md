# fugueback
Musical logback log files


Add dependency
```xml
  <dependency>
        <groupId>dale.is.awesome</groupId>
        <artifactId>fugueback</artifactId>
        <version>1.0-SNAPSHOT</version>
      </dependency>
      
      <dependency>
```
Add Appender in Logback xml
```xml
<appender name="fugueLog" class="dale.is.awesome.fugueback.appender.FugueAppender">
  <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
    <level>TRACE</level>
  </filter>
  <composer>Rachmaninoff</composer>
</appender>
  
