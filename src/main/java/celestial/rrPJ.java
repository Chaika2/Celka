/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rrPB;
import celestial.rrPC;
import celestial.rrPL;
import celestial.rrPO;
import celestial.rrPZ;
import celestial.rrPb_1;
import celestial.rrPm_1;
import com.mojang.serialization.Codec;

public interface rrPJ<P extends rrPL> {
    public static final rrPJ<rrPB> id_class = rrPJ.id_class("always_true", rrPB.id_class);
    public static final rrPJ<rrPb_1> id_break = rrPJ.id_class("block_match", rrPb_1.id_class);
    public static final rrPJ<rrPO> id_byte = rrPJ.id_class("blockstate_match", rrPO.id_class);
    public static final rrPJ<rrPC> id_protected = rrPJ.id_class("tag_match", rrPC.id_class);
    public static final rrPJ<rrPm_1> id_throws = rrPJ.id_class("random_block_match", rrPm_1.id_class);
    public static final rrPJ<rrPZ> id_case = rrPJ.id_class("random_blockstate_match", rrPZ.id_class);

    public static <P extends rrPL> rrPJ<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.s, string, () -> codec);
    }

    public Codec<P> codec();
}

