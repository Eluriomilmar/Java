package parafernalhas.E0802;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public Double totalprice() {
        return getPrice() + customsFee;
    }

    @Override
    public String PriceTag() {
        return getName() + " - $ " + String.format("%.2f", totalprice()) + " (Customs fee: $ "
                + String.format("%.2f", customsFee) + ")";
    }
}
