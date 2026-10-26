/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.iB_2;
import celestial.tW_2;

public class tH_2<T extends iB_2>
extends tW_2<T> {
    public boolean id_native;
    public boolean id_volatile;

    public tH_2(float f) {
        super(0.0f, -14.0f, 64, 32);
        float f2 = -14.0f;
        this.id_break = new Iq_1(this, 0, 16);
        this.id_break.id_class(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, f - 0.5f);
        this.id_break.id_class(0.0f, -14.0f, 0.0f);
        this.id_byte = new Iq_1(this, 32, 16);
        this.id_byte.id_class(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, f);
        this.id_byte.id_class(0.0f, -14.0f, 0.0f);
        this.id_protected = new Iq_1(this, 56, 0);
        this.id_protected.id_class(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f, f);
        this.id_protected.id_class(-3.0f, -12.0f, 0.0f);
        this.id_throws = new Iq_1(this, 56, 0);
        this.id_throws.id_implements = true;
        this.id_throws.id_class(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f, f);
        this.id_throws.id_class(5.0f, -12.0f, 0.0f);
        this.id_case = new Iq_1(this, 56, 0);
        this.id_case.id_class(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f, f);
        this.id_case.id_class(-2.0f, -2.0f, 0.0f);
        this.id_catch = new Iq_1(this, 56, 0);
        this.id_catch.id_implements = true;
        this.id_catch.id_class(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f, f);
        this.id_catch.id_class(2.0f, -2.0f, 0.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6;
        super.id_class(t, f, f2, f3, f4, f5);
        this.id_class.id_finally = true;
        float f7 = -14.0f;
        this.id_byte.id_case = 0.0f;
        this.id_byte.id_protected = -14.0f;
        this.id_byte.id_throws = -0.0f;
        this.id_case.id_case -= 0.0f;
        this.id_catch.id_case -= 0.0f;
        this.id_protected.id_case = (float)((double)this.id_protected.id_case * 0.5);
        this.id_throws.id_case = (float)((double)this.id_throws.id_case * 0.5);
        this.id_case.id_case = (float)((double)this.id_case.id_case * 0.5);
        this.id_catch.id_case = (float)((double)this.id_catch.id_case * 0.5);
        float f8 = 0.4f;
        if (this.id_protected.id_case > 0.4f) {
            this.id_protected.id_case = 0.4f;
        }
        if (this.id_throws.id_case > 0.4f) {
            this.id_throws.id_case = 0.4f;
        }
        if (this.id_protected.id_case < -0.4f) {
            this.id_protected.id_case = -0.4f;
        }
        if (this.id_throws.id_case < -0.4f) {
            this.id_throws.id_case = -0.4f;
        }
        if (this.id_case.id_case > 0.4f) {
            this.id_case.id_case = 0.4f;
        }
        if (this.id_catch.id_case > 0.4f) {
            this.id_catch.id_case = 0.4f;
        }
        if (this.id_case.id_case < -0.4f) {
            this.id_case.id_case = -0.4f;
        }
        if (this.id_catch.id_case < -0.4f) {
            this.id_catch.id_case = -0.4f;
        }
        if (this.id_native) {
            this.id_protected.id_case = -0.5f;
            this.id_throws.id_case = -0.5f;
            this.id_protected.id_private = 0.05f;
            this.id_throws.id_private = -0.05f;
        }
        this.id_protected.id_throws = 0.0f;
        this.id_throws.id_throws = 0.0f;
        this.id_case.id_throws = 0.0f;
        this.id_catch.id_throws = 0.0f;
        this.id_case.id_protected = -5.0f;
        this.id_catch.id_protected = -5.0f;
        this.id_class.id_throws = -0.0f;
        this.id_class.id_protected = -13.0f;
        this.id_break.id_byte = this.id_class.id_byte;
        this.id_break.id_protected = this.id_class.id_protected;
        this.id_break.id_throws = this.id_class.id_throws;
        this.id_break.id_case = this.id_class.id_case;
        this.id_break.id_catch = this.id_class.id_catch;
        this.id_break.id_private = this.id_class.id_private;
        if (this.id_volatile) {
            f6 = 1.0f;
            this.id_class.id_protected -= 5.0f;
        }
        f6 = -14.0f;
        this.id_protected.id_class(-5.0f, -12.0f, 0.0f);
        this.id_throws.id_class(5.0f, -12.0f, 0.0f);
    }
}

