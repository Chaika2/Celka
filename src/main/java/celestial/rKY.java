/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKo_1;
import celestial.rRg_1;
import celestial.rVL;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rKY {
    public static final Codec<rKY> id_class = rVL.rr.dispatch(rKY::id_class, rKo_1::id_class);

    public abstract void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, Random var4);

    protected abstract rKo_1<?> id_class();
}

