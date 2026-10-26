/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfl_3;
import celestial.rpr_3;

public class ryc_3 {
    public static rfl_3 id_class(rfl_3 rfl_32, rpr_3 rpr_32, double d) {
        double d2 = d * (double)rpr_32.id_throws().id_class();
        double d3 = Math.min(d2, 0.0);
        double d4 = Math.max(d2, 0.0);
        switch (rpr_32) {
            case WEST: {
                return new rfl_3(rfl_32.id_class + d3, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_class + d4, rfl_32.id_throws, rfl_32.id_case);
            }
            case EAST: {
                return new rfl_3(rfl_32.id_protected + d3, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected + d4, rfl_32.id_throws, rfl_32.id_case);
            }
            case DOWN: {
                return new rfl_3(rfl_32.id_class, rfl_32.id_break + d3, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_break + d4, rfl_32.id_case);
            }
            default: {
                return new rfl_3(rfl_32.id_class, rfl_32.id_throws + d3, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws + d4, rfl_32.id_case);
            }
            case NORTH: {
                return new rfl_3(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte + d3, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_byte + d4);
            }
            case SOUTH: 
        }
        return new rfl_3(rfl_32.id_class, rfl_32.id_break, rfl_32.id_case + d3, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case + d4);
    }
}

