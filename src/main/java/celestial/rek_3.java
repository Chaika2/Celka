/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rem_3;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;

public class rek_3 {
    private final int id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final rem_3 id_throws;

    public int id_byte() {
        return this.id_byte;
    }

    public rek_3(int n, int n2, int n3, int n4, rem_3 rem_32) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
        this.id_throws = rem_32;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rek_3 rek_32 = (rek_3)object;
            if (this.id_class != rek_32.id_class) {
                return false;
            }
            if (this.id_byte != rek_32.id_byte) {
                return false;
            }
            if (this.id_protected != rek_32.id_protected) {
                return false;
            }
            return this.id_throws == rek_32.id_throws;
        }
        return false;
    }

    public String toString() {
        return "JigsawJunction{sourceX=" + this.id_class + ", sourceGroundY=" + this.id_break + ", sourceZ=" + this.id_byte + ", deltaY=" + this.id_protected + ", destProjection=" + this.id_throws + "}";
    }

    public int hashCode() {
        int n = this.id_class;
        n = 31 * n + this.id_break;
        n = 31 * n + this.id_byte;
        n = 31 * n + this.id_protected;
        return 31 * n + this.id_throws.hashCode();
    }

    public <T> Dynamic<T> id_class(DynamicOps<T> dynamicOps) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("source_x"), dynamicOps.createInt(this.id_class)).put(dynamicOps.createString("source_ground_y"), dynamicOps.createInt(this.id_break)).put(dynamicOps.createString("source_z"), dynamicOps.createInt(this.id_byte)).put(dynamicOps.createString("delta_y"), dynamicOps.createInt(this.id_protected)).put(dynamicOps.createString("dest_proj"), dynamicOps.createString(this.id_throws.id_break()));
        return new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }

    public static <T> rek_3 id_class(Dynamic<T> dynamic) {
        return new rek_3(dynamic.get("source_x").asInt(0), dynamic.get("source_ground_y").asInt(0), dynamic.get("source_z").asInt(0), dynamic.get("delta_y").asInt(0), rem_3.id_class(dynamic.get("dest_proj").asString("")));
    }

    public int id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }
}

