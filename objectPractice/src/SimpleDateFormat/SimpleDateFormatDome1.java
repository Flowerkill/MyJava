package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatDome1 {


    public static void main(String[] args) throws ParseException {
        //一元秒杀活动
        //判断 2023年11月11日 0:11:0 有没有秒杀成功


//        定义要解析的字符串
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:11:0";
        //解析

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf1.parse(startStr);
        Date endStrDate = sdf1.parse(endStr);
        Date orderStrDate = sdf1.parse(orderStr);
        long startTime = startDate.getTime();
        long endTime = endStrDate.getTime();
        long orderTime = orderStrDate.getTime();
        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("秒杀成功");
        } else {
            System.out.println("秒杀失败");
        }


    }
}
