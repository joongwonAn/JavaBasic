package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int sumValue = 0;
        for (int value : values) {
            sumValue += value;
        }
        return sumValue;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
