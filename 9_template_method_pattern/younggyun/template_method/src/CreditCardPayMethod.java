import java.util.Optional;

public class CreditCardPayMethod extends AbstractPayMethod {
    private final String accountId;

    public CreditCardPayMethod(String accountId) {
        this.accountId = accountId;
    }

    @Override
    boolean makeVisible() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    boolean makeEnable() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    boolean makeSelectable() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    boolean makeChecked() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    Optional<ViewType> create(boolean enable, boolean visible, boolean selectable, boolean checked) {
        if (enable && visible && selectable && checked) {
            return Optional.of(ViewType.CREDIT_CARD);
        }
        return Optional.of(ViewType.EMPTY);
    }
}
