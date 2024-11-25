package homework_20.task2;

class Mouse extends Animal {
    private boolean isCaught; // Указывает, поймана ли мышка

    public Mouse(String name, int age) {
        super(name, age);
        this.isCaught = false;
    }

    @Override     // переопределить
    public String toString() {
        return super.toString() + ", Is Caught: " + (isCaught ? "Yes" : "No");
    }

    public void caught() {
        isCaught = true;
        System.out.println(name + " has been caught!");


    }

    public void escape() {
        isCaught = false;
        System.out.println(name + " has escaped!");
    }



}
