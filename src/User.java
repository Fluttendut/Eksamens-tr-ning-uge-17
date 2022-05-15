public class User implements Comparable<User>
{
    private String name;
    private int age;

    public User(String name){
        this.name = name;
    }

    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }

    public void skitse(User other){
        //This will output what????
        this.name.compareTo(other.getName());
    }

    @Override
    public int compareTo(User otherUser){
        if(this.age== otherUser.getAge()) {
            return 0;
        }
        else if (this.age<otherUser.getAge()) {
            return -1;
        }
        else
            return 1;
    }

    @Override
    public String toString(){
        return name + " " + age;
    }
}
