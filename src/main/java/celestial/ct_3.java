/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.cw_3;
import celestial.fY_2;
import celestial.rqO_2;
import celestial.rrGb_1;
import com.google.common.collect.Maps;
import java.util.Map;

public class ct_3
implements AutoCloseable {
    private static final rqO_2 id_class = new rqO_2("textures/map/map_icons.png");
    public static final HU id_break = HU.id_int(id_class);
    public final fY_2 id_byte;
    private final Map<String, cw_3> id_protected = Maps.newHashMap();

    public ct_3(fY_2 fY_22) {
        this.id_byte = fY_22;
    }

    public cw_3 id_class(String string) {
        return this.id_protected.get(string);
    }

    public rrGb_1 id_class(cw_3 cw_32) {
        return cw_32 != null ? cw_32.id_class : null;
    }

    public void id_class() {
        for (cw_3 cw_32 : this.id_protected.values()) {
            cw_32.close();
        }
        this.id_protected.clear();
    }

    public void id_class(Ml_1 ml_1, Hx_1 hx_1, rrGb_1 rrGb_12, boolean bl, int n) {
        this.id_break(rrGb_12).id_class(ml_1, hx_1, bl, n);
    }

    public void id_class(rrGb_1 rrGb_12) {
        this.id_break(rrGb_12).id_class();
    }

    @Override
    public void close() {
        this.id_class();
    }

    private cw_3 id_break(rrGb_1 rrGb_12) {
        cw_3 cw_32 = this.id_protected.get(rrGb_12.id_throws());
        if (cw_32 == null) {
            cw_32 = new cw_3(this, rrGb_12);
            this.id_protected.put(rrGb_12.id_throws(), cw_32);
        }
        return cw_32;
    }
}

