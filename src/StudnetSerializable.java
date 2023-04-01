import java.io.Serializable;

public class StudnetSerializable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private Faculty faculty;

    transient int transientNum;

    public int getTransientNum(){return transientNum; }

    public void setTransientNum(int transientNum){this.transientNum = transientNum;}

    public StudnetSerializable(String name, int id, Faculty faculty) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString(){
        return ("Student name is" + this.getName() +
                "Student ID is" + this.getId() +
                "Faculty is" + this.getFaculty());
    }

}
