import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);
        Clothing socks = new Clothing(4.99);

        TaxVisitor taxVisitor = new TaxVisitor();
        TaxBreakVisitor taxBreakVisitor = new TaxBreakVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();
        InvoiceVisitor invoiceVisitor = new InvoiceVisitor("on clearance");

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Which tax do you want to apply? \n\t1. Tax Break Visitor\n\t2. Tax Holiday Visitor\n\t3. Tax visitor\nInput your option: ");
        int tax = scanner1.nextInt();
        System.out.print("Do you want to see an invoice\nInput your option(y/n): ");
        String invoice = scanner2.nextLine();

        switch (tax) {
            case 1 -> {
                double cigarprice = cigars.accept(taxBreakVisitor);
                double vodkaprice = vodka.accept(taxBreakVisitor);
                double milkprice = milk.accept(taxBreakVisitor);
                double socksprice = socks.accept(taxBreakVisitor);
                if (Objects.equals(invoice, "y")){
                    System.out.println(cigars.accept(invoiceVisitor) + cigarprice);
                    System.out.println(vodka.accept(invoiceVisitor) + vodkaprice);
                    System.out.println(milk.accept(invoiceVisitor) + milkprice);
                    System.out.println(socks.accept(invoiceVisitor) + socksprice);
                } else {
                    System.out.println(cigars.accept(taxBreakVisitor));
                    System.out.println(vodka.accept(taxBreakVisitor));
                    System.out.println(milk.accept(taxBreakVisitor));
                    System.out.println(socks.accept(taxBreakVisitor));
                }
            }
            case 2 -> {
                double cigarprice = cigars.accept(taxHolidayVisitor);
                double vodkaprice = vodka.accept(taxHolidayVisitor);
                double milkprice = milk.accept(taxHolidayVisitor);
                double socksprice = socks.accept(taxHolidayVisitor);
                if (Objects.equals(invoice, "y")){
                    System.out.println(cigars.accept(invoiceVisitor) + cigarprice);
                    System.out.println(vodka.accept(invoiceVisitor) + vodkaprice);
                    System.out.println(milk.accept(invoiceVisitor) + milkprice);
                    System.out.println(socks.accept(invoiceVisitor) + socksprice);
                } else {
                    System.out.println(cigars.accept(taxHolidayVisitor));
                    System.out.println(vodka.accept(taxHolidayVisitor));
                    System.out.println(milk.accept(taxHolidayVisitor));
                    System.out.println(socks.accept(taxHolidayVisitor));
                }
            }
            case 3 -> {
                double cigarprice = cigars.accept(taxVisitor);
                double vodkaprice = vodka.accept(taxVisitor);
                double milkprice = milk.accept(taxVisitor);
                double socksprice = socks.accept(taxVisitor);
                if (Objects.equals(invoice, "y")){
                    System.out.println(cigars.accept(invoiceVisitor) + cigarprice);
                    System.out.println(vodka.accept(invoiceVisitor) + vodkaprice);
                    System.out.println(milk.accept(invoiceVisitor) + milkprice);
                    System.out.println(socks.accept(invoiceVisitor) + socksprice);
                } else {
                    System.out.println(cigars.accept(taxVisitor));
                    System.out.println(vodka.accept(taxVisitor));
                    System.out.println(milk.accept(taxVisitor));
                    System.out.println(socks.accept(taxVisitor));
                }
            }
            default -> System.out.println("Sorry, invalid option.");
        }
    }
}