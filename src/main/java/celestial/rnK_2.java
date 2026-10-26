/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rZM;
import celestial.rZY;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rni_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rrEm_1;
import celestial.ryZ_2;

public class rnK_2
extends rni_3 {
    private boolean id_byte;
    private boolean id_protected;
    private int id_throws;
    private int id_case;

    public rnK_2(rrEm_1 rrEm_12) {
        super(rrEm_12);
    }

    @Override
    public void id_class(rfH_2 rfH_22, rZM rZM2, rpr_3 rpr_32, int n) {
        if (this.id_protected) {
            this.id_case();
        } else {
            super.id_class(rfH_22, rZM2, rpr_32, n);
        }
    }

    @Override
    public ryZ_2 id_class(rhN_2 rhN_22, rYB rYB2, rdn_3 rdn_32, rpm_3 rpm_32) {
        if (this.id_protected) {
            this.id_case();
            return ryZ_2.PASS;
        }
        return super.id_class(rhN_22, rYB2, rdn_32, rpm_32);
    }

    @Override
    public ryZ_2 id_class(rhN_2 rhN_22, rYB rYB2, rdn_3 rdn_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (this.id_protected) {
            this.id_case();
            return ryZ_2.PASS;
        }
        return super.id_class(rhN_22, rYB2, rdn_32, rpm_32, rff_32);
    }

    @Override
    public void id_class() {
        super.id_class();
        ++this.id_case;
        long l = this.id_class.r();
        long l2 = l / 24000L + 1L;
        if (!this.id_byte && this.id_case > 20) {
            this.id_byte = true;
            this.id_break.id_class.id_class(new rZY(rZY.id_case, 0.0f));
        }
        boolean bl = this.id_protected = l > 120500L;
        if (this.id_protected) {
            ++this.id_throws;
        }
        if (l % 24000L == 500L) {
            if (l2 <= 6L) {
                if (l2 == 6L) {
                    this.id_break.id_class.id_class(new rZY(rZY.id_case, 104.0f));
                } else {
                    this.id_break.id_class((rgP_2)new rgn_3("demo.day." + l2), rqR_2.id_break);
                }
            }
        } else if (l2 == 1L) {
            if (l == 100L) {
                this.id_break.id_class.id_class(new rZY(rZY.id_case, 101.0f));
            } else if (l == 175L) {
                this.id_break.id_class.id_class(new rZY(rZY.id_case, 102.0f));
            } else if (l == 250L) {
                this.id_break.id_class.id_class(new rZY(rZY.id_case, 103.0f));
            }
        } else if (l2 == 5L && l % 24000L == 22000L) {
            this.id_break.id_class((rgP_2)new rgn_3("demo.day.warning"), rqR_2.id_break);
        }
    }

    private void id_case() {
        if (this.id_throws > 100) {
            this.id_break.id_class((rgP_2)new rgn_3("demo.reminder"), rqR_2.id_break);
            this.id_throws = 0;
        }
    }
}

