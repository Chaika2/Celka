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
import celestial.rXA;
import celestial.rdn_3;
import celestial.rkT_2;
import celestial.rkj_3;
import celestial.rzO_2;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rcs_3
extends rzO_2 {
    private static final Logger id_break = LogManager.getLogger();

    public static rzh_3<?> id_byte() {
        return rcs_3.id_class(rcs_3::new);
    }

    public rcs_3(rQz_1[] rQz_1Array) {
        super(rQz_1Array);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_case;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rdn_3 rdn_33;
        if (rdn_32.id_class()) {
            return rdn_32;
        }
        Optional<rkT_2> optional = rzr_32.id_byte().id_implements().id_class(rkj_3.id_break, new rXA(rdn_32), rzr_32.id_byte());
        if (optional.isPresent() && !(rdn_33 = optional.get().id_byte()).id_class()) {
            rdn_3 rdn_34 = rdn_33.id_implements();
            rdn_34.id_throws(rdn_32.id_char());
            return rdn_34;
        }
        id_break.warn("Couldn't smelt {} because there is no smelting recipe", (Object)rdn_32);
        return rdn_32;
    }
}

