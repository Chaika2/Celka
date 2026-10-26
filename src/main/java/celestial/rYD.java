/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rKq_1;
import celestial.rVL;
import celestial.rYC;
import celestial.rYG;
import celestial.rYM;
import celestial.rYU;
import celestial.rYY;
import celestial.rYa_1;
import celestial.rYe_1;
import celestial.rqm_3;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class rYD
extends rYY {
    private static final rYe_1 id_catch = new rYe_1(-7, (List<Double>)ImmutableList.of((Object)1.0, (Object)1.0));
    public static final MapCodec<rYD> id_throws = RecordCodecBuilder.mapCodec(instance2 -> instance2.group((App)Codec.LONG.fieldOf("seed").forGetter(rYD2 -> rYD2.id_continue), (App)RecordCodecBuilder.create(instance -> instance.group((App)rYM.id_class.fieldOf("parameters").forGetter(Pair::getFirst), (App)rYG.id_protected.fieldOf("biome").forGetter(Pair::getSecond)).apply((Applicative)instance, Pair::of)).listOf().fieldOf("biomes").forGetter(rYD2 -> rYD2.id_int), (App)rYe_1.id_class.fieldOf("temperature_noise").forGetter(rYD2 -> rYD2.id_private), (App)rYe_1.id_class.fieldOf("humidity_noise").forGetter(rYD2 -> rYD2.id_implements), (App)rYe_1.id_class.fieldOf("altitude_noise").forGetter(rYD2 -> rYD2.id_finally), (App)rYe_1.id_class.fieldOf("weirdness_noise").forGetter(rYD2 -> rYD2.id_extends)).apply((Applicative)instance2, rYD::new));
    public static final Codec<rYD> id_case = Codec.mapEither(rYU.id_class, id_throws).xmap(either -> (rYD)either.map(rYU::id_protected, Function.identity()), rYD2 -> rYD2.id_protected().map(Either::left).orElseGet(() -> Either.right((Object)rYD2))).codec();
    private final rYe_1 id_private;
    private final rYe_1 id_implements;
    private final rYe_1 id_finally;
    private final rYe_1 id_extends;
    private final rKq_1 id_native;
    private final rKq_1 id_volatile;
    private final rKq_1 id_final;
    private final rKq_1 id_package;
    private final List<Pair<rYM, Supplier<rYG>>> id_int;
    private final boolean id_new;
    private final long id_continue;
    private final Optional<Pair<rVL<rYG>, rYa_1>> id_super;

    private rYD(long l, List<Pair<rYM, Supplier<rYG>>> list, rYe_1 rYe_12, rYe_1 rYe_13, rYe_1 rYe_14, rYe_1 rYe_15, Optional<Pair<rVL<rYG>, rYa_1>> optional) {
        super(list.stream().map(Pair::getSecond));
        this.id_continue = l;
        this.id_super = optional;
        this.id_private = rYe_12;
        this.id_implements = rYe_13;
        this.id_finally = rYe_14;
        this.id_extends = rYe_15;
        this.id_native = rKq_1.id_class(new rqm_3(l), rYe_12.id_class(), rYe_12.id_break());
        this.id_volatile = rKq_1.id_class(new rqm_3(l + 1L), rYe_13.id_class(), rYe_13.id_break());
        this.id_final = rKq_1.id_class(new rqm_3(l + 2L), rYe_14.id_class(), rYe_14.id_break());
        this.id_package = rKq_1.id_class(new rqm_3(l + 3L), rYe_15.id_class(), rYe_15.id_break());
        this.id_int = list;
        this.id_new = false;
    }

    private rYD(long l, List<Pair<rYM, Supplier<rYG>>> list, rYe_1 rYe_12, rYe_1 rYe_13, rYe_1 rYe_14, rYe_1 rYe_15) {
        this(l, list, rYe_12, rYe_13, rYe_14, rYe_15, Optional.empty());
    }

    public rYD(long l, List<Pair<rYM, Supplier<rYG>>> list, Optional<Pair<rVL<rYG>, rYa_1>> optional) {
        this(l, list, id_catch, id_catch, id_catch, id_catch, optional);
    }

    @Override
    public rYY id_class(long l) {
        return new rYD(l, this.id_int, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_super);
    }

    @Override
    protected Codec<? extends rYY> id_class() {
        return id_case;
    }

    public boolean id_break(long l) {
        return this.id_continue == l && this.id_super.isPresent() && Objects.equals(this.id_super.get().getSecond(), rYa_1.id_class);
    }

    private Optional<rYU> id_protected() {
        return this.id_super.map(pair -> new rYU((rYa_1)pair.getSecond(), (rVL)pair.getFirst(), this.id_continue));
    }

    @Override
    public rYG id_protected(int n, int n2, int n3) {
        int n4 = this.id_new ? n2 : 0;
        rYM rYM2 = new rYM((float)this.id_native.id_class(n, n4, n3), (float)this.id_volatile.id_class(n, n4, n3), (float)this.id_final.id_class(n, n4, n3), (float)this.id_package.id_class(n, n4, n3), 0.0f);
        return this.id_int.stream().min(Comparator.comparing(pair -> Float.valueOf(((rYM)pair.getFirst()).id_class(rYM2)))).map(Pair::getSecond).map(Supplier::get).orElse(rYC.id_break);
    }
}

