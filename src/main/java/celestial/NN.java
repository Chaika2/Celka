/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class NN
extends Enum<NN> {
    public static final /* enum */ NN NONE = new NN();
    public static final /* enum */ NN LINEAR = new NN();
    private static final /* synthetic */ NN[] $VALUES;

    static {
        $VALUES = NN.id_class();
    }

    public static NN[] values() {
        return (NN[])$VALUES.clone();
    }

    public static NN valueOf(String string) {
        return Enum.valueOf(NN.class, string);
    }

    private static /* synthetic */ NN[] id_class() {
        return new NN[]{NONE, LINEAR};
    }
}

