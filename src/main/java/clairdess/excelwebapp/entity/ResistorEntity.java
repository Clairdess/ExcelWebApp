package clairdess.excelwebapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "resistor_entity")
public class ResistorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getMinQty() {
        return MinQty;
    }

    public void setMinQty(String minQty) {
        MinQty = minQty;
    }

    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        Series = series;
    }

    public String getPackage() {
        return Package;
    }

    public void setPackage(String aPackage) {
        Package = aPackage;
    }

    public String getPart_status() {
        return Part_status;
    }

    public void setPart_status(String part_status) {
        Part_status = part_status;
    }

    public String getCircuitType() {
        return CircuitType;
    }

    public void setCircuitType(String circuitType) {
        CircuitType = circuitType;
    }

    public String getResistance() {
        return Resistance;
    }

    public void setResistance(String resistance) {
        Resistance = resistance;
    }

    public String getNumberOfResistors() {
        return NumberOfResistors;
    }

    public void setNumberOfResistors(String numberOfResistors) {
        NumberOfResistors = numberOfResistors;
    }

    public String getResistorsMatchingRatio() {
        return ResistorsMatchingRatio;
    }

    public void setResistorsMatchingRatio(String resistorsMatchingRatio) {
        ResistorsMatchingRatio = resistorsMatchingRatio;
    }

    public String getResistorRatioDrift() {
        return ResistorRatioDrift;
    }

    public void setResistorRatioDrift(String resistorRatioDrift) {
        ResistorRatioDrift = resistorRatioDrift;
    }

    public String getNumberOfPins() {
        return NumberOfPins;
    }

    public void setNumberOfPins(String numberOfPins) {
        NumberOfPins = numberOfPins;
    }

    public String getPowerPerElement() {
        return PowerPerElement;
    }

    public void setPowerPerElement(String powerPerElement) {
        PowerPerElement = powerPerElement;
    }

    public String getTemperatureCoefficient() {
        return TemperatureCoefficient;
    }

    public void setTemperatureCoefficient(String temperatureCoefficient) {
        TemperatureCoefficient = temperatureCoefficient;
    }

    public String getOperatingTemperature() {
        return OperatingTemperature;
    }

    public void setOperatingTemperature(String operatingTemperature) {
        OperatingTemperature = operatingTemperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
