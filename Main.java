public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("Rasmus");
    Person p2 = new Person("Minh");
    Person p3 = new Person("Nikolay");

    p2.addObserver(p1);
    p2.addObserver(p3);

    p1.addObserver(p2);

    p3.postTweet("I am hungry");
    p2.postTweet("Let's take a look at e2e testing!'");
  }
}