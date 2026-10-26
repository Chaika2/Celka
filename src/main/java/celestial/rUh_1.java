/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDQ;
import celestial.rVL;
import celestial.reB_2;
import celestial.reb_3;
import com.mojang.serialization.Codec;

public class rUh_1<P extends rDQ> {
    public static final rUh_1<reb_3> id_class = rUh_1.id_class("two_layers_feature_size", reb_3.id_byte);
    public static final rUh_1<reB_2> id_break = rUh_1.id_class("three_layers_feature_size", reB_2.id_byte);
    private final Codec<P> id_byte;

    private rUh_1(Codec<P> codec) {
        this.id_byte = codec;
    }

    private static <P extends rDQ> rUh_1<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.rs, string, new rUh_1<P>(codec));
    }

    public Codec<P> id_class() {
        return this.id_byte;
    }
}

