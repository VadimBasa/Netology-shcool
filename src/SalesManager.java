public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int max = 0;
        int min = 1;
        int average = 0;
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
