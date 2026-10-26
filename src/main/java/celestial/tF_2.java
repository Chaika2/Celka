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

public class tF_2<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;

    public tF_2() {
        this.id_return = 32;
        this.id_public = 32;
        int n = 22;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-1.0f, -2.0f, 0.0f, 2.0f, 4.0f, 7.0f);
        this.id_class.id_class(0.0f, 22.0f, 0.0f);
        this.id_byte = new Iq_1(this, 11, 0);
        this.id_byte.id_class(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f);
        this.id_byte.id_class(0.0f, 22.0f, 0.0f);
        this.id_protected = new Iq_1(this, 0, 0);
        this.id_protected.id_class(-1.0f, -2.0f, -1.0f, 2.0f, 3.0f, 1.0f);
        this.id_protected.id_class(0.0f, 22.0f, -3.0f);
        this.id_throws = new Iq_1(this, 22, 1);
        this.id_throws.id_class(-2.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f);
        this.id_throws.id_class(-1.0f, 23.0f, 0.0f);
        this.id_throws.id_private = -0.7853982f;
        this.id_case = new Iq_1(this, 22, 4);
        this.id_case.id_class(0.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f);
        this.id_case.id_class(1.0f, 23.0f, 0.0f);
        this.id_case.id_private = 0.7853982f;
        this.id_catch = new Iq_1(this, 22, 3);
        this.id_catch.id_class(0.0f, -2.0f, 0.0f, 0.0f, 4.0f, 4.0f);
        this.id_catch.id_class(0.0f, 22.0f, 7.0f);
        this.id_break = new Iq_1(this, 20, -6);
        this.id_break.id_class(0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 6.0f);
        this.id_break.id_class(0.0f, 20.0f, 0.0f);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_break);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6 = 1.0f;
        if (!((an_3)t).rT()) {
            f6 = 1.5f;
        }
        this.id_catch.id_catch = -f6 * 0.45f * rfU_2.id_class(0.6f * f3);
    }
}

