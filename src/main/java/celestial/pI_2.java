/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rSu_1;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.tp_3;

public class pI_2
extends tp_3<rSu_1> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private Iq_1 id_throws;
    private Iq_1 id_case;
    private Iq_1 id_catch;
    private Iq_1 id_private;
    private Iq_1 id_implements;
    private Iq_1 id_finally;
    private Iq_1 id_extends;
    private Iq_1 id_native;
    private Iq_1 id_volatile;
    private Iq_1 id_new;
    private Iq_1 id_continue;
    private Iq_1 id_super;
    private Iq_1 id_this;
    private Iq_1 id_else;
    private Iq_1 id_goto;
    private Iq_1 id_while;
    private rSu_1 id_try;
    private float id_instanceof;

    public pI_2() {
        this.id_return = 256;
        this.id_public = 256;
        float f = -16.0f;
        this.id_class = new Iq_1(this);
        this.id_class.id_class("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16, 0.0f, 176, 44);
        this.id_class.id_class("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16, 0.0f, 112, 30);
        this.id_class.id_implements = true;
        this.id_class.id_class("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, 0.0f, 0, 0);
        this.id_class.id_class("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, 0.0f, 112, 0);
        this.id_class.id_implements = false;
        this.id_class.id_class("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, 0.0f, 0, 0);
        this.id_class.id_class("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, 0.0f, 112, 0);
        this.id_byte = new Iq_1(this);
        this.id_byte.id_class(0.0f, 4.0f, -8.0f);
        this.id_byte.id_class("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16, 0.0f, 176, 65);
        this.id_class.id_break(this.id_byte);
        this.id_break = new Iq_1(this);
        this.id_break.id_class("box", -5.0f, -5.0f, -5.0f, 10, 10, 10, 0.0f, 192, 104);
        this.id_break.id_class("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6, 0.0f, 48, 0);
        this.id_protected = new Iq_1(this);
        this.id_protected.id_class(0.0f, 4.0f, 8.0f);
        this.id_protected.id_class("body", -12.0f, 0.0f, -16.0f, 24, 24, 64, 0.0f, 0, 0);
        this.id_protected.id_class("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12, 0.0f, 220, 53);
        this.id_protected.id_class("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12, 0.0f, 220, 53);
        this.id_protected.id_class("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12, 0.0f, 220, 53);
        this.id_throws = new Iq_1(this);
        this.id_throws.id_implements = true;
        this.id_throws.id_class(12.0f, 5.0f, 2.0f);
        this.id_throws.id_class("bone", 0.0f, -4.0f, -4.0f, 56, 8, 8, 0.0f, 112, 88);
        this.id_throws.id_class("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 88);
        this.id_case = new Iq_1(this);
        this.id_case.id_implements = true;
        this.id_case.id_class(56.0f, 0.0f, 0.0f);
        this.id_case.id_class("bone", 0.0f, -2.0f, -2.0f, 56, 4, 4, 0.0f, 112, 136);
        this.id_case.id_class("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 144);
        this.id_throws.id_break(this.id_case);
        this.id_catch = new Iq_1(this);
        this.id_catch.id_class(12.0f, 20.0f, 2.0f);
        this.id_catch.id_class("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 0.0f, 112, 104);
        this.id_private = new Iq_1(this);
        this.id_private.id_class(0.0f, 20.0f, -1.0f);
        this.id_private.id_class("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 0.0f, 226, 138);
        this.id_catch.id_break(this.id_private);
        this.id_implements = new Iq_1(this);
        this.id_implements.id_class(0.0f, 23.0f, 0.0f);
        this.id_implements.id_class("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 0.0f, 144, 104);
        this.id_private.id_break(this.id_implements);
        this.id_finally = new Iq_1(this);
        this.id_finally.id_class(16.0f, 16.0f, 42.0f);
        this.id_finally.id_class("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0.0f, 0, 0);
        this.id_extends = new Iq_1(this);
        this.id_extends.id_class(0.0f, 32.0f, -4.0f);
        this.id_extends.id_class("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 0.0f, 196, 0);
        this.id_finally.id_break(this.id_extends);
        this.id_native = new Iq_1(this);
        this.id_native.id_class(0.0f, 31.0f, 4.0f);
        this.id_native.id_class("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 0.0f, 112, 0);
        this.id_extends.id_break(this.id_native);
        this.id_volatile = new Iq_1(this);
        this.id_volatile.id_class(-12.0f, 5.0f, 2.0f);
        this.id_volatile.id_class("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8, 0.0f, 112, 88);
        this.id_volatile.id_class("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 88);
        this.id_new = new Iq_1(this);
        this.id_new.id_class(-56.0f, 0.0f, 0.0f);
        this.id_new.id_class("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4, 0.0f, 112, 136);
        this.id_new.id_class("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 144);
        this.id_volatile.id_break(this.id_new);
        this.id_continue = new Iq_1(this);
        this.id_continue.id_class(-12.0f, 20.0f, 2.0f);
        this.id_continue.id_class("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 0.0f, 112, 104);
        this.id_super = new Iq_1(this);
        this.id_super.id_class(0.0f, 20.0f, -1.0f);
        this.id_super.id_class("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 0.0f, 226, 138);
        this.id_continue.id_break(this.id_super);
        this.id_this = new Iq_1(this);
        this.id_this.id_class(0.0f, 23.0f, 0.0f);
        this.id_this.id_class("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 0.0f, 144, 104);
        this.id_super.id_break(this.id_this);
        this.id_else = new Iq_1(this);
        this.id_else.id_class(-16.0f, 16.0f, 42.0f);
        this.id_else.id_class("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0.0f, 0, 0);
        this.id_goto = new Iq_1(this);
        this.id_goto.id_class(0.0f, 32.0f, -4.0f);
        this.id_goto.id_class("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 0.0f, 196, 0);
        this.id_else.id_break(this.id_goto);
        this.id_while = new Iq_1(this);
        this.id_while.id_class(0.0f, 31.0f, 4.0f);
        this.id_while.id_class("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 0.0f, 112, 0);
        this.id_goto.id_break(this.id_while);
    }

    private void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, Iq_1 iq_1, Iq_1 iq_12, Iq_1 iq_13, Iq_1 iq_14, Iq_1 iq_15, Iq_1 iq_16, Iq_1 iq_17) {
        iq_15.id_case = 1.0f + f * 0.1f;
        iq_16.id_case = 0.5f + f * 0.1f;
        iq_17.id_case = 0.75f + f * 0.1f;
        iq_12.id_case = 1.3f + f * 0.1f;
        iq_13.id_case = -0.5f - f * 0.1f;
        iq_14.id_case = 0.75f + f * 0.1f;
        iq_1.id_class(ml_1, ok_1, n, n2);
        iq_12.id_class(ml_1, ok_1, n, n2);
        iq_15.id_class(ml_1, ok_1, n, n2);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        float f5;
        ml_1.id_class();
        float f6 = rfU_2.id_catch(this.id_instanceof, this.id_try.id_this, this.id_try.id_else);
        this.id_byte.id_case = (float)(Math.sin(f6 * ((float)Math.PI * 2)) + 1.0) * 0.2f;
        float f7 = (float)(Math.sin(f6 * ((float)Math.PI * 2) - 1.0f) + 1.0);
        f7 = (f7 * f7 + f7 * 2.0f) * 0.05f;
        ml_1.id_class(0.0, (double)(f7 - 2.0f), -3.0);
        ml_1.id_class(rje_3.id_break.id_byte(f7 * 2.0f));
        float f8 = 0.0f;
        float f9 = 20.0f;
        float f10 = -12.0f;
        float f11 = 1.5f;
        double[] dArray = this.id_try.id_class(6, this.id_instanceof);
        float f12 = rfU_2.id_extends(this.id_try.id_class(5, this.id_instanceof)[0] - this.id_try.id_class(10, this.id_instanceof)[0]);
        float f13 = rfU_2.id_extends(this.id_try.id_class(5, this.id_instanceof)[0] + (double)(f12 / 2.0f));
        float f14 = f6 * ((float)Math.PI * 2);
        for (int i = 0; i < 5; ++i) {
            double[] dArray2 = this.id_try.id_class(5 - i, this.id_instanceof);
            f5 = (float)Math.cos((float)i * 0.45f + f14) * 0.15f;
            this.id_break.id_catch = rfU_2.id_extends(dArray2[0] - dArray[0]) * ((float)Math.PI / 180) * 1.5f;
            this.id_break.id_case = f5 + this.id_try.id_class(i, dArray, dArray2) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            this.id_break.id_private = -rfU_2.id_extends(dArray2[0] - (double)f13) * ((float)Math.PI / 180) * 1.5f;
            this.id_break.id_protected = f9;
            this.id_break.id_throws = f10;
            this.id_break.id_byte = f8;
            f9 = (float)((double)f9 + Math.sin(this.id_break.id_case) * 10.0);
            f10 = (float)((double)f10 - Math.cos(this.id_break.id_catch) * Math.cos(this.id_break.id_case) * 10.0);
            f8 = (float)((double)f8 - Math.sin(this.id_break.id_catch) * Math.cos(this.id_break.id_case) * 10.0);
            this.id_break.id_class(ml_1, ok_1, n, n2);
        }
        this.id_class.id_protected = f9;
        this.id_class.id_throws = f10;
        this.id_class.id_byte = f8;
        double[] dArray3 = this.id_try.id_class(0, this.id_instanceof);
        this.id_class.id_catch = rfU_2.id_extends(dArray3[0] - dArray[0]) * ((float)Math.PI / 180);
        this.id_class.id_case = rfU_2.id_extends((double)this.id_try.id_class(6, dArray, dArray3)) * ((float)Math.PI / 180) * 1.5f * 5.0f;
        this.id_class.id_private = -rfU_2.id_extends(dArray3[0] - (double)f13) * ((float)Math.PI / 180);
        this.id_class.id_class(ml_1, ok_1, n, n2);
        ml_1.id_class();
        ml_1.id_class(0.0, 1.0, 0.0);
        ml_1.id_class(rje_3.id_case.id_byte(-f12 * 1.5f));
        ml_1.id_class(0.0, -1.0, 0.0);
        this.id_protected.id_private = 0.0f;
        this.id_protected.id_class(ml_1, ok_1, n, n2);
        float f15 = f6 * ((float)Math.PI * 2);
        this.id_throws.id_case = 0.125f - (float)Math.cos(f15) * 0.2f;
        this.id_throws.id_catch = -0.25f;
        this.id_throws.id_private = -((float)(Math.sin(f15) + 0.125)) * 0.8f;
        this.id_case.id_private = (float)(Math.sin(f15 + 2.0f) + 0.5) * 0.75f;
        this.id_volatile.id_case = this.id_throws.id_case;
        this.id_volatile.id_catch = -this.id_throws.id_catch;
        this.id_volatile.id_private = -this.id_throws.id_private;
        this.id_new.id_private = -this.id_case.id_private;
        this.id_class(ml_1, ok_1, n, n2, f7, this.id_throws, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
        this.id_class(ml_1, ok_1, n, n2, f7, this.id_volatile, this.id_continue, this.id_super, this.id_this, this.id_else, this.id_goto, this.id_while);
        ml_1.id_break();
        f5 = -((float)Math.sin(f6 * ((float)Math.PI * 2))) * 0.0f;
        f14 = f6 * ((float)Math.PI * 2);
        f9 = 10.0f;
        f10 = 60.0f;
        f8 = 0.0f;
        dArray = this.id_try.id_class(11, this.id_instanceof);
        for (int i = 0; i < 12; ++i) {
            dArray3 = this.id_try.id_class(12 + i, this.id_instanceof);
            f5 = (float)((double)f5 + Math.sin((float)i * 0.45f + f14) * (double)0.05f);
            this.id_break.id_catch = (rfU_2.id_extends(dArray3[0] - dArray[0]) * 1.5f + 180.0f) * ((float)Math.PI / 180);
            this.id_break.id_case = f5 + (float)(dArray3[1] - dArray[1]) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            this.id_break.id_private = rfU_2.id_extends(dArray3[0] - (double)f13) * ((float)Math.PI / 180) * 1.5f;
            this.id_break.id_protected = f9;
            this.id_break.id_throws = f10;
            this.id_break.id_byte = f8;
            f9 = (float)((double)f9 + Math.sin(this.id_break.id_case) * 10.0);
            f10 = (float)((double)f10 - Math.cos(this.id_break.id_catch) * Math.cos(this.id_break.id_case) * 10.0);
            f8 = (float)((double)f8 - Math.sin(this.id_break.id_catch) * Math.cos(this.id_break.id_case) * 10.0);
            this.id_break.id_class(ml_1, ok_1, n, n2);
        }
        ml_1.id_break();
    }

    @Override
    public void id_class(rSu_1 rSu_12, float f, float f2, float f3, float f4, float f5) {
    }

    @Override
    public void id_class(rSu_1 rSu_12, float f, float f2, float f3) {
        this.id_try = rSu_12;
        this.id_instanceof = f3;
    }
}

