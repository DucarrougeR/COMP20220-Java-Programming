public class StockItem {
	//declare the properties of StockItem objects
	String stockName;
	String productNumber;
	int stockQuantity;
	int reorderLevel;
	int reorderAmount;
	double unitCost;
	
	public StockItem(String name, String ID, int quantity, int level, int reorderAmount, double cost){
		//assign values to each object properties
		this.stockName = name;
		this.productNumber = ID;
		this.stockQuantity = quantity;
		this.reorderLevel = level;
		this.reorderAmount = reorderAmount;
		this.unitCost = cost;
	}

	public String getStockName() {
		return stockName;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public int getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public int getReorderAmount() {
		return reorderAmount;
	}
	public void setReorderAmount(int reorderAmount) {
		this.reorderAmount = reorderAmount;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	
	public boolean reorderLevelReached(){
		if (stockQuantity <= reorderLevel) {
			return true ;
		} else {
			return false;
		}
	}
	
	
	
}
