package functionTest;

import static org.junit.Assert.assertEquals;
import static java.lang.Float.NaN;

import org.junit.Test;
import function.FunctionSinUtil;

import java.util.HashMap;
import java.util.Map;

public class FunctionSinUtilTest {

    // sin(0)
    @Test
    public void testSinZero() {
        double val = 0;
        double expected = Math.sin(val);
        double actual = FunctionSinUtil.sin(val);
        assertEquals(expected, actual, FunctionSinUtil.PRECISION);
    }

    // для значений угла, выходящих за пределы [-π, π]
    @Test
    public void testSinOutOfRange() {
        double val = Math.PI * 2;
        double actual = FunctionSinUtil.sin(val);
        assertEquals(NaN, actual, FunctionSinUtil.PRECISION);
    }

    // для угла в пределах [-π, π]
    @Test
    public void testSinPrecision() {
        HashMap<Double, Double> arrayTestValues = new HashMap<>();

        // 1 и 4 квадранты
        arrayTestValues.put(Math.PI / 6, 0.5);
        arrayTestValues.put(Math.PI / 4, Math.sqrt(2) / 2);
        arrayTestValues.put(Math.PI / 3, Math.sqrt(3) / 2);
        arrayTestValues.put(Math.PI / 2, 1d);
        arrayTestValues.put(2*Math.PI / 3, Math.sqrt(3) / 2);
        arrayTestValues.put(3* Math.PI / 4, Math.sqrt(2) / 2);
        arrayTestValues.put(5*Math.PI / 6, 0.5);

        // 2 и 3 квадранты
        arrayTestValues.put(-Math.PI / 6, -0.5);
        arrayTestValues.put(-Math.PI / 4, -Math.sqrt(2) / 2);
        arrayTestValues.put(-Math.PI / 3, -Math.sqrt(3) / 2);
        arrayTestValues.put(-Math.PI / 2, -1d);
        arrayTestValues.put(-2*Math.PI / 3, -Math.sqrt(3) / 2);
        arrayTestValues.put(-3* Math.PI / 4, -Math.sqrt(2) / 2);
        arrayTestValues.put(-5*Math.PI / 6, -0.5);

        // граничные значения
        arrayTestValues.put(-Math.PI, 0d);
        arrayTestValues.put(Math.PI, 0d);

        double expected, actual;
        for (Map.Entry<Double, Double> entry : arrayTestValues.entrySet()) {
            expected = entry.getValue();
            actual = FunctionSinUtil.sin(entry.getKey());
            assertEquals(expected, actual, FunctionSinUtil.PRECISION);
        }
    }

}
