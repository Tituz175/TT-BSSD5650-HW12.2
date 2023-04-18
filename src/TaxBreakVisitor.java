import java.text.DecimalFormat;

public class TaxBreakVisitor implements IVisitor{

    DecimalFormat df = new DecimalFormat("#.##");

    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .08) + liquorItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a tobacco item

    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .28) + tobaccoItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a necessity item

    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }

    public double visit(Clothing clothingItem) {
        System.out.println("Clothing Item: Price with Tax");
        return Double.parseDouble(df.format(clothingItem.getPrice()));
    }
}
