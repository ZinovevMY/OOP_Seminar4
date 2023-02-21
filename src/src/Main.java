import armors.Helmet;
import items.Archer;
import items.Swordman;
import items.Warrior;
import team.Team;
import weapons.Bow;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>("Robin Hood");
            archers.addWarrior(new Archer("Robin of Loxley", new Bow(), new Helmet(), new))
            .addWarrior(new Archer("Little John", new Bow()))
            .addWarrior(new Archer("Prior Took", new Bow()));

        System.out.println(archers);

        Team<Warrior> sheriffNotingham = new Team<>("Sheriff of Notingham");
            sheriffNotingham.addWarrior(new Swordman("Sheriff", new Sword()))
            .addWarrior(new Swordman("Guy Gizborn", new Sword()))
            .addWarrior(new Archer("Guardian", new Bow()));

        System.out.println(sheriffNotingham);

    }
}