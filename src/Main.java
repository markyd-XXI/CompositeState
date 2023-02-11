public class Main {
    /**
     * This program will demonstrate the composite and state patterns through an organizational charting tool. Some organizational
     * components will be composites (employees who are in charge of other employees), others will be leafs (employees with no direct reports).
     * Every org member will have a state that defines their status with the org.
     * @param args
     */
    public static void main(String[] args) {
        OrgComponent ceo = new OrgManager("John Doe", "CEO");
        OrgComponent coo = new OrgManager("Jane Doe", "COO");
        OrgComponent cto = new OrgManager("Tom Smith", "CTO");
        OrgComponent cfo = new OrgManager("Emily Johnson", "CFO");
        OrgComponent vpEngineering = new OrgManager("Michael Brown", "VP Of Engineering");
        OrgComponent vpMarketing = new OrgManager("Sarah Davis", "VP of Marketing");
        OrgComponent vpSales = new OrgManager("David Wilson", "VP of Sales");
        OrgComponent managerSoftwareDev = new OrgManager("William Anderson", "Manager of Software Development");
        OrgComponent softwareDev = new OrgEmployee("Billy Jackson", "Software Developer");
        OrgComponent salesEngineer = new OrgEmployee("Aurthur Morgan", "Sales Engineer");
        OrgComponent marketingSpecialist = new OrgEmployee("Dutch Vanderlin", "Marketing Specialist");

        ceo.addDirectReport(cto);
        ceo.addDirectReport(coo);
        ceo.addDirectReport(cfo);
        cto.addDirectReport(vpEngineering);
        coo.addDirectReport(vpMarketing);
        coo.addDirectReport(vpSales);
        vpEngineering.addDirectReport(managerSoftwareDev);
        managerSoftwareDev.addDirectReport(softwareDev);
        vpMarketing.addDirectReport(marketingSpecialist);
        vpSales.addDirectReport(salesEngineer);
        ceo.print();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        cfo.suspendEmployee();
        System.out.printf("Now suspending %s", cfo.getName());
        System.out.println();
        System.out.printf("CFO Stauts now: %s", cfo.getEmployementState().getDescription());
        System.out.println();

        //we try to release employee before suspending, which will not work in the state flow.
        System.out.printf("Trying to release %s", softwareDev.getName());
        System.out.println();
        softwareDev.releaseEmployee();
        //Now we correct it by suspending the employee first, then releasing.
        System.out.printf("Now trying to suspend %s", softwareDev.getName());
        System.out.println();
        softwareDev.suspendEmployee();
        System.out.printf("Software Dev Status now: %s", softwareDev.getEmployementState().getDescription());
        System.out.println();
        System.out.printf("Now trying to release %s", softwareDev.getName());
        System.out.println();
        softwareDev.releaseEmployee();
        System.out.printf("Software Dev Status now: %s", softwareDev.getEmployementState().getDescription());
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        ceo.print();

    }
}