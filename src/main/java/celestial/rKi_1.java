/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDr_1;
import celestial.rVL;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rKi_1 {
    public static final Codec<rKi_1> id_break = rVL.i.dispatch(rKi_1::id_class, rDr_1::id_class);

    protected abstract rDr_1<?> id_class();

    public abstract xc_3 id_class(Random var1, rfH_2 var2);
}

