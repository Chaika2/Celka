/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rie_3;
import celestial.rio_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;

public class riU_2
extends rrrZ<rio_3> {
    public riU_2(Codec<rio_3> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rio_3> id_class() {
        return rie_3::new;
    }
}

