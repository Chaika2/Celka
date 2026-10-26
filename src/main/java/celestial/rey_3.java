/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rYG;
import celestial.rYY;
import celestial.ral_3;
import celestial.rfj_3;
import celestial.rqm_3;
import celestial.rrrI;
import com.mojang.serialization.Codec;

public class rey_3
extends ral_3 {
    public rey_3(Codec<rrrI> codec) {
        super(codec, 33, false, false);
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, rrrI rrrI2) {
        return rqm_32.nextInt(5) >= 2;
    }
}

