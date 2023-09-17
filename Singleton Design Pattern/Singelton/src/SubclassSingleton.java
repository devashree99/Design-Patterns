import java.sql.SQLOutput;

// Subclass of Singleton
public class SubclassSingleton extends Singleton {
 static SubclassSingleton s = new SubclassSingleton(1);
 int d;
    private SubclassSingleton(int d) {

        super();
        this.d = d;

    }


    public static SubclassSingleton getInstance() {

        return s;
    }

    public void display(){
        System.out.println("Child Class Of Singleton Class "+d);
    }
}
