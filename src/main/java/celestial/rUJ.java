/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUX;
import celestial.rUv_1;
import celestial.rrSx_1;
import com.mojang.serialization.Codec;

public class rUJ
implements rUv_1,
rrSx_1 {
    public static final Codec<rUJ> id_class = rUX.id_class(-10, 128, 128).fieldOf("count").xmap(rUJ::new, rUJ::id_break).codec();
    private final rUX id_break;

    public rUJ(int n) {
        this.id_break = rUX.id_class(n);
    }

    public rUJ(rUX rUX2) {
        this.id_break = rUX2;
    }

    public rUX id_break() {
        return this.id_break;
    }
}

