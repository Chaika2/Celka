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
import celestial.tX_2;
import com.google.common.collect.ImmutableList;

public class tv_3<T extends an_3>
extends tX_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;

    public tv_3() {
        int n = 16;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-2.0f, -6.0f, -2.0f, 4.0f, 6.0f, 3.0f, 0.0f);
        this.id_class.id_class(0.0f, 15.0f, -4.0f);
        this.id_catch = new Iq_1(this, 14, 0);
        this.id_catch.id_class(-2.0f, -4.0f, -4.0f, 4.0f, 2.0f, 2.0f, 0.0f);
        this.id_catch.id_class(0.0f, 15.0f, -4.0f);
        this.id_private = new Iq_1(this, 14, 4);
        this.id_private.id_class(-1.0f, -2.0f, -3.0f, 2.0f, 2.0f, 2.0f, 0.0f);
        this.id_private.id_class(0.0f, 15.0f, -4.0f);
        this.id_break = new Iq_1(this, 0, 9);
        this.id_break.id_class(-3.0f, -4.0f, -3.0f, 6.0f, 8.0f, 6.0f, 0.0f);
        this.id_break.id_class(0.0f, 16.0f, 0.0f);
        this.id_byte = new Iq_1(this, 26, 0);
        this.id_byte.id_class(-1.0f, 0.0f, -3.0f, 3.0f, 5.0f, 3.0f);
        this.id_byte.id_class(-2.0f, 19.0f, 1.0f);
        this.id_protected = new Iq_1(this, 26, 0);
        this.id_protected.id_class(-1.0f, 0.0f, -3.0f, 3.0f, 5.0f, 3.0f);
        this.id_protected.id_class(1.0f, 19.0f, 1.0f);
        this.id_throws = new Iq_1(this, 24, 13);
        this.id_throws.id_class(0.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f);
        this.id_throws.id_class(-4.0f, 13.0f, 0.0f);
        this.id_case = new Iq_1(this, 24, 13);
        this.id_case.id_class(-1.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f);
        this.id_case.id_class(4.0f, 13.0f, 0.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_catch.id_case = this.id_class.id_case;
        this.id_catch.id_catch = this.id_class.id_catch;
        this.id_private.id_case = this.id_class.id_case;
        this.id_private.id_catch = this.id_class.id_catch;
        this.id_break.id_case = 1.5707964f;
        this.id_byte.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
        this.id_protected.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.id_throws.id_private = f3;
        this.id_case.id_private = -f3;
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_catch, (Object)this.id_private);
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case);
    }
}

