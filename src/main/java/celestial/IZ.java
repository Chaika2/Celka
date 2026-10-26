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
import java.util.Map;

public class IZ {
    private final rqO_2 id_class;
    private final Map<rqO_2, Float> id_break;

    public IZ(rqO_2 rqO_22, Map<rqO_2, Float> map) {
        this.id_class = rqO_22;
        this.id_break = map;
    }

    public rqO_2 id_class() {
        return this.id_class;
    }

    public boolean id_class(rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) {
        rdb_3 rdb_32 = rdn_32.id_break();
        for (Map.Entry<rqO_2, Float> entry : this.id_break.entrySet()) {
            rdE_2 rdE_22 = rdv_3.id_class(rdb_32, entry.getKey());
            if (rdE_22 != null && !(rdE_22.call(rdn_32, gm_32, iB_22) < entry.getValue().floatValue())) continue;
            return false;
        }
        return true;
    }
}

