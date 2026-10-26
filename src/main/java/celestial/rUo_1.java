/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUv_1;
import celestial.riV_2;
import com.mojang.serialization.Codec;

public class rUo_1
implements rUv_1 {
    public static final Codec<rUo_1> id_class = riV_2.field_236342_h_.fieldOf("portal_type").xmap(rUo_1::new, rUo_12 -> rUo_12.id_break).codec();
    public final riV_2 id_break;

    public rUo_1(riV_2 riV_22) {
        this.id_break = riV_22;
    }
}

