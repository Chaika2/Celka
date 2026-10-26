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

public class wn_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;

    public wn_3() {
        float f = 4.0f;
        float f2 = 0.0f;
        this.id_byte = new Iq_1(this, 0, 0).id_break(64, 64);
        this.id_byte.id_class(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, -0.5f);
        this.id_byte.id_class(0.0f, 4.0f, 0.0f);
        this.id_protected = new Iq_1(this, 32, 0).id_break(64, 64);
        this.id_protected.id_class(-1.0f, 0.0f, -1.0f, 12.0f, 2.0f, 2.0f, -0.5f);
        this.id_protected.id_class(0.0f, 6.0f, 0.0f);
        this.id_throws = new Iq_1(this, 32, 0).id_break(64, 64);
        this.id_throws.id_class(-1.0f, 0.0f, -1.0f, 12.0f, 2.0f, 2.0f, -0.5f);
        this.id_throws.id_class(0.0f, 6.0f, 0.0f);
        this.id_class = new Iq_1(this, 0, 16).id_break(64, 64);
        this.id_class.id_class(-5.0f, -10.0f, -5.0f, 10.0f, 10.0f, 10.0f, -0.5f);
        this.id_class.id_class(0.0f, 13.0f, 0.0f);
        this.id_break = new Iq_1(this, 0, 36).id_break(64, 64);
        this.id_break.id_class(-6.0f, -12.0f, -6.0f, 12.0f, 12.0f, 12.0f, -0.5f);
        this.id_break.id_class(0.0f, 24.0f, 0.0f);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_byte.id_catch = f4 * ((float)Math.PI / 180);
        this.id_byte.id_case = f5 * ((float)Math.PI / 180);
        this.id_class.id_catch = f4 * ((float)Math.PI / 180) * 0.25f;
        float f6 = rfU_2.id_class(this.id_class.id_catch);
        float f7 = rfU_2.id_break(this.id_class.id_catch);
        this.id_protected.id_private = 1.0f;
        this.id_throws.id_private = -1.0f;
        this.id_protected.id_catch = 0.0f + this.id_class.id_catch;
        this.id_throws.id_catch = (float)Math.PI + this.id_class.id_catch;
        this.id_protected.id_byte = f7 * 5.0f;
        this.id_protected.id_throws = -f6 * 5.0f;
        this.id_throws.id_byte = -f7 * 5.0f;
        this.id_throws.id_throws = f6 * 5.0f;
    }

    public Iq_1 id_break() {
        return this.id_byte;
    }
}

