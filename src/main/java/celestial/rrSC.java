/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKv_1;
import celestial.rrSF;
import celestial.rrSQ;
import com.mojang.serialization.Codec;

public class rrSC
extends rrSF<rrSQ> {
    public rrSC(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    protected rKv_1 id_class(rrSQ rrSQ2) {
        return rKv_1.OCEAN_FLOOR_WG;
    }
}

