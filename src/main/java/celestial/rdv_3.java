/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.gm_3;
import celestial.iB_2;
import celestial.rdE_2;
import celestial.rdF_2;
import celestial.rdL_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhp_3;
import celestial.rpZ_2;
import celestial.rqO_2;
import celestial.rxH_2;
import celestial.rxY_2;
import celestial.rxm_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class rdv_3 {
    private static final Map<rqO_2, rdE_2> id_class = Maps.newHashMap();
    private static final rqO_2 id_break = new rqO_2("damaged");
    private static final rqO_2 id_byte = new rqO_2("damage");
    private static final rdE_2 id_protected = (rdn_32, gm_32, iB_22) -> rdn_32.id_case() ? 1.0f : 0.0f;
    private static final rdE_2 id_throws = (rdn_32, gm_32, iB_22) -> rfU_2.id_class((float)rdn_32.id_catch() / (float)rdn_32.id_private(), 0.0f, 1.0f);
    private static final Map<rdb_3, Map<rqO_2, rdE_2>> id_case = Maps.newHashMap();

    static {
        rdv_3.id_class(new rqO_2("lefthanded"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 != null && iB_22.Su() != rpZ_2.RIGHT ? 1.0f : 0.0f);
        rdv_3.id_class(new rqO_2("cooldown"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 instanceof rhd_3 ? ((rhd_3)iB_22).sK().id_class(rdn_32.id_break(), 0.0f) : 0.0f);
        rdv_3.id_class(new rqO_2("custom_model_data"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> rdn_32.id_final() ? (float)rdn_32.id_package().id_private("CustomModelData") : 0.0f);
        rdv_3.id_class(rdy_3.OM, new rqO_2("pull"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> {
            if (iB_22 == null) {
                return 0.0f;
            }
            return iB_22.sX() != rdn_32 ? 0.0f : (float)(rdn_32.id_extends() - iB_22.SH()) / 20.0f;
        });
        rdv_3.id_class(rdy_3.OM, new rqO_2("pulling"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 != null && iB_22.id_return() && iB_22.sX() == rdn_32 ? 1.0f : 0.0f);
        rdv_3.id_class(rdy_3.Xk, new rqO_2("time"), new rdF_2());
        rdv_3.id_class(rdy_3.Xx, new rqO_2("angle"), new rdL_2());
        rdv_3.id_class(rdy_3.kU, new rqO_2("pull"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> {
            if (iB_22 == null) {
                return 0.0f;
            }
            return rxm_3.id_protected(rdn_32) ? 0.0f : (float)(rdn_32.id_extends() - iB_22.SH()) / (float)rxm_3.id_private(rdn_32);
        });
        rdv_3.id_class(rdy_3.kU, new rqO_2("pulling"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 != null && iB_22.id_return() && iB_22.sX() == rdn_32 && !rxm_3.id_protected(rdn_32) ? 1.0f : 0.0f);
        rdv_3.id_class(rdy_3.kU, new rqO_2("charged"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 != null && rxm_3.id_protected(rdn_32) ? 1.0f : 0.0f);
        rdv_3.id_class(rdy_3.kU, new rqO_2("firework"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 != null && rxm_3.id_protected(rdn_32) && rxm_3.id_class(rdn_32, rdy_3.dc) ? 1.0f : 0.0f);
        rdv_3.id_class(rdy_3.kc, new rqO_2("broken"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> rxH_2.id_protected(rdn_32) ? 0.0f : 1.0f);
        rdv_3.id_class(rdy_3.Xd, new rqO_2("cast"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> {
            boolean bl;
            if (iB_22 == null) {
                return 0.0f;
            }
            boolean bl2 = iB_22.ss() == rdn_32;
            boolean bl3 = bl = iB_22.Sn() == rdn_32;
            if (iB_22.ss().id_break() instanceof rxY_2) {
                bl = false;
            }
            return (bl2 || bl) && iB_22 instanceof rhd_3 && (rhp_3)((rhd_3)iB_22).id_implements[29] != null ? 1.0f : 0.0f;
        });
        rdv_3.id_class(rdy_3.kN, new rqO_2("blocking"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 != null && iB_22.id_return() && iB_22.sX() == rdn_32 ? 1.0f : 0.0f);
        rdv_3.id_class(rdy_3.kY, new rqO_2("throwing"), (rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) -> iB_22 != null && iB_22.id_return() && iB_22.sX() == rdn_32 ? 1.0f : 0.0f);
    }

    private static rdE_2 id_class(rqO_2 rqO_22, rdE_2 rdE_22) {
        id_class.put(rqO_22, rdE_22);
        return rdE_22;
    }

    private static void id_class(rdb_3 rdb_33, rqO_2 rqO_22, rdE_2 rdE_22) {
        id_case.computeIfAbsent(rdb_33, rdb_32 -> Maps.newHashMap()).put(rqO_22, rdE_22);
    }

    public static rdE_2 id_class(rdb_3 rdb_32, rqO_2 rqO_22) {
        rdE_2 rdE_22;
        if (rdb_32.id_finally() > 0) {
            if (id_byte.equals(rqO_22)) {
                return id_throws;
            }
            if (id_break.equals(rqO_22)) {
                return id_protected;
            }
        }
        if ((rdE_22 = id_class.get(rqO_22)) != null) {
            return rdE_22;
        }
        Map<rqO_2, rdE_2> map = id_case.get(rdb_32);
        return map == null ? null : map.get(rqO_22);
    }
}

