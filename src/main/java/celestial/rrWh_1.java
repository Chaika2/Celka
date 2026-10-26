/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.ArrayList;

public class rrWh_1 {
    private ArrayList id_class = null;
    private int id_break = 0;
    private float id_byte = 1.0f;
    private int id_protected = 0;

    public boolean id_byte() {
        return this.id_class.isEmpty();
    }

    public rrWh_1() {
        this(10, 0.75f);
    }

    public rrWh_1(int n, float f) {
        this.id_class = new ArrayList(n);
        this.id_break = n;
        this.id_byte = f;
    }

    public rrWh_1(int n) {
        this(n, 0.75f);
    }

    public void id_class() {
        this.id_class.clear();
        this.id_protected = 0;
    }

    public Object id_class(int n) {
        Object e = this.id_class.remove(n);
        if (e != null) {
            --this.id_protected;
        }
        return e;
    }

    public void id_class(int n, Object object) {
        if (object != null) {
            ++this.id_protected;
        }
        this.id_class.add(n, object);
    }

    public boolean id_class(Object object) {
        if (object != null) {
            ++this.id_protected;
        }
        return this.id_class.add(object);
    }

    public boolean id_break(Object object) {
        return this.id_class.contains(object);
    }

    public Object id_break(int n) {
        return this.id_class.get(n);
    }

    public void id_break() {
        float f;
        if (this.id_protected <= 0 && this.id_class.size() <= 0) {
            this.id_class();
        } else if (this.id_class.size() > this.id_break && !((f = (float)this.id_protected * 1.0f / (float)this.id_class.size()) > this.id_byte)) {
            int n;
            int n2 = 0;
            for (n = 0; n < this.id_class.size(); ++n) {
                Object e = this.id_class.get(n);
                if (e == null) continue;
                if (n != n2) {
                    this.id_class.set(n2, e);
                }
                ++n2;
            }
            for (n = this.id_class.size() - 1; n >= n2; --n) {
                this.id_class.remove(n);
            }
        }
    }

    public Object id_break(int n, Object object) {
        Object object2 = this.id_class.set(n, object);
        if (object != object2) {
            if (object2 == null) {
                ++this.id_protected;
            }
            if (object == null) {
                --this.id_protected;
            }
        }
        return object2;
    }

    public int id_throws() {
        return this.id_protected;
    }

    public int id_protected() {
        return this.id_class.size();
    }
}

