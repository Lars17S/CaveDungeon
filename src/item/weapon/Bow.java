package src.item.weapon;

import src.item.Weapon;
import src.item.weapon.Ability;
import javafx.scene.image.Image;

public class Bow extends Weapon {
    // Names from https://torchlight.fandom.com/wiki/Bows_(T2)
    private final String[] names = { "Killseeker", "Knight's Bow", "Spinepiercer", "Beastbane", "The Hunting God's Bow",
            "Stormbow", "The Thunderbow", "Skysplitter" };

    public Bow(int baseAttack, int baseStamina) {
        super("",
                new Ability[] { new Ability("Single Shot", baseAttack, baseStamina),
                        new Ability("Triple Shot", 2 * baseAttack, 2 * baseStamina),
                        new Ability("Critical Shot", (int) (3.5 * baseAttack), (int) (3.5 * baseStamina)) });
        setName(names[(int) (Math.random() * names.length)]);
    }

    @Override
    public String getType() {
        return "Bow";
    }

    @Override
    public Image render() {
        return new Image(getClass().getResource("./img/bow" + (Integer.toString((int)(Math.random() * 5) + 1)) + ".png").toString());
    }
}
