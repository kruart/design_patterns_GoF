package design_patterns.creational_patterns.abstractfactory.validator;

import design_patterns.creational_patterns.abstractfactory.card.CreditCard;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }

}