/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class rqc_3
extends Enum<rqc_3> {
    public static final /* enum */ rqc_3 LEGACY = new rqc_3("legacy");
    public static final /* enum */ rqc_3 MOJANG = new rqc_3("mojang");
    private static final Map<String, rqc_3> SESSION_TYPES;
    private final String sessionType;
    private static final /* synthetic */ rqc_3[] $VALUES;

    private rqc_3(String string2) {
        this.sessionType = string2;
    }

    static {
        $VALUES = rqc_3.id_break();
        SESSION_TYPES = Arrays.stream(rqc_3.values()).collect(Collectors.toMap(rqc_32 -> rqc_32.sessionType, Function.identity()));
    }

    public static rqc_3[] values() {
        return (rqc_3[])$VALUES.clone();
    }

    public static rqc_3 valueOf(String string) {
        return Enum.valueOf(rqc_3.class, string);
    }

    public String id_class() {
        return this.sessionType;
    }

    public static rqc_3 id_class(String string) {
        return SESSION_TYPES.get(string.toLowerCase(Locale.ROOT));
    }

    private static /* synthetic */ rqc_3[] id_break() {
        return new rqc_3[]{LEGACY, MOJANG};
    }

    public static rqc_3 id_break(String string) {
        return SESSION_TYPES.get(string);
    }
}

