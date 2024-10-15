public class Test {
    private static String name = "John";
    private static void setName(String newName) {
        name = newName;
        System.out.println(name);
    }
    public static void main(String[] args) {
        Student s = new Student();
        setName("Tommy");

        s.setClasses("C08");
    }
}
