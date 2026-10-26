/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.aw_3;
import celestial.iO_2;
import celestial.rKv_1;
import celestial.rRP;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rRr_1;
import celestial.rRu_1;
import celestial.rYl_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rga_3;
import celestial.rhN_2;
import celestial.rhb_3;
import celestial.rrEj_1;
import celestial.rrEm_1;
import celestial.rrEq_1;
import celestial.rrGB;
import celestial.rsU_2;
import java.util.Optional;
import java.util.Random;

public class rrEf_1
implements rrEq_1 {
    private final Random id_class = new Random();
    private final rrGB id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;

    public rrEf_1(rrGB rrGB2) {
        this.id_break = rrGB2;
        this.id_byte = 1200;
        this.id_protected = rrGB2.id_synchronized();
        this.id_throws = rrGB2.id_return();
        if (this.id_protected == 0 && this.id_throws == 0) {
            this.id_protected = 24000;
            rrGB2.id_catch(this.id_protected);
            this.id_throws = 25;
            rrGB2.id_private(this.id_throws);
        }
    }

    private rfH_2 id_class(rRR rRR2, rfH_2 rfH_22, int n) {
        rfH_2 rfH_23 = null;
        for (int i = 0; i < 10; ++i) {
            int n2;
            int n3;
            int n4 = rfH_22.b_() + this.id_class.nextInt(n * 2) - n;
            rfH_2 rfH_24 = new rfH_2(n4, n3 = rRR2.id_class(rKv_1.WORLD_SURFACE, n4, n2 = rfH_22.d_() + this.id_class.nextInt(n * 2) - n), n2);
            if (!rrEj_1.id_class(aw_3.ON_GROUND, rRR2, rfH_24, aI_2.e)) continue;
            rfH_23 = rfH_24;
            break;
        }
        return rfH_23;
    }

    private boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22, rfH_22.id_break(1, 2, 1))) {
            if (rRq_12.id_byte(rfH_23).id_extends(rRq_12, rfH_23).id_break()) continue;
            return false;
        }
        return true;
    }

    private void id_class(rrEm_1 rrEm_12, rsU_2 rsU_22, int n) {
        rhb_3 rhb_32;
        rfH_2 rfH_22 = this.id_class((rRR)rrEm_12, rsU_22.Bs(), n);
        if (rfH_22 != null && (rhb_32 = aI_2.R.id_class(rrEm_12, null, null, null, rfH_22, iO_2.EVENT, false, false)) != null) {
            rhb_32.id_break((an_3)rsU_22, true);
        }
    }

    private boolean id_class(rrEm_1 rrEm_12) {
        rhN_2 rhN_22 = rrEm_12.id_this();
        if (rhN_22 == null) {
            return true;
        }
        if (this.id_class.nextInt(10) != 0) {
            return false;
        }
        rfH_2 rfH_23 = rhN_22.Bs();
        int n = 48;
        rga_3 rga_32 = rrEm_12.d();
        Optional<rfH_2> optional = rga_32.id_byte(rRP.id_super.id_break(), rfH_22 -> true, rfH_23, 48, rRr_1.ANY);
        rfH_2 rfH_24 = optional.orElse(rfH_23);
        rfH_2 rfH_25 = this.id_class((rRR)rrEm_12, rfH_24, 48);
        if (rfH_25 != null && this.id_class(rrEm_12, rfH_25)) {
            if (rrEm_12.id_protected(rfH_25).equals(Optional.of(rYl_1.E))) {
                return false;
            }
            rsU_2 rsU_22 = aI_2.e.id_class(rrEm_12, null, null, null, rfH_25, iO_2.EVENT, false, false);
            if (rsU_22 != null) {
                for (int i = 0; i < 2; ++i) {
                    this.id_class(rrEm_12, rsU_22, 4);
                }
                this.id_break.id_class(rsU_22.ro());
                rsU_22.id_else(48000);
                rsU_22.id_implements(rfH_24);
                rsU_22.id_class(rfH_24, 16);
                return true;
            }
        }
        return false;
    }

    @Override
    public int id_class(rrEm_1 rrEm_12, boolean bl, boolean bl2) {
        if (!rrEm_12.B().id_break(rRu_1.id_char)) {
            return 0;
        }
        if (--this.id_byte > 0) {
            return 0;
        }
        this.id_byte = 1200;
        this.id_protected -= 1200;
        this.id_break.id_catch(this.id_protected);
        if (this.id_protected > 0) {
            return 0;
        }
        this.id_protected = 24000;
        if (!rrEm_12.B().id_break(rRu_1.id_protected)) {
            return 0;
        }
        int n = this.id_throws;
        this.id_throws = rfU_2.id_class(this.id_throws + 25, 25, 75);
        this.id_break.id_private(this.id_throws);
        if (this.id_class.nextInt(100) > n) {
            return 0;
        }
        if (this.id_class(rrEm_12)) {
            this.id_throws = 25;
            return 1;
        }
        return 0;
    }
}

