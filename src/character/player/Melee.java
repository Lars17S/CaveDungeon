package src.character.player;

import src.character.Player;
import src.item.Inventory;

public class Melee extends Player {
    public Melee(String name, int healthPoints, char gender, Inventory inventory, double attack) {
        super(name, healthPoints, gender, inventory, attack);
    }
}
