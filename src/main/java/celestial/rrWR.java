/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWY;
import celestial.rrWo_1;
import java.util.Iterator;

public class rrWR<T> {
    private rrWo_1<T> id_class;
    private rrWo_1<T> id_break;
    private int id_byte;

    public rrWo_1<T> id_byte(rrWo_1<T> rrWo_12) {
        this.id_throws(rrWo_12);
        rrWo_1<T> rrWo_13 = rrWo_12.id_break();
        rrWo_1<T> rrWo_14 = rrWo_12.id_byte();
        if (rrWo_13 != null) {
            rrWo_13.id_break(rrWo_14);
        } else {
            this.id_class = rrWo_14;
        }
        if (rrWo_14 != null) {
            rrWo_14.id_class(rrWo_13);
        } else {
            this.id_break = rrWo_13;
        }
        rrWo_12.id_class((rrWo_1)null);
        rrWo_12.id_break(null);
        rrWo_12.id_class((rrWR)null);
        --this.id_byte;
        return rrWo_12;
    }

    public rrWo_1<T> id_byte() {
        return this.id_break;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<rrWo_1<T>> iterator = this.id_class();
        while (iterator.hasNext()) {
            rrWo_1<T> rrWo_12 = iterator.next();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(rrWo_12.id_class());
        }
        return this.id_byte + " [" + stringBuffer.toString() + "]";
    }

    public void id_class(rrWo_1<T> rrWo_12) {
        this.id_case(rrWo_12);
        if (this.id_throws()) {
            this.id_class = rrWo_12;
            this.id_break = rrWo_12;
        } else {
            rrWo_1<T> rrWo_13 = this.id_class;
            rrWo_12.id_break(rrWo_13);
            rrWo_13.id_class(rrWo_12);
            this.id_class = rrWo_12;
        }
        rrWo_12.id_class(this);
        ++this.id_byte;
    }

    public Iterator<rrWo_1<T>> id_class() {
        return new rrWY(this);
    }

    public boolean id_class(rrWo_1<T> rrWo_12, rrWo_1<T> rrWo_13, rrWo_1<T> rrWo_14) {
        rrWo_1<T> rrWo_15;
        this.id_throws(rrWo_13);
        if (rrWo_14 != null) {
            this.id_throws(rrWo_14);
        }
        for (rrWo_15 = rrWo_13; rrWo_15 != null && rrWo_15 != rrWo_14; rrWo_15 = rrWo_15.id_byte()) {
            if (rrWo_15 != rrWo_12) continue;
            return true;
        }
        if (rrWo_15 != rrWo_14) {
            throw new IllegalArgumentException("Sublist is not linked, from: " + rrWo_13 + ", to: " + rrWo_14);
        }
        return false;
    }

    public void id_class(rrWo_1<T> rrWo_12, rrWo_1<T> rrWo_13) {
        if (rrWo_12 == null) {
            this.id_class(rrWo_13);
        } else if (rrWo_12 == this.id_break) {
            this.id_break(rrWo_13);
        } else {
            this.id_throws(rrWo_12);
            this.id_case(rrWo_13);
            rrWo_1<T> rrWo_14 = rrWo_12.id_byte();
            rrWo_12.id_break(rrWo_13);
            rrWo_13.id_class(rrWo_12);
            rrWo_14.id_class(rrWo_13);
            rrWo_13.id_break(rrWo_14);
            rrWo_13.id_class(this);
            ++this.id_byte;
        }
    }

    public void id_break(rrWo_1<T> rrWo_12, rrWo_1<T> rrWo_13) {
        this.id_byte(rrWo_13);
        this.id_class(rrWo_12, rrWo_13);
    }

    public rrWo_1<T> id_break() {
        return this.id_class;
    }

    public void id_break(rrWo_1<T> rrWo_12) {
        this.id_case(rrWo_12);
        if (this.id_throws()) {
            this.id_class = rrWo_12;
            this.id_break = rrWo_12;
        } else {
            rrWo_1<T> rrWo_13 = this.id_break;
            rrWo_12.id_class(rrWo_13);
            rrWo_13.id_break(rrWo_12);
            this.id_break = rrWo_12;
        }
        rrWo_12.id_class(this);
        ++this.id_byte;
    }

    public boolean id_throws() {
        return this.id_byte <= 0;
    }

    private void id_throws(rrWo_1<T> rrWo_12) {
        if (rrWo_12.id_protected != this) {
            throw new IllegalArgumentException("Node has different parent, node: " + rrWo_12 + ", parent: " + rrWo_12.id_protected + ", this: " + this);
        }
    }

    private void id_case(rrWo_1<T> rrWo_12) {
        if (rrWo_12.id_protected != null) {
            throw new IllegalArgumentException("Node has different parent, node: " + rrWo_12 + ", parent: " + rrWo_12.id_protected + ", this: " + this);
        }
    }

    public int id_protected() {
        return this.id_byte;
    }

    public boolean id_protected(rrWo_1<T> rrWo_12) {
        return rrWo_12.id_protected == this;
    }
}

