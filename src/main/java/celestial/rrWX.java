/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrWX {
    public static int id_class(float f) {
        return Float.hashCode(f);
    }

    public static int id_class(int n) {
        return n;
    }

    public static int id_class(Object object, Object object2) {
        return 31 * rrWX.id_class(object) + rrWX.id_class(object2);
    }

    public static int id_class(boolean bl) {
        return Boolean.hashCode(bl);
    }

    public static int id_class(Object object) {
        return object == null ? 0 : object.hashCode();
    }

    public static int id_class(int n, float f) {
        return 31 * rrWX.id_class(n) + rrWX.id_class(f);
    }

    public static int id_class(float f, float f2) {
        return 31 * rrWX.id_class(f) + rrWX.id_class(f2);
    }

    public static int id_class(boolean bl, boolean bl2) {
        return 31 * rrWX.id_class(bl) + rrWX.id_class(bl2);
    }

    public static int id_class(int n, Object object) {
        return 31 * rrWX.id_class(n) + rrWX.id_class(object);
    }

    public static int id_class(Object object, boolean bl) {
        return 31 * rrWX.id_class(object) + rrWX.id_class(bl);
    }
}

