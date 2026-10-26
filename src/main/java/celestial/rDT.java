/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKi_1;
import celestial.rUv_1;
import com.mojang.serialization.Codec;

public class rDT
implements rUv_1 {
    public static final Codec<rDT> id_class = rKi_1.id_break.fieldOf("state_provider").xmap(rDT::new, rDT2 -> rDT2.id_break).codec();
    public final rKi_1 id_break;

    public rDT(rKi_1 rKi_12) {
        this.id_break = rKi_12;
    }
}

