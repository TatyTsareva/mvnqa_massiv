package ru.netology.stats;

public class StatsService {
    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long calculateAverageSale(long[] sales) {
        return calculateTotalSale(sales) / 12;
    }

    public int calculateMonthMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;

            }
        }
        return monthMax + 1;
    }

    public int calculateMonthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;

            }
        }
        return monthMin + 1;
    }

    public int calculateMonthBellowAverage(long[] sales) {
        int resultMin = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                resultMin++;
            }
        }
        return resultMin;
    }

    public int calculateMonthAboveAverage(long[] sales) {
        int resultMin = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                resultMin++;
            }
        }
        return resultMin;
    }
}




