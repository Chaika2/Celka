/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Ly_1
extends Enum<Ly_1> {
    public static final /* enum */ Ly_1 LOCKED = new Ly_1(0, 146);
    public static final /* enum */ Ly_1 LOCKED_HOVER = new Ly_1(0, 166);
    public static final /* enum */ Ly_1 LOCKED_DISABLED = new Ly_1(0, 186);
    public static final /* enum */ Ly_1 UNLOCKED = new Ly_1(20, 146);
    public static final /* enum */ Ly_1 UNLOCKED_HOVER = new Ly_1(20, 166);
    public static final /* enum */ Ly_1 UNLOCKED_DISABLED = new Ly_1(20, 186);
    private final int x;
    private final int y;
    private static final /* synthetic */ Ly_1[] $VALUES;

    private static /* synthetic */ Ly_1[] id_byte() {
        return new Ly_1[]{LOCKED, LOCKED_HOVER, LOCKED_DISABLED, UNLOCKED, UNLOCKED_HOVER, UNLOCKED_DISABLED};
    }

    private Ly_1(int n2, int n3) {
        this.x = n2;
        this.y = n3;
    }

    static {
        $VALUES = Ly_1.id_byte();
    }

    public static Ly_1[] values() {
        return (Ly_1[])$VALUES.clone();
    }

    public static Ly_1 valueOf(String string) {
        return Enum.valueOf(Ly_1.class, string);
    }

    public int id_class() {
        return this.x;
    }

    public int id_break() {
        return this.y;
    }
}

