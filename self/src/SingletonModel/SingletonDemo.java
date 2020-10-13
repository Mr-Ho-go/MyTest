package SingletonModel;

public class SingletonDemo {


    public static void main(String[] args) {

//        SingleObject singleObject = new SingleObject();


        SingleObject singleObject = SingleObject.getInstance();


//        singleObject.showMessage();

        SingleObject instance1 = SingleObject.getInstance1();

        instance1.showMessage();

    }








}
