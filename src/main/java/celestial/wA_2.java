/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class wA_2<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;

    public wA_2(int n) {
        this.id_class = new Iq_1(this, 0, n);
        this.id_break = new Iq_1(this, 32, 0);
        this.id_byte = new Iq_1(this, 32, 4);
        this.id_protected = new Iq_1(this, 32, 8);
        if (n > 0) {
            this.id_class.id_class(-3.0f, 17.0f, -3.0f, 6.0f, 6.0f, 6.0f);
            this.id_break.id_class(-3.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f);
            this.id_byte.id_class(1.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f);
            this.id_protected.id_class(0.0f, 21.0f, -3.5f, 1.0f, 1.0f, 1.0f);
        } else {
            this.id_class.id_class(-4.0f, 16.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected);
    }
}

