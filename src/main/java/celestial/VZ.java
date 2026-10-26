/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class VZ
extends Enum<VZ> {
    public static final /* enum */ VZ FIRST_PERSON = new VZ(true, false);
    public static final /* enum */ VZ THIRD_PERSON_BACK = new VZ(false, false);
    public static final /* enum */ VZ THIRD_PERSON_FRONT = new VZ(false, true);
    private static final VZ[] field_243189_d;
    private boolean field_243190_e;
    private boolean field_243191_f;
    private static final /* synthetic */ VZ[] $VALUES;

    public VZ id_byte() {
        return field_243189_d[(this.ordinal() + 1) % field_243189_d.length];
    }

    private VZ(boolean bl, boolean bl2) {
        this.field_243190_e = bl;
        this.field_243191_f = bl2;
    }

    static {
        $VALUES = VZ.id_protected();
        field_243189_d = VZ.values();
    }

    public static VZ[] values() {
        return (VZ[])$VALUES.clone();
    }

    public static VZ valueOf(String string) {
        return Enum.valueOf(VZ.class, string);
    }

    public boolean id_class() {
        return this.field_243190_e;
    }

    public boolean id_break() {
        return this.field_243191_f;
    }

    private static /* synthetic */ VZ[] id_protected() {
        return new VZ[]{FIRST_PERSON, THIRD_PERSON_BACK, THIRD_PERSON_FRONT};
    }
}

