/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrEJ
extends Enum<rrEJ> {
    public static final /* enum */ rrEJ INACCESSIBLE = new rrEJ();
    public static final /* enum */ rrEJ BORDER = new rrEJ();
    public static final /* enum */ rrEJ TICKING = new rrEJ();
    public static final /* enum */ rrEJ ENTITY_TICKING = new rrEJ();
    private static final /* synthetic */ rrEJ[] $VALUES;

    static {
        $VALUES = rrEJ.id_class();
    }

    public static rrEJ[] values() {
        return (rrEJ[])$VALUES.clone();
    }

    public static rrEJ valueOf(String string) {
        return Enum.valueOf(rrEJ.class, string);
    }

    private static /* synthetic */ rrEJ[] id_class() {
        return new rrEJ[]{INACCESSIBLE, BORDER, TICKING, ENTITY_TICKING};
    }

    public boolean id_class(rrEJ rrEJ2) {
        return this.ordinal() >= rrEJ2.ordinal();
    }
}

