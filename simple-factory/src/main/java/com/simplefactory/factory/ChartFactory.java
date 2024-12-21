package com.simplefactory.factory;

import com.simplefactory.chart.Chart;
import com.simplefactory.impl.HistogramChart;
import com.simplefactory.impl.LineChart;
import com.simplefactory.impl.PieChart;

public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")){
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置柱状图");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
