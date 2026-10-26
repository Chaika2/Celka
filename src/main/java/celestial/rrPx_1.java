/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVA;
import celestial.rVL;
import celestial.rrPA;
import celestial.rrPE;
import celestial.rrPF;
import celestial.rrPG;
import celestial.rrPM;
import celestial.rrPQ;
import celestial.rrPW;
import celestial.rrPd_1;
import celestial.rrPh_1;
import celestial.rrPk_1;
import celestial.rrPn_1;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface rrPx_1<P extends rrPA> {
    public static final rrPx_1<rrPG> id_class = rrPx_1.id_class("block_ignore", rrPG.id_class);
    public static final rrPx_1<rrPd_1> id_break = rrPx_1.id_class("block_rot", rrPd_1.id_class);
    public static final rrPx_1<rrPh_1> id_byte = rrPx_1.id_class("gravity", rrPh_1.id_class);
    public static final rrPx_1<rrPk_1> id_protected = rrPx_1.id_class("jigsaw_replacement", rrPk_1.id_class);
    public static final rrPx_1<rrPF> id_throws = rrPx_1.id_class("rule", rrPF.id_class);
    public static final rrPx_1<rrPQ> id_case = rrPx_1.id_class("nop", rrPQ.id_class);
    public static final rrPx_1<rrPM> id_catch = rrPx_1.id_class("block_age", rrPM.id_class);
    public static final rrPx_1<rrPE> id_private = rrPx_1.id_class("blackstone_replace", rrPE.id_class);
    public static final rrPx_1<rrPW> id_implements = rrPx_1.id_class("lava_submerged_block", rrPW.id_class);
    public static final Codec<rrPA> id_finally = rVL.rb.dispatch("processor_type", rrPA::id_class, rrPx_1::codec);
    public static final Codec<rrPn_1> id_extends = id_finally.listOf().xmap(rrPn_1::new, rrPn_1::id_class);
    public static final Codec<rrPn_1> id_native = Codec.either((Codec)id_extends.fieldOf("processors").codec(), id_extends).xmap(either -> (rrPn_1)either.map(rrPn_12 -> rrPn_12, rrPn_12 -> rrPn_12), Either::left);
    public static final Codec<Supplier<rrPn_1>> id_volatile = rVA.id_class(rVL.L, id_native);

    public static <P extends rrPA> rrPx_1<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.rb, string, () -> codec);
    }

    public Codec<P> codec();
}

