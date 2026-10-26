/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.gK_2;
import celestial.gU_2;
import celestial.ga_3;
import celestial.go_3;
import celestial.rcd_3;
import celestial.rnW_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RP<C> {
    private static final Logger id_break = LogManager.getLogger();
    public static final RP<rnW_2> id_class = new RP<rnW_2>().id_class(new gU_2()).id_class(new ga_3());
    private final Map<rqO_2, gK_2<C, ?>> id_byte = Maps.newHashMap();
    private final Map<Class<?>, gK_2<C, ?>> id_protected = Maps.newHashMap();

    public <T extends go_3<C>> rcd_3 id_class(T t) {
        gK_2<T, T> gK_22 = this.id_class(t.getClass());
        rcd_3 rcd_32 = new rcd_3();
        gK_22.id_class(rcd_32, t);
        rcd_32.id_class("Type", gK_22.id_class().toString());
        return rcd_32;
    }

    public go_3<C> id_class(rcd_3 rcd_32) {
        rqO_2 rqO_22 = rqO_2.id_break(rcd_32.id_native("Type"));
        gK_2<C, ?> gK_22 = this.id_byte.get(rqO_22);
        if (gK_22 == null) {
            id_break.error("Failed to deserialize timer callback: " + rcd_32);
            return null;
        }
        try {
            return gK_22.id_class(rcd_32);
        }
        catch (Exception exception) {
            id_break.error("Failed to deserialize timer callback: " + rcd_32, (Throwable)exception);
            return null;
        }
    }

    public RP<C> id_class(gK_2<C, ?> gK_22) {
        this.id_byte.put(gK_22.id_class(), gK_22);
        this.id_protected.put(gK_22.id_break(), gK_22);
        return this;
    }

    private <T extends go_3<C>> gK_2<C, T> id_class(Class<?> clazz) {
        return this.id_protected.get(clazz);
    }
}

