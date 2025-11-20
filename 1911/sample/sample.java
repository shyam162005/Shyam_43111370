public class sample{
    String person_name = "Shyam";
    void car(){
        System.out.println("RR");
    }
    void bike(){
        System.out.println("S1000RR");
    }
    public static void main(String[] args){
        sample sa = new sample();
        System.out.println(sa.person_name);
        sa.car();
        sa.bike();
        person1 a = new person1();
        System.out.println(a.person_name);
        a.bike();
        a.car();
    }
}
class person1{
    String person_name = "Sai";
    void car(){
        System.out.println("BMW");
    }
    void bike(){
        System.out.println("Kawasaki");
    }

}