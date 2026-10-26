/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rRZ
extends Enum<rRZ> {
    public static final /* enum */ rRZ PLAYER = new rRZ("gamerule.category.player");
    public static final /* enum */ rRZ MOBS = new rRZ("gamerule.category.mobs");
    public static final /* enum */ rRZ SPAWNING = new rRZ("gamerule.category.spawning");
    public static final /* enum */ rRZ DROPS = new rRZ("gamerule.category.drops");
    public static final /* enum */ rRZ UPDATES = new rRZ("gamerule.category.updates");
    public static final /* enum */ rRZ CHAT = new rRZ("gamerule.category.chat");
    public static final /* enum */ rRZ MISC = new rRZ("gamerule.category.misc");
    private final String localeString;
    private static final /* synthetic */ rRZ[] $VALUES;

    private rRZ(String string2) {
        this.localeString = string2;
    }

    static {
        $VALUES = rRZ.id_break();
    }

    public static rRZ[] values() {
        return (rRZ[])$VALUES.clone();
    }

    public static rRZ valueOf(String string) {
        return Enum.valueOf(rRZ.class, string);
    }

    public String id_class() {
        return this.localeString;
    }

    private static /* synthetic */ rRZ[] id_break() {
        return new rRZ[]{PLAYER, MOBS, SPAWNING, DROPS, UPDATES, CHAT, MISC};
    }
}

