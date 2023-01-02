import java.util.Optional;

public class DebitPayMethod extends AbstractPayMethod {
    private final String accountId;

    public DebitPayMethod(String accountId) {
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
            return Optional.of(ViewType.DEBIT);
        }
        return Optional.of(ViewType.EMPTY);
    }
}
