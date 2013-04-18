/**
 * A listing item representing a product.
 **/

public static class ItemListing {
    public static final int AUCTION_ONLY = 0;
    public static final int BUY_ONLY = 1;
    public static final int AUCTION_OR_BUY = 2;
    
    public int urlID;
    public String title;
    public String descr;
    public double price;
    public int saleType;
    public int photo;
    
    public static ArrayList<ItemListing> sampleItems = new ArrayList<ItemListing>();
    sampleItems.add(new ItemListing(4566, "12 Month Netflix Subscription", 
                "A full annual subscription to Netflix, normally $148. Best deal out there.", 
                1, ItemListing.AUCTION_ONLY, 
                R.drawable.no_pic));
    sampleItems.add(new ItemListing(25447, "Bioshock Infinite and Crysis 3 Game codes",
            "I don't need three copies of these games, even though Bioshock is a great game.\nI can either send you the card via USPS First Class mail, or e-mail you the code under the scratch off portion.\nWinner's choice. Just to clarify this is for one code that will get you one copy of Bioshock Infinite and Crysis 3."
            20, ItemListing.AUCTION_ONLY,
            R.drawable.no_pic));
    
    //Temp constructor for sample data
    public ItemListing(int urlID, String title, String descr, double price, int saleType, int photo) {
        this.urlID = urlID;
        this.title = title;
        this.descr = descr;
        this.price = price;
        this.saleType = saleType;
        this.photo = photo;
    }
    
    public String toString() {
        return title;
    }
}