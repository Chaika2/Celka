/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rAI
extends Enum<rAI> {
    public static final /* enum */ rAI CLIENT_RESOURCES = new rAI("assets");
    public static final /* enum */ rAI SERVER_DATA = new rAI("data");
    private final String directoryName;
    private static final /* synthetic */ rAI[] $VALUES;

    private rAI(String string2) {
        this.directoryName = string2;
    }

    static {
        $VALUES = rAI.id_break();
    }

    public static rAI[] values() {
        return (rAI[])$VALUES.clone();
    }

    public static rAI valueOf(String string) {
        return Enum.valueOf(rAI.class, string);
    }

    public String id_class() {
        return this.directoryName;
    }

    private static /* synthetic */ rAI[] id_break() {
        return new rAI[]{CLIENT_RESOURCES, SERVER_DATA};
    }
}

