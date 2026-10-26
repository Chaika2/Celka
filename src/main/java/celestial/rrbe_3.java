/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gm_3;
import celestial.iB_2;
import celestial.rdE_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdv_3;
import celestial.rqO_2;
import celestial.rrbb_3;
import java.util.Arrays;

public class rrbe_3 {
    private rqO_2 id_class;
    private float[] id_break;

    public rrbe_3(rqO_2 rqO_22, float[] fArray) {
        this.id_class = rqO_22;
        this.id_break = (float[])fArray.clone();
        Arrays.sort(this.id_break);
    }

    public String toString() {
        return "location: " + this.id_class + ", values: [" + rrbb_3.id_class(this.id_break) + "]";
    }

    public Integer id_class(rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) {
        rdb_3 rdb_32 = rdn_32.id_break();
        rdE_2 rdE_22 = rdv_3.id_class(rdb_32, this.id_class);
        if (rdE_22 == null) {
            return null;
        }
        float f = rdE_22.call(rdn_32, gm_32, iB_22);
        int n = Arrays.binarySearch(this.id_break, f);
        return n;
    }

    public rqO_2 id_class() {
        return this.id_class;
    }

    public float[] id_break() {
        return this.id_break;
    }
}

