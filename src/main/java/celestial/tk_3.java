/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.rbF_2;
import celestial.rfU_2;
import celestial.tX_2;
import celestial.wP_2;
import com.google.common.collect.ImmutableList;

public class tk_3<T extends rbF_2>
extends tX_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;
    private final Iq_1 id_finally;
    private float id_extends;

    public tk_3() {
        super(false, 24.0f, 0.0f);
        this.id_return = 64;
        this.id_public = 64;
        this.id_class = new Iq_1(this);
        this.id_class.id_class(0.0f, 19.0f, 0.0f);
        this.id_break = new Iq_1(this, 0, 0);
        this.id_break.id_class(0.0f, 0.0f, 0.0f);
        this.id_class.id_break(this.id_break);
        this.id_break.id_class(-3.5f, -4.0f, -5.0f, 7.0f, 7.0f, 10.0f, 0.0f);
        this.id_private = new Iq_1(this, 26, 7);
        this.id_private.id_class(0.0f, -1.0f, 5.0f, 0.0f, 1.0f, 2.0f, 0.0f);
        this.id_break.id_break(this.id_private);
        this.id_implements = new Iq_1(this, 2, 0);
        this.id_implements.id_class(0.0f, -2.0f, -5.0f);
        this.id_implements.id_class(1.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f, 0.0f);
        this.id_finally = new Iq_1(this, 2, 3);
        this.id_finally.id_class(0.0f, -2.0f, -5.0f);
        this.id_finally.id_class(-2.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f, 0.0f);
        this.id_break.id_break(this.id_implements);
        this.id_break.id_break(this.id_finally);
        this.id_byte = new Iq_1(this, 0, 18);
        this.id_byte.id_class(-1.5f, -4.0f, -3.0f);
        this.id_byte.id_case = 0.0f;
        this.id_byte.id_catch = -0.2618f;
        this.id_byte.id_private = 0.0f;
        this.id_class.id_break(this.id_byte);
        this.id_byte.id_class(-9.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, 0.001f);
        this.id_protected = new Iq_1(this, 0, 18);
        this.id_protected.id_class(1.5f, -4.0f, -3.0f);
        this.id_protected.id_case = 0.0f;
        this.id_protected.id_catch = 0.2618f;
        this.id_protected.id_private = 0.0f;
        this.id_protected.id_implements = true;
        this.id_class.id_break(this.id_protected);
        this.id_protected.id_class(0.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, 0.001f);
        this.id_throws = new Iq_1(this);
        this.id_throws.id_class(1.5f, 3.0f, -2.0f);
        this.id_class.id_break(this.id_throws);
        this.id_throws.id_class("frontLegBox", -5.0f, 0.0f, 0.0f, 7, 2, 0, 0.0f, 26, 1);
        this.id_case = new Iq_1(this);
        this.id_case.id_class(1.5f, 3.0f, 0.0f);
        this.id_class.id_break(this.id_case);
        this.id_case.id_class("midLegBox", -5.0f, 0.0f, 0.0f, 7, 2, 0, 0.0f, 26, 3);
        this.id_catch = new Iq_1(this);
        this.id_catch.id_class(1.5f, 3.0f, 2.0f);
        this.id_class.id_break(this.id_catch);
        this.id_catch.id_class("backLegBox", -5.0f, 0.0f, 0.0f, 7, 2, 0, 0.0f, 26, 5);
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of();
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6;
        boolean bl;
        this.id_byte.id_case = 0.0f;
        this.id_implements.id_case = 0.0f;
        this.id_finally.id_case = 0.0f;
        this.id_class.id_case = 0.0f;
        this.id_class.id_protected = 19.0f;
        boolean bl2 = bl = ((an_3)t).BL() && ((an_3)t).rv().id_catch() < 1.0E-7;
        if (bl) {
            this.id_byte.id_catch = -0.2618f;
            this.id_byte.id_private = 0.0f;
            this.id_protected.id_case = 0.0f;
            this.id_protected.id_catch = 0.2618f;
            this.id_protected.id_private = 0.0f;
            this.id_throws.id_case = 0.0f;
            this.id_case.id_case = 0.0f;
            this.id_catch.id_case = 0.0f;
        } else {
            f6 = f3 * 2.1f;
            this.id_byte.id_catch = 0.0f;
            this.id_byte.id_private = rfU_2.id_break(f6) * (float)Math.PI * 0.15f;
            this.id_protected.id_case = this.id_byte.id_case;
            this.id_protected.id_catch = this.id_byte.id_catch;
            this.id_protected.id_private = -this.id_byte.id_private;
            this.id_throws.id_case = 0.7853982f;
            this.id_case.id_case = 0.7853982f;
            this.id_catch.id_case = 0.7853982f;
            this.id_class.id_case = 0.0f;
            this.id_class.id_catch = 0.0f;
            this.id_class.id_private = 0.0f;
        }
        if (!t.T_()) {
            this.id_class.id_case = 0.0f;
            this.id_class.id_catch = 0.0f;
            this.id_class.id_private = 0.0f;
            if (!bl) {
                f6 = rfU_2.id_break(f3 * 0.18f);
                this.id_class.id_case = 0.1f + f6 * (float)Math.PI * 0.025f;
                this.id_implements.id_case = f6 * (float)Math.PI * 0.03f;
                this.id_finally.id_case = f6 * (float)Math.PI * 0.03f;
                this.id_throws.id_case = -f6 * (float)Math.PI * 0.1f + 0.3926991f;
                this.id_catch.id_case = -f6 * (float)Math.PI * 0.05f + 0.7853982f;
                this.id_class.id_protected = 19.0f - rfU_2.id_break(f3 * 0.18f) * 0.9f;
            }
        }
        if (this.id_extends > 0.0f) {
            this.id_class.id_case = wP_2.id_class(this.id_class.id_case, 3.0915928f, this.id_extends);
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        super.id_class(t, f, f2, f3);
        this.id_extends = ((rbF_2)t).id_throw(f3);
        this.id_private.id_finally = !((rbF_2)t).su();
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_class);
    }
}

