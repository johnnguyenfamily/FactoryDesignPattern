package com.johnn.factory;

/**
 * @author johnn
 *
 * ReportFactory class to provide methods to retrieve the object of a specified report type. 
 */
public class ReportFactory {

	public IReport getReport(String reportType) {
		if (reportType == null) {
			return null;
		}
		else if (reportType.equals("ORDER")) {
			return new Order();
		}
		else if (reportType.equals("INVENTORY")) {
			return new Inventory();
		}
		else if (reportType.equals("ACCOUNT_PAYABLE")) {
			return new AccountPayable();
		}
		else if (reportType.equals("ACCOUNT_RECEIVABLE")) {
			return new AccountReceivable();
		}
		
		return null;
	}
}
