/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;

public final class Az_1
extends Enum<Az_1> {
    public static final /* enum */ Az_1 ENABLED = new Az_1("enabled");
    public static final /* enum */ Az_1 DISABLED = new Az_1("disabled");
    public static final /* enum */ Az_1 PROMPT = new Az_1("prompt");
    private final rgP_2 motd;
    private static final /* synthetic */ Az_1[] $VALUES;

    private Az_1(String string2) {
        this.motd = new rgn_3("addServer.resourcePack." + string2);
    }

    static {
        $VALUES = Az_1.id_break();
    }

    public static Az_1[] values() {
        return (Az_1[])$VALUES.clone();
    }

    public static Az_1 valueOf(String string) {
        return Enum.valueOf(Az_1.class, string);
    }

    public rgP_2 id_class() {
        return this.motd;
    }

    private static /* synthetic */ Az_1[] id_break() {
        return new Az_1[]{ENABLED, DISABLED, PROMPT};
    }
}

