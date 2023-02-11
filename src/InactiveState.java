public class InactiveState implements EmployementState{
    OrgComponent orgComponent;
    String description = "Inactive";

    public InactiveState(OrgComponent orgComponent){
        this.orgComponent = orgComponent;
    }

    @Override
    public void suspendEmployee() {
        System.out.printf("%s is not an active employee to suspend.", orgComponent.getName());
        System.out.println();
    }

    @Override
    public void instateEmployee() {
        orgComponent.setEmployementState(orgComponent.getActiveState());
    }

    @Override
    public void releaseEmployee() {
        System.out.printf("%s is not a suspended employee to fire.", orgComponent.getName());
        System.out.println();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
