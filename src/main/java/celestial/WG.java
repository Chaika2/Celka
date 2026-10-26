/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JY;
import celestial.Jq_1;
import celestial.QP;
import celestial.WM;
import celestial.an_3;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.List;

public class WG
extends JY {
    public static final rCN id_int = rCT.id_return;
    private final WM id_new;

    protected WG(WM wM, Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_int, false));
        this.id_new = wM;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_int});
    }

    @Override
    protected void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        if (this.id_break != QP.id_goto && this.id_break != QP.id_while) {
            rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.xe, rqL_2.BLOCKS, 0.3f, 0.6f);
        } else {
            rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.WL, rqL_2.BLOCKS, 0.3f, 0.8f);
        }
    }

    @Override
    protected xc_3 id_class(xc_3 xc_32, int n) {
        return (xc_3)xc_32.id_class(id_int, n > 0);
    }

    @Override
    protected void id_break(rRg_1 rRg_12, rfH_2 rfH_22) {
        if (this.id_break != QP.id_goto && this.id_break != QP.id_while) {
            rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.xU, rqL_2.BLOCKS, 0.3f, 0.5f);
        } else {
            rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.WF, rqL_2.BLOCKS, 0.3f, 0.7f);
        }
    }

    @Override
    protected int id_break(rYB rYB2, rfH_2 rfH_22) {
        List<an_3> list;
        rfl_3 rfl_32 = id_package.id_class(rfH_22);
        switch (this.id_new) {
            case EVERYTHING: {
                list = rYB2.id_class((an_3)null, rfl_32);
                break;
            }
            case MOBS: {
                list = rYB2.id_class(iB_2.class, rfl_32);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!list.isEmpty()) {
            for (an_3 an_32 : list) {
                if (an_32.rB()) continue;
                return 15;
            }
        }
        return 0;
    }

    @Override
    protected int id_catch(xc_3 xc_32) {
        return xc_32.id_byte(id_int) != false ? 15 : 0;
    }
}

