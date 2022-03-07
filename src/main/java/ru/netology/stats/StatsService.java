package ru.netology.stats;

public class StatsService {
    // Сумма всех продаж
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц

    public long calculateAvg(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)

    public long namberMaxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)

    public long namberMinMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }
    //Кол-во месяцев, в которых продажи были ниже среднего

    public long countMonthSalesLessAvg(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < calculateAvg(sales)) {
                month += 1;

            }

        }
        return month;
    }
    //Кол-во месяцев, в которых продажи были выше среднего

    public long countMonthSalesOverAvg(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > calculateAvg(sales)) {
                month += 1;

            }

        }
        return month;
    }

}
