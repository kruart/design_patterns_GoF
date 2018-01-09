package design_patterns.creational_patterns.abstractfactory.factory;

import design_patterns.creational_patterns.abstractfactory.CardType;
import design_patterns.creational_patterns.abstractfactory.card.CreditCard;
import design_patterns.creational_patterns.abstractfactory.card.VisaBlackCreditCard;
import design_patterns.creational_patterns.abstractfactory.card.VisaGoldCreditCard;
import design_patterns.creational_patterns.abstractfactory.validator.Validator;
import design_patterns.creational_patterns.abstractfactory.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
