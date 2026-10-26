/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonPrimitive
 */
package celestial;

import celestial.DE;
import celestial.DP;
import celestial.rqO_2;
import com.google.gson.JsonPrimitive;

public class Ds_1 {
    public static final DP<DE> id_class = new DP<DE>("x", dE -> new JsonPrimitive((Number)dE.field_240208_e_));
    public static final DP<DE> id_break = new DP<DE>("y", dE -> new JsonPrimitive((Number)dE.field_240208_e_));
    public static final DP<rqO_2> id_byte = new DP<rqO_2>("model", rqO_22 -> new JsonPrimitive(rqO_22.toString()));
    public static final DP<Boolean> id_protected = new DP<Boolean>("uvlock", JsonPrimitive::new);
    public static final DP<Integer> id_throws = new DP<Integer>("weight", JsonPrimitive::new);
}

