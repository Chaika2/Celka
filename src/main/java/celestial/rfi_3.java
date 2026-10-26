/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package celestial;

import celestial.rcL_2;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rpr_3;
import com.google.common.base.MoreObjects;

public class rfi_3 {
    public int id_class;
    public int id_break;
    public int id_byte;
    public int id_protected;
    public int id_throws;
    public int id_case;

    public rja_3 id_byte() {
        return new rja_3(this.id_protected - this.id_class, this.id_throws - this.id_break, this.id_case - this.id_byte);
    }

    public rfi_3(rfi_3 rfi_32) {
        this.id_class = rfi_32.id_class;
        this.id_break = rfi_32.id_break;
        this.id_byte = rfi_32.id_byte;
        this.id_protected = rfi_32.id_protected;
        this.id_throws = rfi_32.id_throws;
        this.id_case = rfi_32.id_case;
    }

    public rfi_3(int n, int n2, int n3, int n4, int n5, int n6) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
        this.id_throws = n5;
        this.id_case = n6;
    }

    public rfi_3(rja_3 rja_32, rja_3 rja_33) {
        this.id_class = Math.min(rja_32.b_(), rja_33.b_());
        this.id_break = Math.min(rja_32.c_(), rja_33.c_());
        this.id_byte = Math.min(rja_32.d_(), rja_33.d_());
        this.id_protected = Math.max(rja_32.b_(), rja_33.b_());
        this.id_throws = Math.max(rja_32.c_(), rja_33.c_());
        this.id_case = Math.max(rja_32.d_(), rja_33.d_());
    }

    public rfi_3(int n, int n2, int n3, int n4) {
        this.id_class = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_case = n4;
        this.id_break = 1;
        this.id_throws = 512;
    }

    public rfi_3(int[] nArray) {
        if (nArray.length == 6) {
            this.id_class = nArray[0];
            this.id_break = nArray[1];
            this.id_byte = nArray[2];
            this.id_protected = nArray[3];
            this.id_throws = nArray[4];
            this.id_case = nArray[5];
        }
    }

    public rfi_3() {
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x0", this.id_class).add("y0", this.id_break).add("z0", this.id_byte).add("x1", this.id_protected).add("y1", this.id_throws).add("z1", this.id_case).toString();
    }

    public boolean id_class(int n, int n2, int n3, int n4) {
        return this.id_protected >= n && this.id_class <= n3 && this.id_case >= n2 && this.id_byte <= n4;
    }

    public void id_class(rja_3 rja_32) {
        this.id_class(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public void id_class(int n, int n2, int n3) {
        this.id_class += n;
        this.id_break += n2;
        this.id_byte += n3;
        this.id_protected += n;
        this.id_throws += n2;
        this.id_case += n3;
    }

    public static rfi_3 id_class(int n, int n2, int n3, int n4, int n5, int n6) {
        return new rfi_3(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6), Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
    }

    public static rfi_3 id_class(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, rpr_3 rpr_32) {
        switch (rpr_32) {
            case NORTH: {
                return new rfi_3(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case SOUTH: {
                return new rfi_3(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case WEST: {
                return new rfi_3(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case EAST: {
                return new rfi_3(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
        }
        return new rfi_3(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
    }

    public static rfi_3 id_class() {
        return new rfi_3(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean id_class(rfi_3 rfi_32) {
        return this.id_protected >= rfi_32.id_class && this.id_class <= rfi_32.id_protected && this.id_case >= rfi_32.id_byte && this.id_byte <= rfi_32.id_case && this.id_throws >= rfi_32.id_break && this.id_break <= rfi_32.id_throws;
    }

    public boolean id_break(rja_3 rja_32) {
        return rja_32.b_() >= this.id_class && rja_32.b_() <= this.id_protected && rja_32.d_() >= this.id_byte && rja_32.d_() <= this.id_case && rja_32.c_() >= this.id_break && rja_32.c_() <= this.id_throws;
    }

    public static rfi_3 id_break() {
        return new rfi_3(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public void id_break(rfi_3 rfi_32) {
        this.id_class = Math.min(this.id_class, rfi_32.id_class);
        this.id_break = Math.min(this.id_break, rfi_32.id_break);
        this.id_byte = Math.min(this.id_byte, rfi_32.id_byte);
        this.id_protected = Math.max(this.id_protected, rfi_32.id_protected);
        this.id_throws = Math.max(this.id_throws, rfi_32.id_throws);
        this.id_case = Math.max(this.id_case, rfi_32.id_case);
    }

    public rfi_3 id_break(int n, int n2, int n3) {
        return new rfi_3(this.id_class + n, this.id_break + n2, this.id_byte + n3, this.id_protected + n, this.id_throws + n2, this.id_case + n3);
    }

    public int id_throws() {
        return this.id_throws - this.id_break + 1;
    }

    public rja_3 id_catch() {
        return new rfH_2(this.id_class + (this.id_protected - this.id_class + 1) / 2, this.id_break + (this.id_throws - this.id_break + 1) / 2, this.id_byte + (this.id_case - this.id_byte + 1) / 2);
    }

    public int id_case() {
        return this.id_case - this.id_byte + 1;
    }

    public int id_protected() {
        return this.id_protected - this.id_class + 1;
    }

    public rcL_2 id_private() {
        return new rcL_2(new int[]{this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case});
    }
}

