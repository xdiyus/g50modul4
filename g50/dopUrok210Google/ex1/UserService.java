package dopUrok210Google.ex1;


import java.util.ArrayList;

public class UserService {
    private static java.util.ArrayList<User> users = new java.util.ArrayList<>();

    public boolean addUser(User user){
        return users.add(user);
    }

    public java.util.ArrayList<User> getUsers(){
        return users;
    }
    public void exam(User user, ExamServise examServise){
        int score = user.getScore();
    }
}
