/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ps_1;
import celestial.ra_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.xd_3;
import java.util.List;

public interface C_goto {
    public List<rfH_2> id_class(Ps_1 var1, ra_3 var2, int var3, int var4, int var5);

    public int id_class(Ps_1 var1);

    public List<rfH_2> id_class(Ps_1 var1, ra_3 var2, rfj_3 var3, int var4, int var5);

    public int id_class(Ps_1 var1, int var2);

    default public List<rfH_2> id_class(Ps_1 ps_1, List<xd_3> list, int n, int n2, int n3) {
        return this.id_class(ps_1, new ra_3(list.toArray(new xd_3[0])), n, n2, n3);
    }

    default public List<rfH_2> id_class(Ps_1 ps_1, List<xd_3> list, rfj_3 rfj_32, int n, int n2) {
        return this.id_class(ps_1, new ra_3(list), rfj_32, n, n2);
    }
}

