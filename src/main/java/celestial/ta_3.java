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

public class ta_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class = new Iq_1(this);

    public ta_3() {
        this(0.0f);
    }

    public ta_3(float f) {
        int n = 2;
        this.id_class.id_class(0, 0).id_class(-4.0f, 0.0f, 0.0f, 2.0f, 2.0f, 2.0f, f);
        this.id_class.id_class(0, 0).id_class(0.0f, -4.0f, 0.0f, 2.0f, 2.0f, 2.0f, f);
        this.id_class.id_class(0, 0).id_class(0.0f, 0.0f, -4.0f, 2.0f, 2.0f, 2.0f, f);
        this.id_class.id_class(0, 0).id_class(0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 2.0f, f);
        this.id_class.id_class(0, 0).id_class(2.0f, 0.0f, 0.0f, 2.0f, 2.0f, 2.0f, f);
        this.id_class.id_class(0, 0).id_class(0.0f, 2.0f, 0.0f, 2.0f, 2.0f, 2.0f, f);
        this.id_class.id_class(0, 0).id_class(0.0f, 0.0f, 2.0f, 2.0f, 2.0f, 2.0f, f);
        this.id_class.id_class(0.0f, 0.0f, 0.0f);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
    }
}

