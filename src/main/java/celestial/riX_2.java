/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.riJ_2;
import celestial.riN_2;
import celestial.riW_2;
import celestial.riz_3;
import celestial.rpr_3;
import java.util.Random;

public class riX_2
implements riJ_2 {
    @Override
    public boolean id_class(riz_3 riz_32) {
        return !riz_32.id_byte[rpr_3.WEST.id_byte()] && !riz_32.id_byte[rpr_3.EAST.id_byte()] && !riz_32.id_byte[rpr_3.NORTH.id_byte()] && !riz_32.id_byte[rpr_3.SOUTH.id_byte()] && !riz_32.id_byte[rpr_3.UP.id_byte()];
    }

    @Override
    public riW_2 id_class(rpr_3 rpr_32, riz_3 riz_32, Random random) {
        riz_32.id_protected = true;
        return new riN_2(rpr_32, riz_32);
    }
}

