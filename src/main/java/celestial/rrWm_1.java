/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrWm_1<E> {
    private E[] id_class;
    private int id_break;

    public rrWm_1(int n) {
        this.id_class = new Object[n];
    }

    public int id_class() {
        return this.id_break;
    }

    public E id_class(int n) {
        return this.id_class[n];
    }

    public void id_class(E e) {
        this.id_class[this.id_break] = e;
        ++this.id_break;
    }

    public void id_break() {
        this.id_break = 0;
    }
}

