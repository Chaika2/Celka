/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LV;
import celestial.Ml_1;
import celestial.QY;
import celestial.ZU;
import celestial.Za_1;
import celestial.jj_3;

public class Ze_1
extends LV<Za_1> {
    public final /* synthetic */ ZU id_class;

    public Ze_1(ZU zU, QY qY) {
        this.id_class = zU;
        super(qY, zU.id_package, zU.id_int, 32, zU.id_int - 65 + 4, 18);
        for (jj_3 jj_32 : zU.id_private.id_byte()) {
            Za_1 za_1 = new Za_1(this, jj_32);
            this.id_break(za_1);
            if (!zU.id_private.id_break().getCode().equals(jj_32.getCode())) continue;
            this.id_class(za_1);
        }
        if (this.id_finally() != null) {
            this.id_byte((Za_1)this.id_finally());
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1) {
        this.id_class.id_class(ml_1);
    }

    @Override
    protected boolean id_class() {
        return this.id_class.id_catch() == this;
    }

    public static /* synthetic */ int id_class(Ze_1 ze_1) {
        return ze_1.id_final;
    }

    @Override
    public void id_class(Za_1 za_1) {
        super.id_class(za_1);
    }

    @Override
    protected int id_protected() {
        return super.id_protected() + 20;
    }

    @Override
    public int F_() {
        return super.F_() + 50;
    }
}

