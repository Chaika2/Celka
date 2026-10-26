/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.dz_3;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rHF;
import celestial.rHZ;
import celestial.rHm_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rql_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xK_2
extends dB_2 {
    private static final Logger id_package = LogManager.getLogger();
    public static final rCc_1 id_volatile = dz_3.id_volatile;
    public static final rCN id_final = rCT.id_byte;

    public xK_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_protected().id_case());
    }

    private static void id_class(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        rfw_3 rfw_32 = rfH_22.id_new();
        rRu_1 rRu_12 = rYB2.B();
        int n = rRu_12.id_byte(rRu_1.id_synchronized);
        while (n-- > 0) {
            rHZ rHZ2;
            ryO_2 ryO_22;
            rfw_32.id_class(rpr_32);
            xc_3 xc_32 = rYB2.id_byte(rfw_32);
            xd_3 xd_32 = xc_32.id_break();
            if (!xc_32.id_class(xu_3.bf) || !((ryO_22 = rYB2.id_class(rfw_32)) instanceof rHZ) || (rHZ2 = (rHZ)ryO_22).id_final() != rHF.SEQUENCE) break;
            if (rHZ2.id_catch() || rHZ2.id_private()) {
                rHm_1 rHm_12 = rHZ2.id_throws();
                if (rHZ2.id_native()) {
                    if (!rHm_12.id_class(rYB2)) break;
                    rYB2.id_byte((rfH_2)rfw_32, xd_32);
                } else if (rHZ2.id_package()) {
                    rHm_12.id_class(0);
                }
            }
            rpr_32 = xc_32.id_byte(id_volatile);
        }
        if (n <= 0) {
            int n2 = Math.max(rRu_12.id_byte(rRu_1.id_synchronized), 0);
            id_package.warn("Command Block chain tried to execute more than {} steps!", (Object)n2);
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHZ) {
            rHZ rHZ2 = (rHZ)ryO_22;
            rHm_1 rHm_12 = rHZ2.id_throws();
            if (rdn_32.id_this()) {
                rHm_12.id_class(rdn_32.id_continue());
            }
            if (!rYB2.id_continue) {
                if (rdn_32.id_break("BlockEntityTag") == null) {
                    rHm_12.id_class(rYB2.B().id_break(rRu_1.id_final));
                    rHZ2.id_break(this == xu_3.bf);
                }
                if (rHZ2.id_final() == rHF.SEQUENCE) {
                    boolean bl = rYB2.id_public(rfH_22);
                    rHZ2.id_class(bl);
                }
            }
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        ryO_2 ryO_22;
        if (!rYB2.id_continue && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHZ) {
            rHZ rHZ2 = (rHZ)ryO_22;
            boolean bl2 = rYB2.id_public(rfH_22);
            boolean bl3 = rHZ2.id_catch();
            rHZ2.id_class(bl2);
            if (!bl3 && !rHZ2.id_private() && rHZ2.id_final() != rHF.SEQUENCE && bl2) {
                rHZ2.id_native();
                rYB2.id_finally().id_class(rfH_22, this, 1);
            }
        }
    }

    private void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rHm_1 rHm_12, boolean bl) {
        if (bl) {
            rHm_12.id_class(rYB2);
        } else {
            rHm_12.id_class(0);
        }
        xK_2.id_class(rYB2, rfH_22, xc_32.id_byte(id_volatile));
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHZ && rhd_32.sU()) {
            rhd_32.id_class((rHZ)ryO_22);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        rHZ rHZ2 = new rHZ();
        rHZ2.id_break(this == xu_3.bf);
        return rHZ2;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        ryO_2 ryO_22 = rrEm_12.id_class(rfH_22);
        if (ryO_22 instanceof rHZ) {
            rHZ rHZ2 = (rHZ)ryO_22;
            rHm_1 rHm_12 = rHZ2.id_throws();
            boolean bl = !rql_3.id_break(rHm_12.id_private());
            rHF rHF2 = rHZ2.id_final();
            boolean bl2 = rHZ2.id_extends();
            if (rHF2 == rHF.AUTO) {
                rHZ2.id_native();
                if (bl2) {
                    this.id_class(xc_32, (rYB)rrEm_12, rfH_22, rHm_12, bl);
                } else if (rHZ2.id_package()) {
                    rHm_12.id_class(0);
                }
                if (rHZ2.id_catch() || rHZ2.id_private()) {
                    rrEm_12.id_synchronized().id_class(rfH_22, this, 1);
                }
            } else if (rHF2 == rHF.REDSTONE) {
                if (bl2) {
                    this.id_class(xc_32, (rYB)rrEm_12, rfH_22, rHm_12, bl);
                } else if (rHZ2.id_package()) {
                    rHm_12.id_class(0);
                }
            }
            rrEm_12.id_byte(rfH_22, this);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        return ryO_22 instanceof rHZ ? ((rHZ)ryO_22).id_throws().id_case() : 0;
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

