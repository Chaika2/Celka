/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rQF;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rqO_2;
import celestial.rzr_3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rQy_1
implements rQz_1 {
    private static final Logger id_class = LogManager.getLogger();
    public final rqO_2 id_break;

    public rQy_1(rqO_2 rqO_22) {
        this.id_break = rqO_22;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean id_class(rzr_3 rzr_32) {
        rQz_1 rQz_12 = rzr_32.id_break(this.id_break);
        if (rzr_32.id_class(rQz_12)) {
            boolean bl;
            try {
                bl = rQz_12.test(rzr_32);
            }
            finally {
                rzr_32.id_break(rQz_12);
            }
            return bl;
        }
        id_class.warn("Detected infinite loop in loot tables");
        return false;
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        if (rQs_12.id_break(this.id_break)) {
            rQs_12.id_class("Condition " + this.id_break + " is recursively called");
        } else {
            rQz_1.super.id_class(rQs_12);
            rQz_1 rQz_12 = rQs_12.id_protected(this.id_break);
            if (rQz_12 == null) {
                rQs_12.id_class("Unknown condition table called " + this.id_break);
            } else {
                rQz_12.id_class(rQs_12.id_class(".{" + this.id_break + "}", this.id_break));
            }
        }
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_package;
    }
}

