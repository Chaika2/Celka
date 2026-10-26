/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.au_3;
import celestial.rMl_1;
import celestial.rfU_2;
import celestial.wP_2;
import celestial.wk_3;

public class wS_2<T extends rMl_1>
extends wk_3<T> {
    private float id_catch;
    private float id_private;
    private float id_implements;

    public wS_2(int n, float f) {
        super(n, f, true, 23.0f, 4.8f, 2.7f, 3.0f, 49);
        this.id_return = 64;
        this.id_public = 64;
        this.id_class = new Iq_1(this, 0, 6);
        this.id_class.id_class(-6.5f, -5.0f, -4.0f, 13.0f, 10.0f, 9.0f);
        this.id_class.id_class(0.0f, 11.5f, -17.0f);
        this.id_class.id_class(45, 16).id_class(-3.5f, 0.0f, -6.0f, 7.0f, 5.0f, 2.0f);
        this.id_class.id_class(52, 25).id_class(-8.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f);
        this.id_class.id_class(52, 25).id_class(3.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f);
        this.id_break = new Iq_1(this, 0, 25);
        this.id_break.id_class(-9.5f, -13.0f, -6.5f, 19.0f, 26.0f, 13.0f);
        this.id_break.id_class(0.0f, 10.0f, 0.0f);
        int n2 = 9;
        int n3 = 6;
        this.id_byte = new Iq_1(this, 40, 0);
        this.id_byte.id_class(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.id_byte.id_class(-5.5f, 15.0f, 9.0f);
        this.id_protected = new Iq_1(this, 40, 0);
        this.id_protected.id_class(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.id_protected.id_class(5.5f, 15.0f, 9.0f);
        this.id_throws = new Iq_1(this, 40, 0);
        this.id_throws.id_class(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.id_throws.id_class(-5.5f, 15.0f, -9.0f);
        this.id_case = new Iq_1(this, 40, 0);
        this.id_case.id_class(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.id_case.id_class(5.5f, 15.0f, -9.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        boolean bl = ((rMl_1)t).L() > 0;
        boolean bl2 = ((rMl_1)t).n();
        int n = ((rMl_1)t).sc();
        boolean bl3 = ((rMl_1)t).sd();
        boolean bl4 = ((rMl_1)t).sl();
        if (bl) {
            this.id_class.id_catch = 0.35f * rfU_2.id_class(0.6f * f3);
            this.id_class.id_private = 0.35f * rfU_2.id_class(0.6f * f3);
            this.id_throws.id_case = -0.75f * rfU_2.id_class(0.3f * f3);
            this.id_case.id_case = 0.75f * rfU_2.id_class(0.3f * f3);
        } else {
            this.id_class.id_private = 0.0f;
        }
        if (bl2) {
            if (n < 15) {
                this.id_class.id_case = -0.7853982f * (float)n / 14.0f;
            } else if (n < 20) {
                float f6 = (n - 15) / 5;
                this.id_class.id_case = -0.7853982f + 0.7853982f * f6;
            }
        }
        if (this.id_catch > 0.0f) {
            this.id_break.id_case = wP_2.id_class(this.id_break.id_case, 1.7407963f, this.id_catch);
            this.id_class.id_case = wP_2.id_class(this.id_class.id_case, 1.5707964f, this.id_catch);
            this.id_throws.id_private = -0.27079642f;
            this.id_case.id_private = 0.27079642f;
            this.id_byte.id_private = 0.5707964f;
            this.id_protected.id_private = -0.5707964f;
            if (bl3) {
                this.id_class.id_case = 1.5707964f + 0.2f * rfU_2.id_class(f3 * 0.6f);
                this.id_throws.id_case = -0.4f - 0.2f * rfU_2.id_class(f3 * 0.6f);
                this.id_case.id_case = -0.4f - 0.2f * rfU_2.id_class(f3 * 0.6f);
            }
            if (bl4) {
                this.id_class.id_case = 2.1707964f;
                this.id_throws.id_case = -0.9f;
                this.id_case.id_case = -0.9f;
            }
        } else {
            this.id_byte.id_private = 0.0f;
            this.id_protected.id_private = 0.0f;
            this.id_throws.id_private = 0.0f;
            this.id_case.id_private = 0.0f;
        }
        if (this.id_private > 0.0f) {
            this.id_byte.id_case = -0.6f * rfU_2.id_class(f3 * 0.15f);
            this.id_protected.id_case = 0.6f * rfU_2.id_class(f3 * 0.15f);
            this.id_throws.id_case = 0.3f * rfU_2.id_class(f3 * 0.25f);
            this.id_case.id_case = -0.3f * rfU_2.id_class(f3 * 0.25f);
            this.id_class.id_case = wP_2.id_class(this.id_class.id_case, 1.5707964f, this.id_private);
        }
        if (this.id_implements > 0.0f) {
            this.id_class.id_case = wP_2.id_class(this.id_class.id_case, 2.0561945f, this.id_implements);
            this.id_byte.id_case = -0.5f * rfU_2.id_class(f3 * 0.5f);
            this.id_protected.id_case = 0.5f * rfU_2.id_class(f3 * 0.5f);
            this.id_throws.id_case = 0.5f * rfU_2.id_class(f3 * 0.5f);
            this.id_case.id_case = -0.5f * rfU_2.id_class(f3 * 0.5f);
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        super.id_class(t, f, f2, f3);
        this.id_catch = ((rMl_1)t).id_throw(f3);
        this.id_private = ((rMl_1)t).id_interface(f3);
        this.id_implements = ((au_3)t).n_() ? 0.0f : ((rMl_1)t).id_char(f3);
    }
}

