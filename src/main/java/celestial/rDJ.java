/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package celestial;

import celestial.rDb_1;
import celestial.rUV;
import celestial.rXG;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class rDJ
extends rDb_1 {
    public rDJ(Codec<rUV> codec) {
        super(codec, 128);
        this.id_finally = ImmutableSet.of((Object)xu_3.id_break, (Object)xu_3.id_byte, (Object)xu_3.id_throws, (Object)xu_3.id_catch, (Object)xu_3.id_finally, (Object)xu_3.id_extends, (Object[])new xd_3[]{xu_3.id_native, xu_3.id_implements, xu_3.PR, xu_3.PY, xu_3.Po, xu_3.XL, xu_3.Xz, xu_3.bg, xu_3.XN, xu_3.PK, xu_3.Ju});
        this.id_extends = ImmutableSet.of((Object)rXG.id_throws, (Object)rXG.id_byte);
    }

    @Override
    protected boolean id_class(roC_2 roC_22, Function<rfH_2, rYG> function, BitSet bitSet, Random random, rfw_3 rfw_32, rfw_3 rfw_33, rfw_3 rfw_34, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, MutableBoolean mutableBoolean) {
        int n9 = n6 | n8 << 4 | n7 << 8;
        if (bitSet.get(n9)) {
            return false;
        }
        bitSet.set(n9);
        rfw_32.id_class(n4, n7, n5);
        if (this.id_class(roC_22.id_byte(rfw_32))) {
            xc_3 xc_32 = n7 <= 31 ? id_implements.id_catch() : id_catch;
            roC_22.id_class(rfw_32, xc_32, false);
            return true;
        }
        return false;
    }

    @Override
    protected float id_class(Random random) {
        return (random.nextFloat() * 2.0f + random.nextFloat()) * 2.0f;
    }

    @Override
    protected int id_class() {
        return 10;
    }

    @Override
    protected int id_break(Random random) {
        return random.nextInt(this.id_native);
    }

    @Override
    protected double id_break() {
        return 5.0;
    }
}

