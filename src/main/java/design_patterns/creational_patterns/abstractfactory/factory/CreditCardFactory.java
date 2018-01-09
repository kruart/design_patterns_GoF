package design_patterns.creational_patterns.abstractfactory.factory;

import design_patterns.creational_patterns.abstractfactory.CardType;
import design_patterns.creational_patterns.abstractfactory.card.CreditCard;
import design_patterns.creational_patterns.abstractfactory.validator.Validator;

// Abstract Factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }

    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
