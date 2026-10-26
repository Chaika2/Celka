/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rCD;
import celestial.rKd_1;
import celestial.rRI;
import celestial.red_3;
import celestial.rem_3;
import celestial.rev_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPk_1;
import celestial.rrPl_1;
import celestial.rrPn_1;
import celestial.rrPp_1;
import celestial.rrPt_1;
import celestial.rrPu_1;
import celestial.rrPx_1;
import celestial.rrrA;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class reA_2
extends rev_3 {
    private static final Codec<Either<rqO_2, rrPl_1>> id_class = Codec.of(reA_2::id_class, (Decoder)rqO_2.id_class.map(Either::left));
    public static final Codec<reA_2> id_break = RecordCodecBuilder.create(instance -> instance.group(reA_2.id_catch(), reA_2.id_case(), reA_2.id_break()).apply((Applicative)instance, reA_2::new));
    protected final Either<rqO_2, rrPl_1> id_protected;
    protected final Supplier<rrPn_1> id_throws;

    protected reA_2(Either<rqO_2, rrPl_1> either, Supplier<rrPn_1> supplier, rem_3 rem_32) {
        super(rem_32);
        this.id_protected = either;
        this.id_throws = supplier;
    }

    public reA_2(rrPl_1 rrPl_12) {
        this((Either<rqO_2, rrPl_1>)Either.right((Object)rrPl_12), () -> rrPu_1.id_class, rem_3.RIGID);
    }

    public String toString() {
        return "Single[" + this.id_protected + "]";
    }

    protected rrPN id_class(rqd_3 rqd_32, rfi_3 rfi_32, boolean bl) {
        rrPN rrPN2 = new rrPN();
        rrPN2.id_class(rfi_32);
        rrPN2.id_class(rqd_32);
        rrPN2.id_break(true);
        rrPN2.id_class(false);
        rrPN2.id_class(rrPG.id_break);
        rrPN2.id_byte(true);
        if (!bl) {
            rrPN2.id_class(rrPk_1.id_break);
        }
        this.id_throws.get().id_class().forEach(rrPN2::id_class);
        this.id_byte().id_byte().forEach(rrPN2::id_class);
        return rrPN2;
    }

    @Override
    public red_3<?> id_class() {
        return red_3.id_class;
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, rfH_2 rfH_22, rfH_2 rfH_23, rqd_3 rqd_32, rfi_3 rfi_32, Random random, boolean bl) {
        rrPN rrPN2;
        rrPl_1 rrPl_12 = this.id_class(rrPt_12);
        if (!rrPl_12.id_class(rRI2, rfH_22, rfH_23, rrPN2 = this.id_class(rqd_32, rfi_32, bl), random, 18)) {
            return false;
        }
        for (rrPp_1 rrPp_12 : rrPl_1.id_class(rRI2, rfH_22, rfH_23, rrPN2, this.id_class(rrPt_12, rfH_22, rqd_32, false))) {
            this.id_class(rRI2, rrPp_12, rfH_22, rqd_32, random, rfi_32);
        }
        return true;
    }

    private static <T> DataResult<T> id_class(Either<rqO_2, rrPl_1> either, DynamicOps<T> dynamicOps, T t) {
        Optional optional = either.left();
        return !optional.isPresent() ? DataResult.error((String)"Can not serialize a runtime pool element") : rqO_2.id_class.encode((Object)((rqO_2)optional.get()), dynamicOps, t);
    }

    private rrPl_1 id_class(rrPt_1 rrPt_12) {
        return (rrPl_1)this.id_protected.map(rrPt_12::id_class, Function.identity());
    }

    public List<rrPp_1> id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, boolean bl) {
        rrPl_1 rrPl_12 = this.id_class(rrPt_12);
        List<rrPp_1> list = rrPl_12.id_class(rfH_22, new rrPN().id_class(rqd_32), xu_3.Js, bl);
        ArrayList arrayList = Lists.newArrayList();
        for (rrPp_1 rrPp_12 : list) {
            rCD rCD2;
            if (rrPp_12.id_byte == null || (rCD2 = rCD.valueOf(rrPp_12.id_byte.id_native("mode"))) != rCD.DATA) continue;
            arrayList.add(rrPp_12);
        }
        return arrayList;
    }

    @Override
    public List<rrPp_1> id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, Random random) {
        rrPl_1 rrPl_12 = this.id_class(rrPt_12);
        List<rrPp_1> list = rrPl_12.id_class(rfH_22, new rrPN().id_class(rqd_32), xu_3.JE, true);
        Collections.shuffle(list, random);
        return list;
    }

    @Override
    public rfi_3 id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32) {
        rrPl_1 rrPl_12 = this.id_class(rrPt_12);
        return rrPl_12.id_break(new rrPN().id_class(rqd_32), rfH_22);
    }

    protected static <E extends reA_2> RecordCodecBuilder<E, Either<rqO_2, rrPl_1>> id_catch() {
        return id_class.fieldOf("location").forGetter(reA_22 -> reA_22.id_protected);
    }

    protected static <E extends reA_2> RecordCodecBuilder<E, Supplier<rrPn_1>> id_case() {
        return rrPx_1.id_volatile.fieldOf("processors").forGetter(reA_22 -> reA_22.id_throws);
    }
}

