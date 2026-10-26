/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.NS;
import celestial.dj_3;
import celestial.rDg_1;
import celestial.rKd_1;
import celestial.rKf_1;
import celestial.rKm_1;
import celestial.rKw_1;
import celestial.rRH;
import celestial.rRN;
import celestial.rRR;
import celestial.rRo_1;
import celestial.rUO;
import celestial.rVA;
import celestial.rVL;
import celestial.rVy_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYJ;
import celestial.rYV;
import celestial.rYW;
import celestial.rYX;
import celestial.rYb_1;
import celestial.rYg_1;
import celestial.rYh_1;
import celestial.rYj_1;
import celestial.rYt_1;
import celestial.rYv_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.rqA_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqm_3;
import celestial.rrSR;
import celestial.rrrA;
import celestial.rrrZ;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rYG {
    public static final Logger id_class = LogManager.getLogger();
    public static final Codec<rYG> id_break = RecordCodecBuilder.create(instance -> instance.group((App)rYX.id_class.forGetter(rYG2 -> rYG2.id_finally), (App)rYh_1.CODEC.fieldOf("category").forGetter(rYG2 -> rYG2.id_package), (App)Codec.FLOAT.fieldOf("depth").forGetter(rYG2 -> Float.valueOf(rYG2.id_volatile)), (App)Codec.FLOAT.fieldOf("scale").forGetter(rYG2 -> Float.valueOf(rYG2.id_final)), (App)rYW.id_class.fieldOf("effects").forGetter(rYG2 -> rYG2.id_int), (App)rYv_1.id_byte.forGetter(rYG2 -> rYG2.id_extends), (App)rYt_1.id_byte.forGetter(rYG2 -> rYG2.id_native)).apply((Applicative)instance, rYG::new));
    public static final Codec<rYG> id_byte = RecordCodecBuilder.create(instance -> instance.group((App)rYX.id_class.forGetter(rYG2 -> rYG2.id_finally), (App)rYh_1.CODEC.fieldOf("category").forGetter(rYG2 -> rYG2.id_package), (App)Codec.FLOAT.fieldOf("depth").forGetter(rYG2 -> Float.valueOf(rYG2.id_volatile)), (App)Codec.FLOAT.fieldOf("scale").forGetter(rYG2 -> Float.valueOf(rYG2.id_final)), (App)rYW.id_class.fieldOf("effects").forGetter(rYG2 -> rYG2.id_int)).apply((Applicative)instance, (rYX2, rYh_12, f, f2, rYW2) -> new rYG((rYX)rYX2, (rYh_1)rYh_12, f.floatValue(), f2.floatValue(), (rYW)rYW2, rYv_1.id_break, rYt_1.id_break)));
    public static final Codec<Supplier<rYG>> id_protected = rVA.id_class(rVL.n, id_break);
    public static final Codec<List<Supplier<rYG>>> id_throws = rVA.id_break(rVL.n, id_break);
    private final Map<Integer, List<rrrZ<?>>> id_catch = rVL.t.id_case().collect(Collectors.groupingBy(rrrZ2 -> rrrZ2.id_protected().ordinal()));
    private static final rKw_1 id_private = new rKw_1(new rqm_3(1234L), (List<Integer>)ImmutableList.of((Object)0));
    public static final rKw_1 id_implements = new rKw_1(new rqm_3(3456L), (List<Integer>)ImmutableList.of((Object)-2, (Object)-1, (Object)0));
    public static final rKw_1 id_case = new rKw_1(new rqm_3(2345L), (List<Integer>)ImmutableList.of((Object)0));
    private final rYX id_finally;
    private final rYv_1 id_extends;
    private final rYt_1 id_native;
    private final float id_volatile;
    private final float id_final;
    private final rYh_1 id_package;
    private final rYW id_int;
    private final ThreadLocal<Long2FloatLinkedOpenHashMap> id_new = ThreadLocal.withInitial(() -> rqR_2.id_class(() -> {
        rYb_1 rYb_12 = new rYb_1(this, 1024, 0.25f);
        rYb_12.defaultReturnValue(Float.NaN);
        return rYb_12;
    }));

    public rYJ id_byte() {
        return this.id_finally.id_break;
    }

    public Optional<rqA_2> id_int() {
        return this.id_int.id_implements();
    }

    public rYG(rYX rYX2, rYh_1 rYh_12, float f, float f2, rYW rYW2, rYv_1 rYv_12, rYt_1 rYt_12) {
        this.id_finally = rYX2;
        this.id_extends = rYv_12;
        this.id_native = rYt_12;
        this.id_package = rYh_12;
        this.id_volatile = f;
        this.id_final = f2;
        this.id_int = rYW2;
    }

    public String toString() {
        rqO_2 rqO_22 = rVy_1.id_implements.id_break(this);
        return rqO_22 == null ? super.toString() : rqO_22.toString();
    }

    public final rYh_1 id_this() {
        return this.id_package;
    }

    public int id_class(double d, double d2) {
        int n = this.id_int.id_case().orElseGet(this::id_else);
        return this.id_int.id_catch().id_class(d, d2, n);
    }

    public void id_class(Random random, roC_2 roC_22, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l) {
        rrSR<?> rrSR2 = this.id_extends.id_protected().get();
        rrSR2.id_class(l);
        rrSR2.id_class(random, roC_22, this, n, n2, n3, d, xc_32, xc_33, n4, l);
    }

    public int id_class() {
        return this.id_int.id_protected();
    }

    public boolean id_class(rRR rRR2, rfH_2 rfH_22, boolean bl) {
        if (this.id_class(rfH_22) >= 0.15f) {
            return false;
        }
        if (rfH_22.c_() >= 0 && rfH_22.c_() < 256 && rRR2.id_class(rRo_1.BLOCK, rfH_22) < 10) {
            xc_3 xc_32 = rRR2.id_byte(rfH_22);
            rXE rXE2 = rRR2.id_break(rfH_22);
            if (rXE2.id_class() == rXG.id_byte && xc_32.id_break() instanceof dj_3) {
                boolean bl2;
                if (!bl) {
                    return true;
                }
                boolean bl3 = bl2 = rRR2.id_final(rfH_22.id_byte()) && rRR2.id_final(rfH_22.id_extends()) && rRR2.id_final(rfH_22.id_private()) && rRR2.id_final(rfH_22.id_protected());
                if (!bl2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        return this.id_class(rRR2, rfH_22, true);
    }

    public final float id_class(rfH_2 rfH_22) {
        long l = rfH_22.id_package();
        Long2FloatLinkedOpenHashMap long2FloatLinkedOpenHashMap = this.id_new.get();
        float f = long2FloatLinkedOpenHashMap.get(l);
        if (!Float.isNaN(f)) {
            return f;
        }
        float f2 = this.id_break(rfH_22);
        if (long2FloatLinkedOpenHashMap.size() == 1024) {
            long2FloatLinkedOpenHashMap.removeFirstFloat();
        }
        long2FloatLinkedOpenHashMap.put(l, f2);
        return f2;
    }

    public void id_class(rrrA rrrA2, rKd_1 rKd_12, rKf_1 rKf_12, long l, rqm_3 rqm_32, rfH_2 rfH_22) {
        List<List<Supplier<rDg_1<?, ?>>>> list = this.id_extends.id_byte();
        int n = rKm_1.values().length;
        for (int i = 0; i < n; ++i) {
            int n2 = 0;
            if (rrrA2.id_class()) {
                for (rrrZ rrrZ2 : this.id_catch.getOrDefault(i, Collections.emptyList())) {
                    rqm_32.id_break(l, n2, i);
                    int n3 = rfH_22.b_() >> 4;
                    int n4 = rfH_22.d_() >> 4;
                    int n5 = n3 << 4;
                    int n6 = n4 << 4;
                    try {
                        rrrA2.id_class(rjh_3.id_class(rfH_22), rrrZ2).forEach(rrrH2 -> rrrH2.id_class(rKf_12, rrrA2, rKd_12, rqm_32, new rfi_3(n5, n6, n5 + 15, n6 + 15), new rfj_3(n3, n4)));
                    }
                    catch (Exception exception) {
                        KY kY = KY.id_class(exception, "Feature placement");
                        kY.id_class("Feature").id_class("Id", rVL.t.id_break(rrrZ2)).id_class("Description", () -> rrrZ2.toString());
                        throw new KU(kY);
                    }
                    ++n2;
                }
            }
            if (list.size() <= i) continue;
            for (Supplier supplier : list.get(i)) {
                rDg_1 rDg_12 = (rDg_1)supplier.get();
                rqm_32.id_break(l, n2, i);
                try {
                    rDg_12.id_class(rKf_12, rKd_12, rqm_32, rfH_22);
                }
                catch (Exception exception) {
                    KY kY = KY.id_class(exception, "Feature placement");
                    kY.id_class("Feature").id_class("Id", rVL.q.id_break((rUO<?>)rDg_12.id_throws)).id_class("Config", rDg_12.id_case).id_class("Description", () -> rDg_12.id_throws.toString());
                    throw new KU(kY);
                }
                ++n2;
            }
        }
    }

    public rYt_1 id_break() {
        return this.id_native;
    }

    public boolean id_break(rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_32;
        if (this.id_class(rfH_22) >= 0.15f) {
            return false;
        }
        return rfH_22.c_() >= 0 && rfH_22.c_() < 256 && rRR2.id_class(rRo_1.BLOCK, rfH_22) < 10 && (xc_32 = rRR2.id_byte(rfH_22)).id_catch() && xu_3.Pq.id_continue().id_class(rRR2, rfH_22);
    }

    private float id_break(rfH_2 rfH_22) {
        float f = this.id_finally.id_protected.id_class(rfH_22, this.id_extends());
        if (rfH_22.c_() > 64) {
            float f2 = (float)(id_private.id_class((float)rfH_22.b_() / 8.0f, (float)rfH_22.d_() / 8.0f, false) * 4.0);
            return f - (f2 + (float)rfH_22.c_() - 64.0f) * 0.05f / 30.0f;
        }
        return f;
    }

    public rYv_1 id_throws() {
        return this.id_extends;
    }

    public final float id_finally() {
        return this.id_final;
    }

    public int id_catch() {
        return this.id_int.id_throws().orElseGet(this::id_synchronized);
    }

    public final float id_extends() {
        return this.id_finally.id_byte;
    }

    public int id_case() {
        return this.id_int.id_class();
    }

    public Optional<rYg_1> id_continue() {
        return this.id_int.id_extends();
    }

    private int id_else() {
        double d = rfU_2.id_class(this.id_finally.id_byte, 0.0f, 1.0f);
        double d2 = rfU_2.id_class(this.id_finally.id_throws, 0.0f, 1.0f);
        return rRH.id_class(d, d2);
    }

    public final float id_implements() {
        return this.id_finally.id_throws;
    }

    public Optional<rYj_1> id_new() {
        return this.id_int.id_finally();
    }

    public Optional<rYV> id_package() {
        return this.id_int.id_private();
    }

    public Optional<NS> id_super() {
        return this.id_int.id_native();
    }

    public boolean id_protected() {
        return this.id_implements() > 0.85f;
    }

    public final float id_private() {
        return this.id_volatile;
    }

    public final int id_final() {
        return this.id_int.id_byte();
    }

    public final int id_volatile() {
        return this.id_int.id_break();
    }

    private int id_synchronized() {
        double d = rfU_2.id_class(this.id_finally.id_byte, 0.0f, 1.0f);
        double d2 = rfU_2.id_class(this.id_finally.id_throws, 0.0f, 1.0f);
        return rRN.id_class(d, d2);
    }

    public rYW id_native() {
        return this.id_int;
    }
}

