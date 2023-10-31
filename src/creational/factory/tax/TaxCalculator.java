package creational.factory.tax;

import creational.factory.tax.algorithm.TaxCalculatorFactory;

public class TaxCalculator {
    public static Double calculateTax(TaxRegime regime,SalaryDetails details){
//        switch (regime){
//            case OLD:
//                return 0.4*details.getBasepay()+0.3*details.getHra();
//            case NEW:
//                return 0.4*details.getBasepay()+
//                        0.3* details.getHra()+0.2* details.getLta();
//
//        }
        return TaxCalculatorFactory.getTaxAlgorithm(regime).calculateTax(details);
        // throw new RuntimeException("Invalid regieme"+regime);


    }
}
