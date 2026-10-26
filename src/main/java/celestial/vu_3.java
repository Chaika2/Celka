/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rgB_2;
import celestial.rgF_2;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.rkZ_2;
import celestial.vN_2;
import celestial.vz_3;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class vu_3
implements vN_2 {
    private final List<String> id_class;

    public vu_3(rdn_3 rdn_32) {
        this.id_class = vu_3.id_break(rdn_32);
    }

    @Override
    public rgS_2 id_class(int n) {
        String string = this.id_class.get(n);
        try {
            rVi_1 rVi_12 = rgB_2.id_class(string);
            if (rVi_12 != null) {
                return rVi_12;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return rgS_2.id_protected(string);
    }

    @Override
    public int id_class() {
        return this.id_class.size();
    }

    private static List<String> id_break(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null && rkZ_2.id_class(rcd_32) ? vz_3.id_class(rcd_32) : ImmutableList.of((Object)rgB_2.id_class(new rgn_3("book.invalid.tag").id_class(rgF_2.DARK_RED)));
    }
}

