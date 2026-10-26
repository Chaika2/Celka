/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rVL;
import celestial.rrSI;
import celestial.rrSf_1;
import celestial.rrrZ;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class rrSq_1 {
    public static final Codec<rrSq_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rrSf_1.id_class.optionalFieldOf("stronghold").forGetter(rrSq_12 -> Optional.ofNullable(rrSq_12.id_throws)), (App)Codec.simpleMap(rVL.t, rrSI.id_class, rVL.t).fieldOf("structures").forGetter(rrSq_12 -> rrSq_12.id_protected)).apply((Applicative)instance, rrSq_1::new));
    public static final ImmutableMap<rrrZ<?>, rrSI> id_break = ImmutableMap.builder().put(rrrZ.id_new, (Object)new rrSI(32, 8, 10387312)).put(rrrZ.id_case, (Object)new rrSI(32, 8, 14357617)).put(rrrZ.id_catch, (Object)new rrSI(32, 8, 14357618)).put(rrrZ.id_throws, (Object)new rrSI(32, 8, 14357619)).put((Object)rrrZ.id_finally, (Object)new rrSI(32, 8, 14357620)).put(rrrZ.id_break, (Object)new rrSI(32, 8, 165745296)).put(rrrZ.id_extends, (Object)new rrSI(1, 0, 0)).put(rrrZ.id_native, (Object)new rrSI(32, 5, 10387313)).put(rrrZ.id_package, (Object)new rrSI(20, 11, 10387313)).put(rrrZ.id_protected, (Object)new rrSI(80, 20, 10387319)).put(rrrZ.id_int, (Object)new rrSI(1, 0, 0)).put(rrrZ.id_byte, (Object)new rrSI(1, 0, 0)).put(rrrZ.id_private, (Object)new rrSI(40, 15, 34222645)).put(rrrZ.id_implements, (Object)new rrSI(24, 4, 165745295)).put(rrrZ.id_volatile, (Object)new rrSI(20, 8, 14357621)).put(rrrZ.id_super, (Object)new rrSI(27, 4, 30084232)).put(rrrZ.id_final, (Object)new rrSI(27, 4, 30084232)).put(rrrZ.id_continue, (Object)new rrSI(2, 1, 14357921)).build();
    public static final rrSf_1 id_byte;
    private final Map<rrrZ<?>, rrSI> id_protected;
    private final rrSf_1 id_throws;

    public rrSq_1(Optional<rrSf_1> optional, Map<rrrZ<?>, rrSI> map) {
        this.id_throws = optional.orElse(null);
        this.id_protected = map;
    }

    public rrSq_1(boolean bl) {
        this.id_protected = Maps.newHashMap(id_break);
        this.id_throws = bl ? id_byte : null;
    }

    static {
        for (rrrZ rrrZ2 : rVL.t) {
            if (id_break.containsKey((Object)rrrZ2)) continue;
            throw new IllegalStateException("Structure feature without default settings: " + rVL.t.id_break(rrrZ2));
        }
        id_byte = new rrSf_1(32, 3, 128);
    }

    public Map<rrrZ<?>, rrSI> id_class() {
        return this.id_protected;
    }

    public rrSI id_class(rrrZ<?> rrrZ2) {
        return this.id_protected.get(rrrZ2);
    }

    public rrSf_1 id_break() {
        return this.id_throws;
    }
}

