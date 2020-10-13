package Collection;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AboutList {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();


        // 基本数据
        list.add(33243);
        list.add(12);
        list.add(55);
        list.add(23);
        list.add(554);


//        // stream流排序
//        // 正序
//        List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
//
//        // 倒序
        List<Integer> list2 = list.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }).collect(Collectors.toList());
//
//
        List<Integer> collect = list.stream().sorted((o1,o2)->{return o2 - o1;}).collect(Collectors.toList());
//
        // stream流过滤元素
        // 取前几个元素
        List<Integer> list3 = list.stream().limit(3).collect(Collectors.toList());

        // 取规定的数据
        List<Integer> list4 = list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (60>integer) {
                    return true;
                }else {
                    return false;
                }
            }
        }).collect(Collectors.toList());


        // 链表list，双向
        LinkedList<Object> link = new LinkedList<>();

        link.add("343");

        link.addFirst("fgfg");


        // 栈
        Stack<Object> objects = new Stack<>();

        objects.push("ddf");
        objects.pop();









        // Collections工具类排序
        // 从小到大
//        Collections.sort(list);
        // 从大到小
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });


        List<Integer> listOther = new ArrayList<>();
        for (Integer i: list){
            if (60>i) {
                listOther.add(i);
            }
        }

//        System.out.println("过滤后的list"+listOther);

//        System.out.println("排序后的list"+list);



//        System.out.println("正序排序后的list1"+list1);
        System.out.println("倒序排序后的list2"+list2);
        System.out.println("倒序排序后的collect"+collect);
//        System.out.println("list3"+list3);
//
//        System.out.println("list4"+list4);
    }
























}
