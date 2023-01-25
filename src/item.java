import java.util.LinkedList;

public class item {
    private String itemName;
    private int itemCode;
    LinkedList<item> itemlist = new LinkedList<item>();

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemCode() {
        return itemCode;
    }


}
