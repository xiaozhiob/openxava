

// File generated by OpenXava: Fri Jul 09 10:55:15 CEST 2021
// Archivo generado por OpenXava: Fri Jul 09 10:55:15 CEST 2021

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Formula		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IFormula  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_name = "name"; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException; 	
	public static final String PROPERTY_recipe = "recipe"; 
	java.lang.String getRecipe() throws RemoteException;
	void setRecipe(java.lang.String recipe) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException;	

	java.util.Collection getIngredients() throws RemoteException;		

	// References/Referencias

	// Methods 


}