/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.riJ_2;
import celestial.riQ_2;
import celestial.riW_2;
import celestial.riz_3;
import celestial.rpr_3;
import java.util.Random;

public class rih_3
implements riJ_2 {
    @Override
    public boolean id_class(riz_3 riz_32) {
        return true;
    }

    @Override
    public riW_2 id_class(rpr_3 rpr_32, riz_3 riz_32, Random random) {
        riz_32.id_protected = true;
        return new riQ_2(rpr_32, riz_32, random);
    }
}

