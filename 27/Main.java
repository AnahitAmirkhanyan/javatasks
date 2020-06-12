import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Person youngest(ArrayList<Person> people){
        Person youngest = people.get(0);

        for(Person person : people){
            if(person.getAge() < youngest.getAge()){
                youngest = person;
            }
        }

        return youngest;
    }

    public static Person oldest(ArrayList<Person> people){
        Person oldest = people.get(0);

        for(Person person : people){
            if(person.getAge() > oldest.getAge()){
                oldest = person;
            }
        }

        return oldest;
    }

    public static ArrayList<Person> worksAt(ArrayList<Person> people, String companyName){
        ArrayList<Person> works = new ArrayList<Person>();

        for(Person p : people){
            if(p.getCompanyName().equals(companyName)){
                works.add(p);
            }
        }

        return works;
    }

    public static int mostCommonAge(ArrayList<Person> people){
        int[] age = new int[100]; // assuming no one will be older than 100
        int max = 0; int common = 0;

        for(Person p : people){
            age[p.getAge()]++;
        }

        for(int i = 0; i < age.length; i++){
            if(age[i] > max){
                max = age[i];
                common = i;
            }
        }
        return common;
    }

    public static ArrayList<Person> sort(ArrayList<Person> people){
        people.sort(Comparator.comparingInt(Person::getAge));
        return people;
    }


    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("John", "Google", 23));
        people.add(new Person("Amy", "Amazon", 65));
        people.add(new Person("Gerard", "Google", 32));
        people.add(new Person("Liz", "Microsoft", 26));
        people.add(new Person("Dinesh", "Pied Piper", 32));
        people.add(new Person("Bertram", "Pied Piper", 35));
        people.add(new Person("Richard", "Pied Piper", 30));

        System.out.println(youngest(people).getName());     // name of youngest
        System.out.println(oldest(people).getName());       // name of oldest
        System.out.println(mostCommonAge(people));          // most common age
        System.out.println();
        ArrayList<Person> worksAt = worksAt(people, "Pied Piper");  // get arraylist of people who work in this company

        for(Person person : worksAt){       // iterate through arraylist
            System.out.println(person.getName());   // print names of people who work in that company
        }

        System.out.println();

        ArrayList<Person> sortedByAge = sort(people);
        for(Person person : sortedByAge){
            System.out.println(person.getName() + ", " + person.getCompanyName() + ", " + person.getAge());
        }


    }
}
