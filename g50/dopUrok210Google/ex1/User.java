package dopUrok210Google.ex1;

public class User {
    private String name;
    private int age;
    private int score;



    public User(int age, String name) {
        this.age = age;
        this.name = name;
        this.score = score = 100;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
