/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Qs_1
extends Enum<Qs_1> {
    public static final /* enum */ Qs_1 NORMAL = new Qs_1();
    public static final /* enum */ Qs_1 DESTROY = new Qs_1();
    public static final /* enum */ Qs_1 BLOCK = new Qs_1();
    public static final /* enum */ Qs_1 IGNORE = new Qs_1();
    public static final /* enum */ Qs_1 PUSH_ONLY = new Qs_1();
    private static final /* synthetic */ Qs_1[] $VALUES;

    static {
        $VALUES = Qs_1.id_class();
    }

    public static Qs_1[] values() {
        return (Qs_1[])$VALUES.clone();
    }

    public static Qs_1 valueOf(String string) {
        return Enum.valueOf(Qs_1.class, string);
    }

    private static /* synthetic */ Qs_1[] id_class() {
        return new Qs_1[]{NORMAL, DESTROY, BLOCK, IGNORE, PUSH_ONLY};
    }
}

