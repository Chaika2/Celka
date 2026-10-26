/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.Iy_1;
import celestial.Ml_1;
import celestial.iB_2;
import celestial.is_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.tQ_2;
import celestial.tW_2;

public class wL_2<T extends is_3>
extends tW_2<T> {
    public wL_2() {
        this(0.0f, false);
    }

    public wL_2(float f, boolean bl) {
        super(f);
        if (!bl) {
            this.id_protected = new Iq_1(this, 40, 16);
            this.id_protected.id_class(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, f);
            this.id_protected.id_class(-5.0f, 2.0f, 0.0f);
            this.id_throws = new Iq_1(this, 40, 16);
            this.id_throws.id_implements = true;
            this.id_throws.id_class(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, f);
            this.id_throws.id_class(5.0f, 2.0f, 0.0f);
            this.id_case = new Iq_1(this, 0, 16);
            this.id_case.id_class(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f, f);
            this.id_case.id_class(-2.0f, 12.0f, 0.0f);
            this.id_catch = new Iq_1(this, 0, 16);
            this.id_catch.id_implements = true;
            this.id_catch.id_class(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f, f);
            this.id_catch.id_class(2.0f, 12.0f, 0.0f);
        }
    }

    @Override
    public void id_class(rpZ_2 rpZ_22, Ml_1 ml_1) {
        float f = rpZ_22 == rpZ_2.RIGHT ? 1.0f : -1.0f;
        Iq_1 iq_1 = this.id_class(rpZ_22);
        iq_1.id_byte += f;
        iq_1.id_class(ml_1);
        iq_1.id_byte -= f;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        rdn_3 rdn_32 = ((iB_2)t).ss();
        if (((is_3)t).v() && (rdn_32.id_class() || rdn_32.id_break() != rdy_3.OM)) {
            float f6 = rfU_2.id_class(this.id_final * (float)Math.PI);
            float f7 = rfU_2.id_class((1.0f - (1.0f - this.id_final) * (1.0f - this.id_final)) * (float)Math.PI);
            this.id_protected.id_private = 0.0f;
            this.id_throws.id_private = 0.0f;
            this.id_protected.id_catch = -(0.1f - f6 * 0.6f);
            this.id_throws.id_catch = 0.1f - f6 * 0.6f;
            this.id_protected.id_case = -1.5707964f;
            this.id_throws.id_case = -1.5707964f;
            this.id_protected.id_case -= f6 * 1.2f - f7 * 0.4f;
            this.id_throws.id_case -= f6 * 1.2f - f7 * 0.4f;
            Iy_1.id_class(this.id_protected, this.id_throws, f3);
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        this.id_implements = tQ_2.EMPTY;
        this.id_private = tQ_2.EMPTY;
        rdn_3 rdn_32 = ((iB_2)t).id_protected(rpm_3.MAIN_HAND);
        if (rdn_32.id_break() == rdy_3.OM && ((is_3)t).v()) {
            if (((is_3)t).Su() == rpZ_2.RIGHT) {
                this.id_implements = tQ_2.BOW_AND_ARROW;
            } else {
                this.id_private = tQ_2.BOW_AND_ARROW;
            }
        }
        super.id_class(t, f, f2, f3);
    }
}

