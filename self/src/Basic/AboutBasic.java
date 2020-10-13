package Basic;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class AboutBasic {

    static int x = 25;

    int y;

    public static void main(String[] args) {


//        Integer a = new Integer(123);
//        Integer b = new Integer(123);

//        System.out.println(a==b);// false


//        Integer x = Integer.valueOf(123);
//        Integer y = Integer.valueOf(123);

//        System.out.println(x==y);// true

//        Integer[] ints = {1,4,67,88};
//
//        String[] str = {"e3","er"};


//        Map<String, String> getenv = System.getenv();
//
//        System.out.println(getenv);


//        List<String> strings = Arrays.asList("23", "11");
//        String[] stt = (String[])strings.toArray();
//        for (String s : stt) {
//            System.out.println(s);
//        }



//
//        String[] strings1 = strings.toArray(new String[strings.size()]);
//
//
//
//        List<Integer> ints1 = Arrays.asList(23,11,34,5665,676);
//
//        Integer[] integers = ints1.toArray(new Integer[ints1.size()]);

//        List<Integer> integers = Arrays.asList(ints);
//        System.out.println(integers.toString());
//
//        List<String> strings1 = Arrays.asList(str);
//        System.out.println(strings1.toString());

//
//        Vector<String> vec = new Vector<>();
//
//        vec.add("etr");


//        int[] in = {1,243,6565,787,898,33};
//
//        System.out.println(Arrays.toString(in));
//
//        List<String> list = new ArrayList<>();
//        List<String> synList = Collections.synchronizedList(list);
//
//
//        CopyOnWriteArrayList<Object> copy = new CopyOnWriteArrayList<>();
//
//        copy.add("dfdf");
//        boolean var1 = copy.contains("ere");


        int a = 19;
        int b = 10;
        add(a,b);

        System.out.println(x);
        System.out.println(a);




    }


    public static void add(int a,int b){
        x = a + b ;
        a = a + b ;


    }













}
