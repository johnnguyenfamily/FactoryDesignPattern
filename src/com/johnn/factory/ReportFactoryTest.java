package com.johnn.factory;

/**
 * @author johnn
 *
 * ReportFactoryTest class to test the ReportFactory and its report types.
 */
public class ReportFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ReportFactory reportFactory = new ReportFactory();

        //get an object of Order report and call its generate() method
        IReport orderReport = reportFactory.getReport("ORDER");
        System.out.println(orderReport.generate());

        //get an object of Inventory report and call its generate() method
        IReport inventoryReport = reportFactory.getReport("INVENTORY");
        System.out.println(inventoryReport.generate());

        //get an object of AccountPayable report and call its generate() method
        IReport accountPayableReport = reportFactory.getReport("ACCOUNT_PAYABLE");
        System.out.println(accountPayableReport.generate());

        //get an object of AcountReceivable report and call its generate() method
        IReport accountReceivableReport = reportFactory.getReport("ACCOUNT_RECEIVABLE");
        System.out.println(accountReceivableReport.generate());        

	}

}
