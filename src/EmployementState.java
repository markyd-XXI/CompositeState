public interface EmployementState {
    void suspendEmployee();
    void instateEmployee();
    void releaseEmployee();

    String getDescription();
}
