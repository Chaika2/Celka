/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.rba_3;
import celestial.rfU_2;
import celestial.tX_2;
import com.google.common.collect.ImmutableList;

public class tT_2<T extends rba_3>
extends tX_2<T> {
    public final Iq_1 id_class;
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

    public tT_2() {
        super(true, 8.0f, 3.35f);
        this.id_return = 48;
        this.id_public = 32;
        this.id_class = new Iq_1(this, 1, 5);
        this.id_class.id_class(-3.0f, -2.0f, -5.0f, 8.0f, 6.0f, 6.0f);
        this.id_class.id_class(-1.0f, 16.5f, -3.0f);
        this.id_break = new Iq_1(this, 8, 1);
        this.id_break.id_class(-3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f);
        this.id_byte = new Iq_1(this, 15, 1);
        this.id_byte.id_class(3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f);
        this.id_protected = new Iq_1(this, 6, 18);
        this.id_protected.id_class(-1.0f, 2.01f, -8.0f, 4.0f, 2.0f, 3.0f);
        this.id_class.id_break(this.id_break);
        this.id_class.id_break(this.id_byte);
        this.id_class.id_break(this.id_protected);
        this.id_throws = new Iq_1(this, 24, 15);
        this.id_throws.id_class(-3.0f, 3.999f, -3.5f, 6.0f, 11.0f, 6.0f);
        this.id_throws.id_class(0.0f, 16.0f, -6.0f);
        float f = 0.001f;
        this.id_case = new Iq_1(this, 13, 24);
        this.id_case.id_class(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.id_case.id_class(-5.0f, 17.5f, 7.0f);
        this.id_catch = new Iq_1(this, 4, 24);
        this.id_catch.id_class(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.id_catch.id_class(-1.0f, 17.5f, 7.0f);
        this.id_private = new Iq_1(this, 13, 24);
        this.id_private.id_class(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.id_private.id_class(-5.0f, 17.5f, 0.0f);
        this.id_implements = new Iq_1(this, 4, 24);
        this.id_implements.id_class(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.id_implements.id_class(-1.0f, 17.5f, 0.0f);
        this.id_finally = new Iq_1(this, 30, 0);
        this.id_finally.id_class(2.0f, 0.0f, -1.0f, 4.0f, 9.0f, 5.0f);
        this.id_finally.id_class(-4.0f, 15.0f, -1.0f);
        this.id_throws.id_break(this.id_finally);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (!(((rba_3)t).Sc() || ((rba_3)t).sx() || ((rba_3)t).x())) {
            this.id_class.id_case = f5 * ((float)Math.PI / 180);
            this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        }
        if (((rba_3)t).Sc()) {
            this.id_class.id_case = 0.0f;
            this.id_class.id_catch = -2.0943952f;
            this.id_class.id_private = rfU_2.id_break(f3 * 0.027f) / 22.0f;
        }
        if (((rba_3)t).x()) {
            this.id_throws.id_catch = f6 = rfU_2.id_break(f3) * 0.01f;
            this.id_case.id_private = f6;
            this.id_catch.id_private = f6;
            this.id_private.id_private = f6 / 2.0f;
            this.id_implements.id_private = f6 / 2.0f;
        }
        if (((rba_3)t).sx()) {
            f6 = 0.1f;
            this.id_extends += 0.67f;
            this.id_case.id_case = rfU_2.id_break(this.id_extends * 0.4662f) * 0.1f;
            this.id_catch.id_case = rfU_2.id_break(this.id_extends * 0.4662f + (float)Math.PI) * 0.1f;
            this.id_private.id_case = rfU_2.id_break(this.id_extends * 0.4662f + (float)Math.PI) * 0.1f;
            this.id_implements.id_case = rfU_2.id_break(this.id_extends * 0.4662f) * 0.1f;
        }
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        this.id_throws.id_case = 1.5707964f;
        this.id_finally.id_case = -0.05235988f;
        this.id_case.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
        this.id_catch.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.id_private.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.id_implements.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
        this.id_class.id_class(-1.0f, 16.5f, -3.0f);
        this.id_class.id_catch = 0.0f;
        this.id_class.id_private = ((rba_3)t).id_throw(f3);
        this.id_case.id_finally = true;
        this.id_catch.id_finally = true;
        this.id_private.id_finally = true;
        this.id_implements.id_finally = true;
        this.id_throws.id_class(0.0f, 16.0f, -6.0f);
        this.id_throws.id_private = 0.0f;
        this.id_case.id_class(-5.0f, 17.5f, 7.0f);
        this.id_catch.id_class(-1.0f, 17.5f, 7.0f);
        if (((rba_3)t).x()) {
            this.id_throws.id_case = 1.6755161f;
            float f4 = ((rba_3)t).id_interface(f3);
            this.id_throws.id_class(0.0f, 16.0f + ((rba_3)t).id_interface(f3), -6.0f);
            this.id_class.id_class(-1.0f, 16.5f + f4, -3.0f);
            this.id_class.id_catch = 0.0f;
        } else if (((rba_3)t).Sc()) {
            this.id_throws.id_private = -1.5707964f;
            this.id_throws.id_class(0.0f, 21.0f, -6.0f);
            this.id_finally.id_case = -2.6179938f;
            if (this.id_int) {
                this.id_finally.id_case = -2.1816616f;
                this.id_throws.id_class(0.0f, 21.0f, -2.0f);
            }
            this.id_class.id_class(1.0f, 19.49f, -3.0f);
            this.id_class.id_case = 0.0f;
            this.id_class.id_catch = -2.0943952f;
            this.id_class.id_private = 0.0f;
            this.id_case.id_finally = false;
            this.id_catch.id_finally = false;
            this.id_private.id_finally = false;
            this.id_implements.id_finally = false;
        } else if (((rba_3)t).sJ()) {
            this.id_throws.id_case = 0.5235988f;
            this.id_throws.id_class(0.0f, 9.0f, -3.0f);
            this.id_finally.id_case = 0.7853982f;
            this.id_finally.id_class(-4.0f, 15.0f, -2.0f);
            this.id_class.id_class(-1.0f, 10.0f, -0.25f);
            this.id_class.id_case = 0.0f;
            this.id_class.id_catch = 0.0f;
            if (this.id_int) {
                this.id_class.id_class(-1.0f, 13.0f, -3.75f);
            }
            this.id_case.id_case = -1.3089969f;
            this.id_case.id_class(-5.0f, 21.5f, 6.75f);
            this.id_catch.id_case = -1.3089969f;
            this.id_catch.id_class(-1.0f, 21.5f, 6.75f);
            this.id_private.id_case = -0.2617994f;
            this.id_implements.id_case = -0.2617994f;
        }
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_private, (Object)this.id_implements);
    }
}

