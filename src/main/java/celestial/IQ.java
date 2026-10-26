/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class IQ
extends Enum<IQ> {
    public static final /* enum */ IQ NONE = new IQ();
    public static final /* enum */ IQ THIRD_PERSON_LEFT_HAND = new IQ();
    public static final /* enum */ IQ THIRD_PERSON_RIGHT_HAND = new IQ();
    public static final /* enum */ IQ FIRST_PERSON_LEFT_HAND = new IQ();
    public static final /* enum */ IQ FIRST_PERSON_RIGHT_HAND = new IQ();
    public static final /* enum */ IQ HEAD = new IQ();
    public static final /* enum */ IQ GUI = new IQ();
    public static final /* enum */ IQ GROUND = new IQ();
    public static final /* enum */ IQ FIXED = new IQ();
    private static final /* synthetic */ IQ[] $VALUES;

    static {
        $VALUES = IQ.id_break();
    }

    public static IQ[] values() {
        return (IQ[])$VALUES.clone();
    }

    public static IQ valueOf(String string) {
        return Enum.valueOf(IQ.class, string);
    }

    public boolean id_class() {
        return this == FIRST_PERSON_LEFT_HAND || this == FIRST_PERSON_RIGHT_HAND;
    }

    private static /* synthetic */ IQ[] id_break() {
        return new IQ[]{NONE, THIRD_PERSON_LEFT_HAND, THIRD_PERSON_RIGHT_HAND, FIRST_PERSON_LEFT_HAND, FIRST_PERSON_RIGHT_HAND, HEAD, GUI, GROUND, FIXED};
    }
}

