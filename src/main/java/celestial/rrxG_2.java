/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJi_1;
import celestial.rrMP;
import celestial.rrxB_2;
import celestial.rrxM_2;
import celestial.rrxr_3;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class rrxG_2
implements rrJi_1 {
    private rrxB_2 id_class = null;
    private String id_break = null;
    private Class[] id_byte = null;
    private boolean id_protected = false;
    private Method id_throws = null;

    public boolean id_byte() {
        if (this.id_protected) {
            return this.id_throws != null;
        }
        return this.id_break() != null;
    }

    public int id_byte(Object object) {
        return rrxr_3.id_byte(this, object);
    }

    public int id_byte(Object ... objectArray) {
        return rrxr_3.id_byte(this, objectArray);
    }

    public rrxG_2(rrxB_2 rrxB_22, String string) {
        this(rrxB_22, string, null);
    }

    public rrxG_2(rrxB_2 rrxB_22, String string, Class[] classArray) {
        this.id_class = rrxB_22;
        this.id_break = string;
        this.id_byte = classArray;
        rrxM_2.id_class(this);
    }

    public static Method id_class(Class clazz, String string, Class[] classArray) {
        Method[] methodArray = clazz.getDeclaredMethods();
        for (int i = 0; i < methodArray.length; ++i) {
            Class[] classArray2;
            Method method = methodArray[i];
            if (!method.getName().equals(string) || !rrxr_3.id_class(classArray, classArray2 = method.getParameterTypes())) continue;
            return method;
        }
        return null;
    }

    @Override
    public void id_class() {
        Method method = this.id_break();
    }

    public Object id_class(Object object) {
        return rrxr_3.id_private(this, object);
    }

    public static Method[] id_class(Class clazz, String string) {
        ArrayList<Method> arrayList = new ArrayList<Method>();
        Method[] methodArray = clazz.getDeclaredMethods();
        for (int i = 0; i < methodArray.length; ++i) {
            Method method = methodArray[i];
            if (!method.getName().equals(string)) continue;
            arrayList.add(method);
        }
        return arrayList.toArray(new Method[arrayList.size()]);
    }

    public Object id_class(Object ... objectArray) {
        return rrxr_3.id_private(this, objectArray);
    }

    public boolean id_break(Object object) {
        return rrxr_3.id_break(this, object);
    }

    public Method id_break() {
        if (this.id_protected) {
            return this.id_throws;
        }
        this.id_protected = true;
        Class clazz = this.id_class.id_break();
        if (clazz == null) {
            return null;
        }
        try {
            if (this.id_byte == null) {
                Method[] methodArray = rrxG_2.id_class(clazz, this.id_break);
                if (methodArray.length <= 0) {
                    rrMP.id_throws("(Reflector) Method not present: " + clazz.getName() + "." + this.id_break);
                    return null;
                }
                if (methodArray.length > 1) {
                    rrMP.id_byte("(Reflector) More than one method found: " + clazz.getName() + "." + this.id_break);
                    for (int i = 0; i < methodArray.length; ++i) {
                        Method method = methodArray[i];
                        rrMP.id_byte("(Reflector)  - " + method);
                    }
                    return null;
                }
                this.id_throws = methodArray[0];
            } else {
                this.id_throws = rrxG_2.id_class(clazz, this.id_break, this.id_byte);
            }
            if (this.id_throws == null) {
                rrMP.id_throws("(Reflector) Method not present: " + clazz.getName() + "." + this.id_break);
                return null;
            }
            this.id_throws.setAccessible(true);
            return this.id_throws;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public boolean id_break(Object ... objectArray) {
        return rrxr_3.id_break(this, objectArray);
    }

    public double id_throws(Object object) {
        return rrxr_3.id_case(this, object);
    }

    public void id_throws() {
        this.id_protected = true;
        this.id_throws = null;
    }

    public double id_throws(Object ... objectArray) {
        return rrxr_3.id_case(this, objectArray);
    }

    public void id_catch(Object ... objectArray) {
        rrxr_3.id_class(this, objectArray);
    }

    public String id_case(Object ... objectArray) {
        return rrxr_3.id_catch(this, objectArray);
    }

    public String id_case(Object object) {
        return rrxr_3.id_catch(this, object);
    }

    public float id_protected(Object ... objectArray) {
        return rrxr_3.id_throws(this, objectArray);
    }

    public Class id_protected() {
        Method method = this.id_break();
        return method == null ? null : method.getReturnType();
    }

    public float id_protected(Object object) {
        return rrxr_3.id_throws(this, object);
    }
}

