public class Director {
    public void constructStandartGamingPC(ComputerBuilder builder) {
        builder.setCpu("Intel i5 12th")
                .setGpu("Nvidia RTX3050")
                .setRam(16)
                .setStorage(512);
    }

    public void constructStandartOfficePC(ComputerBuilder builder) {
        builder.setCpu("Intel Pentium G5000")
                .setGpu("Intel Graphics(Integrated)")
                .setRam(8)
                .setStorage(1024);
    }
}
