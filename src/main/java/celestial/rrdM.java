/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrdM
extends Enum<rrdM> {
    public static final /* enum */ rrdM NONE = new rrdM("");
    public static final /* enum */ rrdM SHADOW = new rrdM("shadow");
    public static final /* enum */ rrdM SHADOWCOMP = new rrdM("shadowcomp");
    public static final /* enum */ rrdM PREPARE = new rrdM("prepare");
    public static final /* enum */ rrdM GBUFFERS = new rrdM("gbuffers");
    public static final /* enum */ rrdM DEFERRED = new rrdM("deferred");
    public static final /* enum */ rrdM COMPOSITE = new rrdM("composite");
    private String name;
    private static final /* synthetic */ rrdM[] $VALUES;

    public boolean id_byte() {
        return this == PREPARE || this == DEFERRED || this == COMPOSITE;
    }

    private rrdM(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rrdM.id_throws();
    }

    public static rrdM[] values() {
        return (rrdM[])$VALUES.clone();
    }

    public static rrdM valueOf(String string) {
        return Enum.valueOf(rrdM.class, string);
    }

    public String id_class() {
        return this.name;
    }

    public boolean id_break() {
        return this == SHADOWCOMP || this == PREPARE || this == DEFERRED || this == COMPOSITE;
    }

    private static /* synthetic */ rrdM[] id_throws() {
        return new rrdM[]{NONE, SHADOW, SHADOWCOMP, PREPARE, GBUFFERS, DEFERRED, COMPOSITE};
    }

    public boolean id_protected() {
        return this == SHADOW || this == SHADOWCOMP;
    }
}

