/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Vi_1;
import celestial.Vu_1;
import java.util.function.BooleanSupplier;

public class VA
extends Vu_1 {
    private final BooleanSupplier id_class;

    public VA(String string, int n, String string2, BooleanSupplier booleanSupplier) {
        super(string, Vi_1.KEYSYM, n, string2);
        this.id_class = booleanSupplier;
    }

    @Override
    public void id_class(boolean bl) {
        if (this.id_class.getAsBoolean()) {
            if (bl) {
                super.id_class(!this.id_protected());
            }
        } else {
            super.id_class(bl);
        }
    }
}

