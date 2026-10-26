/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.iG_2;
import celestial.rBk_1;
import celestial.rPe_1;
import celestial.rSK;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rpr_3;
import java.util.List;

public class rBh_1
extends rBk_1 {
    private int id_class;
    private final aA_2 id_break;
    private rhd_3 id_byte;
    private rPe_1 id_protected;

    @Override
    public void id_byte() {
        for (rSK rSK2 : ((rYB)this.id_break.id_throws[7]).id_class(rSK.class, this.id_break.rN().id_class(5.0))) {
            if (rSK2.rU() == null || !(rSK2.rU() instanceof rhd_3)) continue;
            this.id_byte = (rhd_3)rSK2.rU();
            break;
        }
        this.id_class = 0;
        this.id_protected = rPe_1.GO_TO_BOAT;
    }

    public rBh_1(aA_2 aA_22) {
        this.id_break = aA_22;
    }

    @Override
    public boolean id_class() {
        List<rSK> list = ((rYB)this.id_break.id_throws[7]).id_class(rSK.class, this.id_break.rN().id_class(5.0));
        boolean bl = false;
        for (rSK rSK2 : list) {
            an_3 an_32 = rSK2.rU();
            if (!(an_32 instanceof rhd_3) || !(rfU_2.id_throws(((Float)((rhd_3)an_32).id_private[42]).floatValue()) > 0.0f) && !(rfU_2.id_throws(((Float)((rhd_3)an_32).id_private[44]).floatValue()) > 0.0f)) continue;
            bl = true;
            break;
        }
        return this.id_byte != null && (rfU_2.id_throws(((Float)this.id_byte.id_private[42]).floatValue()) > 0.0f || rfU_2.id_throws(((Float)this.id_byte.id_private[44]).floatValue()) > 0.0f) || bl;
    }

    @Override
    public boolean id_break() {
        return this.id_byte != null && this.id_byte.Pm() && (rfU_2.id_throws(((Float)this.id_byte.id_private[42]).floatValue()) > 0.0f || rfU_2.id_throws(((Float)this.id_byte.id_private[44]).floatValue()) > 0.0f);
    }

    @Override
    public void id_throws() {
        boolean bl;
        boolean bl2 = bl = rfU_2.id_throws(((Float)this.id_byte.id_private[42]).floatValue()) > 0.0f || rfU_2.id_throws(((Float)this.id_byte.id_private[44]).floatValue()) > 0.0f;
        float f = this.id_protected == rPe_1.GO_IN_BOAT_DIRECTION ? (bl ? 0.01f : 0.0f) : 0.015f;
        this.id_break.id_class(f, new rjU_2(((Float)this.id_break.id_private[42]).floatValue(), ((Float)this.id_break.id_private[43]).floatValue(), ((Float)this.id_break.id_private[44]).floatValue()));
        this.id_break.id_class(iG_2.SELF, this.id_break.rv());
        if (--this.id_class <= 0) {
            this.id_class = 10;
            if (this.id_protected == rPe_1.GO_TO_BOAT) {
                rfH_2 rfH_22 = this.id_byte.Bs().id_break(this.id_byte.Pg().id_case());
                rfH_22 = rfH_22.id_break(0, -1, 0);
                this.id_break.id_public().id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), 1.0);
                if (this.id_break.id_implements(this.id_byte) < 4.0f) {
                    this.id_class = 0;
                    this.id_protected = rPe_1.GO_IN_BOAT_DIRECTION;
                }
            } else if (this.id_protected == rPe_1.GO_IN_BOAT_DIRECTION) {
                rpr_3 rpr_32 = this.id_byte.rS();
                rfH_2 rfH_23 = this.id_byte.Bs().id_class(rpr_32, 10);
                this.id_break.id_public().id_class((double)rfH_23.b_(), (double)(rfH_23.c_() - 1), (double)rfH_23.d_(), 1.0);
                if (this.id_break.id_implements(this.id_byte) > 12.0f) {
                    this.id_class = 0;
                    this.id_protected = rPe_1.GO_TO_BOAT;
                }
            }
        }
    }

    @Override
    public void id_protected() {
        this.id_byte = null;
    }

    @Override
    public boolean J_() {
        return true;
    }
}

