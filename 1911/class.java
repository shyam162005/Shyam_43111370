public class Class {
    public static void main(String[] args){
        person1 a = new person1();
        a.mul();

    }
}
class person1{
    int mark = 95;
    void mul(){
        int result = mark*100;
        System.out.println(result);
    }
}
