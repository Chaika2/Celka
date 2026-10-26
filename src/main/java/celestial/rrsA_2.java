/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rrsF_2;
import celestial.rrsL_2;
import celestial.rrsN_2;
import celestial.rrsZ_2;
import celestial.rrsc_3;
import celestial.rrsu_3;
import celestial.rrsv_3;
import com.mojang.serialization.Codec;

public class rrsA_2<P extends rrsN_2> {
    public static final rrsA_2<rrsL_2> id_class = rrsA_2.id_class("straight_trunk_placer", rrsL_2.id_throws);
    public static final rrsA_2<rrsZ_2> id_break = rrsA_2.id_class("forking_trunk_placer", rrsZ_2.id_throws);
    public static final rrsA_2<rrsv_3> id_byte = rrsA_2.id_class("giant_trunk_placer", rrsv_3.id_throws);
    public static final rrsA_2<rrsF_2> id_protected = rrsA_2.id_class("mega_jungle_trunk_placer", rrsF_2.id_case);
    public static final rrsA_2<rrsc_3> id_throws = rrsA_2.id_class("dark_oak_trunk_placer", rrsc_3.id_throws);
    public static final rrsA_2<rrsu_3> id_case = rrsA_2.id_class("fancy_trunk_placer", rrsu_3.id_throws);
    private final Codec<P> id_catch;

    private rrsA_2(Codec<P> codec) {
        this.id_catch = codec;
    }

    private static <P extends rrsN_2> rrsA_2<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.rB, string, new rrsA_2<P>(codec));
    }

    public Codec<P> id_class() {
        return this.id_catch;
    }
}

