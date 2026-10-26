/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJa_1;
import celestial.rrMP;
import celestial.rrxB_2;
import java.lang.reflect.Field;

public class rrJD
implements rrJa_1 {
    private rrxB_2 id_class = null;
    private String id_break = null;

    public rrJD(rrxB_2 rrxB_22, String string) {
        this.id_class = rrxB_22;
        this.id_break = string;
    }

    @Override
    public Field id_class() {
        Class clazz = this.id_class.id_break();
        if (clazz == null) {
            return null;
        }
        try {
            Field field = this.id_class(clazz, this.id_break);
            field.setAccessible(true);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            rrMP.id_throws("(Reflector) Field not present: " + clazz.getName() + "." + this.id_break);
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

    private Field id_class(Class clazz, String string) throws NoSuchFieldException {
        Field[] fieldArray = clazz.getDeclaredFields();
        for (int i = 0; i < fieldArray.length; ++i) {
            Field field = fieldArray[i];
            if (!field.getName().equals(string)) continue;
            return field;
        }
        if (clazz == Object.class) {
            throw new NoSuchFieldException(string);
        }
        return this.id_class(clazz.getSuperclass(), string);
    }
}

