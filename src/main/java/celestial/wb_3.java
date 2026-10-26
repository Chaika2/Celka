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

public class wb_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;

    public wb_3() {
        this.id_return = 64;
        this.id_public = 64;
        this.id_class = new Iq_1(this, 0, 8);
        this.id_class.id_class(-3.0f, -2.0f, -8.0f, 5.0f, 3.0f, 9.0f);
        this.id_case = new Iq_1(this, 3, 20);
        this.id_case.id_class(-2.0f, 0.0f, 0.0f, 3.0f, 2.0f, 6.0f);
        this.id_case.id_class(0.0f, -2.0f, 1.0f);
        this.id_class.id_break(this.id_case);
        this.id_catch = new Iq_1(this, 4, 29);
        this.id_catch.id_class(-1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 6.0f);
        this.id_catch.id_class(0.0f, 0.5f, 6.0f);
        this.id_case.id_break(this.id_catch);
        this.id_break = new Iq_1(this, 23, 12);
        this.id_break.id_class(0.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f);
        this.id_break.id_class(2.0f, -2.0f, -8.0f);
        this.id_byte = new Iq_1(this, 16, 24);
        this.id_byte.id_class(0.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f);
        this.id_byte.id_class(6.0f, 0.0f, 0.0f);
        this.id_break.id_break(this.id_byte);
        this.id_protected = new Iq_1(this, 23, 12);
        this.id_protected.id_implements = true;
        this.id_protected.id_class(-6.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f);
        this.id_protected.id_class(-3.0f, -2.0f, -8.0f);
        this.id_throws = new Iq_1(this, 16, 24);
        this.id_throws.id_implements = true;
        this.id_throws.id_class(-13.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f);
        this.id_throws.id_class(-6.0f, 0.0f, 0.0f);
        this.id_protected.id_break(this.id_throws);
        this.id_break.id_private = 0.1f;
        this.id_byte.id_private = 0.1f;
        this.id_protected.id_private = -0.1f;
        this.id_throws.id_private = -0.1f;
        this.id_class.id_case = -0.1f;
        Iq_1 iq_1 = new Iq_1(this, 0, 0);
        iq_1.id_class(-4.0f, -2.0f, -5.0f, 7.0f, 3.0f, 5.0f);
        iq_1.id_class(0.0f, 1.0f, -7.0f);
        iq_1.id_case = 0.2f;
        this.id_class.id_break(iq_1);
        this.id_class.id_break(this.id_break);
        this.id_class.id_break(this.id_protected);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6 = ((float)(((an_3)t).V() * 3) + f3) * 0.13f;
        float f7 = 16.0f;
        this.id_break.id_private = rfU_2.id_break(f6) * 16.0f * ((float)Math.PI / 180);
        this.id_byte.id_private = rfU_2.id_break(f6) * 16.0f * ((float)Math.PI / 180);
        this.id_protected.id_private = -this.id_break.id_private;
        this.id_throws.id_private = -this.id_byte.id_private;
        this.id_case.id_case = -(5.0f + rfU_2.id_break(f6 * 2.0f) * 5.0f) * ((float)Math.PI / 180);
        this.id_catch.id_case = -(5.0f + rfU_2.id_break(f6 * 2.0f) * 5.0f) * ((float)Math.PI / 180);
    }
}

