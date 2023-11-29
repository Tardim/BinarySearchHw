public class Main {
    public static void main(String[] args) {
      SearchTree test = new SearchTree();
      test.add(11);
      test.add(27);
      test.add(31);
      test.add(15);
      test.add(23);
      test.add(51);
      test.add(24);

      test.printInOrder();
    }
}