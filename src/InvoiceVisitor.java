public class InvoiceVisitor implements IVisitor{

    private String descriptor = "";

    public InvoiceVisitor(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("1 - " + liquorItem.getClass() + " ... ");
        return 0;
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("1 - " + tobaccoItem.getClass() + " ... ");
        return 0;
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("1 - " + necessityItem.getClass() + " ... ");
        return 0;
    }

    @Override
    public double visit(Clothing clothingItem) {
        System.out.println("1 - " + clothingItem.getClass() + " ... ");
        return 0;
    }
}
