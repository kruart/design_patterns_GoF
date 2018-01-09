package design_patterns.creational_patterns.abstractfactory.factory;

import design_patterns.creational_patterns.abstractfactory.CardType;
import design_patterns.creational_patterns.abstractfactory.card.AmexGoldCreditCard;
import design_patterns.creational_patterns.abstractfactory.card.AmexPlatinumCreditCard;
import design_patterns.creational_patterns.abstractfactory.card.CreditCard;
import design_patterns.creational_patterns.abstractfactory.validator.AmexGoldValidator;
import design_patterns.creational_patterns.abstractfactory.validator.AmexPlatinumValidator;
import design_patterns.creational_patterns.abstractfactory.validator.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }

    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }

}
