package io.codelex.typesandvariables.exercises;
import java.util.Formatter;
public class Exercise5 {
    public static void main(String[] args) {



        String[] courses = {"English III",
                "Precalculus",
                "Music Theory",
                "Biotechnology",
                "Principles of Technology I",
                "Latin II",
                "AP US History",
                "Business Computer Information Systems"
        };
        String[] teachers = {"Ms. Lapan",
                "Mrs. Gideon",
                "Mr. Davis",
                "Ms. Palmer",
                "Ms. Garcia",
                "Mrs. Barnett",
                "Ms. Johannessen",
                "Mr. James"
        };

        Formatter fmt = new Formatter();
        for (int i = 0; i<65; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 0; i< courses.length; i++){
            fmt.format("%3s %40s %20s\n","|" + (i+1) + "|", courses[i] +"|", teachers[i] + "|");

        }
        System.out.print(fmt);
        for (int i = 0; i<65; i++){
            System.out.print("-");
        }
    }
}
