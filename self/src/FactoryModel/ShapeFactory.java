package FactoryModel;

public class ShapeFactory {



    public Shape getShapeInstance(String shapeName){


        if (null== shapeName || "".equals(shapeName)){

            return null;
        }

        if (shapeName.equalsIgnoreCase("shapeA")){

            return new ShapeA();

        }else if (shapeName.equalsIgnoreCase("shapeB")) {

            return new ShapeB();

        }else if (shapeName.equalsIgnoreCase("shapeC")) {

            return new ShapeC();

        }

        return null;

    }


    public static Object getObjInstance(Class clazz) {

        Object obj = null;

        try {

            obj = Class.forName(clazz.getName()).newInstance();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


        return obj;

    }


}
