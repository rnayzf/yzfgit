package org.yzf.helloworld;

import com.fasterxml.jackson.datatype.jsr310.deser.key.LocalDateKeyDeserializer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) throws ParseException {
        String beginDate = "2020-01-01";
        String endDate = "2020-03-01";
        int opcount = 100;


        GetDateYMD ymd = new GetDateYMD();
        Map<String, String> dt = ymd.getYmd(beginDate, endDate);
        System.out.println("transdate：" + dt.get("date"));
        System.out.println("transtime：" + "000" + dt.get("time"));
        String time = dt.get("time");
        Integer seqno = Integer.valueOf(time).intValue();

        for (int i = 0; i < opcount; i++) {
            Map<String, String> dt1 = ymd.getYmd(beginDate, endDate);
            int amt =(int)(10000000+Math.random()*(100000000-1+1));
            System.out.println("[" + dt1.get("date") + "] " + "[" + String.format("%09d", (seqno++)) + "] "+ "["+String.valueOf(amt)+"]");

        }


    }
}



