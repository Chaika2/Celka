/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJi_1;
import celestial.rrMP;
import celestial.rrki_1;
import celestial.rrxB_2;
import celestial.rrxM_2;
import celestial.rrxr_3;
import java.lang.reflect.Constructor;

public class rrxS_2
implements rrJi_1 {
    private rrxB_2 id_class = null;
    private Class[] id_break = null;
    private boolean id_byte = false;
    private Constructor id_protected = null;

    public boolean id_byte() {
        if (this.id_byte) {
            return this.id_protected != null;
        }
        return this.id_break() != null;
    }

    public rrxS_2(rrxB_2 rrxB_22, Class[] classArray) {
        this.id_class = rrxB_22;
        this.id_break = classArray;
        rrxM_2.id_class(this);
    }

    public Object id_class(Object ... objectArray) {
        return rrxr_3.id_class(this, objectArray);
    }

    @Override
    public void id_class() {
        Constructor constructor = this.id_break();
    }

    private static Constructor id_class(Class clazz, Class[] classArray) {
        Constructor<?>[] constructorArray = clazz.getDeclaredConstructors();
        for (int i = 0; i < constructorArray.length; ++i) {
            Constructor<?> constructor = constructorArray[i];
            Class[] classArray2 = constructor.getParameterTypes();
            if (!rrxr_3.id_class(classArray, classArray2)) continue;
            return constructor;
        }
        return null;
    }

    public Constructor id_break() {
        if (this.id_byte) {
            return this.id_protected;
        }
        this.id_byte = true;
        Class clazz = this.id_class.id_break();
        if (clazz == null) {
            return null;
        }
        try {
            this.id_protected = rrxS_2.id_class(clazz, this.id_break);
            if (this.id_protected == null) {
                rrMP.id_break("(Reflector) Constructor not present: " + clazz.getName() + ", params: " + rrki_1.id_class(this.id_break));
            }
            if (this.id_protected != null) {
                this.id_protected.setAccessible(true);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return this.id_protected;
    }

    public void id_protected() {
        this.id_byte = true;
        this.id_protected = null;
    }
}

