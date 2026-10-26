/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rDg_1;
import celestial.rKN;
import celestial.rKm_1;
import celestial.rKv_1;
import celestial.rUO;
import celestial.rUx_1;
import celestial.rUz_1;
import celestial.rVL;
import celestial.rVn_1;
import celestial.rYF;
import celestial.rYG;
import celestial.rYO;
import celestial.rYl_1;
import celestial.rYv_1;
import celestial.reP_2;
import celestial.rqR_2;
import celestial.rrSI;
import celestial.rrSq_1;
import celestial.rrrF;
import celestial.rrrZ;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKQ {
    private static final Logger id_break = LogManager.getLogger();
    public static final Codec<rKQ> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rVn_1.id_class(rVL.n).forGetter(rKQ2 -> rKQ2.id_protected), (App)rrSq_1.id_class.fieldOf("structures").forGetter(rKQ::id_protected), (App)rKN.id_class.listOf().fieldOf("layers").forGetter(rKQ::id_case), (App)Codec.BOOL.fieldOf("lakes").orElse((Object)false).forGetter(rKQ2 -> rKQ2.id_extends), (App)Codec.BOOL.fieldOf("features").orElse((Object)false).forGetter(rKQ2 -> rKQ2.id_finally), (App)rYG.id_protected.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter(rKQ2 -> Optional.of(rKQ2.id_catch))).apply((Applicative)instance, rKQ::new)).stable();
    private static final Map<rrrZ<?>, reP_2<?, ?>> id_byte = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put(rrrZ.id_byte, rrrF.id_break);
        hashMap.put(rrrZ.id_new, rrrF.id_this);
        hashMap.put(rrrZ.id_extends, rrrF.id_extends);
        hashMap.put(rrrZ.id_finally, rrrF.id_finally);
        hashMap.put(rrrZ.id_case, rrrF.id_case);
        hashMap.put(rrrZ.id_throws, rrrF.id_throws);
        hashMap.put(rrrZ.id_catch, rrrF.id_catch);
        hashMap.put(rrrZ.id_volatile, rrrF.id_volatile);
        hashMap.put(rrrZ.id_implements, rrrF.id_private);
        hashMap.put(rrrZ.id_native, rrrF.id_native);
        hashMap.put(rrrZ.id_package, rrrF.id_new);
        hashMap.put(rrrZ.id_protected, rrrF.id_protected);
        hashMap.put(rrrZ.id_final, rrrF.id_package);
        hashMap.put(rrrZ.id_break, rrrF.id_class);
        hashMap.put(rrrZ.id_private, rrrF.id_goto);
        hashMap.put(rrrZ.id_super, rrrF.id_super);
    });
    private final rVL<rYG> id_protected;
    private final rrSq_1 id_throws;
    private final List<rKN> id_case = Lists.newArrayList();
    private Supplier<rYG> id_catch;
    private final xc_3[] id_private = new xc_3[256];
    private boolean id_implements;
    private boolean id_finally = false;
    private boolean id_extends = false;

    public rYG id_byte() {
        int n;
        boolean bl;
        rYG rYG2 = this.id_throws();
        rYv_1 rYv_12 = rYG2.id_throws();
        rYF rYF2 = new rYF().id_class(rYv_12.id_protected());
        if (this.id_extends) {
            rYF2.id_class(rKm_1.LAKES, rUx_1.id_strictfp);
            rYF2.id_class(rKm_1.LAKES, rUx_1.id_boolean);
        }
        for (Map.Entry<rrrZ<?>, rrSI> xc_3Array2 : this.id_throws.id_class().entrySet()) {
            rYF2.id_class(rYv_12.id_class(id_byte.get(xc_3Array2.getKey())));
        }
        boolean bl2 = bl = (!this.id_implements || this.id_protected.id_byte(rYG2).equals(Optional.of(rYl_1.E))) && this.id_finally;
        if (bl) {
            List<List<Supplier<rDg_1<?, ?>>>> list = rYv_12.id_byte();
            for (n = 0; n < list.size(); ++n) {
                if (n == rKm_1.UNDERGROUND_STRUCTURES.ordinal() || n == rKm_1.SURFACE_STRUCTURES.ordinal()) continue;
                for (Supplier supplier : list.get(n)) {
                    rYF2.id_class(n, supplier);
                }
            }
        }
        xc_3[] xc_3Array = this.id_catch();
        for (n = 0; n < xc_3Array.length; ++n) {
            xc_3 xc_32 = xc_3Array[n];
            if (xc_32 == null || rKv_1.MOTION_BLOCKING.id_throws().test(xc_32)) continue;
            this.id_private[n] = null;
            rYF2.id_class(rKm_1.TOP_LAYER_MODIFICATION, rUO.id_switch.id_break(new rUz_1(n, xc_32)));
        }
        return new rYO().id_class(rYG2.id_byte()).id_class(rYG2.id_this()).id_class(rYG2.id_private()).id_break(rYG2.id_finally()).id_byte(rYG2.id_extends()).id_protected(rYG2.id_implements()).id_class(rYG2.id_native()).id_class(rYF2.id_class()).id_class(rYG2.id_break()).id_class();
    }

    public rKQ(rVL<rYG> rVL2, rrSq_1 rrSq_12, List<rKN> list, boolean bl, boolean bl2, Optional<Supplier<rYG>> optional) {
        this(rrSq_12, rVL2);
        if (bl) {
            this.id_break();
        }
        if (bl2) {
            this.id_class();
        }
        this.id_case.addAll(list);
        this.id_private();
        if (!optional.isPresent()) {
            id_break.error("Unknown biome, defaulting to plains");
            this.id_catch = () -> rVL2.id_byte(rYl_1.id_break);
        } else {
            this.id_catch = optional.get();
        }
    }

    public rKQ(rrSq_1 rrSq_12, rVL<rYG> rVL2) {
        this.id_protected = rVL2;
        this.id_throws = rrSq_12;
        this.id_catch = () -> rVL2.id_byte(rYl_1.id_break);
    }

    public void id_class() {
        this.id_finally = true;
    }

    public static rKQ id_class(rVL<rYG> rVL2) {
        rrSq_1 rrSq_12 = new rrSq_1(Optional.of(rrSq_1.id_byte), Maps.newHashMap((Map)ImmutableMap.of(rrrZ.id_new, (Object)((rrSI)rrSq_1.id_break.get(rrrZ.id_new)))));
        rKQ rKQ2 = new rKQ(rrSq_12, rVL2);
        rKQ2.id_catch = () -> rVL2.id_byte(rYl_1.id_break);
        rKQ2.id_case().add(new rKN(1, xu_3.id_while));
        rKQ2.id_case().add(new rKN(2, xu_3.id_finally));
        rKQ2.id_case().add(new rKN(1, xu_3.id_implements));
        rKQ2.id_private();
        return rKQ2;
    }

    public rKQ id_class(List<rKN> list, rrSq_1 rrSq_12) {
        rKQ rKQ2 = new rKQ(rrSq_12, this.id_protected);
        for (rKN rKN2 : list) {
            rKQ2.id_case.add(new rKN(rKN2.id_class(), rKN2.id_break().id_break()));
            rKQ2.id_private();
        }
        rKQ2.id_class(this.id_catch);
        if (this.id_finally) {
            rKQ2.id_class();
        }
        if (this.id_extends) {
            rKQ2.id_break();
        }
        return rKQ2;
    }

    public rKQ id_class(rrSq_1 rrSq_12) {
        return this.id_class(this.id_case, rrSq_12);
    }

    public void id_class(Supplier<rYG> supplier) {
        this.id_catch = supplier;
    }

    public void id_break() {
        this.id_extends = true;
    }

    public rYG id_throws() {
        return this.id_catch.get();
    }

    public xc_3[] id_catch() {
        return this.id_private;
    }

    public List<rKN> id_case() {
        return this.id_case;
    }

    public rrSq_1 id_protected() {
        return this.id_throws;
    }

    public void id_private() {
        Arrays.fill(this.id_private, 0, this.id_private.length, null);
        int n = 0;
        for (rKN rKN2 : this.id_case) {
            rKN2.id_class(n);
            n += rKN2.id_class();
        }
        this.id_implements = true;
        for (rKN rKN2 : this.id_case) {
            for (int i = rKN2.id_byte(); i < rKN2.id_byte() + rKN2.id_class(); ++i) {
                xc_3 xc_32 = rKN2.id_break();
                if (xc_32.id_class(xu_3.id_class)) continue;
                this.id_implements = false;
                this.id_private[i] = xc_32;
            }
        }
    }
}

