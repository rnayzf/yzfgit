package org.yzf.helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GetDateYMD {
    public Map<String ,String > getYmd(String beginDate, String endDate) throws ParseException {
    Date dt=randomDate(beginDate,endDate);
    String year=String.format("%tY", dt);
    String mon=String .format("%tm", dt);
    String day=String .format("%td", dt);
    String h=String .format("%tH", dt);
    String m=String .format("%tM", dt);
    String s=String .format("%tS", dt);
    Map<String ,String > sdate =new HashMap<String, String>() ;
    String date = year+mon+day;
    String time = h+m+s ;
    sdate.put("date",date);
    sdate.put("time",time);
    return sdate;
}
    public static Date randomDate(String beginDate,String  endDate ) throws ParseException {
        //时间格式化
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //定义开始时间
        Date start = format.parse(beginDate);
        //定义结束时间
        Date end = format.parse(endDate);
        if(start.getTime() >= end.getTime()){
            return null;
        }
        long date = random(start.getTime(),end.getTime());
        return new Date(date);
    }
    private static long random(long begin,long end){

        long rtn = begin + (long)(Math.random() * (end - begin));
        //如果返回的是开始时间和结束时间，通过递归调用本函数查找随机值
        if(rtn == begin || rtn == end){
            return random(begin,end);
        }
        return rtn;
    }
}
