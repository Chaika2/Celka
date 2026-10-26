/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKD;
import celestial.rKK;
import celestial.rKU;
import celestial.rKY;
import celestial.rVL;
import com.mojang.serialization.Codec;

public class rKo_1<P extends rKY> {
    public static final rKo_1<rKU> id_class = rKo_1.id_class("simple_block_placer", rKU.id_break);
    public static final rKo_1<rKD> id_break = rKo_1.id_class("double_plant_placer", rKD.id_break);
    public static final rKo_1<rKK> id_byte = rKo_1.id_class("column_placer", rKK.id_break);
    private final Codec<P> id_protected;

    private rKo_1(Codec<P> codec) {
        this.id_protected = codec;
    }

    private static <P extends rKY> rKo_1<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.rr, string, new rKo_1<P>(codec));
    }

    public Codec<P> id_class() {
        return this.id_protected;
    }
}

