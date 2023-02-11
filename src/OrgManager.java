import java.util.ArrayList;
import java.util.List;

public class OrgManager extends OrgComponent{
    private List<OrgComponent> orgComponents = new ArrayList<>();

    public OrgManager(String name, String title){
        super(name, title);
    }

    public void addDirectReport(OrgComponent orgComponent){
        orgComponents.add(orgComponent);
    };

    public void removeDirectReport(OrgComponent orgComponent){
        orgComponents.remove(orgComponent);
    }

    public void print(){
        System.out.printf("[%s - %s - %s]", getName(), getTitle(), getEmployementState().getDescription());
        System.out.println();
        for(OrgComponent orgComponent: orgComponents){
            orgComponent.print();
        }
    }
}
