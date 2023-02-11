abstract class OrgComponent {
    private String name;
    private String title;

    private EmployementState employementState;

    private EmployementState inactiveState;
    private EmployementState activeState;
    private EmployementState suspendedState;


    public OrgComponent(String name, String title){
        this.name = name;
        this.title = title;
        inactiveState = new InactiveState(this);
        activeState = new ActiveState(this);
        suspendedState = new SuspendedState(this);
        employementState = activeState;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public EmployementState getEmployementState(){return employementState; }
    public void setEmployementState(EmployementState employementState){this.employementState = employementState; }

    public void addDirectReport(OrgComponent orgComponent){
        throw new UnsupportedOperationException();
    }

    public void removeDirectReport(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        System.out.printf("- %s - %s - %s", getName(), getTitle(), getEmployementState().getDescription());
        System.out.println();
        System.out.println();
    }

    void suspendEmployee(){
        employementState.suspendEmployee();
    }
    void instateEmployee(){
        employementState.instateEmployee();
    }
    void releaseEmployee(){
        employementState.releaseEmployee();
    }

    public EmployementState getInactiveState() {
        return inactiveState;
    }

    public void setInactiveState(EmployementState inactiveState) {
        this.inactiveState = inactiveState;
    }

    public EmployementState getActiveState() {
        return activeState;
    }

    public void setActiveState(EmployementState activeState) {
        this.activeState = activeState;
    }

    public EmployementState getSuspendedState() {
        return suspendedState;
    }

    public void setSuspendedState(EmployementState suspendedState) {
        this.suspendedState = suspendedState;
    }
}
