public class SuspendedState implements EmployementState{

    OrgComponent orgComponent;

    String description = "Suspended";

    public SuspendedState(OrgComponent orgComponent){
        this.orgComponent = orgComponent;
    }

    @Override
    public void suspendEmployee() {
        System.out.printf("%s is already in suspended state.", orgComponent.getName());
        System.out.println();
    }

    @Override
    public void instateEmployee() {
        orgComponent.setEmployementState(orgComponent.getActiveState());
    }

    @Override
    public void releaseEmployee() {
        orgComponent.setEmployementState(orgComponent.getInactiveState());
    }

    @Override
    public String getDescription() {
        return description;
    }
}
