import Gun.*;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new AK47(),
                new WaterPistol(),
                new NailGun(),
                new DiscLauncher(),
                new rocketlauncher()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}