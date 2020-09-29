package com.myhanoli.ws.app;

import javax.jws.WebService;

@WebService(endpointInterface="com.myhanoli.ws.app.EmpleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {

	public String getEmpleadoById(int idEmpleado) {
		
		String resp;
		
		resp=(idEmpleado == 10)?"Se encontró empleado":"Error";
		
		
		return resp;
	}

}
