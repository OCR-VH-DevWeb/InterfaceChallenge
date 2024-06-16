public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    // methods
    /**
     * take off into the sky
     */
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off into the sky.");
            // Autre méthode avec printf
            // System.out.printf("%s takes off into the sky.%n", this.getName());
        }
    }

    /**
     * land on the ground
     */
    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            this.altitude = 0;
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + " is too high, it can't land.");
        }
        // Autre méthode avec printf
        // System.out.printf("%s lands on the ground.%n", this.getName());
        // } else {
        // System.out.printf("%s is too high, it can't land.%n", this.getName());
        // }
    }

    /**
     * glide through the air
     */
    @Override
    public void glide() {
        if (this.flying) {
            System.out.println(this.getName() + " is gliding through the air.");
        }
        // Autre méthode avec printf
        // System.out.printf("%s is gliding through the air.%n", this.getName());
    }

    /**
     * ascend to an altitude of ** meters.
     */
    @Override
    public void ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 1000);
            System.out.println(this.getName() + " ascends to an altitude of " + this.altitude + " meters.");
        }
        // Autre méthode avec printf
        // System.out.printf("%s ascends to an altitude of %d meters.%n",
        // this.getName(), this.altitude);

    }

    @Override
    public void descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(this.getName() + " descends to an altitude of " + this.altitude + " meters.");
        }
        // Autre méthode avec printf
        // System.out.printf("%s descends to an altitude of %d meters.%n",
        // this.getName(), this.altitude);
    }
}
