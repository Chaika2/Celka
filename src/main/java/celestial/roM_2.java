/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicLike
 */
package celestial;

import celestial.rcd_3;
import celestial.roE_2;
import com.mojang.serialization.DynamicLike;

public class roM_2 {
    private final double id_class;
    private final double id_break;
    private final double id_byte;
    private final double id_protected;
    private final int id_throws;
    private final int id_case;
    private final double id_catch;
    private final long id_private;
    private final double id_implements;

    public double id_byte() {
        return this.id_byte;
    }

    public roM_2(double d, double d2, double d3, double d4, int n, int n2, double d5, long l, double d6) {
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = d3;
        this.id_protected = d4;
        this.id_throws = n;
        this.id_case = n2;
        this.id_catch = d5;
        this.id_private = l;
        this.id_implements = d6;
    }

    public roM_2(roE_2 roE_22) {
        this.id_class = roE_22.id_class();
        this.id_break = roE_22.id_break();
        this.id_byte = roE_22.id_package();
        this.id_protected = roE_22.id_final();
        this.id_throws = roE_22.id_continue();
        this.id_case = roE_22.id_new();
        this.id_catch = roE_22.id_implements();
        this.id_private = roE_22.id_finally();
        this.id_implements = roE_22.id_extends();
    }

    public void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("BorderCenterX", this.id_class);
        rcd_32.id_class("BorderCenterZ", this.id_break);
        rcd_32.id_class("BorderSize", this.id_catch);
        rcd_32.id_class("BorderSizeLerpTime", this.id_private);
        rcd_32.id_class("BorderSafeZone", this.id_protected);
        rcd_32.id_class("BorderDamagePerBlock", this.id_byte);
        rcd_32.id_class("BorderSizeLerpTarget", this.id_implements);
        rcd_32.id_class("BorderWarningBlocks", (double)this.id_throws);
        rcd_32.id_class("BorderWarningTime", (double)this.id_case);
    }

    public static roM_2 id_class(DynamicLike<?> dynamicLike, roM_2 roM_22) {
        double d = dynamicLike.get("BorderCenterX").asDouble(roM_22.id_class);
        double d2 = dynamicLike.get("BorderCenterZ").asDouble(roM_22.id_break);
        double d3 = dynamicLike.get("BorderSize").asDouble(roM_22.id_catch);
        long l = dynamicLike.get("BorderSizeLerpTime").asLong(roM_22.id_private);
        double d4 = dynamicLike.get("BorderSizeLerpTarget").asDouble(roM_22.id_implements);
        double d5 = dynamicLike.get("BorderSafeZone").asDouble(roM_22.id_protected);
        double d6 = dynamicLike.get("BorderDamagePerBlock").asDouble(roM_22.id_byte);
        int n = dynamicLike.get("BorderWarningBlocks").asInt(roM_22.id_throws);
        int n2 = dynamicLike.get("BorderWarningTime").asInt(roM_22.id_case);
        return new roM_2(d, d2, d6, d5, n, n2, d3, l, d4);
    }

    public double id_class() {
        return this.id_class;
    }

    public double id_break() {
        return this.id_break;
    }

    public int id_throws() {
        return this.id_throws;
    }

    public double id_catch() {
        return this.id_catch;
    }

    public int id_case() {
        return this.id_case;
    }

    public double id_implements() {
        return this.id_implements;
    }

    public double id_protected() {
        return this.id_protected;
    }

    public long id_private() {
        return this.id_private;
    }
}

