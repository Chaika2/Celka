/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Locale;

public final class rrEB
extends Enum<rrEB> {
    public static final /* enum */ rrEB ONGOING = new rrEB();
    public static final /* enum */ rrEB VICTORY = new rrEB();
    public static final /* enum */ rrEB LOSS = new rrEB();
    public static final /* enum */ rrEB STOPPED = new rrEB();
    private static final rrEB[] VALUES;
    private static final /* synthetic */ rrEB[] $VALUES;

    static {
        $VALUES = rrEB.id_break();
        VALUES = rrEB.values();
    }

    public static rrEB[] values() {
        return (rrEB[])$VALUES.clone();
    }

    public static rrEB valueOf(String string) {
        return Enum.valueOf(rrEB.class, string);
    }

    public static rrEB id_class(String string) {
        for (rrEB rrEB2 : VALUES) {
            if (!string.equalsIgnoreCase(rrEB2.name())) continue;
            return rrEB2;
        }
        return ONGOING;
    }

    public String id_class() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    private static /* synthetic */ rrEB[] id_break() {
        return new rrEB[]{ONGOING, VICTORY, LOSS, STOPPED};
    }
}

