import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //algväärtus; kuni; iga tsükkel
        String sonaline = "sõnaline muutuja";
        char taheline = 's';
        double komakohaga = 737.826348;
        //float komakohaga2 = 123.7865757;
        boolean kahendv22rtus = true; // true/false, 1/0, y/n
        byte v2ikenumber = 106;
        short lyhikenumber = 621;
        long pikknumber = 6748348351903657L;

        Scanner scanner = new Scanner(System.in);
        World world = new World(10, 5);
        String input = scanner.nextLine();


        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);
        List<Character> characters = new ArrayList<>(Arrays.asList(player, dragon, orc));

        Item sword = new Item(10, 1, "sword", world.width, world.height);
        Item hammer = new Item(5, 3, "hammer", world.width, world.height);
        Item boot = new Item(1, 10, "boot", world.width, world.height);
//import! java.util.List
        //import java.util.ArrayList
        //import java.util.Arrays
        //printmapis kasutada listi, if-else asemel for loop
        List<Item> items = new ArrayList<>(Arrays.asList(sword, hammer, boot));



        world.printMap(world.width, world.height, characters, items);

        while(!input.equals("end")){

            input = scanner.nextLine();

            player.move(input, world);
            world.printMap(world.width, world.height, player.xCoordinate, player.yCoordinate, player.Symbol, dragon.xCoordinate, dragon.yCoordinate, dragon.symbol, orc.xCoordinate, orc.yCoordinate, orc.symbol);
            System.out.println();
            for (Item i:items) {
                if (i.xCoordinate == player.xCoordinate && i.yCoordinate == player.yCoordinate){
                    player.item = i;
                    System.out.println("picked up " +   player.item.name);
                    break;

                }
            }
        }
        //fori
    }


}