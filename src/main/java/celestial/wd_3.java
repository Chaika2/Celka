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

public class wd_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;

    public wd_3() {
        this.id_return = 32;
        this.id_public = 32;
        int n = 23;
        this.id_class = new Iq_1(this, 0, 27);
        this.id_class.id_class(-1.5f, -2.0f, -1.5f, 3.0f, 2.0f, 3.0f);
        this.id_class.id_class(0.0f, 23.0f, 0.0f);
        this.id_break = new Iq_1(this, 24, 6);
        this.id_break.id_class(-1.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f);
        this.id_break.id_class(0.0f, 20.0f, 0.0f);
        this.id_byte = new Iq_1(this, 28, 6);
        this.id_byte.id_class(0.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f);
        this.id_byte.id_class(0.0f, 20.0f, 0.0f);
        this.id_case = new Iq_1(this, -3, 0);
        this.id_case.id_class(-1.5f, 0.0f, 0.0f, 3.0f, 0.0f, 3.0f);
        this.id_case.id_class(0.0f, 22.0f, 1.5f);
        this.id_protected = new Iq_1(this, 25, 0);
        this.id_protected.id_class(-1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f);
        this.id_protected.id_class(-1.5f, 22.0f, -1.5f);
        this.id_throws = new Iq_1(this, 25, 0);
        this.id_throws.id_class(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f);
        this.id_throws.id_class(1.5f, 22.0f, -1.5f);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_case, (Object)this.id_protected, (Object)this.id_throws);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_protected.id_private = -0.2f + 0.4f * rfU_2.id_class(f3 * 0.2f);
        this.id_throws.id_private = 0.2f - 0.4f * rfU_2.id_class(f3 * 0.2f);
    }
}

