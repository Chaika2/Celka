/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDB;
import celestial.rDP;
import celestial.rDS;
import celestial.rDs_1;
import celestial.rKa_1;
import celestial.rKi_1;
import celestial.rVL;
import com.mojang.serialization.Codec;

public class rDr_1<P extends rKi_1> {
    public static final rDr_1<rDS> id_class = rDr_1.id_class("simple_state_provider", rDS.id_class);
    public static final rDr_1<rDs_1> id_break = rDr_1.id_class("weighted_state_provider", rDs_1.id_class);
    public static final rDr_1<rDB> id_byte = rDr_1.id_class("plain_flower_provider", rDB.id_class);
    public static final rDr_1<rDP> id_protected = rDr_1.id_class("forest_flower_provider", rDP.id_class);
    public static final rDr_1<rKa_1> id_throws = rDr_1.id_class("rotated_block_provider", rKa_1.id_class);
    private final Codec<P> id_case;

    private rDr_1(Codec<P> codec) {
        this.id_case = codec;
    }

    private static <P extends rKi_1> rDr_1<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.i, string, new rDr_1<P>(codec));
    }

    public Codec<P> id_class() {
        return this.id_case;
    }
}

