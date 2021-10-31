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
        return 
        "name: " + name + "\n" + 
        "email: " + email + "\n" + 
        "phone number: " + phoneNumber + "\n" + 
        "age: " + age;
    }
}
