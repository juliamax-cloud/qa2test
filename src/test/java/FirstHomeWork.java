import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class FirstHomeWork {
    @Test
    public void credit() {
        double sum = sumAbDigits(1000,0.2);
        System.out.println(sum);
    }

    private double sumAbDigits(int a, Double b) {
        double c = a + a * b;
        return c;
    }
    
}
