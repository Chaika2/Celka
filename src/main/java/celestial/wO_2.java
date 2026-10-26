/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.Iy_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.is_3;
import celestial.rbJ_2;
import celestial.rbM_2;
import celestial.rbk_3;
import celestial.rfU_2;
import celestial.wh_3;

public class wO_2<T extends is_3>
extends wh_3<T> {
    public final Iq_1 id_native;
    public final Iq_1 id_volatile;
    private final Iq_1 id_goto;
    private final Iq_1 id_while;
    private final Iq_1 id_try;
    private final Iq_1 id_instanceof;

    public wO_2(float f, int n, int n2) {
        super(f, false);
        this.id_return = n;
        this.id_public = n2;
        this.id_byte = new Iq_1(this, 16, 16);
        this.id_byte.id_class(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, f);
        this.id_class = new Iq_1(this);
        this.id_class.id_class(0, 0).id_class(-5.0f, -8.0f, -4.0f, 10.0f, 8.0f, 8.0f, f);
        this.id_class.id_class(31, 1).id_class(-2.0f, -4.0f, -5.0f, 4.0f, 4.0f, 1.0f, f);
        this.id_class.id_class(2, 4).id_class(2.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, f);
        this.id_class.id_class(2, 0).id_class(-3.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, f);
        this.id_native = new Iq_1(this);
        this.id_native.id_class(4.5f, -6.0f, 0.0f);
        this.id_native.id_class(51, 6).id_class(0.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, f);
        this.id_class.id_break(this.id_native);
        this.id_volatile = new Iq_1(this);
        this.id_volatile.id_class(-4.5f, -6.0f, 0.0f);
        this.id_volatile.id_class(39, 6).id_class(-1.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, f);
        this.id_class.id_break(this.id_volatile);
        this.id_break = new Iq_1(this);
        this.id_goto = this.id_byte.id_class();
        this.id_while = this.id_class.id_class();
        this.id_try = this.id_throws.id_class();
        this.id_instanceof = this.id_throws.id_class();
    }

    private void id_class(T t) {
        if (((is_3)t).Z()) {
            this.id_throws.id_case = -1.8f;
        } else {
            this.id_protected.id_case = -1.8f;
        }
    }

    @Override
    protected void id_class(T t, float f) {
        if (this.id_final > 0.0f && t instanceof rbk_3 && ((rbk_3)t).sd() == rbJ_2.ATTACKING_WITH_MELEE_WEAPON) {
            Iy_1.id_class(this.id_protected, this.id_throws, t, this.id_final, f);
        } else {
            super.id_class(t, f);
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_byte.id_class(this.id_goto);
        this.id_class.id_class(this.id_while);
        this.id_throws.id_class(this.id_try);
        this.id_protected.id_class(this.id_instanceof);
        super.id_class(t, f, f2, f3, f4, f5);
        float f6 = 0.5235988f;
        float f7 = f3 * 0.1f + f * 0.5f;
        float f8 = 0.08f + f2 * 0.4f;
        this.id_native.id_private = -0.5235988f - rfU_2.id_break(f7 * 1.2f) * f8;
        this.id_volatile.id_private = 0.5235988f + rfU_2.id_break(f7) * f8;
        if (t instanceof rbM_2) {
            rbM_2 rbM_22 = (rbM_2)t;
            rbJ_2 rbJ_22 = rbM_22.sd();
            if (rbJ_22 == rbJ_2.DANCING) {
                float f9 = f3 / 60.0f;
                this.id_volatile.id_private = 0.5235988f + (float)Math.PI / 180 * rfU_2.id_class(f9 * 30.0f) * 10.0f;
                this.id_native.id_private = -0.5235988f - (float)Math.PI / 180 * rfU_2.id_break(f9 * 30.0f) * 10.0f;
                this.id_class.id_byte = rfU_2.id_class(f9 * 10.0f);
                this.id_class.id_protected = rfU_2.id_class(f9 * 40.0f) + 0.4f;
                this.id_protected.id_private = (float)Math.PI / 180 * (70.0f + rfU_2.id_break(f9 * 40.0f) * 10.0f);
                this.id_throws.id_private = this.id_protected.id_private * -1.0f;
                this.id_protected.id_protected = rfU_2.id_class(f9 * 40.0f) * 0.5f + 1.5f;
                this.id_throws.id_protected = rfU_2.id_class(f9 * 40.0f) * 0.5f + 1.5f;
                this.id_byte.id_protected = rfU_2.id_class(f9 * 40.0f) * 0.35f;
            } else if (rbJ_22 == rbJ_2.ATTACKING_WITH_MELEE_WEAPON && this.id_final == 0.0f) {
                this.id_class(t);
            } else if (rbJ_22 == rbJ_2.CROSSBOW_HOLD) {
                Iy_1.id_class(this.id_protected, this.id_throws, this.id_class, !((is_3)t).Z());
            } else if (rbJ_22 == rbJ_2.CROSSBOW_CHARGE) {
                Iy_1.id_class(this.id_protected, this.id_throws, t, !((is_3)t).Z());
            } else if (rbJ_22 == rbJ_2.ADMIRING_ITEM) {
                this.id_class.id_case = 0.5f;
                this.id_class.id_catch = 0.0f;
                if (((is_3)t).Z()) {
                    this.id_protected.id_catch = -0.5f;
                    this.id_protected.id_case = -0.9f;
                } else {
                    this.id_throws.id_catch = 0.5f;
                    this.id_throws.id_case = -0.9f;
                }
            }
        } else if (((an_3)t).BC() == aI_2.rb) {
            Iy_1.id_class(this.id_throws, this.id_protected, ((is_3)t).v(), this.id_final, f3);
        }
        this.id_super.id_class(this.id_catch);
        this.id_this.id_class(this.id_case);
        this.id_new.id_class(this.id_throws);
        this.id_continue.id_class(this.id_protected);
        this.id_else.id_class(this.id_byte);
        this.id_break.id_class(this.id_class);
    }
}

