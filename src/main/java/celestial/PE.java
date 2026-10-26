/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.an_3;
import celestial.cb_3;
import celestial.rRl_1;
import celestial.rXa_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.ryZ_2;

public interface PE {
    public rRl_1 id_byte();

    public boolean id_class(rfH_2 var1, rpr_3 var2);

    public void id_class(cb_3 var1, an_3 var2, boolean var3);

    public ryZ_2 id_class(rpm_3 var1);

    public ryZ_2 id_class(cb_3 var1, rYB var2, rpm_3 var3, rff_3 var4);

    public void id_class(int var1, int var2, int var3, rXa_1 var4, boolean var5);

    public void id_class(int var1);

    public void id_class(int var1, int var2, int var3, rXa_1 var4);

    public void id_class(boolean var1);

    public void id_class();

    public void id_break();

    public ryZ_2 id_break(cb_3 var1, rYB var2, rpm_3 var3, rff_3 var4);

    public boolean id_break(rfH_2 var1, rpr_3 var2);

    public void id_break(int var1);

    public int id_throws();

    default public double id_case() {
        return this.id_byte().id_throws() ? 5.0 : (double)((Float)C_throws.id_break().id_boolean.id_class[0]).floatValue();
    }

    public boolean id_protected();
}

