/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rin_3;
import celestial.riy_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;

public class riH_2
extends rrrZ<rin_3> {
    public riH_2(Codec<rin_3> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rin_3> id_class() {
        return riy_3::new;
    }
}

