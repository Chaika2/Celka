/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rYD;
import celestial.rYG;
import celestial.rYK;
import celestial.rYi_1;
import celestial.rYn_1;
import celestial.rYo_1;
import celestial.rfH_2;
import celestial.ror_3;
import celestial.rrrZ;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public abstract class rYY
implements rYn_1 {
    public static final Codec<rYY> id_class = rVL.rE.dispatchStable(rYY::id_class, Function.identity());
    protected final Map<rrrZ<?>, Boolean> id_break = Maps.newHashMap();
    protected final Set<xc_3> id_byte = Sets.newHashSet();
    protected final List<rYG> id_protected;

    public Set<xc_3> id_byte() {
        if (this.id_byte.isEmpty()) {
            for (rYG rYG2 : this.id_protected) {
                this.id_byte.add(rYG2.id_throws().id_throws().id_class());
            }
        }
        return this.id_byte;
    }

    protected rYY(Stream<Supplier<rYG>> stream) {
        this((List)stream.map(Supplier::get).collect(ImmutableList.toImmutableList()));
    }

    protected rYY(List<rYG> list) {
        this.id_protected = list;
    }

    static {
        rVL.id_class(rVL.rE, "fixed", ror_3.id_throws);
        rVL.id_class(rVL.rE, "multi_noise", rYD.id_case);
        rVL.id_class(rVL.rE, "checkerboard", rYo_1.id_throws);
        rVL.id_class(rVL.rE, "vanilla_layered", rYi_1.id_throws);
        rVL.id_class(rVL.rE, "the_end", rYK.id_throws);
    }

    public rfH_2 id_class(int n, int n2, int n3, int n4, int n5, Predicate<rYG> predicate, Random random, boolean bl) {
        int n6;
        int n7 = n >> 2;
        int n8 = n3 >> 2;
        int n9 = n4 >> 2;
        int n10 = n2 >> 2;
        rfH_2 rfH_22 = null;
        int n11 = 0;
        for (int i = n6 = bl ? 0 : n9; i <= n9; i += n5) {
            for (int j = -i; j <= i; j += n5) {
                boolean bl2 = Math.abs(j) == i;
                for (int k = -i; k <= i; k += n5) {
                    int n12;
                    int n13;
                    if (bl) {
                        int n14 = n13 = Math.abs(k) == i ? 1 : 0;
                        if (n13 == 0 && !bl2) continue;
                    }
                    if (!predicate.test(this.id_protected(n13 = n7 + k, n10, n12 = n8 + j))) continue;
                    if (rfH_22 == null || random.nextInt(n11 + 1) == 0) {
                        rfH_22 = new rfH_2(n13 << 2, n2, n12 << 2);
                        if (bl) {
                            return rfH_22;
                        }
                    }
                    ++n11;
                }
            }
        }
        return rfH_22;
    }

    public rfH_2 id_class(int n, int n2, int n3, int n4, Predicate<rYG> predicate, Random random) {
        return this.id_class(n, n2, n3, n4, 1, predicate, random, false);
    }

    protected abstract Codec<? extends rYY> id_class();

    public boolean id_class(rrrZ<?> rrrZ3) {
        return this.id_break.computeIfAbsent(rrrZ3, rrrZ2 -> this.id_protected.stream().anyMatch(rYG2 -> rYG2.id_throws().id_class((rrrZ<?>)rrrZ2)));
    }

    public Set<rYG> id_class(int n, int n2, int n3, int n4) {
        int n5 = n - n4 >> 2;
        int n6 = n2 - n4 >> 2;
        int n7 = n3 - n4 >> 2;
        int n8 = n + n4 >> 2;
        int n9 = n2 + n4 >> 2;
        int n10 = n3 + n4 >> 2;
        int n11 = n8 - n5 + 1;
        int n12 = n9 - n6 + 1;
        int n13 = n10 - n7 + 1;
        HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < n13; ++i) {
            for (int j = 0; j < n11; ++j) {
                for (int k = 0; k < n12; ++k) {
                    int n14 = n5 + j;
                    int n15 = n6 + k;
                    int n16 = n7 + i;
                    hashSet.add(this.id_protected(n14, n15, n16));
                }
            }
        }
        return hashSet;
    }

    public abstract rYY id_class(long var1);

    public List<rYG> id_break() {
        return this.id_protected;
    }
}

