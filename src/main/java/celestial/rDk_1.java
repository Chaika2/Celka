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
import celestial.rDJ;
import celestial.rDM;
import celestial.rDX;
import celestial.rDb_1;
import celestial.rDd_1;
import celestial.rDx_1;
import celestial.rUV;
import celestial.rVL;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rlG_2;
import celestial.roC_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class rDk_1<C extends rDX> {
    public static final rDk_1<rUV> id_class = rDk_1.id_class("cave", new rDb_1(rUV.id_class, 256));
    public static final rDk_1<rUV> id_break = rDk_1.id_class("nether_cave", new rDJ(rUV.id_class));
    public static final rDk_1<rUV> id_byte = rDk_1.id_class("canyon", new rDG(rUV.id_class));
    public static final rDk_1<rUV> id_protected = rDk_1.id_class("underwater_canyon", new rDx_1(rUV.id_class));
    public static final rDk_1<rUV> id_throws = rDk_1.id_class("underwater_cave", new rDd_1(rUV.id_class));
    protected static final xc_3 id_case = xu_3.id_class.id_continue();
    protected static final xc_3 id_catch = xu_3.hb.id_continue();
    protected static final rXE id_private = rXG.id_byte.id_private();
    protected static final rXE id_implements = rXG.id_throws.id_private();
    protected Set<xd_3> id_finally = ImmutableSet.of((Object)xu_3.id_break, (Object)xu_3.id_byte, (Object)xu_3.id_throws, (Object)xu_3.id_catch, (Object)xu_3.id_finally, (Object)xu_3.id_extends, (Object[])new xd_3[]{xu_3.id_native, xu_3.id_implements, xu_3.Ee, xu_3.sw, xu_3.sI, xu_3.sf, xu_3.sj, xu_3.sV, xu_3.sg, xu_3.sR, xu_3.sY, xu_3.so, xu_3.sK, xu_3.sD, xu_3.sU, xu_3.se, xu_3.sa, xu_3.si, xu_3.Er, xu_3.F, xu_3.GI, xu_3.Bi, xu_3.Pq, xu_3.Ei});
    protected Set<rXs_1> id_extends = ImmutableSet.of((Object)rXG.id_byte);
    private final Codec<rDM<C>> id_volatile;
    protected final int id_native;

    public Codec<rDM<C>> id_byte() {
        return this.id_volatile;
    }

    public rDk_1(Codec<C> codec, int n) {
        this.id_native = n;
        this.id_volatile = codec.fieldOf("config").xmap(this::id_class, rDM::id_class).codec();
    }

    private boolean id_class(int n, int n2, int n3, int n4, int n5, int n6) {
        return n5 == n || n5 == n2 - 1 || n6 == n3 || n6 == n4 - 1;
    }

    protected boolean id_class(roC_2 roC_22, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n3; i < n4; ++i) {
            for (int j = n7; j < n8; ++j) {
                for (int k = n5 - 1; k <= n6 + 1; ++k) {
                    if (this.id_extends.contains(roC_22.id_break(rfw_32.id_class(i + n * 16, k, j + n2 * 16)).id_class())) {
                        return true;
                    }
                    if (k == n6 + 1 || this.id_class(n3, n4, n7, n8, i, j)) continue;
                    k = n6;
                }
            }
        }
        return false;
    }

    protected boolean id_class(xc_3 xc_32, xc_3 xc_33) {
        return this.id_class(xc_32) || (xc_32.id_class(xu_3.id_throw) || xc_32.id_class(xu_3.id_char)) && !xc_33.id_volatile().id_class(rlG_2.id_break);
    }

    protected boolean id_class(xc_3 xc_32) {
        return this.id_finally.contains(xc_32.id_break());
    }

    protected boolean id_class(int n, int n2, double d, double d2, int n3, int n4, float f) {
        double d3 = n * 16 + 8;
        double d4 = d - d3;
        double d5 = n2 * 16 + 8;
        double d6 = d2 - d5;
        double d7 = n4 - n3;
        double d8 = f + 2.0f + 16.0f;
        return d4 * d4 + d6 * d6 - d7 * d7 <= d8 * d8;
    }

    protected abstract boolean id_class(double var1, double var3, double var5, int var7);

    private static <C extends rDX, F extends rDk_1<C>> F id_class(String string, F f) {
        return (F)rVL.id_class(rVL.y, string, f);
    }

    public rDM<C> id_class(C c) {
        return new rDM<C>(this, c);
    }

    protected boolean id_class(roC_2 roC_22, Function<rfH_2, rYG> function, long l, int n, int n2, int n3, double d, double d2, double d3, double d4, double d5, BitSet bitSet) {
        Random random = new Random(l + (long)n2 + (long)n3);
        double d6 = n2 * 16 + 8;
        double d7 = n3 * 16 + 8;
        if (!(d < d6 - 16.0 - d4 * 2.0 || d3 < d7 - 16.0 - d4 * 2.0 || d > d6 + 16.0 + d4 * 2.0 || d3 > d7 + 16.0 + d4 * 2.0)) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = Math.max(rfU_2.id_byte(d - d4) - n2 * 16 - 1, 0);
            if (this.id_class(roC_22, n2, n3, n9, n8 = Math.min(rfU_2.id_byte(d + d4) - n2 * 16 + 1, 16), n7 = Math.max(rfU_2.id_byte(d2 - d5) - 1, 1), n6 = Math.min(rfU_2.id_byte(d2 + d5) + 1, this.id_native - 8), n5 = Math.max(rfU_2.id_byte(d3 - d4) - n3 * 16 - 1, 0), n4 = Math.min(rfU_2.id_byte(d3 + d4) - n3 * 16 + 1, 16))) {
                return false;
            }
            boolean bl = false;
            rfw_3 rfw_32 = new rfw_3();
            rfw_3 rfw_33 = new rfw_3();
            rfw_3 rfw_34 = new rfw_3();
            for (int i = n9; i < n8; ++i) {
                int n10 = i + n2 * 16;
                double d8 = ((double)n10 + 0.5 - d) / d4;
                for (int j = n5; j < n4; ++j) {
                    int n11 = j + n3 * 16;
                    double d9 = ((double)n11 + 0.5 - d3) / d4;
                    if (d8 * d8 + d9 * d9 >= 1.0) continue;
                    MutableBoolean mutableBoolean = new MutableBoolean(false);
                    for (int k = n6; k > n7; --k) {
                        double d10 = ((double)k - 0.5 - d2) / d5;
                        if (this.id_class(d8, d10, d9, k)) continue;
                        bl |= this.id_class(roC_22, function, bitSet, random, rfw_32, rfw_33, rfw_34, n, n2, n3, n10, n11, i, k, j, mutableBoolean);
                    }
                }
            }
            return bl;
        }
        return false;
    }

    protected boolean id_class(roC_2 roC_22, Function<rfH_2, rYG> function, BitSet bitSet, Random random, rfw_3 rfw_32, rfw_3 rfw_33, rfw_3 rfw_34, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, MutableBoolean mutableBoolean) {
        int n9 = n6 | n8 << 4 | n7 << 8;
        if (bitSet.get(n9)) {
            return false;
        }
        bitSet.set(n9);
        rfw_32.id_class(n4, n7, n5);
        xc_3 xc_32 = roC_22.id_byte(rfw_32);
        xc_3 xc_33 = roC_22.id_byte(rfw_33.id_class((rja_3)rfw_32, rpr_3.UP));
        if (xc_32.id_class(xu_3.id_implements) || xc_32.id_class(xu_3.Bi)) {
            mutableBoolean.setTrue();
        }
        if (!this.id_class(xc_32, xc_33)) {
            return false;
        }
        if (n7 < 11) {
            roC_22.id_class(rfw_32, id_implements.id_catch(), false);
        } else {
            roC_22.id_class(rfw_32, id_catch, false);
            if (mutableBoolean.isTrue()) {
                rfw_34.id_class((rja_3)rfw_32, rpr_3.DOWN);
                if (roC_22.id_byte(rfw_34).id_class(xu_3.id_finally)) {
                    roC_22.id_class(rfw_34, function.apply(rfw_32).id_throws().id_throws().id_class(), false);
                }
            }
        }
        return true;
    }

    public abstract boolean id_class(roC_2 var1, Function<rfH_2, rYG> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9, C var10);

    public abstract boolean id_class(Random var1, int var2, int var3, C var4);

    public int id_protected() {
        return 4;
    }
}

