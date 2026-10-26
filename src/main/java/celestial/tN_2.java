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
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public class tN_2<T extends an_3>
extends wN_2<T> {
    private final Iq_1[] id_class;
    private final Iq_1 id_break = new Iq_1(this, 0, 0);
    private final ImmutableList<Iq_1> id_byte;

    public tN_2() {
        this.id_break.id_class(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        this.id_class = new Iq_1[12];
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i] = new Iq_1(this, 0, 16);
            this.id_class[i].id_class(0.0f, 0.0f, 0.0f, 2.0f, 8.0f, 2.0f);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((Object)this.id_break);
        builder.addAll(Arrays.asList(this.id_class));
        this.id_byte = builder.build();
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return this.id_byte;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        int n;
        float f6 = f3 * (float)Math.PI * -0.1f;
        for (n = 0; n < 4; ++n) {
            this.id_class[n].id_protected = -2.0f + rfU_2.id_break(((float)(n * 2) + f3) * 0.25f);
            this.id_class[n].id_byte = rfU_2.id_break(f6) * 9.0f;
            this.id_class[n].id_throws = rfU_2.id_class(f6) * 9.0f;
            f6 += 1.0f;
        }
        f6 = 0.7853982f + f3 * (float)Math.PI * 0.03f;
        for (n = 4; n < 8; ++n) {
            this.id_class[n].id_protected = 2.0f + rfU_2.id_break(((float)(n * 2) + f3) * 0.25f);
            this.id_class[n].id_byte = rfU_2.id_break(f6) * 7.0f;
            this.id_class[n].id_throws = rfU_2.id_class(f6) * 7.0f;
            f6 += 1.0f;
        }
        f6 = 0.47123894f + f3 * (float)Math.PI * -0.05f;
        for (n = 8; n < 12; ++n) {
            this.id_class[n].id_protected = 11.0f + rfU_2.id_break(((float)n * 1.5f + f3) * 0.5f);
            this.id_class[n].id_byte = rfU_2.id_break(f6) * 5.0f;
            this.id_class[n].id_throws = rfU_2.id_class(f6) * 5.0f;
            f6 += 1.0f;
        }
        this.id_break.id_catch = f4 * ((float)Math.PI / 180);
        this.id_break.id_case = f5 * ((float)Math.PI / 180);
    }
}

