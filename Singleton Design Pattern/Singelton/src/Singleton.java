// Singleton class
public class Singleton {
    private static Singleton instance;


    Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
public void display (){
    System.out.println("Parent Class");
}

}

