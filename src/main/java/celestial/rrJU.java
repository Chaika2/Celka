/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJa_1;
import celestial.rrMP;
import celestial.rrxB_2;
import java.lang.reflect.Field;

public class rrJU
implements rrJa_1 {
    private rrxB_2 id_class = null;
    private Class id_break = null;
    private int id_byte;

    public rrJU(rrxB_2 rrxB_22, Class clazz) {
        this(rrxB_22, clazz, 0);
    }

    public rrJU(rrxB_2 rrxB_22, Class clazz, int n) {
        this.id_class = rrxB_22;
        this.id_break = clazz;
        this.id_byte = n;
    }

    @Override
    public Field id_class() {
        Class clazz = this.id_class.id_break();
        if (clazz == null) {
            return null;
        }
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            int n = 0;
            for (int i = 0; i < fieldArray.length; ++i) {
                Field field = fieldArray[i];
                if (field.getType() != this.id_break) continue;
                if (n == this.id_byte) {
                    field.setAccessible(true);
                    return field;
                }
                ++n;
            }
            rrMP.id_throws("(Reflector) Field not present: " + clazz.getName() + ".(type: " + this.id_break + ", index: " + this.id_byte + ")");
            return null;
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
            return null;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}

