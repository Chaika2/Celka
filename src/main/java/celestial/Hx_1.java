/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.HU;
import celestial.Hd_1;
import celestial.Ok_1;
import celestial.lD_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public interface Hx_1 {
    default public void id_class() {
    }

    public static Hd_1 id_class(Map<HU, lD_2> map, lD_2 lD_22) {
        return new Hd_1(lD_22, map);
    }

    public static Hd_1 id_class(lD_2 lD_22) {
        return Hx_1.id_class((Map<HU, lD_2>)ImmutableMap.of(), lD_22);
    }

    public Ok_1 getBuffer(HU var1);
}

