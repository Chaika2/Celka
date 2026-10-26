/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rRg_1;
import celestial.rVM;
import celestial.rVX;
import celestial.rVz_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.roJ_2;
import celestial.roQ_2;
import celestial.rpM_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVh_1 {
    private static final Logger id_break = LogManager.getLogger();
    public static final rVh_1 id_class = new rVh_1();
    private static final rpM_2[] id_byte = rpM_2.values();
    private final EnumSet<rpM_2> id_protected = EnumSet.noneOf(rpM_2.class);
    private final int[][] id_throws = new int[16][];
    public static final Map<xd_3, rVz_1> id_case = new IdentityHashMap<xd_3, rVz_1>();
    public static final Set<rVz_1> id_catch = Sets.newHashSet();

    private rVh_1() {
    }

    public rVh_1(rcd_3 rcd_32) {
        this();
        if (rcd_32.id_byte("Indices", 10)) {
            rcd_3 rcd_33 = rcd_32.id_int("Indices");
            for (int i = 0; i < this.id_throws.length; ++i) {
                String string = String.valueOf(i);
                if (!rcd_33.id_byte(string, 11)) continue;
                this.id_throws[i] = rcd_33.id_final(string);
            }
        }
        int n = rcd_32.id_private("Sides");
        for (rpM_2 rpM_22 : rpM_2.values()) {
            if ((n & 1 << rpM_22.ordinal()) == 0) continue;
            this.id_protected.add(rpM_22);
        }
    }

    public boolean id_class() {
        for (int[] nArray : this.id_throws) {
            if (nArray == null) continue;
            return false;
        }
        return this.id_protected.isEmpty();
    }

    public void id_class(roJ_2 roJ_22) {
        this.id_break(roJ_22);
        for (rpM_2 rpM_22 : id_byte) {
            rVh_1.id_class(roJ_22, rpM_22);
        }
        rYB rYB2 = roJ_22.id_extends();
        id_catch.forEach(rVz_12 -> rVz_12.id_class(rYB2));
    }

    private static void id_class(roJ_2 roJ_22, rpM_2 rpM_22) {
        rYB rYB2 = roJ_22.id_extends();
        if (roJ_22.id_synchronized().id_protected.remove((Object)rpM_22)) {
            Set<rpr_3> set = rpM_22.id_class();
            boolean bl = false;
            int n = 15;
            boolean bl2 = set.contains(rpr_3.EAST);
            boolean bl3 = set.contains(rpr_3.WEST);
            boolean bl4 = set.contains(rpr_3.SOUTH);
            boolean bl5 = set.contains(rpr_3.NORTH);
            boolean bl6 = set.size() == 1;
            rfj_3 rfj_32 = roJ_22.id_private();
            int n2 = rfj_32.id_break() + (!bl6 || !bl5 && !bl4 ? (bl3 ? 0 : 15) : 1);
            int n3 = rfj_32.id_break() + (!bl6 || !bl5 && !bl4 ? (bl3 ? 0 : 15) : 14);
            int n4 = rfj_32.id_byte() + (!bl6 || !bl2 && !bl3 ? (bl5 ? 0 : 15) : 1);
            int n5 = rfj_32.id_byte() + (!bl6 || !bl2 && !bl3 ? (bl5 ? 0 : 15) : 14);
            rpr_3[] rpr_3Array = rpr_3.values();
            rfw_3 rfw_32 = new rfw_3();
            for (rfH_2 rfH_22 : rfH_2.id_break(n2, 0, n4, n3, rYB2.id_try() - 1, n5)) {
                xc_3 xc_32;
                xc_3 xc_33 = xc_32 = rYB2.id_byte(rfH_22);
                for (rpr_3 rpr_32 : rpr_3Array) {
                    rfw_32.id_class((rja_3)rfH_22, rpr_32);
                    xc_33 = rVh_1.id_class(xc_33, rpr_32, rYB2, rfH_22, rfw_32);
                }
                xd_3.id_class(xc_32, xc_33, rYB2, rfH_22, 18);
            }
        }
    }

    private static xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return id_case.getOrDefault(xc_32.id_break(), rVX.DEFAULT).id_class(xc_32, rpr_32, rRg_12.id_byte(rfH_23), rRg_12, rfH_22, rfH_23);
    }

    public rcd_3 id_break() {
        int n;
        rcd_3 rcd_32 = new rcd_3();
        rcd_3 rcd_33 = new rcd_3();
        for (n = 0; n < this.id_throws.length; ++n) {
            String string = String.valueOf(n);
            if (this.id_throws[n] == null || this.id_throws[n].length == 0) continue;
            rcd_33.id_class(string, this.id_throws[n]);
        }
        if (!rcd_33.id_case()) {
            rcd_32.id_class("Indices", rcd_33);
        }
        n = 0;
        for (rpM_2 rpM_22 : this.id_protected) {
            n |= 1 << rpM_22.ordinal();
        }
        rcd_32.id_class("Sides", (byte)n);
        return rcd_32;
    }

    private void id_break(roJ_2 roJ_22) {
        int n;
        rfw_3 rfw_32 = new rfw_3();
        rfw_3 rfw_33 = new rfw_3();
        rfj_3 rfj_32 = roJ_22.id_private();
        rYB rYB2 = roJ_22.id_extends();
        for (n = 0; n < 16; ++n) {
            roQ_2 roQ_22 = roJ_22.id_byte()[n];
            int[] nArray = this.id_throws[n];
            this.id_throws[n] = null;
            if (roQ_22 == null || nArray == null || nArray.length <= 0) continue;
            rpr_3[] rpr_3Array = rpr_3.values();
            rVM<xc_3> rVM2 = roQ_22.id_implements();
            for (int n2 : nArray) {
                xc_3 xc_32;
                int n3 = n2 & 0xF;
                int n4 = n2 >> 8 & 0xF;
                int n5 = n2 >> 4 & 0xF;
                rfw_32.id_class(rfj_32.id_break() + n3, (n << 4) + n4, rfj_32.id_byte() + n5);
                xc_3 xc_33 = xc_32 = rVM2.id_class(n2);
                for (rpr_3 rpr_32 : rpr_3Array) {
                    rfw_33.id_class((rja_3)rfw_32, rpr_32);
                    if (rfw_32.b_() >> 4 != rfj_32.id_break || rfw_32.d_() >> 4 != rfj_32.id_byte) continue;
                    xc_33 = rVh_1.id_class(xc_33, rpr_32, rYB2, rfw_32, rfw_33);
                }
                xd_3.id_class(xc_32, xc_33, rYB2, rfw_32, 18);
            }
        }
        for (n = 0; n < this.id_throws.length; ++n) {
            if (this.id_throws[n] != null) {
                id_break.warn("Discarding update data for section {} for chunk ({} {})", (Object)n, (Object)rfj_32.id_break, (Object)rfj_32.id_byte);
            }
            this.id_throws[n] = null;
        }
    }
}

