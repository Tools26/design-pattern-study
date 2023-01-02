package payment;

import java.util.Optional;

public abstract class AbstractPayMethod {
    public final PaymentView create() {
        boolean enable = makeEnable();
        boolean visible = makeVisible();
        boolean selectable = enable && makeSelectable();
        boolean checked = selectable && makeChecked();
        Optional<ViewType> type = create(enable, visible, selectable, checked);
        return create(type);
    }

    protected abstract boolean makeVisible();
    protected abstract boolean makeEnable();
    protected abstract boolean makeSelectable();
    protected abstract boolean makeChecked();
    protected abstract Optional<ViewType> create(boolean enable,
                                                 boolean visible,
                                                 boolean selectable,
                                                 boolean checked);


    private PaymentView create(Optional<ViewType> payType) {
        if(payType.isPresent()) {
            ViewType type = payType.get();
            System.out.println(type.toString() + " view created.");
            return new PaymentView(type);
        }
        return  new PaymentView(ViewType.EMPTY);
    }
}
