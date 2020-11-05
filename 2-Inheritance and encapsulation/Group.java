package week5;

import java.util.ArrayList;

public class Group {
    private String groupName;
    ArrayList<Student> students;

    public Group (String groupName){
        this.groupName= groupName;
    }
    public int getNumStudent(){
           return(students.size());
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public boolean removeStudent(int studentID){
        boolean fnd=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).personId==studentID){
                students.remove(i);
                fnd =true;
                break;
            }
        }
        return fnd;
    }

}
