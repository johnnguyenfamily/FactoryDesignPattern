package com.johnn.factory;

/**
 * @author johnn
 *
 * AccountPayable class to generate the AccountPayable report.
 */
public class AccountPayable implements IReport {

	/* (non-Javadoc)
	 * @see com.johnn.factory.IReport#generate()
	 */
	@Override
	public String generate() {
		return "AccountPayable report is generated.";
	}

}
