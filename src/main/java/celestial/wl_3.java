/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public class wl_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1[] id_break = new Iq_1[8];
    private final ImmutableList<Iq_1> id_byte;

    public wl_3() {
        int n = -16;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-6.0f, -8.0f, -6.0f, 12.0f, 16.0f, 12.0f);
        this.id_class.id_protected += 8.0f;
        for (int i = 0; i < this.id_break.length; ++i) {
            this.id_break[i] = new Iq_1(this, 48, 0);
            double d = (double)i * Math.PI * 2.0 / (double)this.id_break.length;
            float f = (float)Math.cos(d) * 5.0f;
            float f2 = (float)Math.sin(d) * 5.0f;
            this.id_break[i].id_class(-1.0f, 0.0f, -1.0f, 2.0f, 18.0f, 2.0f);
            this.id_break[i].id_byte = f;
            this.id_break[i].id_throws = f2;
            this.id_break[i].id_protected = 15.0f;
            d = (double)i * Math.PI * -2.0 / (double)this.id_break.length + 1.5707963267948966;
            this.id_break[i].id_catch = (float)d;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((Object)this.id_class);
        builder.addAll(Arrays.asList(this.id_break));
        this.id_byte = builder.build();
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        for (Iq_1 iq_1 : this.id_break) {
            iq_1.id_case = f3;
        }
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return this.id_byte;
    }
}

