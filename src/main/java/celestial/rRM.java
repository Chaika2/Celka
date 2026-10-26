/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rRM
extends Enum<rRM> {
    public static final /* enum */ rRM PROGRESS = new rRM("progress");
    public static final /* enum */ rRM NOTCHED_6 = new rRM("notched_6");
    public static final /* enum */ rRM NOTCHED_10 = new rRM("notched_10");
    public static final /* enum */ rRM NOTCHED_12 = new rRM("notched_12");
    public static final /* enum */ rRM NOTCHED_20 = new rRM("notched_20");
    private final String name;
    private static final /* synthetic */ rRM[] $VALUES;

    private rRM(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rRM.id_break();
    }

    public static rRM[] values() {
        return (rRM[])$VALUES.clone();
    }

    public static rRM valueOf(String string) {
        return Enum.valueOf(rRM.class, string);
    }

    public String id_class() {
        return this.name;
    }

    public static rRM id_class(String string) {
        for (rRM rRM2 : rRM.values()) {
            if (!rRM2.name.equals(string)) continue;
            return rRM2;
        }
        return PROGRESS;
    }

    private static /* synthetic */ rRM[] id_break() {
        return new rRM[]{PROGRESS, NOTCHED_6, NOTCHED_10, NOTCHED_12, NOTCHED_20};
    }
}

