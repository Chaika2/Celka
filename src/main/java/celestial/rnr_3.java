/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class rnr_3
extends Enum<rnr_3> {
    public static final /* enum */ rnr_3 INTEGER = new rnr_3("integer");
    public static final /* enum */ rnr_3 HEARTS = new rnr_3("hearts");
    private final String field_211840_c;
    private static final Map<String, rnr_3> field_211841_d;
    private static final /* synthetic */ rnr_3[] $VALUES;

    private rnr_3(String string2) {
        this.field_211840_c = string2;
    }

    static {
        $VALUES = rnr_3.id_break();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (rnr_3 rnr_32 : rnr_3.values()) {
            builder.put((Object)rnr_32.field_211840_c, (Object)rnr_32);
        }
        field_211841_d = builder.build();
    }

    public static rnr_3[] values() {
        return (rnr_3[])$VALUES.clone();
    }

    public static rnr_3 valueOf(String string) {
        return Enum.valueOf(rnr_3.class, string);
    }

    public String id_class() {
        return this.field_211840_c;
    }

    public static rnr_3 id_class(String string) {
        return field_211841_d.getOrDefault(string, INTEGER);
    }

    private static /* synthetic */ rnr_3[] id_break() {
        return new rnr_3[]{INTEGER, HEARTS};
    }
}

