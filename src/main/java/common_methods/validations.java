package common_methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class validations {
	
	
	public static boolean IsDropdownOptionFound(Select dropdown, String optionValue)
	{
		boolean flag=false;
		
		List<WebElement> ele_AllOptions = dropdown.getOptions();
		for(WebElement ele:ele_AllOptions)
		{
			String eleOptionValue = ele.getText().trim();
			if(optionValue.equals(eleOptionValue))
			{
				flag=true;
				break;
			}
		}
		
		return flag;
		
	}
	
	

}
