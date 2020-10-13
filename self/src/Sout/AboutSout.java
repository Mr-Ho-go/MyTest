package Sout;

import java.util.ArrayList;
import java.util.List;

/**
 * sout方法解析
 */



public class AboutSout {







    public static void main(String[] args) {


        //对于int数组，sout方法调用的是println（Object x）方法，打印的是ints的地址值
        int[] ints =new int[] {1,45,777,8,9,7};

        System.out.println(ints);

        //对于char数组，sout方法调用的是println（char x[]）方法，打印的chars里面的数值
        char[]  chars = new char[] {'2','3','a','4'};

        System.out.println(chars);

        List<User> list = new ArrayList<>();

        int size = list.size();
//        Integer age = list.get(0).getAge();//索引越界问题

        System.out.println("size" +size);

    }



















}
