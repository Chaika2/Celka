/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKv_1;
import celestial.rrSF;
import celestial.rrSx_1;
import com.mojang.serialization.Codec;

public class rrSh_1<DC extends rrSx_1>
extends rrSF<DC> {
    public rrSh_1(Codec<DC> codec) {
        super(codec);
    }

    @Override
    protected rKv_1 id_class(DC DC2) {
        return rKv_1.MOTION_BLOCKING;
    }
}

