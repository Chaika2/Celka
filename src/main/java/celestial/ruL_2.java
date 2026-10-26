/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.ruB_2;
import celestial.ruF_2;
import celestial.rum_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class ruL_2 {
    public final Map<rum_3, ruF_2<?>> id_class = Maps.newEnumMap(rum_3.class);

    public <T extends ruB_2> ruL_2 id_class(rum_3 rum_32, ruF_2<T> ruF_22) {
        this.id_class.put(rum_32, ruF_22);
        return this;
    }
}

