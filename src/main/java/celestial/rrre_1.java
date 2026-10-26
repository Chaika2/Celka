/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrre_1 {
    private final int[][] id_class;
    public final int id_break;
    public final int id_byte;
    private final int id_protected;

    public rrre_1(int n, int n2, int n3) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_class = new int[n][n2];
    }

    public void id_class(int n, int n2, int n3, int n4) {
        if (this.id_class(n, n2) == n3) {
            this.id_class(n, n2, n4);
        }
    }

    public int id_class(int n, int n2) {
        return n >= 0 && n < this.id_break && n2 >= 0 && n2 < this.id_byte ? this.id_class[n][n2] : this.id_protected;
    }

    public void id_class(int n, int n2, int n3, int n4, int n5) {
        for (int i = n2; i <= n4; ++i) {
            for (int j = n; j <= n3; ++j) {
                this.id_class(j, i, n5);
            }
        }
    }

    public void id_class(int n, int n2, int n3) {
        if (n >= 0 && n < this.id_break && n2 >= 0 && n2 < this.id_byte) {
            this.id_class[n][n2] = n3;
        }
    }

    public boolean id_break(int n, int n2, int n3) {
        return this.id_class(n - 1, n2) == n3 || this.id_class(n + 1, n2) == n3 || this.id_class(n, n2 + 1) == n3 || this.id_class(n, n2 - 1) == n3;
    }
}

