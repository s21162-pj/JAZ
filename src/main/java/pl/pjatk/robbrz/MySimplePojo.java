package pl.pjatk.robbrz;


public class MySimplePojo {

    private int a = 9;
    private String string = "Mateusz Dragon Wielki";

    public MySimplePojo() {
        System.out.println(string+" is created");
    }

    public MySimplePojo(String name) {
        this.string = name;
        System.out.println(string+" is created");
    }

    public Integer geta() {
        return a;
    }

    public void printOutMe() {
    }
}