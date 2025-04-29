package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //TV
        Product<TV, String> product1 = new Product<>();

        //Setter
        product1.setKind(new TV());
        product1.setModel("스마트Tv");

        //Getter
        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        //Car
        Product<Car,String> product2 = new Product<>();

        //Setter
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        //Getter
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
