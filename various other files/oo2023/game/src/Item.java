public class Item implements WorldObject{
    int xCoordinate;
    int yCoordinate;
    int strength;
    int durability;
    String name;

    public Item(int strength, int durability, String name, int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomcoordinate(worldWidth);
        this.yCoordinate = getRandomcoordinate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }
    public int getRandomcoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);

    }
}
