import java.util.List;

public interface IStudent extends IPeople {
    String getFIO();
    String getSchoolClass();
    List<LearningSubject> getLearningSubject();

}
