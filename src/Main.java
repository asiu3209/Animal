public class Main {
    public static void main(String[] args){
        Animal test = new Animal("Animal", 69,false);
        System.out.println(test.getName());
        System.out.println(test.getAge());
        System.out.println(test.getVaccinated());
        test.adopt();
        test.feed();

        Dog test2 = new Dog("Bob", 6969,true);
        System.out.println(test2.getName());
        System.out.println(test2.getAge());
        System.out.println(test2.getVaccinated());
        test2.adopt();
        test2.feed();
        test2.walk();
        test2.attack();

        Cat test3 = new Cat("Mars", 41,true);
        System.out.println(test.getName());
        System.out.println(test.getAge());
        System.out.println(test.getVaccinated());
        test.adopt();
        test.feed();
        test3.play();
        test3.climbing();
    }
}
