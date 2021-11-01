public class Person{
    private String name, address, email, phoneNumber;
    private int age;
    protected Person(){
        
    }
    protected Person(String name, String email, String phoneNumber, int age){
        this.name = name; 
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return getClass() + "\n" +
                "name: " + name;
    }

    public static void main(String[] args){
        print(new Person());
        print(new Student());
        print(new Employee());
        print(new Faculty());
        print(new Staff());
    }
    public static void print(Person x){
        System.out.println(x.toString());
        System.out.println();
    }
}
