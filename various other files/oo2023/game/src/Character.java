public class Character implements WorldObject{
    int xCoordinate;//castimine - teisendamine ühest tüübist teise
    int yCoordinate;
    char symbol;
    public Character(int worldWidth, int worldHeight, char symbol){
        this.yCoordinate = getRandomcoordinate(worldHeight);
        this.xCoordinate = getRandomcoordinate(worldWidth);
        this.symbol = symbol;
    }
    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);

    }

    @Override
    public int getRandomcoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
