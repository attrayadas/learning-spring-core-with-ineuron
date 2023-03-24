package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerMgmtService;
import in.ineuron.vo.CustomerVo;

@Component(value = "controller")
public class CustomerController {
	
	@Autowired
	ICustomerMgmtService service;

	static {
		System.out.println("Controller.class file is loading...");
	}

	public String processResult(CustomerVo vo) {
		CustomerDTO dto = new CustomerDTO();

		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

		String result = service.calculateSimpleInterest(dto);

		return result;
	}
}
