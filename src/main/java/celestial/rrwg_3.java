/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rrIk_1;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class rrwg_3 {
    public static <L, R> Pair<L, R> id_class(rrIk_1 rrIk_12, Setting<?> setting) {
        return Pair.of((Object)rrIk_12, setting.id_class(rrIk_12::id_class));
    }
}

