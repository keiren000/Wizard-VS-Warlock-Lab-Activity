public class Wizard extends Character {
    Wizard (String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }

    //these 2 methods is the attack spells
    public void Fireball(Character enemyCharacter) {
        int damagePoints = 150;
        int manaCost = 50;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Fireball (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void hailStorm(Character enemyCharacter){
        int damagePoints =120;
        int manaCost = 60;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with hailStorm (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }

    //this method is the heal spell
    public void healSpell(){
        int heal=100;
        int manaRegen=50;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }
}