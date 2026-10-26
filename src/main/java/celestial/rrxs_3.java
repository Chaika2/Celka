/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJD;
import celestial.rrJK;
import celestial.rrJU;
import celestial.rrJa_1;
import celestial.rrJi_1;
import celestial.rrxB_2;
import celestial.rrxM_2;
import celestial.rrxr_3;
import java.lang.reflect.Field;

public class rrxs_3
implements rrJi_1 {
    private rrJa_1 id_class = null;
    private boolean id_break = false;
    private Field id_byte = null;

    public Object id_byte() {
        return rrxr_3.id_class(null, this);
    }

    public rrxs_3(Field field) {
        this(new rrJK(field));
    }

    public rrxs_3(rrJa_1 rrJa_12) {
        this.id_class = rrJa_12;
        rrxM_2.id_class(this);
    }

    public rrxs_3(rrxB_2 rrxB_22, String string) {
        this(new rrJD(rrxB_22, string));
    }

    public rrxs_3(rrxB_2 rrxB_22, Class clazz) {
        this(rrxB_22, clazz, 0);
    }

    public rrxs_3(rrxB_2 rrxB_22, Class clazz, int n) {
        this(new rrJU(rrxB_22, clazz, n));
    }

    public void id_class(Object object, Object object2) {
        rrxr_3.id_class(object, this, object2);
    }

    @Override
    public void id_class() {
        Field field = this.id_break();
    }

    public Object id_class(Object object) {
        return rrxr_3.id_class(object, this);
    }

    public void id_break(Object object) {
        rrxr_3.id_class(null, this, object);
    }

    public Field id_break() {
        if (this.id_break) {
            return this.id_byte;
        }
        this.id_break = true;
        this.id_byte = this.id_class.id_class();
        if (this.id_byte != null) {
            this.id_byte.setAccessible(true);
        }
        return this.id_byte;
    }

    public boolean id_protected() {
        return this.id_break() != null;
    }
}

