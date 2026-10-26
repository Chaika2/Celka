/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVE;
import celestial.rVM;
import celestial.rVb_1;
import celestial.rXE;
import celestial.rco_3;
import celestial.roJ_2;
import celestial.rrbB_2;
import celestial.rrbE_2;
import celestial.ruu_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.function.Predicate;

public class roQ_2 {
    private static final rVE<xc_3> id_break = new rVb_1<xc_3>(xd_3.id_char, xu_3.id_class.id_continue());
    private final int id_byte;
    private short id_protected;
    private short id_throws;
    private short id_case;
    private final rVM<xc_3> id_catch;
    public static final ThreadLocal<rrbB_2> id_class = new ThreadLocal();

    public boolean id_byte() {
        return this.id_protected == 0;
    }

    public roQ_2(int n) {
        this(n, 0, 0, 0);
    }

    public roQ_2(int n, short s, short s2, short s3) {
        this.id_byte = n;
        this.id_protected = s;
        this.id_throws = s2;
        this.id_case = s3;
        this.id_catch = new rVM<xc_3>(id_break, xd_3.id_char, rco_3::id_byte, rco_3::id_class, xu_3.id_class.id_continue());
    }

    public static boolean id_class(roQ_2 roQ_22) {
        return roQ_22 == roJ_2.id_class || roQ_22.id_byte();
    }

    public xc_3 id_class(int n, int n2, int n3) {
        return this.id_catch.id_class(n, n2, n3);
    }

    public void id_class(ruu_3 ruu_32) {
        this.id_protected = ruu_32.readShort();
        this.id_catch.id_class(ruu_32);
    }

    public boolean id_class(Predicate<xc_3> predicate) {
        return this.id_catch.id_class(predicate);
    }

    public void id_class() {
        this.id_catch.id_class();
    }

    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, boolean bl) {
        xc_3 xc_33 = bl ? this.id_catch.id_class(n, n2, n3, xc_32) : this.id_catch.id_break(n, n2, n3, xc_32);
        rXE rXE2 = xc_33.id_volatile();
        rXE rXE3 = xc_32.id_volatile();
        if (!xc_33.id_catch()) {
            this.id_protected = (short)(this.id_protected - 1);
            if (xc_33.id_final()) {
                this.id_throws = (short)(this.id_throws - 1);
            }
        }
        if (!rXE2.id_byte()) {
            this.id_case = (short)(this.id_case - 1);
        }
        if (!xc_32.id_catch()) {
            this.id_protected = (short)(this.id_protected + 1);
            if (xc_32.id_final()) {
                this.id_throws = (short)(this.id_throws + 1);
            }
        }
        if (!rXE3.id_byte()) {
            this.id_case = (short)(this.id_case + 1);
        }
        return xc_33;
    }

    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32) {
        return this.id_class(n, n2, n3, xc_32, true);
    }

    public rXE id_break(int n, int n2, int n3) {
        return this.id_catch.id_class(n, n2, n3).id_volatile();
    }

    public void id_break() {
        this.id_catch.id_break();
    }

    public void id_break(ruu_3 ruu_32) {
        ruu_32.writeShort(this.id_protected);
        this.id_catch.id_break(ruu_32);
    }

    public boolean id_throws() {
        return this.id_throws > 0;
    }

    public int id_finally() {
        return 2 + this.id_catch.id_byte();
    }

    public int id_catch() {
        return this.id_byte;
    }

    public short id_extends() {
        return this.id_protected;
    }

    public boolean id_case() {
        return this.id_case > 0;
    }

    public rVM<xc_3> id_implements() {
        return this.id_catch;
    }

    public boolean id_protected() {
        return this.id_throws() || this.id_case();
    }

    public void id_private() {
        rrbE_2 rrbE_22;
        int n2;
        rrbE_2[] rrbE_2Array;
        rrbB_2 rrbB_22 = id_class.get();
        if (rrbB_22 != null && (rrbE_2Array = rrbB_22.id_class()) != null && (n2 = this.id_byte >> 4) >= 0 && n2 < rrbE_2Array.length && (rrbE_22 = rrbE_2Array[n2]) != null) {
            this.id_protected = rrbE_22.id_class();
            this.id_throws = rrbE_22.id_break();
            this.id_case = rrbE_22.id_byte();
            rrbE_2Array[n2] = null;
            return;
        }
        this.id_protected = 0;
        this.id_throws = 0;
        this.id_case = 0;
        this.id_catch.id_class((T xc_32, int n) -> {
            rXE rXE2 = xc_32.id_volatile();
            if (!xc_32.id_catch()) {
                this.id_protected = (short)(this.id_protected + n);
                if (xc_32.id_final()) {
                    this.id_throws = (short)(this.id_throws + n);
                }
            }
            if (!rXE2.id_byte()) {
                this.id_protected = (short)(this.id_protected + n);
                if (rXE2.id_case()) {
                    this.id_case = (short)(this.id_case + n);
                }
            }
        });
    }

    public short id_volatile() {
        return this.id_case;
    }

    public short id_native() {
        return this.id_throws;
    }
}

