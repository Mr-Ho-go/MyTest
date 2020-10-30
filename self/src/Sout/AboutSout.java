package Sout;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * sout方法解析
 */



public class AboutSout {







    public static void main(String[] args) {


//        //对于int数组，sout方法调用的是println（Object x）方法，打印的是ints的地址值
//        int[] ints =new int[] {1,45,777,8,9,7};
//
//        System.out.println(ints);
//
//        //对于char数组，sout方法调用的是println（char x[]）方法，打印的chars里面的数值
//        char[]  chars = new char[] {'2','3','a','4'};
//
//        System.out.println(chars);
//
//        List<User> list = new ArrayList<>();
//
//        int size = list.size();
////        Integer age = list.get(0).getAge();//索引越界问题
//
//        System.out.println("size" +size);
//


//        Calendar cal= Calendar.getInstance();
//        int y=cal.get(Calendar.YEAR);
//        cal.set(Calendar.MONTH,+1);
//        int m=cal.get(Calendar.MONTH);//实际是4月，但得到的会是3月
//        int d=cal.get(Calendar.DATE);
//        int h=cal.get(Calendar.HOUR_OF_DAY); //24小时制    Calendar.HOUR是12小时制
//        int mi=cal.get(Calendar.MINUTE);
//        int s=cal.get(Calendar.SECOND);
//        System.out.println("现在时刻是"+y+"年"+m+"月"+d+"日"+h+"时"+mi+"分"+s+"秒");


//        Calendar cal = Calendar.getInstance();//获取一个Calendar对象
//        cal.setTime(new Date());
//        int y=cal.get(Calendar.YEAR);
//        int m=cal.get(Calendar.MONTH);  //  cal.get(Calendar.MONTH)获取的是上个月的月份数据
//        System.out.println("上月份是"+m);
//
//        cal.add(Calendar.MONTH, +1);
//        int m2=cal.get(Calendar.MONTH);  //
//        System.out.println("当月月份是"+m2);
//
//        int d=cal.get(Calendar.DATE);
//
//        System.out.println("现在时刻是"+y+"年"+m+"月"+d+"日");



        String s1 = "10";
        String s2 = "09";


        Long aLong = Long.valueOf("1020200922194148545064");

//        System.out.println(s2.compareTo(s1));
//
//        LocalDateTime now = LocalDateTime.now();


        System.out.println(aLong);

    }



















}
