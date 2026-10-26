/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rrSx_1;
import com.mojang.serialization.Codec;

public class rrBR
implements rrSx_1 {
    public static final Codec<rrBR> id_class = Codec.INT.fieldOf("chance").xmap(rrBR::new, rrBR2 -> rrBR2.id_break).codec();
    public final int id_break;

    public rrBR(int n) {
        this.id_break = n;
    }
}

