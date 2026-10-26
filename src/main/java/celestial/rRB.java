/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.rEi_1;
import celestial.rKv_1;
import celestial.rRS;
import celestial.rYh_1;
import celestial.rbB_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rrEm_1;
import celestial.rrEq_1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rRB
implements rrEq_1 {
    private static final Logger id_class = LogManager.getLogger();
    private boolean id_break;
    private rRS id_byte = rRS.SIEGE_DONE;
    private int id_protected;
    private int id_throws;
    private int id_case;
    private int id_catch;
    private int id_private;

    private rjU_2 id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        for (int i = 0; i < 10; ++i) {
            int n;
            int n2;
            int n3 = rfH_22.b_() + rrEm_12.id_int.nextInt(16) - 8;
            rfH_2 rfH_23 = new rfH_2(n3, n2 = rrEm_12.id_class(rKv_1.WORLD_SURFACE, n3, n = rfH_22.d_() + rrEm_12.id_int.nextInt(16) - 8), n);
            if (!rrEm_12.id_throw(rfH_23) || !rEi_1.id_break(aI_2.rs, rrEm_12, iO_2.EVENT, rfH_23, rrEm_12.id_int)) continue;
            return rjU_2.id_protected(rfH_23);
        }
        return null;
    }

    @Override
    public int id_class(rrEm_1 rrEm_12, boolean bl, boolean bl2) {
        if (!rrEm_12.id_strictfp() && bl) {
            float f = rrEm_12.id_protected(0.0f);
            if ((double)f == 0.5) {
                rRS rRS2 = this.id_byte = rrEm_12.id_int.nextInt(10) == 0 ? rRS.SIEGE_TONIGHT : rRS.SIEGE_DONE;
            }
            if (this.id_byte == rRS.SIEGE_DONE) {
                return 0;
            }
            if (!this.id_break) {
                if (!this.id_class(rrEm_12)) {
                    return 0;
                }
                this.id_break = true;
            }
            if (this.id_throws > 0) {
                --this.id_throws;
                return 0;
            }
            this.id_throws = 2;
            if (this.id_protected > 0) {
                this.id_break(rrEm_12);
                --this.id_protected;
            } else {
                this.id_byte = rRS.SIEGE_DONE;
            }
            return 1;
        }
        this.id_byte = rRS.SIEGE_DONE;
        this.id_break = false;
        return 0;
    }

    private boolean id_class(rrEm_1 rrEm_12) {
        for (rhd_3 rhd_32 : rrEm_12.id_continue()) {
            rfH_2 rfH_22;
            if (rhd_32.id_native() || !rrEm_12.id_throw(rfH_22 = rhd_32.Bs()) || rrEm_12.id_implements(rfH_22).id_this() == rYh_1.MUSHROOM) continue;
            for (int i = 0; i < 10; ++i) {
                float f = rrEm_12.id_int.nextFloat() * ((float)Math.PI * 2);
                this.id_case = rfH_22.b_() + rfU_2.id_protected(rfU_2.id_break(f) * 32.0f);
                this.id_catch = rfH_22.c_();
                this.id_private = rfH_22.d_() + rfU_2.id_protected(rfU_2.id_class(f) * 32.0f);
                if (this.id_class(rrEm_12, new rfH_2(this.id_case, this.id_catch, this.id_private)) == null) continue;
                this.id_throws = 0;
                this.id_protected = 20;
                break;
            }
            return true;
        }
        return false;
    }

    private void id_break(rrEm_1 rrEm_12) {
        rjU_2 rjU_22 = this.id_class(rrEm_12, new rfH_2(this.id_case, this.id_catch, this.id_private));
        if (rjU_22 != null) {
            rbB_2 rbB_22;
            try {
                rbB_22 = new rbB_2(rrEm_12);
                rbB_22.id_class(rrEm_12, rrEm_12.id_throws(rbB_22.Bs()), iO_2.EVENT, (aU_2)null, (rcd_3)null);
            }
            catch (Exception exception) {
                id_class.warn("Failed to create zombie for village siege at {}", (Object)rjU_22, (Object)exception);
                return;
            }
            rbB_22.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, rrEm_12.id_int.nextFloat() * 360.0f, 0.0f);
            rrEm_12.id_class((an_3)rbB_22);
        }
    }
}

