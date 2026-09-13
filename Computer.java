public class Computer {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;

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

    public void Config() {
        System.out.println("Proccesor: " + cpu);
        System.out.println("Videocard: " + gpu);
        System.out.println("RAM capacity: " + ram + "GB");
        System.out.println("Storage capacity: " + storage + "GB");
    }

}
