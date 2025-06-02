package com.arcgate.testcase;


import org.testng.annotations.Test;

import com.arcgate.base.Base;
import com.arcgate.page.SearchItems;

public class SearchTest extends Base {
	
	
	@Test(priority=1)
	public void verifySearch() throws InterruptedException  {
		
		SearchItems items=new SearchItems(driver);
		items.searchProducts();
			
	}
	
	
	@Test(priority=2)
	public void verifyTitle() throws InterruptedException {
		SearchItems items=new SearchItems(driver);
		items.title();
	}
	

}
