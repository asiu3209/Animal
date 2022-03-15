public class Cat extends Animal{
    private boolean hasPlayedWith;
    private boolean hasClimbed;

    public Cat(String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        hasPlayedWith = false;
    }

    public void play(){
        System.out.println("I have played!");
        hasPlayedWith = true;
    }

    public boolean isHasPlayedWith(){
        return hasPlayedWith;
    }

    public void climbing(){
        System.out.println("I have climbed a wall today!");
        hasClimbed = true;
    }

    public boolean isHasClimbed(){
        return hasClimbed;
    }
}
