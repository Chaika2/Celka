/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUv_1;
import celestial.xc_3;
import com.mojang.serialization.Codec;

public class rDq_1
implements rUv_1 {
    public static final Codec<rDq_1> id_class = xc_3.id_break.fieldOf("state").xmap(rDq_1::new, rDq_12 -> rDq_12.id_break).codec();
    public final xc_3 id_break;

    public rDq_1(xc_3 xc_32) {
        this.id_break = xc_32;
    }
}

