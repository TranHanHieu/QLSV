import java.util.Scanner;

/**
 * Created by Hieu It on 7/10/2016.
 */
public class Actions {
    public int length = 0;

    public void setLength(int length) {
        this.length = length;
    }

    public Actions() {

    }

    Scanner input = new Scanner(System.in);

    public void importStudent(Student[] student) {
        for (int i = 0; i < length; i++) {
            System.out.printf("Bạn nhập vào thông tin cho sinh viên thứ %d: ", i + 1);
            student[i] = new Student();
            student[i].inputStudent();
        }
    }

    //Function ouput sinhVien
    public void outputStudent(Student[] student) {
        for (int i = 0; i < length+add; i++) {
            System.out.println("-----------Thông tin Sv thứ " + (i + 1) + " ------------");
            student[i].displayStudent();//in thông tin của các sinh viên
        }
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int add =0;

    public void addStudent(Student[] student){
        for (int i=length;i<length+add;i++){
            System.out.printf("Bạn nhập vào thông tin cho sinh viên thứ %d: ", i + 1);
            student[i] = new Student();
            student[i].inputStudent();
        }
    }
}
