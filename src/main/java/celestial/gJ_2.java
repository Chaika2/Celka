/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Vo_1;
import celestial.gx_3;
import celestial.mG_2;
import celestial.rAL;
import celestial.rAn_1;
import celestial.rdn_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class gJ_2
implements rAn_1 {
    public static final gx_3<rdn_3> id_class = new gx_3();
    public static final gx_3<rdn_3> id_break = new gx_3();
    public static final gx_3<mG_2> id_byte = new gx_3();
    private final Map<gx_3<?>, Vo_1<?>> id_protected = Maps.newHashMap();

    @Override
    public void id_class(rAL rAL2) {
        for (Vo_1<?> vo_1 : this.id_protected.values()) {
            vo_1.id_break();
        }
    }

    public <T> Vo_1<T> id_class(gx_3<T> gx_32) {
        return this.id_protected.get(gx_32);
    }

    public <T> void id_class(gx_3<T> gx_32, Vo_1<T> vo_1) {
        this.id_protected.put(gx_32, vo_1);
    }
}

