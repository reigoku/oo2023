public class World {
    int width;
    int height;

    Item item;

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void printMap(int worldWidth, int worldHeight, int playerXcoordinate, int playerYcoordinate, char playerSymbol, int dragonXcoordinate, int dragonYcoordinate, char dragonSymbol, int orcXcoordinate, int orcYcoordinate, char orcSymbol) {
        for (int mapY = 0; mapY < worldHeight; mapY++) {
            //sout
            System.out.println();
            for (int mapX = 0; mapX < worldWidth; mapX++) {
                String symbol;
                if (mapY == 0 || mapY == (worldHeight -1)){
                    //System.out.print("-");
                    symbol = "-";
                } else if (mapX == 0 || mapX == (worldWidth -1)){
                    //System.out.print("|");
                    symbol = "|";
                } else {
                    //ctrl+alt+m /refactor->extract->method
                    //refactor->rename
                    for(Item i: items){
                        if (i.yCoordinate == mapY  && i.xCoordinate == mapX){
                            //System.out.print("I");
                            symbol = "I";
                            break;
                        }
                    }
                    if (playerXcoordinate == mapX && playerYcoordinate == mapY){
                        symbol = playerSymbol;
                    } else if (dragonXcoordinate == mapX && dragonYcoordinate == mapY) {
                        symbol = dragonSymbol;
                    } else if (orcXcoordinate == mapX && orcYcoordinate == mapY) {
                        symbol = orcSymbol;
                    }
                    for(Character c: characters){

                    }

                }
                System.out.print(symbol);
                symbol = " ";
            }
        }
    }

//        private static int getRandomcoordinate(int worldDimension) {
//            return (int) (Math.random() * (worldDimension - 2) + 1);
//
//        }

    //void on tagastustüüp - mis tüüp järgneb return kirjele
    //void tähendab et ei tagastata midagi
}
