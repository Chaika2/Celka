/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rrSx_1;
import com.mojang.serialization.Codec;

public class rrSQ
implements rrSx_1 {
    public static final Codec<rrSQ> id_class;
    public static final rrSQ id_break;

    static {
        id_break = new rrSQ();
        id_class = Codec.unit(() -> id_break);
    }
}

