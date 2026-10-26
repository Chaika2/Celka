/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.Iy_1;
import celestial.is_3;
import celestial.rbB_2;
import celestial.tW_2;
import celestial.to_3;

public class wR_2<T extends rbB_2>
extends tW_2<T>
implements to_3 {
    private Iq_1 id_native;

    public wR_2(float f, boolean bl) {
        super(f, 0.0f, 64, bl ? 32 : 64);
        if (bl) {
            this.id_class = new Iq_1(this, 0, 0);
            this.id_class.id_class(-4.0f, -10.0f, -4.0f, 8.0f, 8.0f, 8.0f, f);
            this.id_byte = new Iq_1(this, 16, 16);
            this.id_byte.id_class(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, f + 0.1f);
            this.id_case = new Iq_1(this, 0, 16);
            this.id_case.id_class(-2.0f, 12.0f, 0.0f);
            this.id_case.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f + 0.1f);
            this.id_catch = new Iq_1(this, 0, 16);
            this.id_catch.id_implements = true;
            this.id_catch.id_class(2.0f, 12.0f, 0.0f);
            this.id_catch.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f + 0.1f);
        } else {
            this.id_class = new Iq_1(this, 0, 0);
            this.id_class.id_class(0, 0).id_class(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, f);
            this.id_class.id_class(24, 0).id_class(-1.0f, -3.0f, -6.0f, 2.0f, 4.0f, 2.0f, f);
            this.id_break = new Iq_1(this, 32, 0);
            this.id_break.id_class(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, f + 0.5f);
            this.id_native = new Iq_1(this);
            this.id_native.id_class(30, 47).id_class(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f, f);
            this.id_native.id_case = -1.5707964f;
            this.id_break.id_break(this.id_native);
            this.id_byte = new Iq_1(this, 16, 20);
            this.id_byte.id_class(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f, f);
            this.id_byte.id_class(0, 38).id_class(-4.0f, 0.0f, -3.0f, 8.0f, 18.0f, 6.0f, f + 0.05f);
            this.id_protected = new Iq_1(this, 44, 22);
            this.id_protected.id_class(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
            this.id_protected.id_class(-5.0f, 2.0f, 0.0f);
            this.id_throws = new Iq_1(this, 44, 22);
            this.id_throws.id_implements = true;
            this.id_throws.id_class(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
            this.id_throws.id_class(5.0f, 2.0f, 0.0f);
            this.id_case = new Iq_1(this, 0, 22);
            this.id_case.id_class(-2.0f, 12.0f, 0.0f);
            this.id_case.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
            this.id_catch = new Iq_1(this, 0, 22);
            this.id_catch.id_implements = true;
            this.id_catch.id_class(2.0f, 12.0f, 0.0f);
            this.id_catch.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        }
    }

    @Override
    public void id_class(boolean bl) {
        this.id_class.id_finally = bl;
        this.id_break.id_finally = bl;
        this.id_native.id_finally = bl;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        Iy_1.id_class(this.id_throws, this.id_protected, ((is_3)t).v(), this.id_final, f3);
    }
}

