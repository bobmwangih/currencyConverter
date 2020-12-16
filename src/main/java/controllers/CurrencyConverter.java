package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyConverter {

	@RequestMapping("/convert")
	public ModelAndView convertCurrency(HttpServletRequest request, HttpServletRequest response) {
		int number = Integer.valueOf(request.getParameter("number"));
		String curFrom = request.getParameter("currencyFrom");
		String curTo = request.getParameter("currencyTo");
		double rate = CurrencyRate.getCurrencyRate(curFrom,curTo);
		double result = number * rate ;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("answer", result);
		mv.addObject("computedCurrency", curTo);
		mv.addObject("cRate", rate);
		return mv;
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public ModelAndView goHome(HttpServletRequest request, HttpServletRequest response) {
		ModelAndView m = new ModelAndView();
		m.setViewName("index.jsp");
		return m;

	}
	

}
