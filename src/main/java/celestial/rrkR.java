/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrkY;
import celestial.rrko_1;

public class rrkR
implements rrko_1 {
    private rrkY id_class;
    private rrkY id_break;
    private rrkY id_byte;
    private rrkY id_protected;

    public rrkR(rrkY rrkY2, rrkY rrkY3, rrkY rrkY4, rrkY rrkY5) {
        this.id_class = rrkY2;
        this.id_break = rrkY3;
        this.id_byte = rrkY4;
        this.id_protected = rrkY5;
    }

    @Override
    public int id_class(int n, int n2, int n3, int n4) {
        int n5 = n >> 24 & 0xFF;
        int n6 = n >> 16 & 0xFF;
        int n7 = n >> 8 & 0xFF;
        int n8 = n & 0xFF;
        int n9 = n2 >> 24 & 0xFF;
        int n10 = n2 >> 16 & 0xFF;
        int n11 = n2 >> 8 & 0xFF;
        int n12 = n2 & 0xFF;
        int n13 = n3 >> 24 & 0xFF;
        int n14 = n3 >> 16 & 0xFF;
        int n15 = n3 >> 8 & 0xFF;
        int n16 = n3 & 0xFF;
        int n17 = n4 >> 24 & 0xFF;
        int n18 = n4 >> 16 & 0xFF;
        int n19 = n4 >> 8 & 0xFF;
        int n20 = n4 & 0xFF;
        int n21 = this.id_protected.id_class(n5, n9, n13, n17);
        int n22 = this.id_class.id_class(n6, n10, n14, n18);
        int n23 = this.id_break.id_class(n7, n11, n15, n19);
        int n24 = this.id_byte.id_class(n8, n12, n16, n20);
        return n21 << 24 | n22 << 16 | n23 << 8 | n24;
    }
}

