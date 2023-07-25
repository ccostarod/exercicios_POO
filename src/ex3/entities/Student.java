package ex3.entities;

public class Student {
    public String name;
    public double score1;
    public double score2;
    public double score3;

    public double final_score(){
        return score1 + score2 + score3;
    }

    public void result(){
        if (final_score() < 60) System.out.printf("FAILED\n Missing %.2f\n", 60 - final_score());
        else System.out.println("PASS");
    }
}

