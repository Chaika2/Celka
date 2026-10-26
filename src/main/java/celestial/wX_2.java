/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.rMK;
import celestial.wk_3;

public class wX_2<T extends rMK>
extends wk_3<T> {
    public wX_2() {
        super(12, 0.0f, true, 16.0f, 4.0f, 2.25f, 2.0f, 24);
        this.id_return = 128;
        this.id_public = 64;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-3.5f, -3.0f, -3.0f, 7.0f, 7.0f, 7.0f, 0.0f);
        this.id_class.id_class(0.0f, 10.0f, -16.0f);
        this.id_class.id_class(0, 44).id_class(-2.5f, 1.0f, -6.0f, 5.0f, 3.0f, 3.0f, 0.0f);
        this.id_class.id_class(26, 0).id_class(-4.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        Iq_1 iq_1 = this.id_class.id_class(26, 0);
        iq_1.id_implements = true;
        iq_1.id_class(2.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        this.id_break = new Iq_1(this);
        this.id_break.id_class(0, 19).id_class(-5.0f, -13.0f, -7.0f, 14.0f, 14.0f, 11.0f, 0.0f);
        this.id_break.id_class(39, 0).id_class(-4.0f, -25.0f, -7.0f, 12.0f, 12.0f, 10.0f, 0.0f);
        this.id_break.id_class(-2.0f, 9.0f, 12.0f);
        int n = 10;
        this.id_byte = new Iq_1(this, 50, 22);
        this.id_byte.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 8.0f, 0.0f);
        this.id_byte.id_class(-3.5f, 14.0f, 6.0f);
        this.id_protected = new Iq_1(this, 50, 22);
        this.id_protected.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 8.0f, 0.0f);
        this.id_protected.id_class(3.5f, 14.0f, 6.0f);
        this.id_throws = new Iq_1(this, 50, 40);
        this.id_throws.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 6.0f, 0.0f);
        this.id_throws.id_class(-2.5f, 14.0f, -7.0f);
        this.id_case = new Iq_1(this, 50, 40);
        this.id_case.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 6.0f, 0.0f);
        this.id_case.id_class(2.5f, 14.0f, -7.0f);
        this.id_byte.id_byte -= 1.0f;
        this.id_protected.id_byte += 1.0f;
        this.id_byte.id_throws += 0.0f;
        this.id_protected.id_throws += 0.0f;
        this.id_throws.id_byte -= 1.0f;
        this.id_case.id_byte += 1.0f;
        this.id_throws.id_throws -= 1.0f;
        this.id_case.id_throws -= 1.0f;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        float f6 = f3 - (float)((Integer)((rMK)t).id_throws[41]).intValue();
        float f7 = ((rMK)t).id_throw(f6);
        f7 *= f7;
        float f8 = 1.0f - f7;
        this.id_break.id_case = 1.5707964f - f7 * (float)Math.PI * 0.35f;
        this.id_break.id_protected = 9.0f * f8 + 11.0f * f7;
        this.id_throws.id_protected = 14.0f * f8 - 6.0f * f7;
        this.id_throws.id_throws = -8.0f * f8 - 4.0f * f7;
        this.id_throws.id_case -= f7 * (float)Math.PI * 0.45f;
        this.id_case.id_protected = this.id_throws.id_protected;
        this.id_case.id_throws = this.id_throws.id_throws;
        this.id_case.id_case -= f7 * (float)Math.PI * 0.45f;
        if (this.id_int) {
            this.id_class.id_protected = 10.0f * f8 - 9.0f * f7;
            this.id_class.id_throws = -16.0f * f8 - 7.0f * f7;
        } else {
            this.id_class.id_protected = 10.0f * f8 - 14.0f * f7;
            this.id_class.id_throws = -16.0f * f8 - 3.0f * f7;
        }
        this.id_class.id_case += f7 * (float)Math.PI * 0.15f;
    }
}

