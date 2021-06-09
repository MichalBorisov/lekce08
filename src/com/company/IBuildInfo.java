package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IBuildInfo {
    public void SetTeacher(Teacher groupTeacher);
    public void SetStudentList(ArrayList<Student> studentList);
    public void SetGrade(Integer grade);
    public void SetGroupName(String groupName);
    public void AddStudent(Student student);

}
