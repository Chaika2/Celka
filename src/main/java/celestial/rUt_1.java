/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUv_1;
import com.mojang.serialization.Codec;

public class rUt_1
implements rUv_1 {
    public static final Codec<rUt_1> id_class;
    public static final rUt_1 id_break;

    static {
        id_break = new rUt_1();
        id_class = Codec.unit(() -> id_break);
    }
}

