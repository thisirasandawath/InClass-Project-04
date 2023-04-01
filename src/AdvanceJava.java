import java.io.*;

public class AdvanceJava {

    public static void main(String args[]){
        System.out.println("Hi");

        Faculty faculty = Faculty.POST_GRADUATE_DEPARTMENT;

        System.out.println(faculty.name());
        System.out.println(faculty.getValue());

//        recurstionTest();
        System.out.println(findFactorial(6));

        StudnetSerializable studnetSerializable = new StudnetSerializable("Ashan" , 1 , Faculty.COMPUTER);
        studnetSerializable.setTransientNum(5);

        String fileName = "C:\\Users\\Saberio\\Desktop\\java.txt";

        FileOutputStream fileOutputStream= null;
        ObjectOutputStream objectOutputStream= null;

        try{
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studnetSerializable);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object serialized :  \n " +studnetSerializable);
        }catch (IOException e){
            System.out.println(e.toString());
        }

        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;

        try{
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            StudnetSerializable student = (StudnetSerializable) objectInputStream.readObject();
            System.out.println("Object deserialized :  \n " +student);
            System.out.println("Object not serialized :  \n " +student.getTransientNum());
            objectInputStream.close();
            fileOutputStream.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }

    }
//    public static void recurstionTest(){
//        System.out.println("NSBM");
//        recurstionTest();
//    }

    public static int findFactorial(int number) {
        if(number == 0){
            return 1;
        }else{
            return number * findFactorial( number - 1);
        }
    }
}
