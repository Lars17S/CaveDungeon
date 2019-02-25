package src.character;

public class Character {
    private String nombre;
    private int healthPoints;
    private int experience;

    public Character(String nombre, int healthPoints, int experience) {
        this.nombre = nombre;
        this.healthPoints = healthPoints;
        this.experience = experience;
    }

    public Character() {
        // Set random name, hp and experience
        // For boss and enemy npc
    }
}
