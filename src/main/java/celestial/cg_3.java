/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.FC;
import celestial.FN;
import celestial.FO;
import celestial.FQ;
import celestial.FT;
import celestial.Fc_1;
import celestial.Fh_1;
import celestial.Fm_1;
import celestial.Fn_1;
import celestial.Fq_1;
import celestial.Ft_1;
import celestial.Fw_1;
import celestial.Fy_1;
import celestial.Fz_1;
import celestial.QY;
import celestial.ZV;
import celestial.Zi_1;
import celestial.Zj_1;
import celestial.Zn_1;
import celestial.cR_2;
import celestial.rJP;
import celestial.rJr_1;
import celestial.rVL;
import celestial.rgP_2;
import celestial.vP_2;
import celestial.vm_3;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cg_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Map<rJP<?>, cR_2<?, ?>> id_break = Maps.newHashMap();

    static {
        cg_3.id_class(rJP.id_class, Fc_1::new);
        cg_3.id_class(rJP.id_break, Fc_1::new);
        cg_3.id_class(rJP.id_byte, Fc_1::new);
        cg_3.id_class(rJP.id_protected, Fc_1::new);
        cg_3.id_class(rJP.id_throws, Fc_1::new);
        cg_3.id_class(rJP.id_case, Fc_1::new);
        cg_3.id_class(rJP.id_catch, Fn_1::new);
        cg_3.id_class(rJP.id_private, FO::new);
        cg_3.id_class(rJP.id_implements, Fh_1::new);
        cg_3.id_class(rJP.id_finally, Fz_1::new);
        cg_3.id_class(rJP.id_extends, FQ::new);
        cg_3.id_class(rJP.id_native, Fm_1::new);
        cg_3.id_class(rJP.id_volatile, Zn_1::new);
        cg_3.id_class(rJP.id_final, FC::new);
        cg_3.id_class(rJP.id_package, Zj_1::new);
        cg_3.id_class(rJP.id_int, ZV::new);
        cg_3.id_class(rJP.id_new, Zi_1::new);
        cg_3.id_class(rJP.id_continue, vP_2::new);
        cg_3.id_class(rJP.id_super, Fy_1::new);
        cg_3.id_class(rJP.id_this, Fq_1::new);
        cg_3.id_class(rJP.id_else, FT::new);
        cg_3.id_class(rJP.id_synchronized, Ft_1::new);
        cg_3.id_class(rJP.id_return, FN::new);
        cg_3.id_class(rJP.id_public, Fw_1::new);
    }

    private static <M extends rJr_1, U extends vm_3> void id_class(rJP<? extends M> rJP2, cR_2<M, U> cR_22) {
        cR_2<M, U> cR_23 = id_break.put(rJP2, cR_22);
        if (cR_23 != null) {
            throw new IllegalStateException("Duplicate registration for " + rVL.G.id_break(rJP2));
        }
    }

    public static boolean id_class() {
        boolean bl = false;
        for (rJP rJP2 : rVL.G) {
            if (id_break.containsKey(rJP2)) continue;
            id_class.debug("Menu {} has no matching screen", (Object)rVL.G.id_break(rJP2));
            bl = true;
        }
        return bl;
    }

    public static <T extends rJr_1> void id_class(rJP<T> rJP2, QY qY, int n, rgP_2 rgP_22) {
        if (rJP2 == null) {
            id_class.warn("Trying to open invalid screen with name: {}", (Object)rgP_22.getString());
        } else {
            cR_2<T, ?> cR_22 = cg_3.id_class(rJP2);
            if (cR_22 == null) {
                id_class.warn("Failed to create screen for menu type: {}", (Object)rVL.G.id_break(rJP2));
            } else {
                cR_22.id_class(rgP_22, rJP2, qY, n);
            }
        }
    }

    private static <T extends rJr_1> cR_2<T, ?> id_class(rJP<T> rJP2) {
        return id_break.get(rJP2);
    }
}

