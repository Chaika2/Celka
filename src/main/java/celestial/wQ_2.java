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

public class wQ_2<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;

    public wQ_2() {
        this.id_return = 32;
        this.id_public = 32;
        int n = 20;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f);
        this.id_class.id_class(0.0f, 20.0f, 0.0f);
        this.id_break = new Iq_1(this, 0, 13);
        this.id_break.id_class(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f);
        this.id_break.id_class(0.0f, 20.0f, 8.0f);
        this.id_byte = new Iq_1(this, 22, 0);
        this.id_byte.id_class(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f);
        this.id_byte.id_class(0.0f, 20.0f, 0.0f);
        Iq_1 iq_1 = new Iq_1(this, 20, 10);
        iq_1.id_class(0.0f, -2.5f, 0.0f, 0.0f, 5.0f, 6.0f);
        iq_1.id_class(0.0f, 0.0f, 8.0f);
        this.id_break.id_break(iq_1);
        Iq_1 iq_12 = new Iq_1(this, 2, 1);
        iq_12.id_class(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 3.0f);
        iq_12.id_class(0.0f, -4.5f, 5.0f);
        this.id_class.id_break(iq_12);
        Iq_1 iq_13 = new Iq_1(this, 0, 2);
        iq_13.id_class(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 4.0f);
        iq_13.id_class(0.0f, -4.5f, -1.0f);
        this.id_break.id_break(iq_13);
        this.id_protected = new Iq_1(this, -4, 0);
        this.id_protected.id_class(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f);
        this.id_protected.id_class(-1.5f, 21.5f, 0.0f);
        this.id_protected.id_private = -0.7853982f;
        this.id_throws = new Iq_1(this, 0, 0);
        this.id_throws.id_class(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f);
        this.id_throws.id_class(1.5f, 21.5f, 0.0f);
        this.id_throws.id_private = 0.7853982f;
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6 = 1.0f;
        float f7 = 1.0f;
        if (!((an_3)t).rT()) {
            f6 = 1.3f;
            f7 = 1.7f;
        }
        this.id_break.id_catch = -f6 * 0.25f * rfU_2.id_class(f7 * 0.6f * f3);
    }
}

