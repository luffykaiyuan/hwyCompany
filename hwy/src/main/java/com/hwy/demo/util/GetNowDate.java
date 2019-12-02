package com.hwy.demo.util;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class GetNowDate {
    //获取字符串类型的当前时间
    public static String getStringDate() {
        Date date = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    //获取时间类型的  当前时间
    public static Date getDate() {
        Date date = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(sdf.format(date));
            return date;
        } catch (Exception e) {
            return date;
        }
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("当前时间：" + new Date().toLocaleString());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println("当天0点时间：" + sdf.format(getNowDayStart()));
//		System.out.println("当天24点时间：" + sdf.format(getNowDayEnd()));
//		System.out.println("本周周一0点时间：" + sdf.format(getWeekStart()));
//		System.out.println("本周周日24点时间：" + sdf.format(getWeekEnd()));
//		System.out.println("本月初0点时间：" + sdf.format(getMonthStart()));
//		System.out.println("本月未24点时间：" + sdf.format(getMonthEnd()));
//		System.out.println("本季度开始时间：" + sdf.format(getCurrentQuarterStart()));
//		System.out.println("本季度截止时间：" + sdf.format(getCurrentQuarterEnd()));
//	}

    // 获得当天0点时间
    public String getNowDayStart() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    // 获得当天24点时间
    public String getNowDayEnd() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 24);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    // 获得本周一0点时间
    public String getWeekStart() {
        Calendar cal = Calendar.getInstance();
        int day_of_week = cal.get(Calendar. DAY_OF_WEEK) - 1;
        if (day_of_week == 0 ) {
            day_of_week = 7 ;
        }
        cal.add(Calendar.DATE , -day_of_week + 1 );
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    // 获得本周日24点时间
    public String getWeekEnd() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(sdf.parse(getWeekStart()));
            cal.add(Calendar.DAY_OF_WEEK, 7);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sdf.format(cal.getTime());
    }

    // 获得本月第一天0点时间
    public String getMonthStart() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    // 获得本月最后一天24点时间
    public String getMonthEnd() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 24);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    //	获取本季度开始时间
    public String getCurrentQuarterStart() {
        Calendar c = Calendar.getInstance();
        int currentMonth = c.get(Calendar.MONTH) + 1;
        SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = null;
        try {
            if (currentMonth >= 1 && currentMonth <= 3)
                c.set(Calendar.MONTH, 0);
            else if (currentMonth >= 4 && currentMonth <= 6)
                c.set(Calendar.MONTH, 3);
            else if (currentMonth >= 7 && currentMonth <= 9)
                c.set(Calendar.MONTH, 4);
            else if (currentMonth >= 10 && currentMonth <= 12)
                c.set(Calendar.MONTH, 9);
            c.set(Calendar.DATE, 1);
            now = longSdf.parse(shortSdf.format(c.getTime()) + " 00:00:00");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shortSdf.format(now);
    }

    // 获取本季度结束时间
    public String getCurrentQuarterEnd() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(sdf.parse(getCurrentQuarterStart()));
            cal.add(Calendar.MONTH, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sdf.format(cal.getTime());
    }

}
