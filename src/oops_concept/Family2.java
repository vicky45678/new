package oops_concept;

public class Family2 {

    int familyId;
    String familyName;
    int familyMember;
    String familyBackgraund;

    public void home()
    {
        System.out.println("my home id is "+ familyId);
    }
    public void familyhead()
    {
        System.out.println("head of the family " +familyName);
    }
    public void familymamber()
    {
        System.out.println("total family member is " +familyMember);
    }
    public void showFullDetails()
    {
        System.out.println("my home id is " +familyId);
        System.out.println("head of the family " +familyName);
        System.out.println("total family member is " +familyMember);
        System.out.println("family background is  " +familyBackgraund);
    }
}
