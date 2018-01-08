package com.johnn.factory;

/**
 * @author johnn
 *
 * AccountReceivable class to generate the AccountReceivable report.
 */
public class AccountReceivable implements IReport {

	/* (non-Javadoc)
	 * @see com.johnn.factory.IReport#generate()
	 */
	@Override
	public String generate() {
		return "AccountReceivable report is generated.";
	}

}
