public class GamingPCBuilder implements ComputerBuilder{
    private Computer computer = new Computer();

    @Override
    public ComputerBuilder setCpu(String cpu) {
        this.computer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        this.computer.setGpu(gpu);
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.computer.setRam(ram);
        return this;
    }

    @Override
    public ComputerBuilder setStorage(int storage) {
        this.computer.setStorage(storage);
        return this;
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
