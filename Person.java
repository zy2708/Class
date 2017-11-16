package edu.nvcc.Zhonglin;
/**
 * Person class is a class to get a person's name and age
 */
public class Person {
    /**
     * person's name
     */
    public String name;
    /**
     * person's age
     */
    public int age;

    /**
     *initialize person object
     */
    public Person(){

    }
    /**
     * initialize person's name to name
     * initialize peoson's age to age
     * @param name
     * @param age
     */
    public Person(String name,int age){
        this.age= age;
        this.name= name;
    }

    /**
     * get person's name
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * get person's age
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * set person's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set person's age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * name+" is "+age+" years old."
     * @return
     */
    @Override
    public String toString() {
        return name+" is "+age+" years old.";
    }
}

