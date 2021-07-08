package Java.Composition;

public class Motherboard {

    private String model;
    private String manufacture;
    private int ramDimms;
    private int vgaDimms;
    private String bios;

    public Motherboard(String model, String manufacture, int ramDimms, int vgaDimms, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramDimms = ramDimms;
        this.vgaDimms = vgaDimms;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamDimms() {
        return ramDimms;
    }

    public int getVgaDimms() {
        return vgaDimms;
    }

    public String getBios() {
        return bios;
    }
}
