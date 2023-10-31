package creational.factory.tax.algorithm;

import creational.factory.tax.TaxRegime;

//Step-3
public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime regime){
        switch (regime){
            case OLD :
                return new OldTaxAlgorithm();
            case NEW:
                return new NewTaxAlgorithm();
        }

        throw new RuntimeException("Invalid Regime"+regime);
    }
}
