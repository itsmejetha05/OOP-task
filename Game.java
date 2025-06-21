class Character {
    void attack() {
        System.out.println("Character attacks!");
    }
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior swings sword!");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage casts a fireball!");
    }
}

public class Game {
    public static void main(String[] args) {
        Character c;

        c = new Warrior();
        c.attack();

        c = new Mage();
        c.attack();
    }
}
