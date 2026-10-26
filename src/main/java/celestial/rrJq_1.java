/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rjj_3;

public class rrJq_1 {
    private Iq_1 id_class = null;
    private int id_break = 0;
    private int id_byte = 0;
    private float id_protected = 0.0f;
    private float id_throws = 0.0f;
    private float id_case = 0.0f;
    private int id_catch = 0;
    private int id_private = 0;
    private int id_implements = 0;
    private float id_finally = 0.0f;
    private float id_extends = 0.0f;
    private float id_native = 0.0f;
    private float id_volatile = 0.0f;
    private float id_final = 0.0f;

    public rrJq_1(Iq_1 iq_1, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this.id_class = iq_1;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = f;
        this.id_throws = f2;
        this.id_case = f3;
        this.id_catch = n3;
        this.id_private = n4;
        this.id_implements = n5;
        this.id_finally = f4;
        this.id_extends = (float)n / iq_1.id_class;
        this.id_native = (float)n2 / iq_1.id_break;
        this.id_volatile = (float)(n + n3) / iq_1.id_class;
        this.id_final = (float)(n2 + n4) / iq_1.id_break;
    }

    public static void id_class(Ml_1 ml_1, Ok_1 ok_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, float f10, float f11, float f12) {
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        float f13 = rjj_32.id_throws(f10, f11, f12);
        float f14 = rjj_32.id_case(f10, f11, f12);
        float f15 = rjj_32.id_catch(f10, f11, f12);
        float f16 = rjV_22.id_break(f, f2, f3, 1.0f);
        float f17 = rjV_22.id_byte(f, f2, f3, 1.0f);
        float f18 = rjV_22.id_protected(f, f2, f3, 1.0f);
        ok_1.id_class(f16, f17, f18, f4, f5, f6, f7, f8, f9, n, n2, f13, f14, f15);
    }

    public static void id_class(Ml_1 ml_1, Ok_1 ok_1, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7, int n3, int n4, float f8, float f9, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        int n5;
        if (f5 < 6.25E-4f) {
            f5 = 6.25E-4f;
        }
        float f15 = f3 - f;
        float f16 = f4 - f2;
        float f17 = rfU_2.id_throws(f15) * (f6 / 16.0f);
        float f18 = rfU_2.id_throws(f16) * (f7 / 16.0f);
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = -1.0f;
        rrJq_1.id_class(ml_1, ok_1, 0.0f, f18, 0.0f, f8, f9, f10, f11, f, f4, n4, n3, f19, f20, f21);
        rrJq_1.id_class(ml_1, ok_1, f17, f18, 0.0f, f8, f9, f10, f11, f3, f4, n4, n3, f19, f20, f21);
        rrJq_1.id_class(ml_1, ok_1, f17, 0.0f, 0.0f, f8, f9, f10, f11, f3, f2, n4, n3, f19, f20, f21);
        rrJq_1.id_class(ml_1, ok_1, 0.0f, 0.0f, 0.0f, f8, f9, f10, f11, f, f2, n4, n3, f19, f20, f21);
        f19 = 0.0f;
        f20 = 0.0f;
        f21 = 1.0f;
        rrJq_1.id_class(ml_1, ok_1, 0.0f, 0.0f, f5, f8, f9, f10, f11, f, f2, n4, n3, f19, f20, f21);
        rrJq_1.id_class(ml_1, ok_1, f17, 0.0f, f5, f8, f9, f10, f11, f3, f2, n4, n3, f19, f20, f21);
        rrJq_1.id_class(ml_1, ok_1, f17, f18, f5, f8, f9, f10, f11, f3, f4, n4, n3, f19, f20, f21);
        rrJq_1.id_class(ml_1, ok_1, 0.0f, f18, f5, f8, f9, f10, f11, f, f4, n4, n3, f19, f20, f21);
        float f22 = 0.5f * f15 / (float)n;
        float f23 = 0.5f * f16 / (float)n2;
        f19 = -1.0f;
        f20 = 0.0f;
        f21 = 0.0f;
        for (n5 = 0; n5 < n; ++n5) {
            f14 = (float)n5 / (float)n;
            f13 = f + f15 * f14 + f22;
            rrJq_1.id_class(ml_1, ok_1, f14 * f17, f18, f5, f8, f9, f10, f11, f13, f4, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f14 * f17, f18, 0.0f, f8, f9, f10, f11, f13, f4, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f14 * f17, 0.0f, 0.0f, f8, f9, f10, f11, f13, f2, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f14 * f17, 0.0f, f5, f8, f9, f10, f11, f13, f2, n4, n3, f19, f20, f21);
        }
        f19 = 1.0f;
        f20 = 0.0f;
        f21 = 0.0f;
        for (n5 = 0; n5 < n; ++n5) {
            f14 = (float)n5 / (float)n;
            f13 = f + f15 * f14 + f22;
            f12 = f14 + 1.0f / (float)n;
            rrJq_1.id_class(ml_1, ok_1, f12 * f17, 0.0f, f5, f8, f9, f10, f11, f13, f2, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f12 * f17, 0.0f, 0.0f, f8, f9, f10, f11, f13, f2, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f12 * f17, f18, 0.0f, f8, f9, f10, f11, f13, f4, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f12 * f17, f18, f5, f8, f9, f10, f11, f13, f4, n4, n3, f19, f20, f21);
        }
        f19 = 0.0f;
        f20 = 1.0f;
        f21 = 0.0f;
        for (n5 = 0; n5 < n2; ++n5) {
            f14 = (float)n5 / (float)n2;
            f13 = f2 + f16 * f14 + f23;
            f12 = f14 + 1.0f / (float)n2;
            rrJq_1.id_class(ml_1, ok_1, 0.0f, f12 * f18, f5, f8, f9, f10, f11, f, f13, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f17, f12 * f18, f5, f8, f9, f10, f11, f3, f13, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f17, f12 * f18, 0.0f, f8, f9, f10, f11, f3, f13, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, 0.0f, f12 * f18, 0.0f, f8, f9, f10, f11, f, f13, n4, n3, f19, f20, f21);
        }
        f19 = 0.0f;
        f20 = -1.0f;
        f21 = 0.0f;
        for (n5 = 0; n5 < n2; ++n5) {
            f14 = (float)n5 / (float)n2;
            f13 = f2 + f16 * f14 + f23;
            rrJq_1.id_class(ml_1, ok_1, f17, f14 * f18, f5, f8, f9, f10, f11, f3, f13, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, 0.0f, f14 * f18, f5, f8, f9, f10, f11, f, f13, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, 0.0f, f14 * f18, 0.0f, f8, f9, f10, f11, f, f13, n4, n3, f19, f20, f21);
            rrJq_1.id_class(ml_1, ok_1, f17, f14 * f18, 0.0f, f8, f9, f10, f11, f3, f13, n4, n3, f19, f20, f21);
        }
    }

    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        float f5 = 0.0625f;
        ml_1.id_class((double)(this.id_protected * f5), (double)(this.id_throws * f5), (double)(this.id_case * f5));
        float f6 = this.id_extends;
        float f7 = this.id_volatile;
        float f8 = this.id_native;
        float f9 = this.id_final;
        if (this.id_class.id_implements) {
            f6 = this.id_volatile;
            f7 = this.id_extends;
        }
        if (this.id_class.id_final) {
            f8 = this.id_final;
            f9 = this.id_native;
        }
        rrJq_1.id_class(ml_1, ok_1, f6, f8, f7, f9, this.id_catch, this.id_private, f5 * (float)this.id_implements, this.id_class.id_class, this.id_class.id_break, n, n2, f, f2, f3, f4);
        ml_1.id_class((double)(-this.id_protected * f5), (double)(-this.id_throws * f5), (double)(-this.id_case * f5));
    }
}

