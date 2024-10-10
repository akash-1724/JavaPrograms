package Tutorial11;

import pack1.Man;
import pack2.Woman;

public class MainT10 {
    public static void main(String[] args) {
        Man man = new Man("Smith", 40);
        Woman woman = new Woman("Jane", 35);

        man.displayMe();
        woman.displayMe();
    }
}
