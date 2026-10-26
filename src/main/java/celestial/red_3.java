/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.reA_2;
import celestial.reF_2;
import celestial.reJ_2;
import celestial.reL_2;
import celestial.rev_3;
import celestial.rex_3;
import com.mojang.serialization.Codec;

public interface red_3<P extends rev_3> {
    public static final red_3<reA_2> id_class = red_3.id_class("single_pool_element", reA_2.id_break);
    public static final red_3<reL_2> id_break = red_3.id_class("list_pool_element", reL_2.id_class);
    public static final red_3<rex_3> id_byte = red_3.id_class("feature_pool_element", rex_3.id_class);
    public static final red_3<reJ_2> id_protected = red_3.id_class("empty_pool_element", reJ_2.id_class);
    public static final red_3<reF_2> id_throws = red_3.id_class("legacy_single_pool_element", reF_2.id_class);

    public static <P extends rev_3> red_3<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.rM, string, () -> codec);
    }

    public Codec<P> codec();
}

