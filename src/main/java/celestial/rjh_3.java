/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rjX_2;
import celestial.rja_3;
import celestial.rpr_3;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rjh_3
extends rja_3 {
    public static int id_byte(long l) {
        return (int)(l << 44 >> 44);
    }

    public static int id_byte(short s) {
        return s >>> 4 & 0xF;
    }

    public int id_byte() {
        return this.c_();
    }

    public rfH_2 id_int() {
        int n = 8;
        return this.id_package().id_break(8, 8, 8);
    }

    public rjh_3(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public static int id_class(int n) {
        return n >> 4;
    }

    public static int id_class(short s) {
        return s >>> 8 & 0xF;
    }

    public static Stream<rjh_3> id_class(int n, int n2, int n3, int n4, int n5, int n6) {
        return StreamSupport.stream(new rjX_2((n4 - n + 1) * (n5 - n2 + 1) * (n6 - n3 + 1), 64, n, n2, n3, n4, n5, n6), false);
    }

    public static Stream<rjh_3> id_class(rjh_3 rjh_32, int n) {
        int n2 = rjh_32.id_break();
        int n3 = rjh_32.id_byte();
        int n4 = rjh_32.id_protected();
        return rjh_3.id_class(n2 - n, n3 - n, n4 - n, n2 + n, n3 + n, n4 + n);
    }

    public static long id_class(long l, rpr_3 rpr_32) {
        return rjh_3.id_class(l, rpr_32.id_implements(), rpr_32.id_finally(), rpr_32.id_extends());
    }

    public static rjh_3 id_class(int n, int n2, int n3) {
        return new rjh_3(n, n2, n3);
    }

    public static rjh_3 id_class(rfj_3 rfj_32, int n) {
        return new rjh_3(rfj_32.id_break, n, rfj_32.id_byte);
    }

    public static rjh_3 id_class(an_3 an_32) {
        return new rjh_3(rjh_3.id_class(rfU_2.id_byte(an_32.rx())), rjh_3.id_class(rfU_2.id_byte(an_32.re())), rjh_3.id_class(rfU_2.id_byte(an_32.BO())));
    }

    public static rjh_3 id_class(long l) {
        return new rjh_3(rjh_3.id_break(l), rjh_3.id_byte(l), rjh_3.id_protected(l));
    }

    public static rjh_3 id_class(rfH_2 rfH_22) {
        return new rjh_3(rjh_3.id_class(rfH_22.b_()), rjh_3.id_class(rfH_22.c_()), rjh_3.id_class(rfH_22.d_()));
    }

    public static long id_class(long l, int n, int n2, int n3) {
        return rjh_3.id_break(rjh_3.id_break(l) + n, rjh_3.id_byte(l) + n2, rjh_3.id_protected(l) + n3);
    }

    public static int id_break(int n) {
        return n & 0xF;
    }

    public static int id_break(long l) {
        return (int)(l << 0 >> 42);
    }

    public int id_break() {
        return this.b_();
    }

    public static long id_break(int n, int n2, int n3) {
        long l = 0L;
        l |= ((long)n & 0x3FFFFFL) << 42;
        return (l |= ((long)n2 & 0xFFFFFL) << 0) | ((long)n3 & 0x3FFFFFL) << 20;
    }

    public static int id_break(short s) {
        return s >>> 0 & 0xF;
    }

    public static Stream<rjh_3> id_break(rfj_3 rfj_32, int n) {
        int n2 = rfj_32.id_break;
        int n3 = rfj_32.id_byte;
        return rjh_3.id_class(n2 - n, 0, n3 - n, n2 + n, 15, n3 + n);
    }

    public static short id_break(rfH_2 rfH_22) {
        int n = rjh_3.id_break(rfH_22.b_());
        int n2 = rjh_3.id_break(rfH_22.c_());
        int n3 = rjh_3.id_break(rfH_22.d_());
        return (short)(n << 8 | n3 << 4 | n2 << 0);
    }

    public int id_throws(short s) {
        return this.id_finally() + rjh_3.id_break(s);
    }

    public static long id_throws(long l) {
        return rjh_3.id_break(rjh_3.id_class(rfH_2.id_class(l)), rjh_3.id_class(rfH_2.id_break(l)), rjh_3.id_class(rfH_2.id_byte(l)));
    }

    public int id_finally() {
        return this.id_byte() << 4;
    }

    public static int id_catch(int n) {
        return n << 4;
    }

    public rfH_2 id_catch(short s) {
        return new rfH_2(this.id_protected(s), this.id_throws(s), this.id_case(s));
    }

    public int id_extends() {
        return this.id_protected() << 4;
    }

    public static long id_case(long l) {
        return l & 0xFFFFFFFFFFF00000L;
    }

    public int id_case(short s) {
        return this.id_extends() + rjh_3.id_byte(s);
    }

    public long id_continue() {
        return rjh_3.id_break(this.id_break(), this.id_byte(), this.id_protected());
    }

    public rfj_3 id_new() {
        return new rfj_3(this.id_break(), this.id_protected());
    }

    public rfH_2 id_package() {
        return new rfH_2(rjh_3.id_catch(this.id_break()), rjh_3.id_catch(this.id_byte()), rjh_3.id_catch(this.id_protected()));
    }

    public Stream<rfH_2> id_super() {
        return rfH_2.id_class(this.id_private(), this.id_finally(), this.id_extends(), this.id_native(), this.id_volatile(), this.id_final());
    }

    public int id_protected() {
        return this.d_();
    }

    public int id_protected(short s) {
        return this.id_private() + rjh_3.id_class(s);
    }

    public static int id_protected(long l) {
        return (int)(l << 22 >> 42);
    }

    public int id_private() {
        return this.id_break() << 4;
    }

    public int id_final() {
        return (this.id_protected() << 4) + 15;
    }

    public int id_volatile() {
        return (this.id_byte() << 4) + 15;
    }

    public int id_native() {
        return (this.id_break() << 4) + 15;
    }
}

