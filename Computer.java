public class Computer {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    private final int GBinTB = 1024;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void displayConfig() {
        System.out.println("Proccesor: " + cpu);
        System.out.println("Videocard: " + gpu);
        System.out.println("RAM capacity: " + ram + "GB");

        if (storage >= GBinTB) {
            int TeraB = storage / GBinTB;
            System.out.println("Storage capacity: " + TeraB + "TB");
        } else {
            System.out.println("Storage capacity: " + storage + "GB");
        }

        System.out.println("________________________");
    }

}
