/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.LZ;
import celestial.Lj_1;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.cC_2;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class La_1
extends Lj_1<La_1> {
    public final List<LZ> id_class;

    private La_1(List<LZ> list) {
        this.id_class = list;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.id_class.forEach(lZ -> {
            lZ.id_final = n2;
            lZ.id_class(ml_1, n6, n7, f);
        });
    }

    public static La_1 id_class(Qw_1 qw_1, int n, QF qF, QF qF2) {
        LZ lZ = qF.id_class(qw_1, n / 2 - 155, 0, 150);
        return qF2 == null ? new La_1((List<LZ>)ImmutableList.of((Object)lZ)) : new La_1((List<LZ>)ImmutableList.of((Object)lZ, (Object)qF2.id_class(qw_1, n / 2 - 155 + 160, 0, 150)));
    }

    public static La_1 id_class(Qw_1 qw_1, int n, QF qF) {
        return new La_1((List<LZ>)ImmutableList.of((Object)qF.id_class(qw_1, n / 2 - 155, 0, 310)));
    }

    @Override
    public List<? extends cC_2> x_() {
        return this.id_class;
    }
}

