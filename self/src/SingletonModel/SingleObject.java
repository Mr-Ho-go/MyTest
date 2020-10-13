package SingletonModel;

public class SingleObject {


    private static SingleObject instance = new SingleObject();

    private static SingleObject instance1;

    private SingleObject(){

    }

    // 饿汉式
    public static SingleObject getInstance(){
        return instance;
    }


    // 懒汉式
    public static SingleObject getInstance1(){
        if (null == instance1){
            instance1 = new SingleObject();
        }
        return instance1;
    }


    public void showMessage(){
        System.out.println("show message///////");
    }






}
