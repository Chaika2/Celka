/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.aI_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.rOg_1;
import celestial.rOp_1;
import celestial.rRg_1;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rxN_2;
import java.util.List;

public class rxR_2
extends rxN_2 {
    private final aI_2<?> id_class;

    public rxR_2(aI_2<?> aI_22, rXs_1 rXs_12, rdO_2 rdO_22) {
        super(rXs_12, rdO_22);
        this.id_class = aI_22;
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rcd_3 rcd_32;
        if (this.id_class == aI_2.Y && (rcd_32 = rdn_32.id_package()) != null && rcd_32.id_byte("BucketVariantTag", 3)) {
            int n = rcd_32.id_private("BucketVariantTag");
            rgF_2[] rgF_2Array = new rgF_2[]{rgF_2.ITALIC, rgF_2.GRAY};
            String string = "color.minecraft." + rOg_1.id_this(n);
            String string2 = "color.minecraft." + rOg_1.id_else(n);
            for (int i = 0; i < rOg_1.id_class.length; ++i) {
                if (n != rOg_1.id_class[i]) continue;
                list.add(new rgn_3(rOg_1.id_break(i)).id_class(rgF_2Array));
                return;
            }
            list.add(new rgn_3(rOg_1.id_synchronized(n)).id_class(rgF_2Array));
            rgn_3 rgn_32 = new rgn_3(string);
            if (!string.equals(string2)) {
                rgn_32.id_break(", ").id_class(new rgn_3(string2));
            }
            rgn_32.id_class(rgF_2Array);
            list.add(rgn_32);
        }
    }

    private void id_class(rrEm_1 rrEm_12, rdn_3 rdn_32, rfH_2 rfH_22) {
        an_3 an_32 = this.id_class.id_class(rrEm_12, rdn_32, null, rfH_22, iO_2.BUCKET, true, false);
        if (an_32 != null) {
            ((rOp_1)an_32).id_this(true);
        }
    }

    @Override
    protected void id_class(rhd_3 rhd_32, rRg_1 rRg_12, rfH_2 rfH_22) {
        rRg_12.id_class(rhd_32, rfH_22, rqn_3.rW, rqL_2.NEUTRAL, 1.0f, 1.0f);
    }

    @Override
    public void id_class(rYB rYB2, rdn_3 rdn_32, rfH_2 rfH_22) {
        if (rYB2 instanceof rrEm_1) {
            this.id_class((rrEm_1)rYB2, rdn_32, rfH_22);
        }
    }
}

