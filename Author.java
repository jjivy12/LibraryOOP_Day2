public class Author extends book {

    private String name;
    private int age;
    private int booksPublished;

    Author(String name, int age, int booksPublished) {
        this.name = name;
        this.age = age;
        this.booksPublished = booksPublished;
        
    }
//Getters 
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getbooksPublished{
        return booksPublished;
    }
//setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", aged " + this.age + " years-old.";
    }
}