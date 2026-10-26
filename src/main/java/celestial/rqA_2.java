/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rqO_2;
import com.mojang.serialization.Codec;

public class rqA_2 {
    public static final Codec<rqA_2> id_class = rqO_2.id_class.xmap(rqA_2::new, rqA_22 -> rqA_22.id_break);
    private final rqO_2 id_break;

    public rqA_2(rqO_2 rqO_22) {
        this.id_break = rqO_22;
    }

    public rqO_2 id_class() {
        return this.id_break;
    }
}

