/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rum_3
extends Enum<rum_3> {
    public static final /* enum */ rum_3 SERVERBOUND = new rum_3();
    public static final /* enum */ rum_3 CLIENTBOUND = new rum_3();
    private static final /* synthetic */ rum_3[] $VALUES;

    static {
        $VALUES = rum_3.id_class();
    }

    public static rum_3[] values() {
        return (rum_3[])$VALUES.clone();
    }

    public static rum_3 valueOf(String string) {
        return Enum.valueOf(rum_3.class, string);
    }

    private static /* synthetic */ rum_3[] id_class() {
        return new rum_3[]{SERVERBOUND, CLIENTBOUND};
    }
}

