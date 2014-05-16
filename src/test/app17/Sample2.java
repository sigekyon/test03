package test.app17;

public class Sample2 {
    private final String name;
    private Sample2(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
  
    public static final Sample2 JANUARY = new Sample2("JANUARY");
    public static final Sample2 FEBRUARY = new Sample2("FEBRUARY");
    public static final Sample2 MARCH = new Sample2("MARCH");
  
    private static final Sample2[]
        PRIVATE_VALUES = { JANUARY, FEBRUARY, MARCH, };
  
    public static Sample2[] values() {
        return PRIVATE_VALUES;
    }
}
