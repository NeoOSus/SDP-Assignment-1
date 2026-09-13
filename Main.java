public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        ComputerBuilder gamingBuilder = new GamingPCBuilder();
        director.constructStandartGamingPC(gamingBuilder);
        Computer gamingPC = gamingBuilder.build();
        System.out.println("Gaming PC: ");
        gamingPC.displayConfig();

        ComputerBuilder officeBuilder = new OfficePCBuilder();
        director.constructStandartOfficePC(officeBuilder);
        Computer officePC = officeBuilder.build();
        System.out.println("Office PC: ");
        officePC.displayConfig();
    }
}
