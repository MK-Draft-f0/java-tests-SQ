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
