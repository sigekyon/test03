package test.app17;

public class Sample4 {
    enum Month {
        JANUARY("�r��"),
        FEBRUARY("�@��"),
        MARCH("�퐶"),
        APRIL("�K��"),
        MAY("�H��"),
        JUNE("������"),
        JULY("����"),
        AUGUST("�t��"),
        SEPTEMBER("����"),
        OCTOBER("�_����"),
        NOVEMBER("����"),
        DECEMBER("�t��");
  
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
