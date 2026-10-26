/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rcd_3;
import celestial.rgP_2;
import celestial.rhN_2;
import celestial.rnx_3;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

public class rnd_3 {
    private final Map<rqO_2, rnx_3> id_class = Maps.newHashMap();

    public rcd_3 id_byte() {
        rcd_3 rcd_32 = new rcd_3();
        for (rnx_3 rnx_32 : this.id_class.values()) {
            rcd_32.id_class(rnx_32.id_break().toString(), rnx_32.id_catch());
        }
        return rcd_32;
    }

    public Collection<rqO_2> id_class() {
        return this.id_class.keySet();
    }

    public void id_class(rcd_3 rcd_32) {
        for (String string : rcd_32.id_protected()) {
            rqO_2 rqO_22 = new rqO_2(string);
            this.id_class.put(rqO_22, rnx_3.id_class(rcd_32.id_int(string), rqO_22));
        }
    }

    public void id_class(rhN_2 rhN_22) {
        for (rnx_3 rnx_32 : this.id_class.values()) {
            rnx_32.id_byte(rhN_22);
        }
    }

    public rnx_3 id_class(rqO_2 rqO_22) {
        return this.id_class.get(rqO_22);
    }

    public void id_class(rnx_3 rnx_32) {
        this.id_class.remove(rnx_32.id_break());
    }

    public rnx_3 id_class(rqO_2 rqO_22, rgP_2 rgP_22) {
        rnx_3 rnx_32 = new rnx_3(rqO_22, rgP_22);
        this.id_class.put(rqO_22, rnx_32);
        return rnx_32;
    }

    public void id_break(rhN_2 rhN_22) {
        for (rnx_3 rnx_32 : this.id_class.values()) {
            rnx_32.id_protected(rhN_22);
        }
    }

    public Collection<rnx_3> id_break() {
        return this.id_class.values();
    }
}

