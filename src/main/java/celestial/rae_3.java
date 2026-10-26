/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUt_1;
import celestial.raa_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;

public class rae_3
extends rrrZ<rUt_1> {
    public rae_3(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rUt_1> id_class() {
        return raa_3::new;
    }
}

