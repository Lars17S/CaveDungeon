package src.item.potion;

import src.item.Potion;
import javafx.scene.image.Image;

public class StaminaPotion extends Potion {
    public StaminaPotion(int recoveryPoints) {
        super("Stamina Potion", recoveryPoints);
    }

    @Override
    public char getType() {
        return 's';
    }

    @Override
    public Image render() {
        return new Image(getClass().getResource("./img/staminapotion.png").toString());
    }
}
