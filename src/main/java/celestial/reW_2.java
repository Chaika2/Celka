/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rVF;
import celestial.rVL;
import celestial.rVm_1;
import celestial.reN_2;
import celestial.reQ_2;
import celestial.rel_3;
import celestial.reu_3;
import celestial.rev_3;
import celestial.rez_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjw_3;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrI;
import celestial.rrrZ;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class reW_2 {
    public static final Logger id_class = LogManager.getLogger();

    public static void id_class(rVm_1 rVm_12, rrrI rrrI2, reN_2 reN_22, rKd_1 rKd_12, rrPt_1 rrPt_12, rfH_2 rfH_22, List<? super rel_3> list, Random random, boolean bl, boolean bl2) {
        rrrZ.id_throws();
        rVF<reu_3> rVF2 = rVm_12.id_break(rVL.A);
        rqd_3 rqd_32 = rqd_3.id_class(random);
        reu_3 reu_32 = rrrI2.id_byte().get();
        rev_3 rev_32 = reu_32.id_class(random);
        rel_3 rel_32 = reN_22.create(rrPt_12, rev_32, rfH_22, rev_32.id_protected(), rqd_32, rev_32.id_class(rrPt_12, rfH_22, rqd_32));
        rfi_3 rfi_32 = rel_32.id_catch();
        int n = (rfi_32.id_protected + rfi_32.id_class) / 2;
        int n2 = (rfi_32.id_case + rfi_32.id_byte) / 2;
        int n3 = bl2 ? rfH_22.c_() + rKd_12.id_break(n, n2, rKv_1.WORLD_SURFACE_WG) : rfH_22.c_();
        int n4 = rfi_32.id_break + rel_32.id_protected();
        rel_32.id_class(0, n3 - n4, 0);
        list.add(rel_32);
        if (rrrI2.id_break() > 0) {
            int n5 = 80;
            rfl_3 rfl_32 = new rfl_3(n - 80, n3 - 80, n2 - 80, n + 80 + 1, n3 + 80 + 1, n2 + 80 + 1);
            rez_3 rez_32 = new rez_3(rVF2, rrrI2.id_break(), reN_22, rKd_12, rrPt_12, list, random);
            rez_32.id_private.addLast(new reQ_2(rel_32, (MutableObject<rjC_2>)new MutableObject((Object)rjw_3.id_class(rjw_3.id_class(rfl_32), rjw_3.id_class(rfl_3.id_class(rfi_32)), rjN_2.id_throws)), n3 + 80, 0));
            while (!rez_32.id_private.isEmpty()) {
                reQ_2 reQ_22 = rez_32.id_private.removeFirst();
                rez_32.id_class(reQ_22.id_class, reQ_22.id_break, reQ_22.id_byte, reQ_22.id_protected, bl);
            }
        }
    }

    public static void id_class(rVm_1 rVm_12, rel_3 rel_32, int n, reN_2 reN_22, rKd_1 rKd_12, rrPt_1 rrPt_12, List<? super rel_3> list, Random random) {
        rVF<reu_3> rVF2 = rVm_12.id_break(rVL.A);
        rez_3 rez_32 = new rez_3(rVF2, n, reN_22, rKd_12, rrPt_12, list, random);
        rez_32.id_private.addLast(new reQ_2(rel_32, (MutableObject<rjC_2>)new MutableObject((Object)rjw_3.id_class), 0, 0));
        while (!rez_32.id_private.isEmpty()) {
            reQ_2 reQ_22 = rez_32.id_private.removeFirst();
            rez_32.id_class(reQ_22.id_class, reQ_22.id_break, reQ_22.id_byte, reQ_22.id_protected, false);
        }
    }
}

