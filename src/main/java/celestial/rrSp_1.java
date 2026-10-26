/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonObject
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rKQ;
import celestial.rKT;
import celestial.rKW;
import celestial.rKd_1;
import celestial.rKk_1;
import celestial.rKz_1;
import celestial.rRJ;
import celestial.rRX;
import celestial.rVC;
import celestial.rVF;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYi_1;
import celestial.rpY_2;
import celestial.rqM_2;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonObject;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Properties;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrSp_1 {
    public static final Codec<rrSp_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.LONG.fieldOf("seed").stable().forGetter(rrSp_1::id_class), (App)Codec.BOOL.fieldOf("generate_features").orElse((Object)true).stable().forGetter(rrSp_1::id_break), (App)Codec.BOOL.fieldOf("bonus_chest").orElse((Object)false).stable().forGetter(rrSp_1::id_byte), (App)rVC.id_break(rVL.id_import, Lifecycle.stable(), rRX.id_class).xmap(rRX::id_class, Function.identity()).fieldOf("dimensions").forGetter(rrSp_1::id_protected), (App)Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter(rrSp_12 -> rrSp_12.id_catch)).apply((Applicative)instance, instance.stable(rrSp_1::new))).comapFlatMap(rrSp_1::id_volatile, Function.identity());
    private static final Logger id_break = LogManager.getLogger();
    private final long id_byte;
    private final boolean id_protected;
    private final boolean id_throws;
    private final rVC<rRX> id_case;
    private final Optional<String> id_catch;

    public boolean id_byte() {
        return this.id_throws;
    }

    private rrSp_1(long l, boolean bl, boolean bl2, rVC<rRX> rVC2, Optional<String> optional) {
        this.id_byte = l;
        this.id_protected = bl;
        this.id_throws = bl2;
        this.id_case = rVC2;
        this.id_catch = optional;
    }

    public rrSp_1(long l, boolean bl, boolean bl2, rVC<rRX> rVC2) {
        this(l, bl, bl2, rVC2, Optional.empty());
        rRX rRX2 = rVC2.id_class(rRX.id_break);
        if (rRX2 == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
    }

    public static rrSp_1 id_class(rVm_1 rVm_12, Properties properties) {
        String string2 = (String)MoreObjects.firstNonNull((Object)((String)properties.get("generator-settings")), (Object)"");
        properties.put("generator-settings", string2);
        String string3 = (String)MoreObjects.firstNonNull((Object)((String)properties.get("level-seed")), (Object)"");
        properties.put("level-seed", string3);
        String string4 = (String)properties.get("generate-structures");
        boolean bl = string4 == null || Boolean.parseBoolean(string4);
        properties.put("generate-structures", Objects.toString(bl));
        String string5 = (String)properties.get("level-type");
        String string6 = Optional.ofNullable(string5).map(string -> string.toLowerCase(Locale.ROOT)).orElse("default");
        properties.put("level-type", string6);
        long l = new Random().nextLong();
        if (!string3.isEmpty()) {
            try {
                long l2 = Long.parseLong(string3);
                if (l2 != 0L) {
                    l = l2;
                }
            }
            catch (NumberFormatException numberFormatException) {
                l = string3.hashCode();
            }
        }
        rVF<rRJ> rVF2 = rVm_12.id_break(rVL.id_void);
        rVF<rYG> rVF3 = rVm_12.id_break(rVL.n);
        rVF<rKW> rVF4 = rVm_12.id_break(rVL.u);
        rVC<rRX> rVC2 = rRJ.id_class(rVF2, rVF3, rVF4, l);
        int n = -1;
        switch (string6.hashCode()) {
            case -1100099890: {
                if (!string6.equals("largebiomes")) break;
                n = 3;
                break;
            }
            case 3145593: {
                if (!string6.equals("flat")) break;
                n = 0;
                break;
            }
            case 1045526590: {
                if (!string6.equals("debug_all_block_states")) break;
                n = 1;
                break;
            }
            case 1271599715: {
                if (!string6.equals("amplified")) break;
                n = 2;
            }
        }
        switch (n) {
            case 0: {
                JsonObject jsonObject = !string2.isEmpty() ? rpY_2.id_class(string2) : new JsonObject();
                Dynamic dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)jsonObject);
                return new rrSp_1(l, bl, false, rrSp_1.id_class(rVF2, rVC2, (rKd_1)new rKz_1(rKQ.id_class.parse(dynamic).resultOrPartial(arg_0 -> ((Logger)id_break).error(arg_0)).orElseGet(() -> rKQ.id_class(rVF3)))));
            }
            case 1: {
                return new rrSp_1(l, bl, false, rrSp_1.id_class(rVF2, rVC2, (rKd_1)new rKk_1(rVF3)));
            }
            case 2: {
                return new rrSp_1(l, bl, false, rrSp_1.id_class(rVF2, rVC2, (rKd_1)new rKT(new rYi_1(l, false, false, rVF3), l, () -> rVF4.id_byte(rKW.id_protected))));
            }
            case 3: {
                return new rrSp_1(l, bl, false, rrSp_1.id_class(rVF2, rVC2, (rKd_1)new rKT(new rYi_1(l, false, true, rVF3), l, () -> rVF4.id_byte(rKW.id_byte))));
            }
        }
        return new rrSp_1(l, bl, false, rrSp_1.id_class(rVF2, rVC2, (rKd_1)rrSp_1.id_class(rVF3, rVF4, l)));
    }

    public rrSp_1 id_class(boolean bl, OptionalLong optionalLong) {
        rVC<rRX> rVC2;
        long l = optionalLong.orElse(this.id_byte);
        if (optionalLong.isPresent()) {
            rVC2 = new rVC<rRX>(rVL.id_import, Lifecycle.experimental());
            long l2 = optionalLong.getAsLong();
            for (Map.Entry<rqM_2<rRX>, rRX> entry : this.id_case.id_throws()) {
                rqM_2<rRX> rqM_22 = entry.getKey();
                rVC2.id_class(rqM_22, new rRX(entry.getValue().id_class(), entry.getValue().id_byte().id_class(l2)), this.id_case.id_protected(entry.getValue()));
            }
        } else {
            rVC2 = this.id_case;
        }
        rrSp_1 rrSp_12 = this.id_catch() ? new rrSp_1(l, false, false, rVC2) : new rrSp_1(l, this.id_break(), this.id_byte() && !bl, rVC2);
        return rrSp_12;
    }

    public long id_class() {
        return this.id_byte;
    }

    public static rVC<rRX> id_class(rVL<rRJ> rVL2, rVC<rRX> rVC2, rKd_1 rKd_12) {
        rRX rRX2 = rVC2.id_class(rRX.id_break);
        Supplier<rRJ> supplier = () -> rRX2 == null ? rVL2.id_byte(rRJ.id_case) : rRX2.id_break();
        return rrSp_1.id_class(rVC2, supplier, rKd_12);
    }

    public static rrSp_1 id_class(rVm_1 rVm_12) {
        rVF<rYG> rVF2 = rVm_12.id_break(rVL.n);
        int n = "North Carolina".hashCode();
        rVF<rRJ> rVF3 = rVm_12.id_break(rVL.id_void);
        rVF<rKW> rVF4 = rVm_12.id_break(rVL.u);
        return new rrSp_1(n, true, true, rrSp_1.id_class(rVF3, rRJ.id_class(rVF3, rVF2, rVF4, n), (rKd_1)rrSp_1.id_class(rVF2, rVF4, n)));
    }

    public static rrSp_1 id_class(rVL<rRJ> rVL2, rVL<rYG> rVL3, rVL<rKW> rVL4) {
        long l = new Random().nextLong();
        return new rrSp_1(l, true, false, rrSp_1.id_class(rVL2, rRJ.id_class(rVL2, rVL3, rVL4, l), (rKd_1)rrSp_1.id_class(rVL3, rVL4, l)));
    }

    public static rKT id_class(rVL<rYG> rVL2, rVL<rKW> rVL3, long l) {
        return new rKT(new rYi_1(l, false, false, rVL2), l, () -> rVL3.id_byte(rKW.id_byte));
    }

    public static rVC<rRX> id_class(rVC<rRX> rVC2, Supplier<rRJ> supplier, rKd_1 rKd_12) {
        rVC<rRX> rVC3 = new rVC<rRX>(rVL.id_import, Lifecycle.experimental());
        rVC3.id_class(rRX.id_break, new rRX(supplier, rKd_12), Lifecycle.stable());
        for (Map.Entry<rqM_2<rRX>, rRX> entry : rVC2.id_throws()) {
            rqM_2<rRX> rqM_22 = entry.getKey();
            if (rqM_22 == rRX.id_break) continue;
            rVC3.id_class(rqM_22, entry.getValue(), rVC2.id_protected(entry.getValue()));
        }
        return rVC3;
    }

    public boolean id_break() {
        return this.id_protected;
    }

    public rKd_1 id_throws() {
        rRX rRX2 = this.id_case.id_class(rRX.id_break);
        if (rRX2 == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
        return rRX2.id_byte();
    }

    public rrSp_1 id_finally() {
        return new rrSp_1(this.id_byte, this.id_protected, true, this.id_case, this.id_catch);
    }

    public boolean id_catch() {
        return this.id_throws() instanceof rKk_1;
    }

    public rrSp_1 id_extends() {
        return new rrSp_1(this.id_byte, !this.id_protected, this.id_throws, this.id_case);
    }

    public ImmutableSet<rqM_2<rYB>> id_case() {
        return (ImmutableSet)this.id_protected().id_throws().stream().map(entry -> rqM_2.id_class(rVL.id_static, ((rqM_2)entry.getKey()).id_class())).collect(ImmutableSet.toImmutableSet());
    }

    public boolean id_implements() {
        return this.id_catch.isPresent();
    }

    public rVC<rRX> id_protected() {
        return this.id_case;
    }

    public boolean id_private() {
        return this.id_throws() instanceof rKz_1;
    }

    private boolean id_final() {
        return rRX.id_class(this.id_byte, this.id_case);
    }

    private DataResult<rrSp_1> id_volatile() {
        rRX rRX2 = this.id_case.id_class(rRX.id_break);
        if (rRX2 == null) {
            return DataResult.error((String)"Overworld settings missing");
        }
        return this.id_final() ? DataResult.success((Object)this, (Lifecycle)Lifecycle.stable()) : DataResult.success((Object)this);
    }

    public rrSp_1 id_native() {
        return new rrSp_1(this.id_byte, this.id_protected, !this.id_throws, this.id_case);
    }
}

