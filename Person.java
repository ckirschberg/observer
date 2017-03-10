public class Person extends Observable
  implements Observer {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public void postTweet(String msg) {
    System.out.println(name + ": " + msg);
    notifyObservers(msg);
  }

  public void myNotify(String msg) {
    System.out.println(name + " was notified: " + msg);
  }
}