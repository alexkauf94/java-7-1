package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSales = 0;

        for (long sale : sales) {
            totalSales += sale;
        }

        return totalSales;
    }

    public long average(long[] sales) {
        long totalSales = 0;

        for (long sale : sales) {
            totalSales += sale;
        }

        long averageSale = totalSales / sales.length;

        return averageSale;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }

        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int num = 0;

        long averageSale =  average(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                num++;
            }


        }

        return num;
    }

    public int monthsAboveAverage(long[] sales) {
        int num = 0;

        long averageSale =  average(sales);

        for (long sale : sales) {
            if (sale > averageSale) {
                num++;
            }


        }

        return num;
    }

}
