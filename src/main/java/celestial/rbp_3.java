/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dO_2;
import celestial.rCm_1;
import celestial.rYB;
import celestial.rbF_2;
import celestial.rbq_3;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zO_2;
import celestial.zz_3;

public class rbp_3
extends rbq_3 {
    public final /* synthetic */ rbF_2 id_class;

    public rbp_3(rbF_2 rbF_22) {
        this.id_class = rbF_22;
        super(rbF_22);
    }

    @Override
    public void id_throws() {
        if (rbF_2.id_package(this.id_class).nextInt(30) == 0) {
            for (int i = 1; i <= 2; ++i) {
                int n;
                rfH_2 rfH_22 = this.id_class.Bs().id_catch(i);
                xc_3 xc_32 = ((rYB)this.id_class.id_throws[7]).id_byte(rfH_22);
                xd_3 xd_32 = xc_32.id_break();
                boolean bl = false;
                rCm_1 rCm_12 = null;
                if (!xd_32.id_class(rls_3.z)) continue;
                if (xd_32 instanceof dO_2) {
                    dO_2 dO_22 = (dO_2)xd_32;
                    if (!dO_22.id_implements(xc_32)) {
                        bl = true;
                        rCm_12 = dO_22.id_break();
                    }
                } else if (xd_32 instanceof zO_2) {
                    int n2 = xc_32.id_byte(zO_2.id_volatile);
                    if (n2 < 7) {
                        bl = true;
                        rCm_12 = zO_2.id_volatile;
                    }
                } else if (xd_32 == xu_3.XJ && (n = xc_32.id_byte(zz_3.id_volatile).intValue()) < 3) {
                    bl = true;
                    rCm_12 = zz_3.id_volatile;
                }
                if (!bl) continue;
                ((rYB)this.id_class.id_throws[7]).id_byte(2005, rfH_22, 0);
                ((rYB)this.id_class.id_throws[7]).id_break(rfH_22, (xc_3)xc_32.id_class(rCm_12, xc_32.id_byte(rCm_12) + 1));
                this.id_class.sl();
            }
        }
    }

    @Override
    public boolean id_catch() {
        if (this.id_class.sn() >= 10) {
            return false;
        }
        if (rbF_2.id_final(this.id_class).nextFloat() < 0.3f) {
            return false;
        }
        return this.id_class.sc() && this.id_class.sH();
    }

    @Override
    public boolean id_private() {
        return this.id_catch();
    }
}

