/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rrPD;
import celestial.rrPI;
import celestial.rrPK;
import celestial.rrPR;
import celestial.rrPU;
import celestial.rrPV;
import celestial.rrPe_1;
import celestial.rrPf_1;
import celestial.rrPg_1;
import celestial.rrPj_1;
import com.mojang.serialization.Codec;

public class rrPo_1<P extends rrPR> {
    public static final rrPo_1<rrPf_1> id_class = rrPo_1.id_class("blob_foliage_placer", rrPf_1.id_class);
    public static final rrPo_1<rrPe_1> id_break = rrPo_1.id_class("spruce_foliage_placer", rrPe_1.id_class);
    public static final rrPo_1<rrPU> id_byte = rrPo_1.id_class("pine_foliage_placer", rrPU.id_class);
    public static final rrPo_1<rrPI> id_protected = rrPo_1.id_class("acacia_foliage_placer", rrPI.id_class);
    public static final rrPo_1<rrPj_1> id_throws = rrPo_1.id_class("bush_foliage_placer", rrPj_1.id_byte);
    public static final rrPo_1<rrPg_1> id_case = rrPo_1.id_class("fancy_foliage_placer", rrPg_1.id_byte);
    public static final rrPo_1<rrPK> id_catch = rrPo_1.id_class("jungle_foliage_placer", rrPK.id_class);
    public static final rrPo_1<rrPD> id_private = rrPo_1.id_class("mega_pine_foliage_placer", rrPD.id_class);
    public static final rrPo_1<rrPV> id_implements = rrPo_1.id_class("dark_oak_foliage_placer", rrPV.id_class);
    private final Codec<P> id_finally;

    private rrPo_1(Codec<P> codec) {
        this.id_finally = codec;
    }

    private static <P extends rrPR> rrPo_1<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.rP, string, new rrPo_1<P>(codec));
    }

    public Codec<P> id_class() {
        return this.id_finally;
    }
}

