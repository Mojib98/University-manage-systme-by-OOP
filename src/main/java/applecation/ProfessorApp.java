package applecation;

import system.professor.ProfessorSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProfessorApp {
    ProfessorSystem professorSystem = new ProfessorSystem();
    private Scanner scanner;

    public void insertScore(){
        try {
            System.out.println("insert id of student");
          String  select1 = scanner.next();
            System.out.println();
            System.out.println("please insert your idCourser");
            int idc=scanner.nextInt();
            System.out.println("please insert Score");
            int score = scanner.nextInt();
            professorSystem.insertScore(select1,idc,score);

        } catch (InputMismatchException e) {
            System.out.println("your grade is not true");
        }
    }
}
