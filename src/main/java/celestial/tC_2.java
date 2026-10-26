/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.iB_2;
import celestial.is_3;
import celestial.rbB_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.tQ_2;
import celestial.wg_3;

public class tC_2<T extends rbB_2>
extends wg_3<T> {
    public tC_2(float f, float f2, int n, int n2) {
        super(f, f2, n, n2);
        this.id_protected = new Iq_1(this, 32, 48);
        this.id_protected.id_class(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_protected.id_class(-5.0f, 2.0f + f2, 0.0f);
        this.id_case = new Iq_1(this, 16, 48);
        this.id_case.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_case.id_class(-1.9f, 12.0f + f2, 0.0f);
    }

    public tC_2(float f, boolean bl) {
        super(f, 0.0f, 64, bl ? 32 : 64);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        if (this.id_private == tQ_2.THROW_SPEAR) {
            this.id_throws.id_case = this.id_throws.id_case * 0.5f - (float)Math.PI;
            this.id_throws.id_catch = 0.0f;
        }
        if (this.id_implements == tQ_2.THROW_SPEAR) {
            this.id_protected.id_case = this.id_protected.id_case * 0.5f - (float)Math.PI;
            this.id_protected.id_catch = 0.0f;
        }
        if (this.id_extends > 0.0f) {
            this.id_protected.id_case = this.id_class(this.id_extends, this.id_protected.id_case, -2.5132742f) + this.id_extends * 0.35f * rfU_2.id_class(0.1f * f3);
            this.id_throws.id_case = this.id_class(this.id_extends, this.id_throws.id_case, -2.5132742f) - this.id_extends * 0.35f * rfU_2.id_class(0.1f * f3);
            this.id_protected.id_private = this.id_class(this.id_extends, this.id_protected.id_private, -0.15f);
            this.id_throws.id_private = this.id_class(this.id_extends, this.id_throws.id_private, 0.15f);
            this.id_catch.id_case -= this.id_extends * 0.55f * rfU_2.id_class(0.1f * f3);
            this.id_case.id_case += this.id_extends * 0.55f * rfU_2.id_class(0.1f * f3);
            this.id_class.id_case = 0.0f;
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        this.id_implements = tQ_2.EMPTY;
        this.id_private = tQ_2.EMPTY;
        rdn_3 rdn_32 = ((iB_2)t).id_protected(rpm_3.MAIN_HAND);
        if (rdn_32.id_break() == rdy_3.kY && ((is_3)t).v()) {
            if (((is_3)t).Su() == rpZ_2.RIGHT) {
                this.id_implements = tQ_2.THROW_SPEAR;
            } else {
                this.id_private = tQ_2.THROW_SPEAR;
            }
        }
        super.id_class(t, f, f2, f3);
    }
}

