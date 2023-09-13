public class Phone {
    String os;
    int ram;
    double screenSize;

    private Phone(String os, int ram, double screenSize) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Phone [OS=" + os + ", RAM=" + ram + "GB, ScreenSize=" + screenSize + " inches]";
    }

    public static class PhoneBuilder {
        String os;
        int ram;
        double screenSize;

        public PhoneBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Phone build() {
            return new Phone(os, ram, screenSize);
        }
    }

    // Usage example
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder()
                .setOs("Android")
                .setRam(8)
                .setScreenSize(6.4)
                .build();

        System.out.println(phone);
    }
}
