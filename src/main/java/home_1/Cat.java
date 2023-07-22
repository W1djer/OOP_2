package home_1;

public class Cat implements inter{
    private String name;
    private Integer age;

    private String owner;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Cat(){
    }

    public void setOwner() {
        this.owner = Owner();
    }

    public void setOwner(String owner){
        this.owner = owner;
    }


    @Override
    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + " Мне " + age + " года(лет). Мой владелец " + owner);
    }
}
