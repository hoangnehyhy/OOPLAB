public class Cart {
    public static final int Max_Numbers_Ordered = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[Max_Numbers_Ordered];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if(qtyOrdered < Max_Numbers_Ordered){
            itemOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("Added successfully!");
        }
        else
            System.out.println("Fully added!");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        boolean found = false;
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemOrdered[i] == dvd){
                found = true;
                for(int j = i; j < qtyOrdered; j++) {
                    itemOrdered[j] = itemOrdered[j+1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Removed successfully!");
                break;
            }
        }
        if(!found){
            System.out.println("Cannot find digital video disc!");
        }
    }

    public float TotalCost(){
        float Total = 0;
        for(int i = 0; i < qtyOrdered; i++) Total += itemOrdered[i].getCost();
        return Total;
    }
}
