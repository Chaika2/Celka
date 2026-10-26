/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgS_2;
import celestial.vc_3;
import celestial.vu_3;
import celestial.vz_3;

public interface vN_2 {
    public static vN_2 id_class(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 == rdy_3.dr) {
            return new vu_3(rdn_32);
        }
        return rdb_32 == rdy_3.xi ? new vc_3(rdn_32) : vz_3.id_class;
    }

    public rgS_2 id_class(int var1);

    public int id_class();

    default public rgS_2 id_break(int n) {
        return n >= 0 && n < this.id_class() ? this.id_class(n) : rgS_2.id_break;
    }
}

