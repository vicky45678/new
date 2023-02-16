package oops_concept.class_and_object_7_PM_Batch.check_prime_number;

public class Find_prime_num {

    public void find_prime(){
        int i,m=0,flag=0;
        int n=13;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }


}

    public static void main(String[] args) {
        Find_prime_num obj=new Find_prime_num();
        obj.find_prime();
    }
}
