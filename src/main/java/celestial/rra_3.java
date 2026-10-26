/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTB;
import java.util.function.Consumer;

public final class rra_3
extends Enum<rra_3> {
    public static final /* enum */ rra_3 ORDERED = new rra_3(rTB2 -> {});
    public static final /* enum */ rra_3 SHUFFLED = new rra_3(rTB::id_class);
    private final Consumer<rTB<?>> field_220629_c;
    private static final /* synthetic */ rra_3[] $VALUES;

    private rra_3(Consumer<rTB<?>> consumer) {
        this.field_220629_c = consumer;
    }

    static {
        $VALUES = rra_3.id_class();
    }

    public static rra_3[] values() {
        return (rra_3[])$VALUES.clone();
    }

    public static rra_3 valueOf(String string) {
        return Enum.valueOf(rra_3.class, string);
    }

    public void id_class(rTB<?> rTB2) {
        this.field_220629_c.accept(rTB2);
    }

    private static /* synthetic */ rra_3[] id_class() {
        return new rra_3[]{ORDERED, SHUFFLED};
    }
}

