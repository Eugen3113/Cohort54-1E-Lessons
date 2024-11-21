package homework_20.task2;

class Cat extends Animal {
    private String breed; // Порода кота

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}
