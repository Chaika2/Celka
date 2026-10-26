/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVA;
import celestial.rVL;
import celestial.rYG;
import celestial.roC_2;
import celestial.rrSa_1;
import celestial.rrsE_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.function.Supplier;

public class rrSR<SC extends rrSa_1> {
    public static final Codec<rrSR<?>> id_class = rVL.l.dispatch(rrSR2 -> rrSR2.id_byte, rrsE_2::id_protected);
    public static final Codec<Supplier<rrSR<?>>> id_break = rVA.id_class(rVL.m, id_class);
    public final rrsE_2<SC> id_byte;
    public final SC id_protected;

    public rrSR(rrsE_2<SC> rrsE_22, SC SC2) {
        this.id_byte = rrsE_22;
        this.id_protected = SC2;
    }

    public SC id_class() {
        return this.id_protected;
    }

    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l) {
        this.id_byte.id_class(random, roC_22, rYG2, n, n2, n3, d, xc_32, xc_33, n4, l, this.id_protected);
    }

    public void id_class(long l) {
        this.id_byte.id_class(l);
    }
}

