package FactoryModel;

public class AboutDesignModel {


    public static void main(String[] args) {

        // 设计模式---->工厂模式

//        ShapeFactory shapeFactory = new ShapeFactory();
//
//        Shape shapeA = shapeFactory.getShapeInstance("shapeA");
//        shapeA.draw();
//        Shape shapeB = shapeFactory.getShapeInstance("shapeB");
//        shapeB.draw();
//        Shape shapeC = shapeFactory.getShapeInstance("shapeC");
//        shapeC.draw();

        ShapeA shapeA1 = (ShapeA) ShapeFactory.getObjInstance(ShapeA.class);
        shapeA1.draw();





    }



















}
