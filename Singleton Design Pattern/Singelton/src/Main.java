// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1==s2)
            System.out.println("same object");

        SubclassSingleton s3 = SubclassSingleton.getInstance();
        SubclassSingleton s4 = SubclassSingleton.getInstance();
        s3.display();
        s4.display();
    }
}