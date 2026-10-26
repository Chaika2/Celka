/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Jq_1;
import celestial.QP;
import celestial.dj_3;
import celestial.kh_3;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rqj_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.LinkedList;

public class zB_2
extends xd_3 {
    protected zB_2(Jq_1 jq_1) {
        super(jq_1);
    }

    protected void id_class(rYB rYB2, rfH_2 rfH_22) {
        if (this.id_break(rYB2, rfH_22)) {
            rYB2.id_class(rfH_22, xu_3.c.id_continue(), 2);
            rYB2.id_byte(2001, rfH_22, xd_3.id_finally(xu_3.id_try.id_continue()));
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        this.id_class(rYB2, rfH_22);
        super.id_class(xc_32, rYB2, rfH_22, xd_32, rfH_23, bl);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break())) {
            this.id_class(rYB2, rfH_22);
        }
    }

    private boolean id_break(rYB rYB2, rfH_2 rfH_22) {
        LinkedList linkedList = Lists.newLinkedList();
        linkedList.add(new rqj_3<rfH_2, Integer>(rfH_22, 0));
        int n = 0;
        while (!linkedList.isEmpty()) {
            rqj_3 rqj_32 = (rqj_3)linkedList.poll();
            rfH_2 rfH_23 = (rfH_2)rqj_32.id_class();
            int n2 = (Integer)rqj_32.id_break();
            for (rpr_3 rpr_32 : rpr_3.values()) {
                rfH_2 rfH_24 = rfH_23.id_break(rpr_32);
                xc_3 xc_32 = rYB2.id_byte(rfH_24);
                rXE rXE2 = rYB2.id_break(rfH_24);
                QP qP = xc_32.id_byte();
                if (!rXE2.id_class(rlG_2.id_break)) continue;
                if (xc_32.id_break() instanceof kh_3 && ((kh_3)((Object)xc_32.id_break())).id_break(rYB2, rfH_24, xc_32) != rXG.id_class) {
                    ++n;
                    if (n2 >= 6) continue;
                    linkedList.add(new rqj_3<rfH_2, Integer>(rfH_24, n2 + 1));
                    continue;
                }
                if (xc_32.id_break() instanceof dj_3) {
                    rYB2.id_class(rfH_24, xu_3.id_class.id_continue(), 3);
                    ++n;
                    if (n2 >= 6) continue;
                    linkedList.add(new rqj_3<rfH_2, Integer>(rfH_24, n2 + 1));
                    continue;
                }
                if (qP != QP.id_case && qP != QP.id_implements) continue;
                ryO_2 ryO_22 = xc_32.id_break().id_protected() ? rYB2.id_class(rfH_24) : null;
                zB_2.id_class(xc_32, rYB2, rfH_24, ryO_22);
                rYB2.id_class(rfH_24, xu_3.id_class.id_continue(), 3);
                ++n;
                if (n2 >= 6) continue;
                linkedList.add(new rqj_3<rfH_2, Integer>(rfH_24, n2 + 1));
            }
            if (n <= 64) continue;
            break;
        }
        return n > 0;
    }
}

