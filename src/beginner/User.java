package beginner;

public class User {


    public static void main(String[] args) {

        User user = new User("Peace","asdf",26,"Computer engineer") ;
        User user1 = new User("qwe","asdf",21,"Unemployee") ;


        System.out.println(user.toString());
        System.out.println(user1.toString());

    }

    private String name ;
    private String surname ;
    private int age ;
    private String job ;

    public User(String name, String surname, int age, String job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "beginner.User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
