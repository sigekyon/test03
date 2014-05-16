package test.app17;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Sample7 {
    enum ArrowKeys { UP, RIGHT, DOWN, LEFT }
    
    public void exec() {
        List<EnumSet<ArrowKeys>> keys = new ArrayList<EnumSet<ArrowKeys>>();
        keys.add(EnumSet.of(ArrowKeys.UP));
        keys.add(EnumSet.of(ArrowKeys.RIGHT));
        keys.add(EnumSet.of(ArrowKeys.UP, ArrowKeys.RIGHT));
        keys.add(EnumSet.of(ArrowKeys.DOWN));
        keys.add(EnumSet.of(ArrowKeys.UP, ArrowKeys.DOWN));
        keys.add(EnumSet.allOf(ArrowKeys.class));
        for (EnumSet<ArrowKeys> e : keys) {
            System.out.print(e + ":");
            if (e.contains(ArrowKeys.UP)) {
                System.out.print("UP, ");
            }
            if (e.contains(ArrowKeys.RIGHT)) {
                System.out.print("RIGHT, ");
            }
            if (e.contains(ArrowKeys.DOWN)) {
                System.out.print("DOWN, ");
            }
            if (e.contains(ArrowKeys.LEFT)) {
                System.out.print("LEFT, ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
    	Sample7 app = new Sample7();
        app.exec();
    }
}
