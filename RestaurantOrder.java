abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    void prepare() {
        System.out.println("Preparing appetizer...");
    }

    void serve() {
        System.out.println("Serving appetizer.");
    }
}

class MainCourse extends MenuItem {
    void prepare() {
        System.out.println("Preparing main course...");
    }

    void serve() {
        System.out.println("Serving main course.");
    }
}

class Beverage extends MenuItem {
    void prepare() {
        System.out.println("Preparing beverage...");
    }

    void serve() {
        System.out.println("Serving beverage.");
    }
}

public class RestaurantOrder {
    public static void main(String[] args) {
        MenuItem item;

        item = new Appetizer();
        item.prepare();
        item.serve();

        System.out.println();

        item = new MainCourse();
        item.prepare();
        item.serve();

        System.out.println();

        item = new Beverage();
        item.prepare();
        item.serve();
    }
}
