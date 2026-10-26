/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.ly_3;
import celestial.rfH_2;
import celestial.yD_2;
import celestial.yK_2;
import com.google.common.collect.Lists;
import java.util.Collection;

public class pM_2
implements yD_2 {
    private final QY id_class;
    private Collection<rfH_2> id_break = Lists.newArrayList();

    public pM_2(QY qY) {
        this.id_class = qY;
    }

    private static void id_class(String string, rfH_2 rfH_22, int n) {
        double d = (double)rfH_22.b_() + 0.5;
        double d2 = (double)rfH_22.c_() + 1.3;
        double d3 = (double)rfH_22.d_() + 0.5;
        yK_2.id_class(string, d, d2, d3, n, 0.04f, true, 0.0f, true);
    }

    private static void id_class(rfH_2 rfH_22) {
        yK_2.id_class(rfH_22.id_byte(-0.5, -0.5, -0.5), rfH_22.id_byte(1.5, 1.5, 1.5), 1.0f, 0.0f, 0.0f, 0.15f);
        int n = -65536;
        pM_2.id_class("Raid center", rfH_22, -65536);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        rfH_2 rfH_22 = this.id_break().id_byte();
        for (rfH_2 rfH_23 : this.id_break) {
            if (!rfH_22.id_class(rfH_23, 160.0)) continue;
            pM_2.id_class(rfH_23);
        }
    }

    public void id_class(Collection<rfH_2> collection) {
        this.id_break = collection;
    }

    private ly_3 id_break() {
        return ((Hh_1)this.id_class.id_class[16]).id_finally();
    }
}

