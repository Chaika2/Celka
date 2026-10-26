/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ay_3;
import celestial.iO_2;
import celestial.rEA;
import celestial.rGT;
import celestial.rGg_1;
import celestial.rGt_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;

public class rEl_1
extends rGt_1 {
    private final ay_3 id_throws;
    public final /* synthetic */ rEA id_class;

    public rEl_1(rEA rEA2) {
        this.id_class = rEA2;
        super(rEA2);
        this.id_throws = new ay_3().id_class(16.0).id_byte().id_throws().id_class().id_break();
    }

    @Override
    public boolean id_class() {
        if (!super.id_class()) {
            return false;
        }
        int n = ((rYB)this.id_class.id_throws[7]).id_class(rGg_1.class, this.id_throws, this.id_class, this.id_class.rN().id_class(16.0)).size();
        return rEA.id_class(this.id_class).nextInt(8) + 1 > n;
    }

    @Override
    protected void id_finally() {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        for (int i = 0; i < 3; ++i) {
            rfH_2 rfH_22 = this.id_class.Bs().id_break(-2 + rEA.id_break(this.id_class).nextInt(5), 1, -2 + rEA.id_byte(this.id_class).nextInt(5));
            rGg_1 rGg_12 = aI_2.K.id_class((rYB)this.id_class.id_throws[7]);
            rGg_12.id_class(rfH_22, 0.0f, 0.0f);
            rGg_12.id_class(rrEm_12, ((rYB)this.id_class.id_throws[7]).id_throws(rfH_22), iO_2.MOB_SUMMONED, (aU_2)null, (rcd_3)null);
            rGg_12.id_class(this.id_class);
            rGg_12.id_implements(rfH_22);
            rGg_12.id_class(20 * (30 + rEA.id_protected(this.id_class).nextInt(90)));
            rrEm_12.id_class((an_3)rGg_12);
        }
    }

    @Override
    protected int id_catch() {
        return 100;
    }

    @Override
    protected rqA_2 id_extends() {
        return rqn_3.Bi;
    }

    @Override
    protected int id_private() {
        return 340;
    }

    @Override
    protected rGT id_native() {
        return rGT.SUMMON_VEX;
    }
}

