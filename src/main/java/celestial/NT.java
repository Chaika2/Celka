/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class NT
extends Enum<NT> {
    public static final /* enum */ NT FILE = new NT("file");
    public static final /* enum */ NT SOUND_EVENT = new NT("event");
    private final String name;
    private static final /* synthetic */ NT[] $VALUES;

    private NT(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = NT.id_class();
    }

    public static NT[] values() {
        return (NT[])$VALUES.clone();
    }

    public static NT valueOf(String string) {
        return Enum.valueOf(NT.class, string);
    }

    private static /* synthetic */ NT[] id_class() {
        return new NT[]{FILE, SOUND_EVENT};
    }

    public static NT id_class(String string) {
        for (NT nT : NT.values()) {
            if (!nT.name.equals(string)) continue;
            return nT;
        }
        return null;
    }
}

