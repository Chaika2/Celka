/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ar_1;
import celestial.LV;
import celestial.Ml_1;
import celestial.QY;
import celestial.cm_3;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.yb_3;

public class Li_1
extends LV<Ar_1> {
    public static final rqO_2 id_throws = new rqO_2("textures/gui/resource_packs.png");
    public static final rgP_2 id_case = new rgn_3("pack.incompatible");
    private static final rgP_2 id_catch = new rgn_3("pack.incompatible.confirm.title");
    public final rgP_2 id_class;

    public Li_1(QY qY, int n, int n2, rgP_2 rgP_22) {
        super(qY, n, n2, 32, n2 - 55 + 4, 36);
        this.id_class = rgP_22;
        this.id_this = false;
        this.id_class(true, 13);
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2, yb_3 yb_32) {
        rVi_1 rVi_12 = new rgN_2("").id_class(this.id_class).id_class(rgF_2.UNDERLINE, rgF_2.BOLD);
        ((cm_3)this.id_native.id_class[15]).id_byte(ml_1, rVi_12, n + this.id_final / 2 - ((cm_3)this.id_native.id_class[15]).id_class(rVi_12) / 2, Math.min(this.id_int + 3, n2), 0xFFFFFF);
    }

    @Override
    protected int id_protected() {
        return this.id_continue - 6;
    }

    public int id_private() {
        return this.id_package;
    }

    @Override
    public int F_() {
        return this.id_final;
    }
}

