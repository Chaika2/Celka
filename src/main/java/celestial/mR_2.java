/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LV;
import celestial.QY;
import celestial.mY_2;
import celestial.mg_3;
import java.util.List;

public class mR_2
extends LV<mY_2> {
    public final /* synthetic */ mg_3 id_class;

    public mR_2(mg_3 mg_32) {
        this.id_class = mg_32;
        super(mg_32.id_volatile, mg_32.id_package, mg_32.id_int, 43, mg_32.id_int - 60, 24);
        for (int i = 0; i < mg_32.id_case.id_case().size(); ++i) {
            this.id_break(new mY_2(this));
        }
    }

    public static /* synthetic */ QY id_class(mR_2 mR_22) {
        return mR_22.id_native;
    }

    @Override
    public void id_class(mY_2 mY_22) {
        super.id_class(mY_22);
        this.id_class.id_native();
    }

    @Override
    protected boolean id_class() {
        return this.id_class.id_catch() == this;
    }

    public void id_throws() {
        int n = this.x_().indexOf(this.id_finally());
        this.id_native();
        for (int i = 0; i < this.id_class.id_case.id_case().size(); ++i) {
            this.id_break(new mY_2(this));
        }
        List list = this.x_();
        if (n >= 0 && n < list.size()) {
            this.id_class((mY_2)list.get(n));
        }
    }

    @Override
    protected int id_protected() {
        return this.id_final - 70;
    }
}

