import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private final String fio;
    private String schoolClass;
    private List<LearningSubject> learningSubject = new ArrayList<>();
    SetDataMain df = new SetDataMain();


    public Student(String fio) {
        this.fio = fio;
    }

    @Override
    public String getFIO() {

        return fio;
    }

    @Override
    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public List<LearningSubject> getLearningSubject() {
        return learningSubject;
    }

    public void addLearningSubject(LearningSubject learningSubject){
        this.learningSubject.add(learningSubject);
    }

    @Override
    public double getAvg() {
        double result = 0;
        for (LearningSubject subject : learningSubject) {
            result += subject.getValue();
        }
        return result / learningSubject.size();
    }
}
