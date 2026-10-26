/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Df_1
extends Enum<Df_1> {
    public static final /* enum */ Df_1 AND = new Df_1("AND");
    public static final /* enum */ Df_1 OR = new Df_1("OR");
    public final String field_240094_c_;
    private static final /* synthetic */ Df_1[] $VALUES;

    private Df_1(String string2) {
        this.field_240094_c_ = string2;
    }

    static {
        $VALUES = Df_1.id_class();
    }

    public static Df_1[] values() {
        return (Df_1[])$VALUES.clone();
    }

    public static Df_1 valueOf(String string) {
        return Enum.valueOf(Df_1.class, string);
    }

    private static /* synthetic */ Df_1[] id_class() {
        return new Df_1[]{AND, OR};
    }
}

