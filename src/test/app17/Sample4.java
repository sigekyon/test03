package test.app17;

public class Sample4 {
    enum Month {
        JANUARY("–rŒ"),
        FEBRUARY("”@Œ"),
        MARCH("–í¶"),
        APRIL("‰KŒ"),
        MAY("HŒ"),
        JUNE("…–³Œ"),
        JULY("•¶Œ"),
        AUGUST("—tŒ"),
        SEPTEMBER("’·Œ"),
        OCTOBER("_–³Œ"),
        NOVEMBER("‘šŒ"),
        DECEMBER("t‘–");
  
        private String name;
        Month(String name) { this.name = name; }
        public String getName() { return name; }
    }
    public void exec() {
        for (Month m : Month.values()) {
          System.out.println(m + ":" + m.getName());
        }
    }
    public static void main(String[] args) {
      Sample4 app = new Sample4();
      app.exec();
    }

}
