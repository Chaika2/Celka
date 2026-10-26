/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rYG;
import celestial.rYY;
import celestial.rfH_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ror_3
extends rYY {
    public static final Codec<ror_3> id_throws = rYG.id_protected.fieldOf("biome").xmap(ror_3::new, ror_32 -> ror_32.id_case).stable().codec();
    private final Supplier<rYG> id_case;

    public ror_3(rYG rYG2) {
        this(() -> rYG2);
    }

    public ror_3(Supplier<rYG> supplier) {
        super((List<rYG>)ImmutableList.of((Object)supplier.get()));
        this.id_case = supplier;
    }

    @Override
    public Set<rYG> id_class(int n, int n2, int n3, int n4) {
        return Sets.newHashSet((Object[])new rYG[]{this.id_case.get()});
    }

    @Override
    public rfH_2 id_class(int n, int n2, int n3, int n4, int n5, Predicate<rYG> predicate, Random random, boolean bl) {
        if (predicate.test(this.id_case.get())) {
            return bl ? new rfH_2(n, n2, n3) : new rfH_2(n - n4 + random.nextInt(n4 * 2 + 1), n2, n3 - n4 + random.nextInt(n4 * 2 + 1));
        }
        return null;
    }

    @Override
    protected Codec<? extends rYY> id_class() {
        return id_throws;
    }

    @Override
    public rYY id_class(long l) {
        return this;
    }

    @Override
    public rYG id_protected(int n, int n2, int n3) {
        return this.id_case.get();
    }
}

