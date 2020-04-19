import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetDataMain {
    public static void main(String[] args) {

        String name = new String();


        List<String> list = new ArrayList<>();

        Map<String, List> hashMap = new HashMap<>();

        Map<Integer, String> listOfSubjects = new HashMap<>();
        listOfSubjects.put(1, "Geometry");
        listOfSubjects.put(2, "Algebra");
        listOfSubjects.put(3, "Physics");
        listOfSubjects.put(4, "Biology");
        listOfSubjects.put(5, "History");
        listOfSubjects.put(6, "Geography");
        listOfSubjects.put(7, "Art");
        listOfSubjects.put(8, "Russian language");
        listOfSubjects.put(9, "English");
        listOfSubjects.put(10, "Russian literature");

        Map<Integer, String> listOfStudents = new HashMap<>();
        listOfStudents.put(1, "Rachel Green");
        listOfStudents.put(2, "Monica Geller");
        listOfStudents.put(3, "Phoebe Buffay");
        listOfStudents.put(4, "Joey Tribbiani");
        listOfStudents.put(5, "Chandler Bing");
        listOfStudents.put(6, "Ross Geller");

        Map<String, String> crossJoinStudentAndSubject = new HashMap<>();
        crossJoinStudentAndSubject.put(listOfStudents.get(1), listOfSubjects.get(9));
        crossJoinStudentAndSubject.put(listOfStudents.get(1), listOfSubjects.get(4));
        crossJoinStudentAndSubject.put(listOfStudents.get(1), listOfSubjects.get(5));
        crossJoinStudentAndSubject.put(listOfStudents.get(1), listOfSubjects.get(2));
        crossJoinStudentAndSubject.put(listOfStudents.get(1), listOfSubjects.get(1));
        crossJoinStudentAndSubject.put(listOfStudents.get(2), listOfSubjects.get(1));
        crossJoinStudentAndSubject.put(listOfStudents.get(2), listOfSubjects.get(3));
        crossJoinStudentAndSubject.put(listOfStudents.get(2), listOfSubjects.get(4));
        crossJoinStudentAndSubject.put(listOfStudents.get(2), listOfSubjects.get(10));
        crossJoinStudentAndSubject.put(listOfStudents.get(2), listOfSubjects.get(5));
        crossJoinStudentAndSubject.put(listOfStudents.get(2), listOfSubjects.get(6));
        crossJoinStudentAndSubject.put(listOfStudents.get(3), listOfSubjects.get(1));
        crossJoinStudentAndSubject.put(listOfStudents.get(3), listOfSubjects.get(2));
        crossJoinStudentAndSubject.put(listOfStudents.get(3), listOfSubjects.get(3));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(1));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(3));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(2));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(7));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(8));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(9));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(10));
        crossJoinStudentAndSubject.put(listOfStudents.get(4), listOfSubjects.get(5));
        crossJoinStudentAndSubject.put(listOfStudents.get(5), listOfSubjects.get(3));
        crossJoinStudentAndSubject.put(listOfStudents.get(5), listOfSubjects.get(1));
        crossJoinStudentAndSubject.put(listOfStudents.get(5), listOfSubjects.get(4));
        crossJoinStudentAndSubject.put(listOfStudents.get(5), listOfSubjects.get(2));
        crossJoinStudentAndSubject.put(listOfStudents.get(5), listOfSubjects.get(7));
        crossJoinStudentAndSubject.put(listOfStudents.get(5), listOfSubjects.get(8));
        crossJoinStudentAndSubject.put(listOfStudents.get(6), listOfSubjects.get(1));
        crossJoinStudentAndSubject.put(listOfStudents.get(6), listOfSubjects.get(2));
        crossJoinStudentAndSubject.put(listOfStudents.get(6), listOfSubjects.get(3));
        crossJoinStudentAndSubject.put(listOfStudents.get(6), listOfSubjects.get(4));
        crossJoinStudentAndSubject.put(listOfStudents.get(6), listOfSubjects.get(5));
        crossJoinStudentAndSubject.put(listOfStudents.get(6), listOfSubjects.get(6));
        crossJoinStudentAndSubject.put(listOfStudents.get(6), listOfSubjects.get(9));

        name = listOfStudents.get()




    }
}
