/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.rOK;
import celestial.tV_2;

public class tj_3<T extends rOK>
extends tV_2<T> {
    private final Iq_1 id_byte = new Iq_1(this, 26, 21);
    private final Iq_1 id_protected;

    public tj_3(float f) {
        super(f);
        this.id_byte.id_class(-4.0f, 0.0f, -2.0f, 8.0f, 8.0f, 3.0f);
        this.id_protected = new Iq_1(this, 26, 21);
        this.id_protected.id_class(-4.0f, 0.0f, -2.0f, 8.0f, 8.0f, 3.0f);
        this.id_byte.id_catch = -1.5707964f;
        this.id_protected.id_catch = 1.5707964f;
        this.id_byte.id_class(6.0f, -8.0f, 0.0f);
        this.id_protected.id_class(-6.0f, -8.0f, 0.0f);
        this.id_class.id_break(this.id_byte);
        this.id_class.id_break(this.id_protected);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        if (((rOK)t).sJ()) {
            this.id_byte.id_finally = true;
            this.id_protected.id_finally = true;
        } else {
            this.id_byte.id_finally = false;
            this.id_protected.id_finally = false;
        }
    }

    @Override
    protected void id_class(Iq_1 iq_1) {
        Iq_1 iq_12 = new Iq_1(this, 0, 12);
        iq_12.id_class(-1.0f, -7.0f, 0.0f, 2.0f, 7.0f, 1.0f);
        iq_12.id_class(1.25f, -10.0f, 4.0f);
        Iq_1 iq_13 = new Iq_1(this, 0, 12);
        iq_13.id_class(-1.0f, -7.0f, 0.0f, 2.0f, 7.0f, 1.0f);
        iq_13.id_class(-1.25f, -10.0f, 4.0f);
        iq_12.id_case = 0.2617994f;
        iq_12.id_private = 0.2617994f;
        iq_13.id_case = 0.2617994f;
        iq_13.id_private = -0.2617994f;
        iq_1.id_break(iq_12);
        iq_1.id_break(iq_13);
    }
}

