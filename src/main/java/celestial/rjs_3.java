/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXE;
import java.util.function.Predicate;

public final class rjs_3
extends Enum<rjs_3> {
    public static final /* enum */ rjs_3 NONE = new rjs_3(rXE2 -> false);
    public static final /* enum */ rjs_3 SOURCE_ONLY = new rjs_3(rXE::id_break);
    public static final /* enum */ rjs_3 ANY = new rjs_3(rXE2 -> !rXE2.id_byte());
    private final Predicate<rXE> fluidTest;
    private static final /* synthetic */ rjs_3[] $VALUES;

    private rjs_3(Predicate<rXE> predicate) {
        this.fluidTest = predicate;
    }

    static {
        $VALUES = rjs_3.id_class();
    }

    public static rjs_3[] values() {
        return (rjs_3[])$VALUES.clone();
    }

    public static rjs_3 valueOf(String string) {
        return Enum.valueOf(rjs_3.class, string);
    }

    private static /* synthetic */ rjs_3[] id_class() {
        return new rjs_3[]{NONE, SOURCE_ONLY, ANY};
    }

    public boolean id_class(rXE rXE2) {
        return this.fluidTest.test(rXE2);
    }
}

