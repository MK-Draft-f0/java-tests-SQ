public class Id1108_nc {
    boolean something = true;
    boolean somethingElse = true;

    public void myMethod() {
        if(something) {
          executeTask();
        } else if (somethingElse) {          // Noncompliant
          doSomethingElse();
        }
        else {                               // Compliant
           generateError();
        }
      
        try {
          generateOrder();
        } catch (Exception e) {
          log(e);
        }
        finally {
          closeConnection();
        }
      }

    public void executeTask() { /* */ }
    public void doSomethingElse() { /* */ }
    public void generateError() { /* */ }
    public void generateOrder() { /* */ }
    public void closeConnection() { /* */ }
    public void log(Exception e) { /* */ }   
}
