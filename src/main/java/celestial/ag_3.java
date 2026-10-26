/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rhd_3;
import celestial.rpJ_2;
import celestial.rrEm_1;
import java.util.Objects;
import java.util.UUID;

public interface ag_3 {
    public void id_byte(iB_2 var1);

    public UUID id_byte();

    default public void id_class(rhd_3 rhd_32) {
        if (((rYB)rhd_32.id_throws[7]).B().id_break(rRu_1.id_abstract) && rhd_32.ro().equals(this.id_byte())) {
            this.S_();
        }
    }

    default public void id_class(rrEm_1 rrEm_12, rcd_3 rcd_32) {
        this.id_class(rcd_32.id_private("AngerTime"));
        if (!rcd_32.id_break("AngryAt")) {
            this.id_class((UUID)null);
        } else {
            UUID uUID = rcd_32.id_class("AngryAt");
            this.id_class(uUID);
            an_3 an_32 = rrEm_12.id_break(uUID);
            if (an_32 != null) {
                if (an_32 instanceof is_3) {
                    this.id_break((is_3)an_32);
                }
                if (an_32.BC() == aI_2.rM) {
                    this.id_break((rhd_3)an_32);
                }
            }
        }
    }

    default public void id_class(rrEm_1 rrEm_12, boolean bl) {
        iB_2 iB_22 = this.I_();
        UUID uUID = this.id_byte();
        if ((iB_22 == null || iB_22.Sl()) && uUID != null && rrEm_12.id_break(uUID) instanceof is_3) {
            this.S_();
        } else {
            if (iB_22 != null && !Objects.equals(uUID, iB_22.ro())) {
                this.id_class(iB_22.ro());
                this.id_protected();
            }
            if (!(this.id_class() <= 0 || iB_22 != null && iB_22.BC() == aI_2.rM && bl)) {
                this.id_class(this.id_class() - 1);
                if (this.id_class() == 0) {
                    this.S_();
                }
            }
        }
    }

    public void id_class(int var1);

    public void id_class(UUID var1);

    public int id_class();

    public void id_break(iB_2 var1);

    public void id_break(rhd_3 var1);

    default public void id_case() {
        this.S_();
        this.id_protected();
    }

    public void id_protected();

    public iB_2 I_();

    default public void S_() {
        this.id_break((iB_2)null);
        this.id_class((UUID)null);
        this.id_byte(null);
        this.id_class(0);
    }

    default public void a_(rcd_3 rcd_32) {
        rcd_32.id_break("AngerTime", this.id_class());
        if (this.id_byte() != null) {
            rcd_32.id_class("AngryAt", this.id_byte());
        }
    }

    default public boolean a_(rYB rYB2) {
        return rYB2.B().id_break(rRu_1.id_long) && this.T_() && this.id_byte() == null;
    }

    default public boolean T_() {
        return this.id_class() > 0;
    }

    default public boolean b_(iB_2 iB_22) {
        if (!rpJ_2.id_case.test(iB_22)) {
            return false;
        }
        return iB_22.BC() == aI_2.rM && this.a_((rYB)iB_22.id_throws[7]) ? true : iB_22.ro().equals(this.id_byte());
    }
}

