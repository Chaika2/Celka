/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class Vb_1
extends Enum<Vb_1> {
    public static final /* enum */ Vb_1 NONE = new Vb_1("none");
    public static final /* enum */ Vb_1 PARTIAL = new Vb_1("partial");
    public static final /* enum */ Vb_1 FULL = new Vb_1("full");
    private static final Map<String, Vb_1> field_217824_d;
    private final String field_217825_e;
    private static final /* synthetic */ Vb_1[] $VALUES;

    private Vb_1(String string2) {
        this.field_217825_e = string2;
    }

    static {
        $VALUES = Vb_1.id_break();
        field_217824_d = Arrays.stream(Vb_1.values()).collect(Collectors.toMap(Vb_1::id_class, vb_1 -> vb_1));
    }

    public static Vb_1[] values() {
        return (Vb_1[])$VALUES.clone();
    }

    public static Vb_1 valueOf(String string) {
        return Enum.valueOf(Vb_1.class, string);
    }

    public static Vb_1 id_class(String string) {
        return field_217824_d.getOrDefault(string, NONE);
    }

    public String id_class() {
        return this.field_217825_e;
    }

    private static /* synthetic */ Vb_1[] id_break() {
        return new Vb_1[]{NONE, PARTIAL, FULL};
    }
}

