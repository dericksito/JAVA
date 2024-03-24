package com.krakedev.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
private static Logger logger=LogManager.getLogger(Admin.class);//asi creamos una instancia  y tiene q recifir como parametro la clase a la q se le aplica
//entonces este logger esta atado a mi clase admin en este caso


public void agregar() {
	
	logger.info("mensaje de info ");
	logger.warn("mensaje de warn ");
	logger.trace("mensaje de trace ");
	logger.error("mensaje de error ");
	logger.debug("mensaje de debug ");
}
}
 