package clairdess.excelwebapp.model;

public class Resistor {
    private final String Name;
    private final String Price;
    private final String Stock;
    private final String Supplier;
    private final String MinQty;
    private final String Series;
    private final String Package;
    private final String Part_status;
    private final String CircuitType;
    private final String Resistance;
    private final String NumberOfResistors;
    private final String ResistorsMatchingRatio;
    private final String ResistorRatioDrift;
    private final String NumberOfPins;
    private final String PowerPerElement;
    private final String TemperatureCoefficient;
    private final String OperatingTemperature;

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