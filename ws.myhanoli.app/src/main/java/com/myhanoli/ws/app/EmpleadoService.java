package com.myhanoli.ws.app;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface EmpleadoService {
	
	
	@WebMethod(operationName="getEmpleado")
	@WebResult(name="ResultadoOperacion")String getEmpleadoById(@WebParam(name="idEmpleado")int idEmpleado);

}
