/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rjo_3;
import celestial.rpr_3;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Io_1 {
    private static final Logger id_byte = LogManager.getLogger();
    public static final EnumMap<rpr_3, rjo_3> id_class = rqR_2.id_class(Maps.newEnumMap(rpr_3.class), enumMap -> {
        enumMap.put(rpr_3.SOUTH, rjo_3.id_class());
        enumMap.put(rpr_3.EAST, new rjo_3(null, new rjY_2(new rje_3(0.0f, 1.0f, 0.0f), 90.0f, true), null, null));
        enumMap.put(rpr_3.WEST, new rjo_3(null, new rjY_2(new rje_3(0.0f, 1.0f, 0.0f), -90.0f, true), null, null));
        enumMap.put(rpr_3.NORTH, new rjo_3(null, new rjY_2(new rje_3(0.0f, 1.0f, 0.0f), 180.0f, true), null, null));
        enumMap.put(rpr_3.UP, new rjo_3(null, new rjY_2(new rje_3(1.0f, 0.0f, 0.0f), -90.0f, true), null, null));
        enumMap.put(rpr_3.DOWN, new rjo_3(null, new rjY_2(new rje_3(1.0f, 0.0f, 0.0f), 90.0f, true), null, null));
    });
    public static final EnumMap<rpr_3, rjo_3> id_break = rqR_2.id_class(Maps.newEnumMap(rpr_3.class), enumMap -> {
        for (rpr_3 rpr_32 : rpr_3.values()) {
            enumMap.put(rpr_32, id_class.get(rpr_32).id_break());
        }
    });

    public static rjo_3 id_class(rjo_3 rjo_32) {
        rjV_2 rjV_22 = rjV_2.id_case(0.5f, 0.5f, 0.5f);
        rjV_22.id_class(rjo_32.id_byte());
        rjV_22.id_class(rjV_2.id_case(-0.5f, -0.5f, -0.5f));
        return new rjo_3(rjV_22);
    }

    public static rjo_3 id_class(rjo_3 rjo_32, rpr_3 rpr_32, Supplier<String> supplier) {
        rpr_3 rpr_33 = rpr_3.id_class(rjo_32.id_byte(), rpr_32);
        rjo_3 rjo_33 = rjo_32.id_break();
        if (rjo_33 == null) {
            id_byte.warn(supplier.get());
            return new rjo_3(null, null, new rje_3(0.0f, 0.0f, 0.0f), null);
        }
        rjo_3 rjo_34 = id_break.get(rpr_32).id_class(rjo_33).id_class(id_class.get(rpr_33));
        return Io_1.id_class(rjo_34);
    }
}

