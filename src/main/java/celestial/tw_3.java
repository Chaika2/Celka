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
import java.util.Random;

public class tw_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1[] id_class = new Iq_1[9];
    private final ImmutableList<Iq_1> id_break;

    public tw_3() {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iq_1 iq_1 = new Iq_1(this, 0, 0);
        iq_1.id_class(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f);
        iq_1.id_protected = 17.6f;
        builder.add((Object)iq_1);
        Random random = new Random(1660L);
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i] = new Iq_1(this, 0, 0);
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f2 = ((float)(i / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n = random.nextInt(7) + 8;
            this.id_class[i].id_class(-1.0f, 0.0f, -1.0f, 2.0f, n, 2.0f);
            this.id_class[i].id_byte = f;
            this.id_class[i].id_throws = f2;
            this.id_class[i].id_protected = 24.6f;
            builder.add((Object)this.id_class[i]);
        }
        this.id_break = builder.build();
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i].id_case = 0.2f * rfU_2.id_class(f3 * 0.3f + (float)i) + 0.4f;
        }
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return this.id_break;
    }
}

