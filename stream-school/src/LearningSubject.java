public class LearningSubject {
    private final ISubject subject;
    private Double value;

    public LearningSubject(ISubject subject, Double value) {
        this.subject = subject;
        this.value = value;
    }

    public ISubject getSubject() {
        return subject;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
