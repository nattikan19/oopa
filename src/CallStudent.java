
public class CallStudent {
    public static void main(String[] args) {
        System.out.println("Hello World...");
        Student nattikan = new Student();
        System.out.println("Object nattikan = "+nattikan);
        nattikan.addCourses();
        nattikan.dropCourses();
        nattikan.payment();
        nattikan.enrollment();       
        
        //crete object GraduateStudent
        GraduateStudent prea = new GraduateStudent();
        System.out.println("Object prea = "+prea);
        prea.oralExanation();
        prea.thesisExanation();
        prea.addCourses();
        prea.dropCourses();
        prea.payment();
    }
}