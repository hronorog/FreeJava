package FreeJava;

import FreeJava.db.DB;

public class Main {
    public static void main (String[] args){

        final int count = 10; // константа, изменить после создания нельзя, наследников нет

        Car bmw = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0});
        bmw.engine.setValues(false, 2000);
        bmw.engine.info();

        Truck truck = new Truck(5600, new byte[] {100, 0, 100}, false);
        truck.engine.setValues(true, 500);
        truck.engine.info();

        Car flyCar = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0}) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("Машина летит");
            }
        };

        flyCar.moveObject(450);

        DB db = new DB();
        info();

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();
        obj4.getCount();
    }

    public static void info() {
        System.out.println("Hi");
    }

    public static void info(String word) {
        System.out.println(word + "!");
    }
}
