public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long max = 0;
        long min = 1;
        long average = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] <= min) {
                min = sales[i];
            }
            average += sales[i];
        }
        average -= (max + min);
        average = average / (sales.length - 2);
        return average;
    }
}
}
