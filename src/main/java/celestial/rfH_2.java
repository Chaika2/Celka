/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.rfT_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rfl_3;
import celestial.rfp_3;
import celestial.rfq_3;
import celestial.rfw_3;
import celestial.rfy_3;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrTj_1;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rfH_2
extends rja_3
implements rrTj_1 {
    public static final Codec<rfH_2> id_byte = Codec.INT_STREAM.comapFlatMap(intStream -> rqR_2.id_class(intStream, 3).map(nArray -> new rfH_2(nArray[0], nArray[1], nArray[2])), rfH_22 -> IntStream.of(rfH_22.b_(), rfH_22.c_(), rfH_22.d_())).stable();
    private static final Logger id_class = LogManager.getLogger();
    public static final rfH_2 id_protected = new rfH_2(0, 0, 0);
    private static final int id_break;
    private static final int id_catch;
    private static final int id_private;
    private static final long id_implements;
    private static final long id_finally;
    private static final long id_extends;
    private static final int id_native;
    private static final int id_volatile;

    public rfH_2 id_byte(double d, double d2, double d3) {
        return d == 0.0 && d2 == 0.0 && d3 == 0.0 ? this : new rfH_2((double)this.b_() + d, (double)this.c_() + d2, (double)this.d_() + d3);
    }

    public rfH_2 id_byte() {
        return this.id_break(rpr_3.WEST);
    }

    public static int id_byte(long l) {
        return (int)(l << 64 - id_native - id_catch >> 64 - id_catch);
    }

    public rfH_2 id_byte(rja_3 rja_32) {
        return this.id_break(-rja_32.b_(), -rja_32.c_(), -rja_32.d_());
    }

    public rfH_2 id_int() {
        return this;
    }

    public rfH_2(an_3 an_32) {
        this(an_32.rx(), an_32.re(), an_32.BO());
    }

    public rfH_2(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public rfH_2(double d, double d2, double d3) {
        super(d, d2, d3);
    }

    public rfH_2(rfl_3 rfl_32) {
        this(rfU_2.id_byte(rfl_32.id_class), rfU_2.id_byte(rfl_32.id_break), rfU_2.id_byte(rfl_32.id_byte));
    }

    public rfH_2(eX_2 eX_22) {
        this(eX_22.id_class(), eX_22.id_break(), eX_22.id_byte());
    }

    public rfH_2(rja_3 rja_32) {
        this(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public rfH_2(rjU_2 rjU_22) {
        this(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    static {
        id_catch = id_break = 1 + rfU_2.id_case(rfU_2.id_byte(30000000));
        id_private = 64 - id_break - id_catch;
        id_implements = (1L << id_break) - 1L;
        id_finally = (1L << id_private) - 1L;
        id_extends = (1L << id_catch) - 1L;
        id_native = id_private;
        id_volatile = id_private + id_catch;
    }

    public rfH_2 id_class(double d, double d2, double d3) {
        return d == 0.0 && d2 == 0.0 && d3 == 0.0 ? this : new rfH_2((double)this.b_() + d, (double)this.c_() + d2, (double)this.d_() + d3);
    }

    public rfH_2 id_class(rpr_3 rpr_32, int n) {
        return n == 0 ? this : new rfH_2(this.b_() + rpr_32.id_implements() * n, this.c_() + rpr_32.id_finally() * n, this.d_() + rpr_32.id_extends() * n);
    }

    public rfH_2 id_class(rpB_2 rpB_22, int n) {
        if (n == 0) {
            return this;
        }
        int n2 = rpB_22 == rpB_2.X ? n : 0;
        int n3 = rpB_22 == rpB_2.Y ? n : 0;
        int n4 = rpB_22 == rpB_2.Z ? n : 0;
        return new rfH_2(this.b_() + n2, this.c_() + n3, this.d_() + n4);
    }

    public rfH_2 id_class(rqd_3 rqd_32) {
        switch (rqd_32) {
            default: {
                return this;
            }
            case CLOCKWISE_90: {
                return new rfH_2(-this.d_(), this.c_(), this.b_());
            }
            case CLOCKWISE_180: {
                return new rfH_2(-this.b_(), this.c_(), -this.d_());
            }
            case COUNTERCLOCKWISE_90: 
        }
        return new rfH_2(this.d_(), this.c_(), -this.b_());
    }

    public static int id_class(long l) {
        return (int)(l << 64 - id_volatile - id_break >> 64 - id_break);
    }

    public static Stream<rfH_2> id_class(rfi_3 rfi_32) {
        return rfH_2.id_class(Math.min(rfi_32.id_class, rfi_32.id_protected), Math.min(rfi_32.id_break, rfi_32.id_throws), Math.min(rfi_32.id_byte, rfi_32.id_case), Math.max(rfi_32.id_class, rfi_32.id_protected), Math.max(rfi_32.id_break, rfi_32.id_throws), Math.max(rfi_32.id_byte, rfi_32.id_case));
    }

    public rfH_2 id_class(int n) {
        return this.id_class(rpr_3.WEST, n);
    }

    public static Iterable<rfH_2> id_class(Random random, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n5 - n2 + 1;
        int n9 = n6 - n3 + 1;
        int n10 = n7 - n4 + 1;
        return () -> new rfy_3(n, n2, random, n8, n3, n9, n4, n10);
    }

    public static Iterable<rfH_2> id_class(rfH_2 rfH_22, int n, int n2, int n3) {
        int n4 = n + n2 + n3;
        int n5 = rfH_22.b_();
        int n6 = rfH_22.c_();
        int n7 = rfH_22.d_();
        return () -> new rfp_3(n7, n4, n, n2, n3, n5, n6);
    }

    public static Optional<rfH_2> id_class(rfH_2 rfH_22, int n, int n2, Predicate<rfH_2> predicate) {
        return rfH_2.id_break(rfH_22, n, n2, n).filter(predicate).findFirst();
    }

    public static Iterable<rfH_2> id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        return rfH_2.id_break(Math.min(rfH_22.b_(), rfH_23.b_()), Math.min(rfH_22.c_(), rfH_23.c_()), Math.min(rfH_22.d_(), rfH_23.d_()), Math.max(rfH_22.b_(), rfH_23.b_()), Math.max(rfH_22.c_(), rfH_23.c_()), Math.max(rfH_22.d_(), rfH_23.d_()));
    }

    public static Stream<rfH_2> id_class(rfl_3 rfl_32) {
        return rfH_2.id_class(rfU_2.id_byte(rfl_32.id_class), rfU_2.id_byte(rfl_32.id_break), rfU_2.id_byte(rfl_32.id_byte), rfU_2.id_byte(rfl_32.id_protected), rfU_2.id_byte(rfl_32.id_throws), rfU_2.id_byte(rfl_32.id_case));
    }

    public static long id_class(long l, int n, int n2, int n3) {
        return rfH_2.id_throws(rfH_2.id_class(l) + n, rfH_2.id_break(l) + n2, rfH_2.id_byte(l) + n3);
    }

    public static Stream<rfH_2> id_class(int n, int n2, int n3, int n4, int n5, int n6) {
        return StreamSupport.stream(rfH_2.id_break(n, n2, n3, n4, n5, n6).spliterator(), false);
    }

    public static long id_class(long l, rpr_3 rpr_32) {
        return rfH_2.id_class(l, rpr_32.id_implements(), rpr_32.id_finally(), rpr_32.id_extends());
    }

    public static Iterable<rfw_3> id_class(rfH_2 rfH_22, int n, rpr_3 rpr_32, rpr_3 rpr_33) {
        Validate.validState((rpr_32.id_final() != rpr_33.id_final() ? 1 : 0) != 0, (String)"The two directions cannot be on the same axis", (Object[])new Object[0]);
        return () -> new rfT_2(rpr_32, rpr_33, rfH_22, n);
    }

    public rfH_2 id_break(rpr_3 rpr_32) {
        return new rfH_2(this.b_() + rpr_32.id_implements(), this.c_() + rpr_32.id_finally(), this.d_() + rpr_32.id_extends());
    }

    public rfH_2 id_break(int n, int n2, int n3) {
        return n == 0 && n2 == 0 && n3 == 0 ? this : new rfH_2(this.b_() + n, this.c_() + n2, this.d_() + n3);
    }

    public static Stream<rfH_2> id_break(rfH_2 rfH_22, rfH_2 rfH_23) {
        return StreamSupport.stream(rfH_2.id_class(rfH_22, rfH_23).spliterator(), false);
    }

    public static Stream<rfH_2> id_break(rfH_2 rfH_22, int n, int n2, int n3) {
        return StreamSupport.stream(rfH_2.id_class(rfH_22, n, n2, n3).spliterator(), false);
    }

    @Override
    public /* synthetic */ rja_3 id_break(rpr_3 rpr_32, int n) {
        return this.id_class(rpr_32, n);
    }

    public static Iterable<rfH_2> id_break(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n4 - n + 1;
        int n8 = n5 - n2 + 1;
        int n9 = n6 - n3 + 1;
        int n10 = n7 * n8 * n9;
        return () -> new rfq_3(n10, n7, n8, n, n2, n3);
    }

    public rfH_2 id_break() {
        return this.id_break(rpr_3.DOWN);
    }

    public rfH_2 id_break(rja_3 rja_32) {
        return this.id_break(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public static int id_break(long l) {
        return (int)(l << 64 - id_private >> 64 - id_private);
    }

    public rfH_2 id_break(int n) {
        return this.id_class(rpr_3.UP, n);
    }

    @Override
    public /* synthetic */ rja_3 id_throws(rja_3 rja_32) {
        return this.id_protected(rja_32);
    }

    public static long id_throws(int n, int n2, int n3) {
        long l = 0L;
        l |= ((long)n & id_implements) << id_volatile;
        return (l |= ((long)n2 & id_finally) << 0) | ((long)n3 & id_extends) << id_native;
    }

    public static long id_throws(long l) {
        return l & 0xFFFFFFFFFFFFFFF0L;
    }

    @Override
    public /* synthetic */ rja_3 id_catch() {
        return this.id_break();
    }

    public rfH_2 id_catch(int n) {
        return this.id_class(rpr_3.DOWN, n);
    }

    public rfH_2 id_extends() {
        return this.id_break(rpr_3.EAST);
    }

    @Override
    public /* synthetic */ rja_3 id_case(int n) {
        return this.id_break(n);
    }

    @Override
    public /* synthetic */ rja_3 id_implements() {
        return this.id_final();
    }

    @Override
    public /* synthetic */ rja_3 id_implements(int n) {
        return this.id_catch(n);
    }

    public rfw_3 id_new() {
        return new rfw_3(this.b_(), this.c_(), this.d_());
    }

    public long id_package() {
        return rfH_2.id_throws(this.b_(), this.c_(), this.d_());
    }

    public static rfH_2 id_protected(long l) {
        return new rfH_2(rfH_2.id_class(l), rfH_2.id_break(l), rfH_2.id_byte(l));
    }

    public rfH_2 id_protected() {
        return this.id_break(rpr_3.SOUTH);
    }

    public rfH_2 id_protected(rja_3 rja_32) {
        return new rfH_2(this.c_() * rja_32.d_() - this.d_() * rja_32.c_(), this.d_() * rja_32.b_() - this.b_() * rja_32.d_(), this.b_() * rja_32.c_() - this.c_() * rja_32.b_());
    }

    public rfH_2 id_private(int n) {
        return this.id_class(rpr_3.SOUTH, n);
    }

    public rfH_2 id_private() {
        return this.id_break(rpr_3.NORTH);
    }

    public rfH_2 id_final() {
        return this.id_break(rpr_3.UP);
    }

    public rfH_2 id_volatile(int n) {
        return this.id_class(rpr_3.EAST, n);
    }

    public rfH_2 id_native(int n) {
        return this.id_class(rpr_3.NORTH, n);
    }
}

