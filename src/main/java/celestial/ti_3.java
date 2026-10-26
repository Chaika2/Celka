/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package celestial;

import celestial.Iq_1;
import celestial.rGA;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public class ti_3<T extends rGA>
extends wN_2<T> {
    private final Iq_1[] id_class = new Iq_1[8];
    private final Iq_1 id_break;
    private final ImmutableList<Iq_1> id_byte;

    public ti_3() {
        for (int i = 0; i < this.id_class.length; ++i) {
            int n = 0;
            int n2 = i;
            if (i == 2) {
                n = 24;
                n2 = 10;
            } else if (i == 3) {
                n = 24;
                n2 = 19;
            }
            this.id_class[i] = new Iq_1(this, n, n2);
            this.id_class[i].id_class(-4.0f, 16 + i, -4.0f, 8.0f, 1.0f, 8.0f);
        }
        this.id_break = new Iq_1(this, 0, 16);
        this.id_break.id_class(-2.0f, 18.0f, -2.0f, 4.0f, 4.0f, 4.0f);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((Object)this.id_break);
        builder.addAll(Arrays.asList(this.id_class));
        this.id_byte = builder.build();
    }

    @Override
    public /* synthetic */ Iterable id_class() {
        return this.id_break();
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        float f4 = rfU_2.id_catch(f3, ((rGA)t).id_protected, ((rGA)t).id_break);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i].id_protected = (float)(-(4 - i)) * f4 * 1.7f;
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
    }

    public ImmutableList<Iq_1> id_break() {
        return this.id_byte;
    }
}

