/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rzO_2;
import celestial.rzV_2;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNR
extends rzO_2 {
    private static final Logger id_break = LogManager.getLogger();
    public final rzV_2 id_byte;

    public rNR(rQz_1[] rQz_1Array, rzV_2 rzV_22) {
        super(rQz_1Array);
        this.id_byte = rzV_22;
    }

    public static rzh_3<?> id_class(rzV_2 rzV_22) {
        return rNR.id_class((rQz_1[] rQz_1Array) -> new rNR((rQz_1[])rQz_1Array, rzV_22));
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_private;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        if (rdn_32.id_throws()) {
            float f = 1.0f - this.id_byte.id_break(rzr_32.id_class());
            rdn_32.id_break(rfU_2.id_protected(f * (float)rdn_32.id_private()));
        } else {
            id_break.warn("Couldn't set damage of loot item {}", (Object)rdn_32);
        }
        return rdn_32;
    }
}

