class main{
    public static void main(String[] args) {
        
        //this objects implements prey interface.
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Pig pig = new Pig();

        //this objects implements predator interface.
        Crocodile croc = new Crocodile();
        Shark shark = new Shark();
        Hawk hawk = new Hawk();

        croc.hunt();
        shark.hunt();
        hawk.hunt();

        rabbit.prey();
        fish.prey();
        pig.prey();

        

        
    }
}