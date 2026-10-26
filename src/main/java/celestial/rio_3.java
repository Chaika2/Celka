/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUv_1;
import com.mojang.serialization.Codec;

public class rio_3
implements rUv_1 {
    public static final Codec<rio_3> id_class = Codec.BOOL.fieldOf("is_beached").orElse((Object)false).xmap(rio_3::new, rio_32 -> rio_32.id_break).codec();
    public final boolean id_break;

    public rio_3(boolean bl) {
        this.id_break = bl;
    }
}

