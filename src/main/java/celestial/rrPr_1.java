/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUt_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrH;
import celestial.rrrV;
import celestial.rrrZ;
import celestial.rrrn_1;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.Random;

public class rrPr_1
extends rrrH<rUt_1> {
    public rrPr_1(rrrZ<rUt_1> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32) {
        super.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32);
        int n = this.id_byte.id_break;
        for (int i = rfi_32.id_class; i <= rfi_32.id_protected; ++i) {
            for (int j = rfi_32.id_byte; j <= rfi_32.id_case; ++j) {
                Object object2;
                rfH_2 rfH_22 = new rfH_2(i, n, j);
                if (rRI2.id_finally(rfH_22) || !this.id_byte.id_break(rfH_22)) continue;
                boolean bl = false;
                for (Object object2 : this.id_break) {
                    if (!((rrrn_1)object2).id_catch().id_break(rfH_22)) continue;
                    bl = true;
                    break;
                }
                if (!bl) continue;
                for (int k = n - 1; k > 1 && (rRI2.id_finally((rfH_2)(object2 = new rfH_2(i, k, j))) || rRI2.id_byte((rfH_2)object2).id_byte().id_class()); --k) {
                    rRI2.id_class((rfH_2)object2, xu_3.id_volatile.id_continue(), 2);
                }
            }
        }
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUt_1 rUt_12) {
        rqd_3 rqd_32 = rqd_3.id_class(this.id_protected);
        int n3 = 5;
        int n4 = 5;
        if (rqd_32 == rqd_3.CLOCKWISE_90) {
            n3 = -5;
        } else if (rqd_32 == rqd_3.CLOCKWISE_180) {
            n3 = -5;
            n4 = -5;
        } else if (rqd_32 == rqd_3.COUNTERCLOCKWISE_90) {
            n4 = -5;
        }
        int n5 = (n << 4) + 7;
        int n6 = (n2 << 4) + 7;
        int n7 = rKd_12.id_byte(n5, n6, rKv_1.WORLD_SURFACE_WG);
        int n8 = rKd_12.id_byte(n5, n6 + n4, rKv_1.WORLD_SURFACE_WG);
        int n9 = rKd_12.id_byte(n5 + n3, n6, rKv_1.WORLD_SURFACE_WG);
        int n10 = rKd_12.id_byte(n5 + n3, n6 + n4, rKv_1.WORLD_SURFACE_WG);
        int n11 = Math.min(Math.min(n7, n8), Math.min(n9, n10));
        if (n11 >= 60) {
            rfH_2 rfH_22 = new rfH_2(n * 16 + 8, n11 + 1, n2 * 16 + 8);
            LinkedList linkedList = Lists.newLinkedList();
            rrrV.id_class(rrPt_12, rfH_22, rqd_32, linkedList, this.id_protected);
            this.id_break.addAll(linkedList);
            this.id_break();
        }
    }
}

