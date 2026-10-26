/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;

public class rrWx_1 {
    private Object[] id_class;
    private int id_break = 0;

    public rrWx_1(Object object, Object object2, Object object3, Object object4) {
        this(new Object[]{object, object2, object3, object4});
    }

    public rrWx_1(Object object, Object object2, Object object3) {
        this(new Object[]{object, object2, object3});
    }

    public rrWx_1(Object object, Object object2) {
        this(new Object[]{object, object2});
    }

    public rrWx_1(Object[] objectArray) {
        this.id_class = (Object[])objectArray.clone();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof rrWx_1)) {
            return false;
        }
        rrWx_1 rrWx_12 = (rrWx_1)object;
        Object[] objectArray = rrWx_12.id_break();
        if (objectArray.length != this.id_class.length) {
            return false;
        }
        for (int i = 0; i < this.id_class.length; ++i) {
            if (rrWx_1.id_class(this.id_class[i], objectArray[i])) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "[" + rrbb_3.id_class(this.id_class) + "]";
    }

    public int hashCode() {
        if (this.id_break == 0) {
            this.id_break = 7;
            for (int i = 0; i < this.id_class.length; ++i) {
                Object object = this.id_class[i];
                if (object == null) continue;
                this.id_break = 31 * this.id_break + object.hashCode();
            }
        }
        return this.id_break;
    }

    private static boolean id_class(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object == null) {
            return false;
        }
        return object2 == null ? false : object.equals(object2);
    }

    public Object[] id_class() {
        return (Object[])this.id_class.clone();
    }

    private Object[] id_break() {
        return this.id_class;
    }
}

