/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rgS_2;
import celestial.vN_2;
import celestial.vz_3;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class vc_3
implements vN_2 {
    private final List<String> id_class;

    public vc_3(rdn_3 rdn_32) {
        this.id_class = vc_3.id_break(rdn_32);
    }

    @Override
    public rgS_2 id_class(int n) {
        return rgS_2.id_protected(this.id_class.get(n));
    }

    @Override
    public int id_class() {
        return this.id_class.size();
    }

    private static List<String> id_break(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null ? vz_3.id_class(rcd_32) : ImmutableList.of();
    }
}

