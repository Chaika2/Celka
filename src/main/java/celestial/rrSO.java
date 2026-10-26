/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKv_1;
import celestial.rrSu_1;
import celestial.rrSx_1;
import com.mojang.serialization.Codec;

public abstract class rrSO<DC extends rrSx_1>
extends rrSu_1<DC> {
    public rrSO(Codec<DC> codec) {
        super(codec);
    }

    protected abstract rKv_1 id_class(DC var1);
}

