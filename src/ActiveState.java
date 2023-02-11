public class ActiveState implements EmployementState{

    OrgComponent orgComponent;

    String description = "Active";

    public ActiveState(OrgComponent orgComponent){
        this.orgComponent = orgComponent;
    }

    @Override
    public void suspendEmployee() {
        orgComponent.setEmployementState(orgComponent.getSuspendedState());
    }

    @Override
    public void instateEmployee() {
        System.out.printf("%s is already active.", orgComponent.getName());
        System.out.println();
    }

    @Override
    public void releaseEmployee() {
        System.out.printf("%s needs to be suspended first.", orgComponent.getName());
        System.out.println();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
