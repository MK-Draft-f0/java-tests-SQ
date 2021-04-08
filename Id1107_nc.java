class Id1107_nc {
    boolean something = true;
    boolean somethingElse = true;

  public void myMethod1107nc() {
    if(something) {
      executeTask();
    } else if (somethingElse) {
      doSomethingElse();
    }
    else {                               // Noncompliant
       generateError();
    }

    try {
      generateOrder();
    } catch (Exception e) {
      log(e);
    }
    finally {                            // Noncompliant
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
