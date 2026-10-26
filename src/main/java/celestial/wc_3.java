/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.rOb_1;
import celestial.wk_3;

public class wc_3<T extends rOb_1>
extends wk_3<T> {
    private float id_catch;

    public wc_3() {
        super(12, 0.0f, false, 8.0f, 4.0f, 2.0f, 2.0f, 24);
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-3.0f, -4.0f, -6.0f, 6.0f, 6.0f, 8.0f, 0.0f);
        this.id_class.id_class(0.0f, 6.0f, -8.0f);
        this.id_break = new Iq_1(this, 28, 8);
        this.id_break.id_class(-4.0f, -10.0f, -7.0f, 8.0f, 16.0f, 6.0f, 0.0f);
        this.id_break.id_class(0.0f, 5.0f, 2.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        this.id_class.id_case = this.id_catch;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        super.id_class(t, f, f2, f3);
        this.id_class.id_protected = 6.0f + ((rOb_1)t).id_throw(f3) * 9.0f;
        this.id_catch = ((rOb_1)t).id_interface(f3);
    }
}

