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