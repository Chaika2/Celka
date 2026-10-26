/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ur_1;
import celestial.rTu_1;
import celestial.rTv_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rrPl_1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UJ
implements Ur_1 {
    private static final Logger id_class = LogManager.getLogger();

    @Override
    public rcd_3 id_class(String string, rcd_3 rcd_32) {
        return string.startsWith("data/minecraft/structures/") ? UJ.id_break(string, UJ.id_class(rcd_32)) : rcd_32;
    }

    private static rcd_3 id_class(rcd_3 rcd_32) {
        if (!rcd_32.id_byte("DataVersion", 99)) {
            rcd_32.id_break("DataVersion", 500);
        }
        return rcd_32;
    }

    private static rcd_3 id_break(String string, rcd_3 rcd_32) {
        rrPl_1 rrPl_12 = new rrPl_1();
        int n = rcd_32.id_private("DataVersion");
        int n2 = 2532;
        if (n < 2532) {
            id_class.warn("SNBT Too old, do not forget to update: " + n + " < 2532: " + string);
        }
        rcd_3 rcd_33 = rco_3.id_class(rTu_1.id_class(), rTv_1.STRUCTURE, rcd_32, n);
        rrPl_12.id_break(rcd_33);
        return rrPl_12.id_class(new rcd_3());
    }
}

