public class Cat {
    public String name;
    public Integer age;
    public Boolean likesCuddles;

    public Cat(String name, Integer age, Boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    void displayInfo() {
        if (this.likesCuddles) {
            System.out.printf("This is %s, who is %d years old. %s likes cuddles!", this.name, this.age, this.name);
        } else {
            System.out.printf("This is %s, who is %d years old. %s doesn't like cuddles!", this.name, this.age,
                    this.name);

        }
    }
}