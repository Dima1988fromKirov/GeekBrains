package OOP.HomeWork.Seminar6_SOLID.view;

public class ShowListGroup {
    public ShowGroup showGroup;

    public ShowListGroup(ShowGroup showGroup) {
        this.showGroup = showGroup;
    }

    public void showListGroup(){
        showGroup.showGroup();
    }
}
