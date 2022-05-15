import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main
{
    public void go(){
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();
        for(int i = 0 ; i < 5; i++) {
            //System.out.println("Type in name number " + (i+1) + " of 5");
            users.add(new User(sc.nextLine()));
        }
        users.get(0).setName("hans");


    }


    public static void main(String[] args)
    {
        Main prg = new Main();
        //prg.go();
        ArrayList<User> sortingNames = new ArrayList<User>();
        User firstUser = new User("Bob",10);
        User secondUser = new User("Ken",15);
        User thirdUser = new User("Lena",120);
        User fourthUser = new User("Karen",8);
        User FifthUser = new User("Linda",65);
        sortingNames.add(firstUser);
        sortingNames.add(secondUser);
        sortingNames.add(thirdUser);
        sortingNames.add(fourthUser);
        sortingNames.add(firstUser);

        System.out.println(sortingNames);
        Collections.sort(sortingNames);
        System.out.println(sortingNames);

    }
}
