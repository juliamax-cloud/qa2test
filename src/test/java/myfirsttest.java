import org.junit.jupiter.api.Test;

public class myfirsttest {
    @Test
    public void firsttest() {
        System.out.println("Hello corona!");

        int sum = sumTwoDigits(15,45);
        System.out.println(sum);
        System.out.println(sumTwoDigits(9,13));
    }
    private int sumTwoDigits(int a, int b) {
      int c = a + b;
      return c;
    }
}
