/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrxB_2;
import celestial.rrxr_3;
import celestial.rrxs_3;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrxb_3 {
    public static rrxs_3 id_byte(Class clazz, Class clazz2) {
        Field field = rrxb_3.id_class(clazz, clazz2);
        if (field == null) {
            return null;
        }
        rrxB_2 rrxB_22 = new rrxB_2(clazz);
        return new rrxs_3(rrxB_22, field.getName());
    }

    private rrxb_3() {
    }

    public static Object id_class(Object object, Class clazz, Class clazz2) {
        rrxs_3 rrxs_32 = rrxb_3.id_byte(clazz, clazz2);
        if (rrxs_32 == null) {
            return null;
        }
        return !rrxs_32.id_protected() ? null : rrxr_3.id_class(object, rrxs_32);
    }

    public static Object id_class(Object object, Class clazz, Class clazz2, int n) {
        rrxs_3 rrxs_32 = rrxb_3.id_break(clazz, clazz2, n);
        if (rrxs_32 == null) {
            return null;
        }
        return !rrxs_32.id_protected() ? null : rrxr_3.id_class(object, rrxs_32);
    }

    public static Field id_class(Class clazz, Field field, Class clazz2, int n) {
        Field[] fieldArray = rrxb_3.id_class(clazz, field, clazz2);
        return n >= 0 && n < fieldArray.length ? fieldArray[n] : null;
    }

    public static boolean id_class(Object object, Class clazz, Class clazz2, Object object2) {
        rrxs_3 rrxs_32 = rrxb_3.id_byte(clazz, clazz2);
        if (rrxs_32 == null) {
            return false;
        }
        return !rrxs_32.id_protected() ? false : rrxr_3.id_class(object, rrxs_32, object2);
    }

    public static boolean id_class(Object object, Class clazz, Class clazz2, int n, Object object2) {
        rrxs_3 rrxs_32 = rrxb_3.id_break(clazz, clazz2, n);
        if (rrxs_32 == null) {
            return false;
        }
        return !rrxs_32.id_protected() ? false : rrxr_3.id_class(object, rrxs_32, object2);
    }

    public static Field id_class(Class clazz, Class clazz2) {
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            for (int i = 0; i < fieldArray.length; ++i) {
                Field field = fieldArray[i];
                if (field.getType() != clazz2) continue;
                field.setAccessible(true);
                return field;
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] id_class(Field[] fieldArray, Class clazz) {
        try {
            ArrayList<Field> arrayList = new ArrayList<Field>();
            for (int i = 0; i < fieldArray.length; ++i) {
                Field field = fieldArray[i];
                if (field.getType() != clazz) continue;
                field.setAccessible(true);
                arrayList.add(field);
            }
            return arrayList.toArray(new Field[arrayList.size()]);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] id_class(Class clazz, Field field, Class clazz2) {
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            List<Field> list = Arrays.asList(fieldArray);
            int n = list.indexOf(field);
            if (n < 0) {
                return new Field[0];
            }
            List<Field> list2 = list.subList(n + 1, list.size());
            Field[] fieldArray2 = list2.toArray(new Field[list2.size()]);
            return rrxb_3.id_class(fieldArray2, clazz2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field id_class(Class clazz, Class clazz2, int n) {
        Field[] fieldArray = rrxb_3.id_break(clazz, clazz2);
        return n >= 0 && n < fieldArray.length ? fieldArray[n] : null;
    }

    public static Field[] id_class(Object object, Field[] fieldArray, Class clazz, Object object2) {
        try {
            ArrayList<Field> arrayList = new ArrayList<Field>();
            for (int i = 0; i < fieldArray.length; ++i) {
                Field field = fieldArray[i];
                if (field.getType() != clazz) continue;
                boolean bl = Modifier.isStatic(field.getModifiers());
                if (object == null && !bl || object != null && bl) continue;
                field.setAccessible(true);
                Object object3 = field.get(object);
                if (object3 == object2) {
                    arrayList.add(field);
                    continue;
                }
                if (object3 == null || object2 == null || !object3.equals(object2)) continue;
                arrayList.add(field);
            }
            return arrayList.toArray(new Field[arrayList.size()]);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] id_break(Class clazz, Class clazz2) {
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            return rrxb_3.id_class(fieldArray, clazz2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static rrxs_3 id_break(Class clazz, Class clazz2, int n) {
        Field field = rrxb_3.id_class(clazz, clazz2, n);
        if (field == null) {
            return null;
        }
        rrxB_2 rrxB_22 = new rrxB_2(clazz);
        return new rrxs_3(rrxB_22, field.getName());
    }
}

