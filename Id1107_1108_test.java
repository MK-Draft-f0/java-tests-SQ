class Id1107_1108_test {
    boolean something = true;
    boolean somethingElse = true;
  
  public void myMethod() {
    if(something) {
      executeTask();
    } 
    else if (somethingElse) {
      doSomethingElse();
    } else {
       generateError();
    }

    try {
      generateOrder();
    } catch (Exception e) {
      log(e);
    } finally {
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
