/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;

public class rrWJ {
    private int[] id_class;
    private int id_break = 0;

    public rrWJ(int n, int n2, int n3, int n4) {
        this(new int[]{n, n2, n3, n4});
    }

    public rrWJ(int n, int n2, int n3) {
        this(new int[]{n, n2, n3});
    }

    public rrWJ(int n, int n2) {
        this(new int[]{n, n2});
    }

    public rrWJ(int[] nArray) {
        this.id_class = (int[])nArray.clone();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof rrWJ)) {
            return false;
        }
        rrWJ rrWJ2 = (rrWJ)object;
        int[] nArray = rrWJ2.id_break();
        if (nArray.length != this.id_class.length) {
            return false;
        }
        for (int i = 0; i < this.id_class.length; ++i) {
            if (this.id_class[i] == nArray[i]) continue;
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
                int n = this.id_class[i];
                this.id_break = 31 * this.id_break + n;
            }
        }
        return this.id_break;
    }

    public int[] id_class() {
        return (int[])this.id_class.clone();
    }

    private int[] id_break() {
        return this.id_class;
    }
}

