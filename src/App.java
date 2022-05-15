public class App {
    public static void App(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");
        //creating the objects
        Wizard Sau= new Wizard("Sau", 30, 80, 100);
        Warlock Ghost = new Warlock("Ghost", 20, 70, 100);

        //the implementation of method nameDisplay();
        Sau.nameDisplay();
        Ghost.nameDisplay();

        //start of the sequence
        Sau.hailStorm(Ghost);
        Sau.showStats();
        Sau.showStats();

        Ghost.maelStorm(Sau);
        //implementation of method showStats();
        Sau.showStats();
        Ghost.showStats();

        //the use of regen spell
        Sau.healSpell();
        Sau.showStats();
        Ghost.showStats();

        Ghost.fireBall(Sau);
        Sau.showStats();
        Ghost.showStats();

        Ghost. fireBall(Ghost);
        //the levelUp(); method
        Sau.levelUp();
    }
}
