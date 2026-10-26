/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLx_1;
import celestial.rRO;
import celestial.rRV;
import celestial.rRh_1;
import celestial.rRt_1;
import celestial.rRy_1;
import celestial.rXs_1;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.roX_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rrGs_1;
import celestial.xd_3;
import java.util.Random;

public interface rRg_1
extends rRt_1,
rRy_1 {
    default public void id_byte(int n, rfH_2 rfH_22, int n2) {
        this.id_class((rhd_3)null, n, rfH_22, n2);
    }

    public Random id_long();

    default public int id_float() {
        return this.id_default().id_extends();
    }

    default public void id_class(rfH_2 rfH_22, xd_3 xd_32) {
    }

    public void id_class(rhd_3 var1, rfH_2 var2, rqA_2 var3, rqL_2 var4, float var5, float var6);

    public void id_class(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12);

    public void id_class(rhd_3 var1, int var2, rfH_2 var3, int var4);

    @Override
    default public boolean id_break(int n, int n2) {
        return this.id_goto().id_case(n, n2);
    }

    public rRh_1 id_throws(rfH_2 var1);

    public rRV<xd_3> id_finally();

    public rRV<rXs_1> id_extends();

    public roX_2 id_goto();

    @Override
    default public long id_throw() {
        return this.id_public().id_case();
    }

    public rrGs_1 id_public();

    default public rRO id_abstract() {
        return this.id_public().id_extends();
    }
}

