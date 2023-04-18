public interface IVisitor {
    public double visit(Liquor liquorItem);

    public double visit(Tobacco tobaccoItem);

    public double visit(Necessity necessityItem);
    public double visit(Clothing clothingItem);
}
