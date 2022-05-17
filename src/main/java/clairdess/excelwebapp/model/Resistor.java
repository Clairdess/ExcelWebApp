package clairdess.excelwebapp.model;

import clairdess.excelwebapp.entity.ResistorEntity;

public class Resistor {
    private String Name;
    private String Price;
    private String Stock;
    private String Supplier;
    private String MinQty;
    private String Series;
    private String Package;
    private String Part_status;
    private String CircuitType;
    private String Resistance;
    private String NumberOfResistors;
    private String ResistorsMatchingRatio;
    private String ResistorRatioDrift;
    private String NumberOfPins;
    private String PowerPerElement;
    private String TemperatureCoefficient;
    private String OperatingTemperature;


    public Resistor(String name, String price, String stock, String supplier, String minQty,
                    String series, String Package, String part_status, String circuitType,
                    String resistance, String numberOfResistors, String resistorsMatchingRatio,
                    String resistorRatioDrift, String numberOfPins, String powerPerElement,
                    String temperatureCoefficient, String operatingTemperature) {
        this.Name = name;
        this.Price = price;
        this.Stock = stock;
        this.Supplier = supplier;
        this.MinQty = minQty;
        this.Series = series;
        this.Package = Package;
        this.Part_status = part_status;
        this.CircuitType = circuitType;
        this.Resistance = resistance;
        this.NumberOfResistors = numberOfResistors;
        this.ResistorsMatchingRatio = resistorsMatchingRatio;
        this.ResistorRatioDrift = resistorRatioDrift;
        this.NumberOfPins = numberOfPins;
        this.PowerPerElement = powerPerElement;
        this.TemperatureCoefficient = temperatureCoefficient;
        this.OperatingTemperature = operatingTemperature;
    }

    public Resistor() {

    }

    public static Resistor toModel(ResistorEntity resistor) {
        Resistor entityToModel = new Resistor();
        entityToModel.setName(resistor.getName());
        entityToModel.setMinQty(resistor.getMinQty());
        entityToModel.setCircuitType(resistor.getCircuitType());
        entityToModel.setMinQty(resistor.getMinQty());
        entityToModel.setNumberOfResistors(resistor.getNumberOfResistors());
        entityToModel.setPackage(resistor.getPackage());
        entityToModel.setNumberOfPins(resistor.getNumberOfPins());
        entityToModel.setOperatingTemperature(resistor.getOperatingTemperature());
        entityToModel.setPart_status(resistor.getPart_status());
        entityToModel.setPowerPerElement(resistor.getPowerPerElement());
        entityToModel.setPrice(resistor.getPrice());
        entityToModel.setResistorRatioDrift(resistor.getResistorRatioDrift());
        entityToModel.setResistorsMatchingRatio(resistor.getResistorsMatchingRatio());
        entityToModel.setSeries(resistor.getSeries());
        entityToModel.setStock(resistor.getStock());
        entityToModel.setSupplier(resistor.getSupplier());
        entityToModel.setTemperatureCoefficient(resistor.getTemperatureCoefficient());
        return entityToModel;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public void setMinQty(String minQty) {
        MinQty = minQty;
    }

    public void setSeries(String series) {
        Series = series;
    }

    public void setPackage(String aPackage) {
        Package = aPackage;
    }

    public void setPart_status(String part_status) {
        Part_status = part_status;
    }

    public void setCircuitType(String circuitType) {
        CircuitType = circuitType;
    }

    public void setResistance(String resistance) {
        Resistance = resistance;
    }

    public void setNumberOfResistors(String numberOfResistors) {
        NumberOfResistors = numberOfResistors;
    }

    public void setResistorsMatchingRatio(String resistorsMatchingRatio) {
        ResistorsMatchingRatio = resistorsMatchingRatio;
    }

    public void setResistorRatioDrift(String resistorRatioDrift) {
        ResistorRatioDrift = resistorRatioDrift;
    }

    public void setNumberOfPins(String numberOfPins) {
        NumberOfPins = numberOfPins;
    }

    public void setPowerPerElement(String powerPerElement) {
        PowerPerElement = powerPerElement;
    }

    public void setTemperatureCoefficient(String temperatureCoefficient) {
        TemperatureCoefficient = temperatureCoefficient;
    }

    public void setOperatingTemperature(String operatingTemperature) {
        OperatingTemperature = operatingTemperature;
    }

    public String getName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }

    public String getStock() {
        return Stock;
    }

    public String getSupplier() {
        return Supplier;
    }

    public String getMinQty() {
        return MinQty;
    }

    public String getSeries() {
        return Series;
    }

    public String getPackage() {
        return Package;
    }

    public String getPart_status() {
        return Part_status;
    }

    public String getCircuitType() {
        return CircuitType;
    }

    public String getResistance() {
        return Resistance;
    }

    public String getNumberOfResistors() {
        return NumberOfResistors;
    }

    public String getResistorsMatchingRatio() {
        return ResistorsMatchingRatio;
    }

    public String getResistorRatioDrift() {
        return ResistorRatioDrift;
    }

    public String getNumberOfPins() {
        return NumberOfPins;
    }

    public String getPowerPerElement() {
        return PowerPerElement;
    }

    public String getTemperatureCoefficient() {
        return TemperatureCoefficient;
    }

    public String getOperatingTemperature() {
        return OperatingTemperature;
    }

    @Override
    public String toString() {
        return "Resistor{" +
                "Name='" + Name + '\'' +
                ", Price='" + Price + '\'' +
                ", Stock='" + Stock + '\'' +
                ", Supplier='" + Supplier + '\'' +
                ", MinQty='" + MinQty + '\'' +
                ", Series='" + Series + '\'' +
                ", Package='" + Package + '\'' +
                ", Part_status='" + Part_status + '\'' +
                ", CircuitType='" + CircuitType + '\'' +
                ", Resistance='" + Resistance + '\'' +
                ", NumberOfResistors='" + NumberOfResistors + '\'' +
                ", ResistorsMatchingRatio='" + ResistorsMatchingRatio + '\'' +
                ", ResistorRatioDrift='" + ResistorRatioDrift + '\'' +
                ", NumberOfPins='" + NumberOfPins + '\'' +
                ", PowerPerElement='" + PowerPerElement + '\'' +
                ", TemperatureCoefficient='" + TemperatureCoefficient + '\'' +
                ", OperatingTemperature='" + OperatingTemperature + '\'' +
                '}';
    }
}