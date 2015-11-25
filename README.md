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
<appender name="asyncFugueLog" class="ch.qos.logback.classic.AsyncAppender">
    <appender-ref ref="debugLog" />
    <includeCallerData>true</includeCallerData>
  </appender>
  
  <appender name="fugueLog" class="dale.is.awesome.fugueback.appender.FugueAppender">
  <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
    <level>TRACE</level>
  </filter>
  <composer>Dale</composer>
</appender>

  <root level="debug">
    <appender-ref ref="errorLog" />
    <appender-ref ref="asyncDebugLog" />
    <appender-ref ref="asyncFugueLog" />
  
