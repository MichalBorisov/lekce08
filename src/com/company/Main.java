package com.company;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    private static final String OUTPUT_FILE_FORMAT_A = "GroupFormatA.txt";
    private static final String OUTPUT_FILE_FORMAT_B = "GroupFormatB.txt";

    public static void main(String[] args) {

        DataCell dataCell = new DataCell();
        dataCell.SetGroupName( "Group 5.B");
        dataCell.SetGrade( 5);
        dataCell.SetTeacher(new Teacher("James","Hammett"));
        dataCell.AddStudent(new Student("Alan","Rasmussen",LocalDate.of(1995,5,5),"ID001"));
        dataCell.AddStudent(new Student("Alan the Second","Rasmussen",LocalDate.of(1995,6,5),"ID002"));
        dataCell.AddStudent(new Student("Alan the Third","Rasmussen",LocalDate.of(1995,7,5),"ID003"));
        dataCell.AddStudent(new Student("Alan the Fourth","Rasmussen",LocalDate.of(1995,8,5),"ID004"));
        dataCell.PrintInfoFormatA();
        System.out.println();
        System.out.println();
        System.out.println();
        dataCell.PrintInfoFormatB();
        try {
            dataCell.PrintInfoToFileFormatA(OUTPUT_FILE_FORMAT_A);
        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
        try {
            dataCell.PrintInfoToFileFormatB(OUTPUT_FILE_FORMAT_B);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
