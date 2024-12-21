package com.simplefactory.main;

import com.simplefactory.chart.Chart;
import com.simplefactory.factory.ChartFactory;

public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
