import java.util.Scanner;

public class StoreToRent {
    private static final double MAINTENANCE_COST = 1000;
    private final double INTEREST_RATE = 0.25;
    private String storeName;
    private String storeBusiness;
    private double totalArea;
    private double sellingPrice;
    private double rent;
    private String minimumLeasePeriod;
    private String floorNumber;
    private boolean available;
    private boolean loanRequired;
    private double loanAmount;
    private int loanPaymentTerm;

    public StoreToRent() {
    }

    public StoreToRent(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        this.loanRequired = loanRequired;
        this.loanAmount = loanAmount;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreBusiness() {
        return storeBusiness;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRent() {
        return rent;
    }

    public String getMinimumLeasePeriod() {
        return minimumLeasePeriod;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getINTEREST_RATE() {
        return INTEREST_RATE;
    }

    public boolean isLoanRequired() {
        return loanRequired;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getLoanPaymentTerm() {
        return loanPaymentTerm;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreBusiness(String storeBusiness) {
        this.storeBusiness = storeBusiness;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public void setMinimumLeasePeriod(String minimumLeasePeriod) {
        this.minimumLeasePeriod = minimumLeasePeriod;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void enterStoreDetails() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Store Name: ");
        setStoreName(input.nextLine());

        System.out.println("Enter Store Business: ");
        setStoreBusiness(input.nextLine());

        System.out.println("Enter Total Area: ");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Invalid input. Please enter a valid number for Total Area: ");
        }
        setTotalArea(input.nextDouble());
        input.nextLine();

        System.out.println("Enter Selling Price: ");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Invalid input. Please enter a valid number for Selling Price: ");
        }
        setSellingPrice(input.nextDouble());
        input.nextLine();

        System.out.println("Enter Rent: ");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Invalid input. Please enter a valid number for Rent: ");
        }
        setRent(input.nextDouble());
        input.nextLine();

        System.out.println("Enter Minimum Lease Period: ");
        setMinimumLeasePeriod(input.nextLine());

        System.out.println("Enter Floor Number: ");
        setFloorNumber(input.nextLine());

        System.out.println("Enter Available: ");
        while (true) {
            String inputStr = input.nextLine().trim();
            if ("true".equalsIgnoreCase(inputStr)) {
                setAvailable(true);
                break;
            } else if ("false".equalsIgnoreCase(inputStr)) {
                setAvailable(false);
                break;
            } else {
                System.out.println("Invalid input. Please enter either 'true' or 'false': ");
            }
        }

        input.close();
    }

    public double calculateLoanFinancing() {
        if (loanRequired) {
            return (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\nStore Name: " + storeName + "\nStore Business: " + storeBusiness + "\nTotal Area (sq.m): " + totalArea + "\nSelling Price: €" + sellingPrice + "\nRent: €" + rent + "\nMinimum Lease Period: " + minimumLeasePeriod + "\nFloor Number: " + floorNumber + "\nMaintenance Cost: €" + MAINTENANCE_COST + "\nAvailable: " + available + "\n";
    }
}    