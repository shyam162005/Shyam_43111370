public class singleinheritance {
    public static void main(String[] args) {
        son s = new son();
        s.car();
        s.dads_car();
        dad d = new dad();
        d.dads_car();
    }
    
}
class dad{
    void dads_car(){
        System.out.println("Pagani");
    }

}
class son extends dad{
    void car(){
        System.out.println("Bugatti");
    }
}
