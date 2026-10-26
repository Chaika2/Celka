/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.rFP;
import celestial.rTQ;
import celestial.rYB;
import celestial.rqM_2;
import celestial.rrEm_1;
import celestial.rrzB_2;
import celestial.ruB_2;
import celestial.ruS_2;
import celestial.ruT_2;
import celestial.rvD_2;
import celestial.rvZ_2;
import celestial.yX_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruZ_2 {
    private static final Logger id_break = LogManager.getLogger();
    public static rqM_2<rYB> id_class = null;

    protected static void id_class(ruS_2 ruS_22) {
        if (ruS_22 instanceof rvD_2) {
            ((yX_2)QY.id_instanceof().id_class[8]).id_else();
        }
        if (ruS_22 instanceof rFP) {
            rFP rFP2 = (rFP)ruS_22;
            id_class = rFP2.id_byte();
        } else if (ruS_22 instanceof rvZ_2) {
            rvZ_2 rvZ_22 = (rvZ_2)ruS_22;
            id_class = rvZ_22.id_finally();
        } else {
            id_class = null;
        }
    }

    public static <T extends ruB_2> void id_class(ruS_2<T> ruS_22, T t, rrEm_1 rrEm_12) throws ruT_2 {
        ruZ_2.id_class(ruS_22, t, rrEm_12.id_const());
    }

    public static <T extends ruB_2> void id_class(ruS_2<T> ruS_22, T t, rTQ<?> rTQ2) throws ruT_2 {
        if (!rTQ2.rX()) {
            rTQ2.execute(new rrzB_2(ruS_22, () -> {
                ruZ_2.id_class(ruS_22);
                if (t.id_class().id_case()) {
                    ruS_22.id_class(t);
                } else {
                    id_break.debug("Ignoring packet due to disconnection: " + ruS_22);
                }
            }));
            throw ruT_2.id_class;
        }
        ruZ_2.id_class(ruS_22);
    }
}

