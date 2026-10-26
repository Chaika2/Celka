/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rKV;
import celestial.rKg_1;
import celestial.rVL;
import celestial.rYC;
import celestial.rYG;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rqu_3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrBJ {
    private static final Logger id_class = LogManager.getLogger();
    private final rKg_1 id_break;

    public rrBJ(rKV<rKg_1> rKV2) {
        this.id_break = rKV2.make();
    }

    public rYG id_class(rVL<rYG> rVL2, int n, int n2) {
        int n3 = this.id_break.id_class(n, n2);
        rqM_2<rYG> rqM_22 = rYC.id_class(n3);
        if (rqM_22 == null) {
            throw new IllegalStateException("Unknown biome id emitted by layers: " + n3);
        }
        rYG rYG2 = rVL2.id_class(rqM_22);
        if (rYG2 == null) {
            if (rqu_3.id_byte) {
                throw rqR_2.id_byte(new IllegalStateException("Unknown biome id: " + n3));
            }
            id_class.warn("Unknown biome id: ", (Object)n3);
            return rVL2.id_class(rYC.id_class(0));
        }
        return rYG2;
    }
}

