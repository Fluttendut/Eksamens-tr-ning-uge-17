import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public void go(){
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();
        for(int i = 0 ; i < 5; i++) {
            System.out.println("Type in name number " + (i+1) + " of 5");
            users.add(new User(sc.nextLine()));
        }
        users.get(0).setName("hans");
    }


    public static void main(String[] args)
    {
        Main prg = new Main();
        prg.go();
    }
}
