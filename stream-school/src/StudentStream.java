import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStream extends Student {

    public StudentStream(String fio) {
        super(fio);
    }

    @Override
    public double getAvg() {
        return getLearningSubject().stream()
                .filter(subject -> subject.getValue() !=null)
                .map(LearningSubject::getValue)
                .mapToDouble(Double::doubleValue).average().getAsDouble();
    }
}
