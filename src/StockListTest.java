public class StockListTest {

	public void main (String[] args){
		//here we are creating a StockItem object named Baked Beans with the following properties
		StockItem bakedBeans = new StockItem("Baked Beans", "A1001001000", 55, 60, 20, 0.50);
		//creating the other object in StockItem
		StockItem chickenSoup = new StockItem("Chicken Soup", "B2000100112", 32, 20, 10, 0.65);	
		StockItem tomatoSoup = new StockItem("Tomato Soup", "B2005113245", 7, 30, 12, 0.58);
		StockItem cocaCola = new StockItem("Coca Cola", "C5007383954", 100, 200, 50, 1.30);
		StockItem fantaOrange = new StockItem("Fanta Orange", "C5007351010", 50, 100, 50, 1.33);
		StockItem croissant = new StockItem("Croissant", "D3002439534", 47, 120, 60, 0.35);
		
		//here we retrieve the attribute 'productNumber' of the object Potatoes
		System.out.println(bakedBeans.productNumber);
		
		//we create a StockList object(empty list)
		StockList firstList = new StockList();
		//we add the new StockItem object (Baked Beans) to the list
		firstList.addStockItem(bakedBeans);
		
		//retrieve the new size of StockList object called FirstList, size should now be 1
		//but size is declared as a private variable... cannot access the variable directly
		//create a method in StockList class to access and return the variable 'size'
		firstList.getSize();
		
		//add remaining StockItem objects to the StockList object.
		firstList.addStockItem(chickenSoup);
		firstList.addStockItem(tomatoSoup);
		firstList.addStockItem(cocaCola);
		firstList.addStockItem(fantaOrange);
		firstList.addStockItem(croissant);
		
		//check StockList to see that size has increased and use method checkReorderLevels()
		firstList.getSize();
		firstList.checkReorderLevels();
		}
}
