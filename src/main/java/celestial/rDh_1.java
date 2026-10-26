/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDX;
import com.mojang.serialization.Codec;

public class rDh_1
implements rDX {
    public static final Codec<rDh_1> id_class;
    public static final rDh_1 id_break;

    static {
        id_break = new rDh_1();
        id_class = Codec.unit(() -> id_break);
    }
}

