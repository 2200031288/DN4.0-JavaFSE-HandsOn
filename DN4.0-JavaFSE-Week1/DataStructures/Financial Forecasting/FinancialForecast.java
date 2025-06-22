package week1;

public class FinancialForecast {

    public static double calculateMovingAverage(int[] sales, int window) {
        if (sales.length < window) {
            System.out.println("Not enough data points.");
            return 0;
        }

        int sum = 0;
        for (int i = sales.length - window; i < sales.length; i++) {
            sum += sales[i];
        }

        return (double) sum / window;
    }

    public static void main(String[] args) {
        int[] sales = {120, 150, 170, 200, 250}; // Example sales data (last 5 days)
        int window = 3; // Use last 3 days for SMA

        double forecast = calculateMovingAverage(sales, window);
        System.out.printf("📈 Forecasted average for next day: %.2f\n", forecast);
    }
}
