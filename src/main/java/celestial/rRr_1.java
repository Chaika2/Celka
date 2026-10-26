/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgU_2;
import java.util.function.Predicate;

public final class rRr_1
extends Enum<rRr_1> {
    public static final /* enum */ rRr_1 HAS_SPACE = new rRr_1(rgU_2::id_byte);
    public static final /* enum */ rRr_1 IS_OCCUPIED = new rRr_1(rgU_2::id_protected);
    public static final /* enum */ rRr_1 ANY = new rRr_1(rgU_22 -> true);
    private final Predicate<? super rgU_2> test;
    private static final /* synthetic */ rRr_1[] $VALUES;

    private rRr_1(Predicate<? super rgU_2> predicate) {
        this.test = predicate;
    }

    static {
        $VALUES = rRr_1.id_break();
    }

    public static rRr_1[] values() {
        return (rRr_1[])$VALUES.clone();
    }

    public static rRr_1 valueOf(String string) {
        return Enum.valueOf(rRr_1.class, string);
    }

    public Predicate<? super rgU_2> id_class() {
        return this.test;
    }

    private static /* synthetic */ rRr_1[] id_break() {
        return new rRr_1[]{HAS_SPACE, IS_OCCUPIED, ANY};
    }
}

