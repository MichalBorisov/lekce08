package com.company;

public class ScreenPrinter {

    static void printToScreenFormatA(DataCell cell)
    {
        System.out.println("####################################");
        System.out.println("Group: "+cell.groupName+" (Grade: "+cell.grade+")");
        System.out.println("Group teacher: "+cell.groupTeacher.getFullName());
        System.out.println("Student number: "+cell.studentList.size());
        System.out.println("####################################");
        for (Student student:
                cell.studentList) {
            System.out.println(student.getFullInfo());
        }
    }
    static void printToScreenFormatB(DataCell cell)
    {
        System.out.println(cell.groupName+", "+cell.groupTeacher.getFullName());

        for (Student student:
                cell.studentList) {
            System.out.println(student.getStudentNumber() + ", " +student.getFullName());
        }
    }

}
