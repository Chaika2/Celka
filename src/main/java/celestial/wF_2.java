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

public class wF_2<T extends an_3>
extends wN_2<T> {
    private final Iq_1[] id_class;
    private final Iq_1[] id_break;
    private final ImmutableList<Iq_1> id_byte;
    private final float[] id_protected = new float[7];
    private static final int[][] id_throws = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] id_case = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public wF_2() {
        this.id_class = new Iq_1[7];
        float f = -3.5f;
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i] = new Iq_1(this, id_case[i][0], id_case[i][1]);
            this.id_class[i].id_class((float)id_throws[i][0] * -0.5f, 0.0f, (float)id_throws[i][2] * -0.5f, id_throws[i][0], id_throws[i][1], id_throws[i][2]);
            this.id_class[i].id_class(0.0f, 24 - id_throws[i][1], f);
            this.id_protected[i] = f;
            if (i >= this.id_class.length - 1) continue;
            f += (float)(id_throws[i][2] + id_throws[i + 1][2]) * 0.5f;
        }
        this.id_break = new Iq_1[3];
        this.id_break[0] = new Iq_1(this, 20, 0);
        this.id_break[0].id_class(-5.0f, 0.0f, (float)id_throws[2][2] * -0.5f, 10.0f, 8.0f, id_throws[2][2]);
        this.id_break[0].id_class(0.0f, 16.0f, this.id_protected[2]);
        this.id_break[1] = new Iq_1(this, 20, 11);
        this.id_break[1].id_class(-3.0f, 0.0f, (float)id_throws[4][2] * -0.5f, 6.0f, 4.0f, id_throws[4][2]);
        this.id_break[1].id_class(0.0f, 20.0f, this.id_protected[4]);
        this.id_break[2] = new Iq_1(this, 20, 18);
        this.id_break[2].id_class(-3.0f, 0.0f, (float)id_throws[4][2] * -0.5f, 6.0f, 5.0f, id_throws[1][2]);
        this.id_break[2].id_class(0.0f, 19.0f, this.id_protected[1]);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Arrays.asList(this.id_class));
        builder.addAll(Arrays.asList(this.id_break));
        this.id_byte = builder.build();
    }

    @Override
    public /* synthetic */ Iterable id_class() {
        return this.id_break();
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i].id_catch = rfU_2.id_break(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs(i - 2));
            this.id_class[i].id_byte = rfU_2.id_class(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs(i - 2);
        }
        this.id_break[0].id_catch = this.id_class[2].id_catch;
        this.id_break[1].id_catch = this.id_class[4].id_catch;
        this.id_break[1].id_byte = this.id_class[4].id_byte;
        this.id_break[2].id_catch = this.id_class[1].id_catch;
        this.id_break[2].id_byte = this.id_class[1].id_byte;
    }

    public ImmutableList<Iq_1> id_break() {
        return this.id_byte;
    }
}

