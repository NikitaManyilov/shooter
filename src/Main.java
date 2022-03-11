import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()-1
        );
        int slot;
        int maxSlot;
        maxSlot = player.getSlotsCount();
        boolean condition = true;

        while (condition) {
            slot = scanner.nextInt();
            if (slot < maxSlot & slot >= 0){
                player.shotWithWeapon(slot);
                System.out.println("Перезарядил и убрал в инвентарь.");
            }
            else {
                System.out.println("Слот без оружия");
            }
            if (slot == -1) {
                condition = false;
                System.out.println("Game over!");
            }
        }
    }
}