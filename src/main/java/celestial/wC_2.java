/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class wC_2<T extends an_3>
extends wN_2<T> {
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
    private final Iq_1 id_extends;

    public wC_2() {
        float f = 0.0f;
        int n = 15;
        this.id_class = new Iq_1(this, 32, 4);
        this.id_class.id_class(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, 0.0f);
        this.id_class.id_class(0.0f, 15.0f, -3.0f);
        this.id_break = new Iq_1(this, 0, 0);
        this.id_break.id_class(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f, 0.0f);
        this.id_break.id_class(0.0f, 15.0f, 0.0f);
        this.id_byte = new Iq_1(this, 0, 12);
        this.id_byte.id_class(-5.0f, -4.0f, -6.0f, 10.0f, 8.0f, 12.0f, 0.0f);
        this.id_byte.id_class(0.0f, 15.0f, 9.0f);
        this.id_protected = new Iq_1(this, 18, 0);
        this.id_protected.id_class(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_protected.id_class(-4.0f, 15.0f, 2.0f);
        this.id_throws = new Iq_1(this, 18, 0);
        this.id_throws.id_class(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_throws.id_class(4.0f, 15.0f, 2.0f);
        this.id_case = new Iq_1(this, 18, 0);
        this.id_case.id_class(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_case.id_class(-4.0f, 15.0f, 1.0f);
        this.id_catch = new Iq_1(this, 18, 0);
        this.id_catch.id_class(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_catch.id_class(4.0f, 15.0f, 1.0f);
        this.id_private = new Iq_1(this, 18, 0);
        this.id_private.id_class(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_private.id_class(-4.0f, 15.0f, 0.0f);
        this.id_implements = new Iq_1(this, 18, 0);
        this.id_implements.id_class(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_implements.id_class(4.0f, 15.0f, 0.0f);
        this.id_finally = new Iq_1(this, 18, 0);
        this.id_finally.id_class(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_finally.id_class(-4.0f, 15.0f, -1.0f);
        this.id_extends = new Iq_1(this, 18, 0);
        this.id_extends.id_class(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.id_extends.id_class(4.0f, 15.0f, -1.0f);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_private, (Object)this.id_implements, (Object)this.id_finally, (Object)this.id_extends);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        float f6 = 0.7853982f;
        this.id_protected.id_private = -0.7853982f;
        this.id_throws.id_private = 0.7853982f;
        this.id_case.id_private = -0.58119464f;
        this.id_catch.id_private = 0.58119464f;
        this.id_private.id_private = -0.58119464f;
        this.id_implements.id_private = 0.58119464f;
        this.id_finally.id_private = -0.7853982f;
        this.id_extends.id_private = 0.7853982f;
        float f7 = -0.0f;
        float f8 = 0.3926991f;
        this.id_protected.id_catch = 0.7853982f;
        this.id_throws.id_catch = -0.7853982f;
        this.id_case.id_catch = 0.3926991f;
        this.id_catch.id_catch = -0.3926991f;
        this.id_private.id_catch = -0.3926991f;
        this.id_implements.id_catch = 0.3926991f;
        this.id_finally.id_catch = -0.7853982f;
        this.id_extends.id_catch = 0.7853982f;
        float f9 = -(rfU_2.id_break(f * 0.6662f * 2.0f + 0.0f) * 0.4f) * f2;
        float f10 = -(rfU_2.id_break(f * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f2;
        float f11 = -(rfU_2.id_break(f * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f2;
        float f12 = -(rfU_2.id_break(f * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f2;
        float f13 = Math.abs(rfU_2.id_class(f * 0.6662f + 0.0f) * 0.4f) * f2;
        float f14 = Math.abs(rfU_2.id_class(f * 0.6662f + (float)Math.PI) * 0.4f) * f2;
        float f15 = Math.abs(rfU_2.id_class(f * 0.6662f + 1.5707964f) * 0.4f) * f2;
        float f16 = Math.abs(rfU_2.id_class(f * 0.6662f + 4.712389f) * 0.4f) * f2;
        this.id_protected.id_catch += f9;
        this.id_throws.id_catch += -f9;
        this.id_case.id_catch += f10;
        this.id_catch.id_catch += -f10;
        this.id_private.id_catch += f11;
        this.id_implements.id_catch += -f11;
        this.id_finally.id_catch += f12;
        this.id_extends.id_catch += -f12;
        this.id_protected.id_private += f13;
        this.id_throws.id_private += -f13;
        this.id_case.id_private += f14;
        this.id_catch.id_private += -f14;
        this.id_private.id_private += f15;
        this.id_implements.id_private += -f15;
        this.id_finally.id_private += f16;
        this.id_extends.id_private += -f16;
    }
}

