abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Piano is playing a melody.");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Guitar is strumming chords.");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Violin is playing a tune.");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Instrument inst;

        inst = new Piano();
        inst.playSound();

        inst = new Guitar();
        inst.playSound();

        inst = new Violin();
        inst.playSound();
    }
}
