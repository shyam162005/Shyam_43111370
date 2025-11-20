public class hierarchyinheritance {
    public static void main(String[] args) {
        dad d = new dad();
        d.vehicle1();

        son s = new son();
        s.vehicle2();
        s.vehicle1();
        
        daughter da = new daughter();
        da.vehicle3();
        da.vehicle1();
    }
}
class dad{
    void vehicle1(){
        System.out.println("Bugatti");
    }
}
class son extends dad{
    void vehicle2(){
        System.out.println("S1000RR");
    }

}
class daughter extends dad{
    void vehicle3(){
        System.out.println("Ferrari");
    }
}
