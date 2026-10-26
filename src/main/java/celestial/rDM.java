/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDX;
import celestial.rDk_1;
import celestial.rVA;
import celestial.rVL;
import celestial.rYG;
import celestial.rfH_2;
import celestial.roC_2;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class rDM<WC extends rDX> {
    public static final Codec<rDM<?>> id_class = rVL.y.dispatch(rDM2 -> rDM2.id_protected, rDk_1::id_byte);
    public static final Codec<Supplier<rDM<?>>> id_break = rVA.id_class(rVL.Z, id_class);
    public static final Codec<List<Supplier<rDM<?>>>> id_byte = rVA.id_break(rVL.Z, id_class);
    private final rDk_1<WC> id_protected;
    private final WC id_throws;

    public rDM(rDk_1<WC> rDk_12, WC WC2) {
        this.id_protected = rDk_12;
        this.id_throws = WC2;
    }

    public boolean id_class(roC_2 roC_22, Function<rfH_2, rYG> function, Random random, int n, int n2, int n3, int n4, int n5, BitSet bitSet) {
        return this.id_protected.id_class(roC_22, function, random, n, n2, n3, n4, n5, bitSet, this.id_throws);
    }

    public WC id_class() {
        return this.id_throws;
    }

    public boolean id_class(Random random, int n, int n2) {
        return this.id_protected.id_class(random, n, n2, this.id_throws);
    }
}

