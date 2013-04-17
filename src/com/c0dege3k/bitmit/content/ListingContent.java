package com.c0dege3k.bitmit.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ListingClass {

    /**
     * An array of sample (dummy) items.
     */
    public static List<CategoryListing> ITEMS = new ArrayList<CategoryListing>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, CategoryListing> ITEM_MAP = new HashMap<String, CategoryListing>();

    static {
        // Add 3 sample items.
        addItem(new CategoryListing("recent", "Recently Added"));
        addItem(new CategoryListing("ending", "Ending Soon"));
        addItem(new CategoryListing("hot", "Hot Auctions"));
        addItem(new CategoryListing("best", "Bestseller"));
    }

    private static void addItem(CategoryListing item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class CategoryListing {
        public String id;
        public String content;

        public CategoryListing(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
    
    public static class ItemListing {
        public String urlID;
        public String title;
        public int photo;
        
        public ItemListing(String urlID, String title, int photo) {
            this.urlID = urlID;
            this.title = title;
            this.photo = photo;
        }
        
        public String toString() {
            return title;
        }
    }
}
