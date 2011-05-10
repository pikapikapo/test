package test.web.controllers;

import java.util.Map;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

import test.web.services.SimpleProductManager;

public class InventoryControllerTests extends TestCase {

	 public void testHandleRequestView() throws Exception{
	        InventoryController controller = new InventoryController();
	        controller.setProductManager(new SimpleProductManager());
	        ModelAndView modelAndView = controller.handleRequest(null, null);
	        assertEquals("inventory", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
	        Map modelMap = (Map) modelAndView.getModel().get("model");
	        String nowValue = (String) modelMap.get("now");
	        assertNotNull(nowValue);
	    }
}