public class Animal {
    private String name; int age; boolean vaccinated; boolean sleep;
    public Animal(String name, int age, boolean vaccinated){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        sleep = false;
    }

    public void adopt(){
        System.out.println("I have been adopted!");
    }

    public void feed(){
        System.out.println("I have been feed!");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getVaccinated(){
        return vaccinated;
    }

    public void sleep(){
        sleep = true;
    }
    public void wake(){
        sleep = false;
    }
    public boolean isSleep(){
        return sleep;
    }
}
