package com.johnn.factory;

/**
 * @author johnn
 *
 * Inventory class to generate the Inventory report.
 */
public class Inventory implements IReport {

	/* (non-Javadoc)
	 * @see com.johnn.factory.IReport#generate()
	 */
	@Override
	public String generate() {
		return "Inventory report is generated.";
	}

}
