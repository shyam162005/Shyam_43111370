public class multipleinheritance {
    public static void main(String[] args){
        school sc = new school();
        sc.school_name();
        System.out.println();
        headmaster h = new headmaster();
        h.headmaster_name();
        h.school_name();
        System.out.println();
        teachers t = new teachers();
        t.teacher_name();
        t.school_name();
        System.out.println();
        students s = new students();
        s.student_name();
        s.school_name();
    }
    
}
class school{
    void school_name(){
        System.out.println("Madras Christian College Higher Secondary School");
    }
}

class headmaster extends school{
    void headmaster_name(){
        System.out.println("G.J. Manohar");
    }
}
class teachers extends headmaster{
    void teacher_name(){
        System.out.println("Nandhini");
    }
}
class students extends teachers{
    void student_name(){
        System.out.println("Shyam");
    }
}
