/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;

public final class Oe_1
extends Enum<Oe_1> {
    public static final /* enum */ Oe_1 TASK = new Oe_1("task", 0, rgF_2.GREEN);
    public static final /* enum */ Oe_1 CHALLENGE = new Oe_1("challenge", 26, rgF_2.DARK_PURPLE);
    public static final /* enum */ Oe_1 GOAL = new Oe_1("goal", 52, rgF_2.GREEN);
    private final String name;
    private final int icon;
    private final rgF_2 format;
    private final rgP_2 translatedToast;
    private static final /* synthetic */ Oe_1[] $VALUES;

    public rgF_2 id_byte() {
        return this.format;
    }

    private Oe_1(String string2, int n2, rgF_2 rgF_22) {
        this.name = string2;
        this.icon = n2;
        this.format = rgF_22;
        this.translatedToast = new rgn_3("advancements.toast." + string2);
    }

    static {
        $VALUES = Oe_1.id_throws();
    }

    public static Oe_1[] values() {
        return (Oe_1[])$VALUES.clone();
    }

    public static Oe_1 valueOf(String string) {
        return Enum.valueOf(Oe_1.class, string);
    }

    public static Oe_1 id_class(String string) {
        for (Oe_1 oe_1 : Oe_1.values()) {
            if (!oe_1.name.equals(string)) continue;
            return oe_1;
        }
        throw new IllegalArgumentException("Unknown frame type '" + string + "'");
    }

    public String id_class() {
        return this.name;
    }

    public int id_break() {
        return this.icon;
    }

    private static /* synthetic */ Oe_1[] id_throws() {
        return new Oe_1[]{TASK, CHALLENGE, GOAL};
    }

    public rgP_2 id_protected() {
        return this.translatedToast;
    }
}

