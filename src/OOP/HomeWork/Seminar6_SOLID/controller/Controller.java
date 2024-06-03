package OOP.HomeWork.Seminar6_SOLID.controller;

import OOP.HomeWork.Seminar6_SOLID.model.groups.GroupStudents;
import OOP.HomeWork.Seminar6_SOLID.model.groups.GroupTeacher;
import OOP.HomeWork.Seminar6_SOLID.model.methods.Create;
import OOP.HomeWork.Seminar6_SOLID.model.methods.CreateStudent;
import OOP.HomeWork.Seminar6_SOLID.model.methods.CreateTeacher;
import OOP.HomeWork.Seminar6_SOLID.view.ShowListGroup;

import java.util.ArrayList;

public class Controller {

    private GroupStudents groupStudents = new GroupStudents(new ArrayList<>());
    private GroupTeacher groupTeacher = new GroupTeacher(new ArrayList<>());
    private ShowListGroup showListGroupStudents = new ShowListGroup(groupStudents);
    private ShowListGroup showListGroupTeacher = new ShowListGroup(groupTeacher);

    public void createTeacher(String name){
        Create create =  new CreateTeacher(name,groupTeacher);
        create.create(name);
    }

    public void createStudents(String name){
        Create create = new CreateStudent(name,groupStudents);
        create.create(name);

    }

    public void showListTeacher(){
        showListGroupTeacher.showListGroup();
    }

    public void showListStudents(){
        showListGroupStudents.showListGroup();
    }

    public void sort(){
        groupStudents.sort();
    }


}
