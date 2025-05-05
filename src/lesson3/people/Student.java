package lesson3.people;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.setSchool(school);
    }

    //school get/set
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void introduce() {
        System.out.println("我是" + this.getName() + ", 今年" + this.getAge() + "歲, 就讀於" + this.getSchool());

        // 由於沒覆寫getName() & getage(), 所以可用this.getNamee 和this.getSchppl())
    }
}
