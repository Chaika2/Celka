/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rUo_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.riI_2;
import celestial.riV_2;
import celestial.rif_3;
import celestial.rij_3;
import celestial.riw_3;
import celestial.rja_3;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;
import java.util.Random;

public class rig_3
extends rrrH<rUo_1> {
    protected rig_3(rrrZ<rUo_1> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUo_1 rUo_12) {
        riI_2 riI_22;
        rif_3 rif_32 = new rif_3();
        if (rUo_12.id_break == riV_2.DESERT) {
            riI_22 = riI_2.PARTLY_BURIED;
            rif_32.id_protected = false;
            rif_32.id_byte = 0.0f;
        } else if (rUo_12.id_break == riV_2.JUNGLE) {
            riI_22 = riI_2.ON_LAND_SURFACE;
            rif_32.id_protected = this.id_protected.nextFloat() < 0.5f;
            rif_32.id_byte = 0.8f;
            rif_32.id_throws = true;
            rif_32.id_case = true;
        } else if (rUo_12.id_break == riV_2.SWAMP) {
            riI_22 = riI_2.ON_OCEAN_FLOOR;
            rif_32.id_protected = false;
            rif_32.id_byte = 0.5f;
            rif_32.id_case = true;
        } else if (rUo_12.id_break == riV_2.MOUNTAIN) {
            var10_10 = this.id_protected.nextFloat() < 0.5f;
            riI_22 = var10_10 ? riI_2.IN_MOUNTAIN : riI_2.ON_LAND_SURFACE;
            rif_32.id_protected = var10_10 || this.id_protected.nextFloat() < 0.5f;
        } else if (rUo_12.id_break == riV_2.OCEAN) {
            riI_22 = riI_2.ON_OCEAN_FLOOR;
            rif_32.id_protected = false;
            rif_32.id_byte = 0.8f;
        } else if (rUo_12.id_break == riV_2.NETHER) {
            riI_22 = riI_2.IN_NETHER;
            rif_32.id_protected = this.id_protected.nextFloat() < 0.5f;
            rif_32.id_byte = 0.0f;
            rif_32.id_catch = true;
        } else {
            var10_10 = this.id_protected.nextFloat() < 0.5f;
            riI_22 = var10_10 ? riI_2.UNDERGROUND : riI_2.ON_LAND_SURFACE;
            rif_32.id_protected = var10_10 || this.id_protected.nextFloat() < 0.5f;
        }
        rqO_2 rqO_22 = this.id_protected.nextFloat() < 0.05f ? new rqO_2(rij_3.id_synchronized[this.id_protected.nextInt(rij_3.id_synchronized.length)]) : new rqO_2(rij_3.id_else[this.id_protected.nextInt(rij_3.id_else.length)]);
        rrPl_1 rrPl_12 = rrPt_12.id_class(rqO_22);
        rqd_3 rqd_32 = rqR_2.id_class(rqd_3.values(), (Random)this.id_protected);
        rpa_3 rpa_32 = this.id_protected.nextFloat() < 0.5f ? rpa_3.NONE : rpa_3.FRONT_BACK;
        rfH_2 rfH_22 = new rfH_2(rrPl_12.id_class().b_() / 2, 0, rrPl_12.id_class().d_() / 2);
        rfH_2 rfH_23 = new rfj_3(n, n2).id_finally();
        rfi_3 rfi_32 = rrPl_12.id_class(rfH_23, rqd_32, rfH_22, rpa_32);
        rja_3 rja_32 = rfi_32.id_catch();
        int n3 = rja_32.b_();
        int n4 = rja_32.d_();
        int n5 = rKd_12.id_class(n3, n4, riw_3.id_class(riI_22)) - 1;
        int n6 = rij_3.id_class(this.id_protected, rKd_12, riI_22, rif_32.id_protected, n5, rfi_32.id_throws(), rfi_32);
        rfH_2 rfH_24 = new rfH_2(rfH_23.b_(), n6, rfH_23.d_());
        if (rUo_12.id_break == riV_2.MOUNTAIN || rUo_12.id_break == riV_2.OCEAN || rUo_12.id_break == riV_2.STANDARD) {
            rif_32.id_break = rij_3.id_class(rfH_24, rYG2);
        }
        this.id_break.add(new riw_3(rfH_24, riI_22, rif_32, rqO_22, rrPl_12, rqd_32, rpa_32, rfH_22));
        this.id_break();
    }
}

