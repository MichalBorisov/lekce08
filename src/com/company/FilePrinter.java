package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter {

    static void printToFileFormatA(String filePath, DataCell cell) throws IOException {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)))) {
            writer.println("####################################");
            writer.println("Group: "+cell.groupName+" (Grade: "+cell.grade+")");
            writer.println("Group teacher: "+cell.groupTeacher.getFullName());
            writer.println("Student number: "+cell.studentList.size());
            writer.println("####################################");
            for (Student student:
                    cell.studentList) {
                writer.println(student.getFullInfo());
            }
        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
    static void printToFileFormatB(String filePath, DataCell cell) throws IOException {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)))) {
            writer.println(cell.groupName+", "+cell.groupTeacher.getFullName());

            for (Student student:
                    cell.studentList) {
                writer.println(student.getStudentNumber() + ", " +student.getFullName());
            }
        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

}
