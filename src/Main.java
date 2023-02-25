public class Main {
    public static void main(String[] args) {

//Static...>variables,methods,blocks,classes
        Student s1 = new Student();
        s1.name = "Tom";
        s1.age = 25;

        Student s2 = new Student();
        s2.name = "peter";
        s2.age = 30;
        Movie m1= new Movie("Harry potter1",10);
        Movie m2= new Movie("Harry potter2",20);
        Movie m3= new Movie("Harry potter3",30);
        Movie m4= new Movie("Harry potter4",40);


        System.out.println(Student.school);
    }
}