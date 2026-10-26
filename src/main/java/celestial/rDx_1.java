/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package celestial;

import celestial.rDG;
import celestial.rDd_1;
import celestial.rUV;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class rDx_1
extends rDG {
    public rDx_1(Codec<rUV> codec) {
        super(codec);
        this.id_finally = ImmutableSet.of((Object)xu_3.id_break, (Object)xu_3.id_byte, (Object)xu_3.id_throws, (Object)xu_3.id_catch, (Object)xu_3.id_finally, (Object)xu_3.id_extends, (Object[])new xd_3[]{xu_3.id_native, xu_3.id_implements, xu_3.Ee, xu_3.sw, xu_3.sI, xu_3.sf, xu_3.sj, xu_3.sV, xu_3.sg, xu_3.sR, xu_3.sY, xu_3.so, xu_3.sK, xu_3.sD, xu_3.sU, xu_3.se, xu_3.sa, xu_3.si, xu_3.Er, xu_3.F, xu_3.GI, xu_3.Bi, xu_3.Pq, xu_3.id_throw, xu_3.id_char, xu_3.id_try, xu_3.id_instanceof, xu_3.rg, xu_3.id_class, xu_3.hb});
    }

    @Override
    protected boolean id_class(roC_2 roC_22, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return false;
    }

    @Override
    protected boolean id_class(roC_2 roC_22, Function<rfH_2, rYG> function, BitSet bitSet, Random random, rfw_3 rfw_32, rfw_3 rfw_33, rfw_3 rfw_34, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, MutableBoolean mutableBoolean) {
        return rDd_1.id_class(this, roC_22, bitSet, random, rfw_32, n, n2, n3, n4, n5, n6, n7, n8);
    }
}

