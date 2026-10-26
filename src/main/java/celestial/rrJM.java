/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QF;
import celestial.QY;
import celestial.cm_3;
import celestial.rgP_2;
import celestial.rpl_3;
import celestial.rrJO;
import celestial.rrWl_1;
import celestial.vm_3;
import java.util.List;

public class rrJM
extends vm_3 {
    protected List<LZ> id_throws;
    protected cm_3 id_case;
    protected boolean id_catch;

    protected void id_byte(LZ lZ) {
    }

    public rrJM(rgP_2 rgP_22) {
        super(rgP_22);
        this.id_throws = this.id_new;
        this.id_case = (cm_3)QY.id_instanceof().id_class[15];
        this.id_catch = false;
    }

    public static void id_class(Ml_1 ml_1, cm_3 cm_32, rpl_3 rpl_32, int n, int n2, int n3) {
        cm_32.id_class(ml_1, rpl_32, (float)(n - cm_32.id_class(rpl_32) / 2), (float)n2, n3);
    }

    public static LZ id_class(int n, int n2, List<LZ> list) {
        for (int i = 0; i < list.size(); ++i) {
            LZ lZ = list.get(i);
            if (!lZ.id_new) continue;
            int n3 = rrWl_1.id_class(lZ);
            int n4 = rrWl_1.id_break(lZ);
            if (n < lZ.id_volatile || n2 < lZ.id_final || n >= lZ.id_volatile + n3 || n2 >= lZ.id_final + n4) continue;
            return lZ;
        }
        return null;
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        return !this.id_catch ? false : super.id_class(d, d2, n, d3, d4);
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        if (!this.id_catch) {
            return false;
        }
        this.id_catch = false;
        this.id_class(false);
        return this.id_catch() != null && this.id_catch().id_class(d, d2, n) ? true : super.id_class(d, d2, n);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        boolean bl = super.id_break(d, d2, n);
        this.id_catch = true;
        LZ lZ = rrJM.id_class((int)d, (int)d2, this.id_throws);
        if (lZ != null && lZ.id_int) {
            rrJO rrJO2;
            if (n == 1 && lZ instanceof rrJO && (rrJO2 = (rrJO)((Object)lZ)).id_implements() == QF.id_public) {
                lZ.id_class(this.id_volatile.c());
            }
            if (n == 0) {
                this.id_break(lZ);
            } else if (n == 1) {
                this.id_byte(lZ);
            }
            return true;
        }
        return bl;
    }

    protected void id_break(LZ lZ) {
    }
}

