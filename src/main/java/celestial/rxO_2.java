/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.JL;
import celestial.VD;
import celestial.rHE;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rku_3;
import celestial.rxL_2;
import celestial.xd_3;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class rxO_2
extends rku_3 {
    public rxL_2 id_byte() {
        return ((JL)this.id_catch()).id_break();
    }

    public rxO_2(xd_3 xd_32, xd_3 xd_33, rdO_2 rdO_22) {
        super(xd_32, xd_33, rdO_22);
        Validate.isInstanceOf(JL.class, (Object)xd_32);
        Validate.isInstanceOf(JL.class, (Object)xd_33);
    }

    public static void id_class(rdn_3 rdn_32, List<rgP_2> list) {
        rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
        if (rcd_32 != null && rcd_32.id_throws("Patterns")) {
            rcy_3 rcy_32 = rcd_32.id_protected("Patterns", 10);
            for (int i = 0; i < rcy_32.size() && i < 6; ++i) {
                rcd_3 rcd_33 = rcy_32.id_class(i);
                rxL_2 rxL_22 = rxL_2.id_class(rcd_33.id_private("Color"));
                rHE rHE2 = rHE.id_class(rcd_33.id_native("Pattern"));
                if (rHE2 == null) continue;
                list.add(new rgn_3("block.minecraft.banner." + rHE2.id_class() + "." + rxL_22.id_byte()).id_class(rgF_2.GRAY));
            }
        }
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rxO_2.id_class(rdn_32, list);
    }
}

