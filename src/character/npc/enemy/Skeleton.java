package src.character.npc.enemy;

import src.character.npc.Enemy;
import src.character.Player;

import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.image.Image;

public class Skeleton extends Enemy {
    public Skeleton() {
        super("Skeleton", 30, 8, 4);
    }

    @Override
    public int getExperience() {
        return ThreadLocalRandom.current().nextInt(5, 7);
    }

    @Override
    protected int[] getArgsForWeapon(Player player) {
        int baseAttack = ThreadLocalRandom.current().nextInt(16, 22);
        int baseStamina = ThreadLocalRandom.current().nextInt(4, 8);
        int[] res = { baseAttack, baseStamina };
        return res;
    }

    @Override
    protected int getDefenseForArmor(Player player) {
        return ThreadLocalRandom.current().nextInt(5, 8);
    }

    @Override
    public String getType() {
        return "Skeleton";
    }

    @Override
    public Image render() {
        String path = "./img/skeleton.gif";
        return new Image(getClass().getResource(path).toString());
    }
}