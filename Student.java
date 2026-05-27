class Stu {
    private int id;
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
}
public class Student{
    public static void main(String[] args) {
        Stu s = new Stu();
        s.setId(101);
        System.out.println("ID: " + s.getId());
    }
}