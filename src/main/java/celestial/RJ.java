/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCZ;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rlb_3;
import celestial.ryO_2;
import celestial.ryw_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Map;
import java.util.function.Predicate;

public class RJ
implements Predicate<ryw_3> {
    private final rlb_3<xd_3> id_class;
    private final rcd_3 id_break;
    private final Map<String, String> id_byte;

    public RJ(rlb_3<xd_3> rlb_32, Map<String, String> map, rcd_3 rcd_32) {
        this.id_class = rlb_32;
        this.id_byte = map;
        this.id_break = rcd_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((ryw_3)object);
    }

    public boolean id_class(ryw_3 ryw_32) {
        xc_3 xc_32 = ryw_32.id_class();
        if (!xc_32.id_class(this.id_class)) {
            return false;
        }
        for (Map.Entry<String, String> entry : this.id_byte.entrySet()) {
            rCZ<?> rCZ2 = xc_32.id_break().id_new().id_class(entry.getKey());
            if (rCZ2 == null) {
                return false;
            }
            Comparable comparable = rCZ2.id_break(entry.getValue()).orElse(null);
            if (comparable == null) {
                return false;
            }
            if (xc_32.id_byte(rCZ2) == comparable) continue;
            return false;
        }
        if (this.id_break == null) {
            return true;
        }
        ryO_2 ryO_22 = ryw_32.id_break();
        return ryO_22 != null && rco_3.id_class(this.id_break, ryO_22.id_class(new rcd_3()), true);
    }
}

