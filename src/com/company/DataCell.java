package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class DataCell extends Group implements IPrintInfo, IBuildInfo{

    public DataCell() {
        super();
    }

    @Override
    public void PrintInfoFormatA() {
        ScreenPrinter.printToScreenFormatA(this);
    }
    @Override
    public void PrintInfoFormatB() {
        ScreenPrinter.printToScreenFormatB(this);
    }

    @Override
    public void PrintInfoToFileFormatA(String filePath) throws IOException {
        FilePrinter.printToFileFormatA(filePath,this);
    }

    @Override
    public void PrintInfoToFileFormatB(String filePath) throws IOException {
        FilePrinter.printToFileFormatB(filePath,this);
    }

    @Override
    public void SetTeacher(Teacher groupTeacher) {
        super.groupTeacher = groupTeacher;
    }

    @Override
    public void SetStudentList(ArrayList<Student> studentList) {
        if(super.studentList == null) super.studentList = new ArrayList<>();
        super.studentList.addAll(studentList);
    }

    @Override
    public void SetGrade(Integer grade) {
        super.grade = grade;
    }

    @Override
    public void SetGroupName(String groupName) {
        super.groupName=groupName;
    }

    @Override
    public void AddStudent(Student student) {
        if(super.studentList == null) super.studentList = new ArrayList<>();
        super.studentList.add(student);
    }

}
