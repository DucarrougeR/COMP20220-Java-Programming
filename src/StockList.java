public class StockList {
//A class for the stock list
	public static final int MAX_SIZE = 10000;
	
	private int size;
	
	private StockItem[] items;	
	public StockItem[] getItems() {
		return items;
	}
	public void setItems(StockItem[] items) {
		this.items = items;
	}
	
	public StockList() {
		items = new StockItem[MAX_SIZE];
		size = 0;
	}
////////////////////////////////////////////////////////////////
	public int getSize(){
		return size;
	}
	
	public boolean addStockItem(StockItem S){
		//check that the list is not full first
		if (size < MAX_SIZE){
			//take list 'items' at index=size and replace with object to add
			items[size] = S;
			//1 object added to list now, so increase size of list by 1
			size +=1;
			return true;
		} else {
			System.out.println("The item was not added to the list.");
			return false;
		}
	}
	
	public void checkStockItems(){
		for (int i=0; i<size; i++){
			System.out.println("ITEM: "+ items[i].stockQuantity +"units of "+ items[i].stockName +"with product number"
		+ items[i].productNumber +"in stock: total value "+ items[i].unitCost); 
		}
	}

	public void checkReorderLevels(){
		for (int i=0; i<size; i++){
			if (items[i].stockQuantity <= items[i].reorderLevel){
				System.out.println("REORDER: "+ items[i].stockQuantity +"units of "+ 
			items[i].stockName +"with product number"+ items[i].productNumber +"in stock: total cost "+ items[i].unitCost);
			}
		}
	}
}
