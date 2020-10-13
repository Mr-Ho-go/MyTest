package Collection;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AboutMap extends HashMap {


    public static <MultiValueMap> void main(String[] args) {


        HashMap<String,String> map = new HashMap<>();

        map.put("12","e8");
        map.put("1","e2");
        map.put("122","e5");
        map.put("1212","e7");
        map.put("132","e6");
        map.put("152","e8");

        // Stream流应用
        Set<Entry<String, String>> entries = map.entrySet();
//        List<Entry<String, String>> collect = entries.stream().sorted().collect(Collectors.toList());





//        System.out.println("============"+collect1);

//        System.out.println("============"+entries);


//        Hashtable table = new Hashtable<>();

        // hashTable的value为null会有空指针异常抛出
//        table.put(null,null);
//        table.put(null,"null");
//        table.put("", "");

//        // hashMap 允许出现null的Key和Val
//        map.put(null,null);
//        // hashMap 允许出现空串的Key和Val
//        map.put("","");
//
//        map.put("1",1);
//
//        String s = "wang";
//        int i = s.hashCode();
//        int h;
//        int h1;
//        int h2;
//        h1 = s.hashCode();
//        h2 = h1 >>> 16;
//        h = h1 ^ h2;


        // IdentityHashMap特点
//        IdentityHashMap<String, Integer> map1 = new IdentityHashMap<>();

//        map1.put("11",12);
//        map1.put("11",121);
//
//        Integer i = map1.get("11");
//        System.out.println("============"+i);
//        String str1 = "key";
//        String str2 = "key";
//        System.out.println(str1 == str2);
//        Map<String,String> map = new IdentityHashMap<>();
//        map.put(str1,"value1");
//        map.put(str2,"value2");
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"  "+entry.getValue());
//        }
//        System.out.println("containsKey---->"+map1.get("key"));
//        System.out.println("value---->"+map.get("key"));


//        String str1 = new String("key");
//        String str2 = new String("key");
//        System.out.println(str1 == str2);
//        Map<String, String> map = new IdentityHashMap<>();
//        map.put(str1,"value1");
//        map.put(str2,"value2");
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"  "+entry.getValue());
//        }
//        System.out.println("\"key\" containKey--->"+map.containsKey("key"));
//        System.out.println("str1 containKey--->"+map.containsKey(str1));
//        System.out.println("str2 containKey--->"+map.containsKey(str2));
//        System.out.println("value--->"+map.get("key"));
//        System.out.println("value--->"+map.get(str1));
//        System.out.println("value--->"+map.get(str2));















    }



}
