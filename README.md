# EJB20-JBOSS.EAP.74-example
An simple example of running EJB 2.0 SLSB on JBoss EAP 7.4

Setup steps:
1. Install JBoss EAP 7.4
2. Start JBoss EAP 7.4  
3. Build and deploy using Admin console
4. Add JBoss EAP/bin/client/jboss-client.jar to the project classpath
5. Run JBossTestCalculatorClient

The JNDI naming patterns can be obtained in the admin console: Runtime/JNDI/View/Java Contexts/java:jboss/export
The JNDI name of CalculatorHome is what we should use: demoEJB-1.0-SNAPSHOT/CalculatorEJB!nccu.CalculatorHome
(The full name after java:jboss/exported/)

Add the following xml segment at the end of .m2/settings.xml; if there is no settings.xml, 
you can create one based on the sample in \apache-maven-3.8.3\conf
```xml
<profile>
  <id>jboss-ga-repository</id>
  <repositories>
    <repository>
      <id>jboss-ga-repository</id>
      <url>https://maven.repository.redhat.com/ga/</url>
      <releases>
        <enabled>true</enabled>
      </releases>
      <snapshots>
        <enabled>false</enabled>
      </snapshots>
    </repository>
  </repositories>
  <pluginRepositories>
    <pluginRepository>
      <id>jboss-ga-plugin-repository</id>
      <url>https://maven.repository.redhat.com/ga/</url>
      <releases>
        <enabled>true</enabled>
      </releases>
      <snapshots>
        <enabled>false</enabled>
      </snapshots>
    </pluginRepository>
  </pluginRepositories>   
</profile>
```