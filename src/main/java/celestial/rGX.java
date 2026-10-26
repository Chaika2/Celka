/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rGB;
import celestial.rGS;
import celestial.rGb_1;
import celestial.rYB;
import celestial.rbf_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rpJ_2;
import java.util.List;

public class rGX
extends rGb_1 {
    public final /* synthetic */ rGB id_break;

    @Override
    public void id_byte() {
    }

    public rGX(rGB rGB2) {
        this.id_break = rGB2;
        super(rGB2);
    }

    @Override
    public boolean id_class() {
        return this.id_break.I_() != null && this.id_break.id_super == rGS.SWOOP;
    }

    @Override
    public boolean id_break() {
        iB_2 iB_22 = this.id_break.I_();
        if (iB_22 == null) {
            return false;
        }
        if (!iB_22.BM()) {
            return false;
        }
        if (!(iB_22 instanceof rhd_3) || !((rhd_3)iB_22).id_native() && !((rhd_3)iB_22).id_implements()) {
            List<an_3> list;
            if (!this.id_class()) {
                return false;
            }
            if ((Integer)this.id_break.id_throws[41] % 20 == 0 && !(list = ((rYB)this.id_break.id_throws[7]).id_class(rbf_3.class, this.id_break.rN().id_class(16.0), rpJ_2.id_class)).isEmpty()) {
                for (rbf_3 rbf_32 : list) {
                    rbf_32.sc();
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_break.I_();
        this.id_break.id_break = new rjU_2(iB_22.rx(), iB_22.id_byte(0.5), iB_22.BO());
        if (this.id_break.rN().id_class(0.2f).id_byte(iB_22.rN())) {
            this.id_break.id_public(iB_22);
            this.id_break.id_super = rGS.CIRCLE;
            if (!this.id_break.BF()) {
                ((rYB)this.id_break.id_throws[7]).id_byte(1039, this.id_break.Bs(), 0);
            }
        } else if (((Boolean)this.id_break.id_throws[23]).booleanValue() || (Integer)this.id_break.id_private[10] > 0) {
            this.id_break.id_super = rGS.CIRCLE;
        }
    }

    @Override
    public void id_protected() {
        this.id_break.id_byte((iB_2)null);
        this.id_break.id_super = rGS.CIRCLE;
    }
}

