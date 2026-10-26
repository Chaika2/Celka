/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rDg_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rVL;
import celestial.reA_2;
import celestial.reF_2;
import celestial.reJ_2;
import celestial.reL_2;
import celestial.red_3;
import celestial.rem_3;
import celestial.rex_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPl_1;
import celestial.rrPn_1;
import celestial.rrPp_1;
import celestial.rrPt_1;
import celestial.rrPu_1;
import celestial.rrrA;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class rev_3 {
    public static final Codec<rev_3> id_byte = rVL.rM.dispatch("element_type", rev_3::id_class, red_3::codec);
    private volatile rem_3 id_class;

    public rem_3 id_byte() {
        rem_3 rem_32 = this.id_class;
        if (rem_32 == null) {
            throw new IllegalStateException();
        }
        return rem_32;
    }

    protected rev_3(rem_3 rem_32) {
        this.id_class = rem_32;
    }

    public static Function<rem_3, reL_2> id_class(List<Function<rem_3, ? extends rev_3>> list) {
        return rem_32 -> new reL_2(list.stream().map(function -> (rev_3)function.apply(rem_32)).collect(Collectors.toList()), (rem_3)rem_32);
    }

    public static Function<rem_3, rex_3> id_class(rDg_1<?, ?> rDg_12) {
        return rem_32 -> new rex_3(() -> rDg_12, (rem_3)rem_32);
    }

    public static Function<rem_3, reF_2> id_class(String string, rrPn_1 rrPn_12) {
        return rem_32 -> new reF_2((Either<rqO_2, rrPl_1>)Either.left((Object)new rqO_2(string)), () -> rrPn_12, (rem_3)rem_32);
    }

    public rev_3 id_class(rem_3 rem_32) {
        this.id_class = rem_32;
        return this;
    }

    public void id_class(rRg_1 rRg_12, rrPp_1 rrPp_12, rfH_2 rfH_22, rqd_3 rqd_32, Random random, rfi_3 rfi_32) {
    }

    public abstract red_3<?> id_class();

    public abstract boolean id_class(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10);

    public abstract rfi_3 id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3);

    public abstract List<rrPp_1> id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4);

    public static Function<rem_3, reF_2> id_class(String string) {
        return rem_32 -> new reF_2((Either<rqO_2, rrPl_1>)Either.left((Object)new rqO_2(string)), () -> rrPu_1.id_class, (rem_3)rem_32);
    }

    protected static <E extends rev_3> RecordCodecBuilder<E, rem_3> id_break() {
        return rem_3.field_236858_c_.fieldOf("projection").forGetter(rev_3::id_byte);
    }

    public static Function<rem_3, reA_2> id_break(String string, rrPn_1 rrPn_12) {
        return rem_32 -> new reA_2((Either<rqO_2, rrPl_1>)Either.left((Object)new rqO_2(string)), () -> rrPn_12, (rem_3)rem_32);
    }

    public static Function<rem_3, reA_2> id_break(String string) {
        return rem_32 -> new reA_2((Either<rqO_2, rrPl_1>)Either.left((Object)new rqO_2(string)), () -> rrPu_1.id_class, (rem_3)rem_32);
    }

    public static Function<rem_3, reJ_2> id_throws() {
        return rem_32 -> reJ_2.id_break;
    }

    public int id_protected() {
        return 1;
    }
}

