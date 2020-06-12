public class Person {
    private String name;
    private String companyName;
    private int age;

    public Person(String name, String companyName, int age){
        this.name = name;
        this.companyName = companyName;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
