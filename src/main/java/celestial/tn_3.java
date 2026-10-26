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

public class tn_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;

    public tn_3() {
        this.id_return = 64;
        this.id_public = 64;
        float f = 18.0f;
        float f2 = -8.0f;
        this.id_class = new Iq_1(this, 22, 0);
        this.id_class.id_class(-4.0f, -7.0f, 0.0f, 8.0f, 7.0f, 13.0f);
        this.id_class.id_class(0.0f, 22.0f, -5.0f);
        Iq_1 iq_1 = new Iq_1(this, 51, 0);
        iq_1.id_class(-0.5f, 0.0f, 8.0f, 1.0f, 4.0f, 5.0f);
        iq_1.id_case = 1.0471976f;
        this.id_class.id_break(iq_1);
        Iq_1 iq_12 = new Iq_1(this, 48, 20);
        iq_12.id_implements = true;
        iq_12.id_class(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f);
        iq_12.id_class(2.0f, -2.0f, 4.0f);
        iq_12.id_case = 1.0471976f;
        iq_12.id_private = 2.0943952f;
        this.id_class.id_break(iq_12);
        Iq_1 iq_13 = new Iq_1(this, 48, 20);
        iq_13.id_class(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f);
        iq_13.id_class(-2.0f, -2.0f, 4.0f);
        iq_13.id_case = 1.0471976f;
        iq_13.id_private = -2.0943952f;
        this.id_class.id_break(iq_13);
        this.id_break = new Iq_1(this, 0, 19);
        this.id_break.id_class(-2.0f, -2.5f, 0.0f, 4.0f, 5.0f, 11.0f);
        this.id_break.id_class(0.0f, -2.5f, 11.0f);
        this.id_break.id_case = -0.10471976f;
        this.id_class.id_break(this.id_break);
        this.id_byte = new Iq_1(this, 19, 20);
        this.id_byte.id_class(-5.0f, -0.5f, 0.0f, 10.0f, 1.0f, 6.0f);
        this.id_byte.id_class(0.0f, 0.0f, 9.0f);
        this.id_byte.id_case = 0.0f;
        this.id_break.id_break(this.id_byte);
        Iq_1 iq_14 = new Iq_1(this, 0, 0);
        iq_14.id_class(-4.0f, -3.0f, -3.0f, 8.0f, 7.0f, 6.0f);
        iq_14.id_class(0.0f, -4.0f, -3.0f);
        Iq_1 iq_15 = new Iq_1(this, 0, 13);
        iq_15.id_class(-1.0f, 2.0f, -7.0f, 2.0f, 2.0f, 4.0f);
        iq_14.id_break(iq_15);
        this.id_class.id_break(iq_14);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        if (an_3.id_case(((an_3)t).rv()) > 1.0E-7) {
            this.id_class.id_case += -0.05f + -0.05f * rfU_2.id_break(f3 * 0.3f);
            this.id_break.id_case = -0.1f * rfU_2.id_break(f3 * 0.3f);
            this.id_byte.id_case = -0.2f * rfU_2.id_break(f3 * 0.3f);
        }
    }
}

