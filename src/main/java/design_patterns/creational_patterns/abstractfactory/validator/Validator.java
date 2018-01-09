package design_patterns.creational_patterns.abstractfactory.validator;

import design_patterns.creational_patterns.abstractfactory.card.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
