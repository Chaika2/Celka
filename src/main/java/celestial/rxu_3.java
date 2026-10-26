/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.an_3;
import celestial.ee_3;
import celestial.rRP;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rco_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rqL_2;
import celestial.rqM_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.ryZ_2;
import celestial.xu_3;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rxu_3
extends rdb_3
implements ee_3 {
    private static final Logger id_class = LogManager.getLogger();

    public rxu_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        boolean bl;
        rfH_2 rfH_22 = rdH_22.id_class();
        rYB rYB2 = rdH_22.id_int();
        if (!rYB2.id_byte(rfH_22).id_class(xu_3.Jc)) {
            return super.id_class(rdH_22);
        }
        rYB2.id_class((rhd_3)null, rfH_22, rqn_3.GL, rqL_2.PLAYERS, 1.0f, 1.0f);
        rhd_3 rhd_32 = rdH_22.id_final();
        rdn_3 rdn_32 = rdH_22.id_volatile();
        boolean bl2 = bl = !((rhx_3)rhd_32.id_implements[18]).id_protected && rdn_32.id_char() == 1;
        if (bl) {
            this.id_class(rYB2.E(), rfH_22, rdn_32.id_int());
        } else {
            rdn_3 rdn_33 = new rdn_3(rdy_3.Xx, 1);
            rcd_3 rcd_32 = rdn_32.id_final() ? rdn_32.id_package().id_catch() : new rcd_3();
            rdn_33.id_byte(rcd_32);
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            this.id_class(rYB2.E(), rfH_22, rcd_32);
            if (!((rhz_3)rhd_32.id_implements[1]).id_throws(rdn_33)) {
                rhd_32.id_class(rdn_33, false);
            }
        }
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, an_3 an_32, int n, boolean bl) {
        if (!rYB2.id_continue && rxu_3.id_protected(rdn_32)) {
            rcd_3 rcd_32 = rdn_32.id_int();
            if (rcd_32.id_throws("LodestoneTracked") && !rcd_32.id_new("LodestoneTracked")) {
                return;
            }
            Optional<rqM_2<rYB>> optional = rxu_3.id_class(rcd_32);
            if (optional.isPresent() && optional.get() == rYB2.E() && rcd_32.id_throws("LodestonePos") && !((rrEm_1)rYB2).d().id_class(rRP.id_return, rco_3.id_break(rcd_32.id_int("LodestonePos")))) {
                rcd_32.id_continue("LodestonePos");
            }
        }
    }

    public static Optional<rqM_2<rYB>> id_class(rcd_3 rcd_32) {
        return rYB.id_break.parse((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_byte("LodestoneDimension")).result();
    }

    private void id_class(rqM_2<rYB> rqM_22, rfH_2 rfH_22, rcd_3 rcd_32) {
        rcd_32.id_class("LodestonePos", rco_3.id_class(rfH_22));
        rYB.id_break.encodeStart((DynamicOps)rcf_3.id_class, rqM_22).resultOrPartial(arg_0 -> ((Logger)id_class).error(arg_0)).ifPresent(rcZ_22 -> rcd_32.id_class("LodestoneDimension", (rcZ_2)rcZ_22));
        rcd_32.id_class("LodestoneTracked", true);
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        return rxu_3.id_protected(rdn_32) || super.id_throws(rdn_32);
    }

    @Override
    public String id_case(rdn_3 rdn_32) {
        return rxu_3.id_protected(rdn_32) ? "item.minecraft.lodestone_compass" : super.id_case(rdn_32);
    }

    public static boolean id_protected(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null && (rcd_32.id_throws("LodestoneDimension") || rcd_32.id_throws("LodestonePos"));
    }
}

