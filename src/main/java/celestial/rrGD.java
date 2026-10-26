/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrGK;

public final class rrGD
extends Enum<rrGD>
implements rrGK {
    public static final /* enum */ rrGD MODELS = new rrGD();
    public static final /* enum */ rrGD TEXTURES = new rrGD();
    public static final /* enum */ rrGD SOUNDS = new rrGD();
    public static final /* enum */ rrGD LANGUAGES = new rrGD();
    public static final /* enum */ rrGD SHADERS = new rrGD();
    private static final /* synthetic */ rrGD[] $VALUES;

    static {
        $VALUES = rrGD.id_class();
    }

    public static rrGD[] values() {
        return (rrGD[])$VALUES.clone();
    }

    public static rrGD valueOf(String string) {
        return Enum.valueOf(rrGD.class, string);
    }

    private static /* synthetic */ rrGD[] id_class() {
        return new rrGD[]{MODELS, TEXTURES, SOUNDS, LANGUAGES, SHADERS};
    }
}

