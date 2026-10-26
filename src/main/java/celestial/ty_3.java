/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.rfU_2;
import celestial.wN_2;
import java.util.Arrays;

public class ty_3<T extends an_3>
extends wN_2<T> {
    private static final int[][] id_class = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
    private static final int[][] id_break = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
    private static final int id_byte = id_class.length;
    private final Iq_1[] id_protected = new Iq_1[id_byte];

    public ty_3() {
        float f = -3.5f;
        for (int i = 0; i < this.id_protected.length; ++i) {
            this.id_protected[i] = new Iq_1(this, id_break[i][0], id_break[i][1]);
            this.id_protected[i].id_class((float)id_class[i][0] * -0.5f, 0.0f, (float)id_class[i][2] * -0.5f, id_class[i][0], id_class[i][1], id_class[i][2]);
            this.id_protected[i].id_class(0.0f, 24 - id_class[i][1], f);
            if (i >= this.id_protected.length - 1) continue;
            f += (float)(id_class[i][2] + id_class[i + 1][2]) * 0.5f;
        }
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return Arrays.asList(this.id_protected);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < this.id_protected.length; ++i) {
            this.id_protected[i].id_catch = rfU_2.id_break(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + Math.abs(i - 2));
            this.id_protected[i].id_byte = rfU_2.id_class(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)Math.abs(i - 2);
        }
    }
}

