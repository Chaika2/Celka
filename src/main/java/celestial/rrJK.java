/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJa_1;
import java.lang.reflect.Field;

public class rrJK
implements rrJa_1 {
    private Field id_class;

    public rrJK(Field field) {
        this.id_class = field;
    }

    @Override
    public Field id_class() {
        return this.id_class;
    }
}

