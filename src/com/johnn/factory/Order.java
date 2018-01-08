package com.johnn.factory;

/**
 * @author johnn
 *
 * Order class to generate the Order report.
 */
public class Order implements IReport {

	/* (non-Javadoc)
	 * @see com.johnn.factory.IReport#generate()
	 */
	@Override
	public String generate() {
		return "Order report is generated.";
	}

}
