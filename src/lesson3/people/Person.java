package lesson3.people;

public class Person {
    
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }


    //name get/set
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //age get/set
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age >= 0){
        this.age = age;
        } else {
            System.out.println("請輸入正確年齡");
        }
    }

    public void introduce() {
        System.out.println("我是" + this.getName() + ", 今年" + this.getAge() + "歲");
    }

}
