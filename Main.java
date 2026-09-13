public class Main {
    public static void main(String[] args) {

        ComputerBuilder gamingBuilder = new GamingPCBuilder();
        Computer gamingPC = gamingBuilder
                .setCpu("Intel i5 12th")
                .setGpu("Nvidia RTX 3050")
                .setRam(16)
                .setStorage(500) //my laptop configs for example
                .build();

        System.out.println("Gaming PC: ");
        gamingPC.Config();

        ComputerBuilder officeBuilder = new OfficePCBuilder();
        Computer officePC = officeBuilder
                .setCpu("Intel Pentium G5000")
                .setGpu("Intel Gpaphics(Integrated)")
                .setRam(8)
                .setStorage(1000)
                .build();

        System.out.println("Office PC: ");
        officePC.Config();
    }
}
