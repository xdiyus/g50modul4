package dopUrok210Google.ex1;

import java.util.Random;

public class PracticyEx implements ExamServise{
    @Override
    public int exam(int totalBall) {
        Random random = new Random();
        return  random.nextInt(5,totalBall);

    }
}
