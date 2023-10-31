package creational.factory.tax.algorithm;

import creational.factory.tax.SalaryDetails;

//Step-2 Create concrete classes
public class OldTaxAlgorithm implements TaxAlgorithm{

    @Override
    public Double calculateTax(SalaryDetails details) {
        return 0.4*details.getBasepay()+0.3*details.getHra();
    }
}
