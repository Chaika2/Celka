package celestial;

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

public class rfH_2 extends rja_3 implements rrTj_1 {
   public static final Codec<rfH_2> id_byte = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> rqR_2.id_class(var0, 3).map(var0x -> new rfH_2(var0x[0], var0x[1], var0x[2])), var0 -> IntStream.of(var0.b_(), var0.c_(), var0.d_())
      )
      .stable();
   private static final Logger id_class = LogManager.getLogger();
   public static final rfH_2 id_protected = new rfH_2(0, 0, 0);
   private static final int id_break = 1 + rfU_2.id_case(rfU_2.id_byte(30000000));
   private static final int id_catch = id_break;
   private static final int id_private = 64 - id_break - id_catch;
   private static final long id_implements = (1L << id_break) - 1L;
   private static final long id_finally = (1L << id_private) - 1L;
   private static final long id_extends = (1L << id_catch) - 1L;
   private static final int id_native = id_private;
   private static final int id_volatile = id_private + id_catch;

   public rfH_2 id_byte(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0 ? this : new rfH_2((double)this.b_() + var1, (double)this.c_() + var3, (double)this.d_() + var5);
   }

   public rfH_2 id_byte() {
      return this.id_break(rpr_3.WEST);
   }

   public static int id_byte(long var0) {
      return (int)(var0 << 64 - id_native - id_catch >> 64 - id_catch);
   }

   public rfH_2 id_byte(rja_3 var1) {
      return this.id_break(-var1.b_(), -var1.c_(), -var1.d_());
   }

   public rfH_2 id_int() {
      return this;
   }

   public rfH_2(an_3 var1) {
      this(var1.rx(), var1.re(), var1.BO());
   }

   public rfH_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public rfH_2(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public rfH_2(rfl_3 var1) {
      this(rfU_2.id_byte(var1.id_class), rfU_2.id_byte(var1.id_break), rfU_2.id_byte(var1.id_byte));
   }

   public rfH_2(eX_2 var1) {
      this(var1.id_class(), var1.id_break(), var1.id_byte());
   }

   public rfH_2(rja_3 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rfH_2(rjU_2 var1) {
      this(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public rfH_2 id_class(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0 ? this : new rfH_2((double)this.b_() + var1, (double)this.c_() + var3, (double)this.d_() + var5);
   }

   public rfH_2 id_class(rpr_3 var1, int var2) {
      return var2 == 0 ? this : new rfH_2(this.b_() + var1.id_implements() * var2, this.c_() + var1.id_finally() * var2, this.d_() + var1.id_extends() * var2);
   }

   public rfH_2 id_class(rpB_2 var1, int var2) {
      if (var2 == 0) {
         return this;
      } else {
         int var3 = var1 == rpB_2.X ? var2 : 0;
         int var4 = var1 == rpB_2.Y ? var2 : 0;
         int var5 = var1 == rpB_2.Z ? var2 : 0;
         return new rfH_2(this.b_() + var3, this.c_() + var4, this.d_() + var5);
      }
   }

   public rfH_2 id_class(rqd_3 var1) {
      switch (var1) {
         case NONE:
         default:
            return this;
         case CLOCKWISE_90:
            return new rfH_2(-this.d_(), this.c_(), this.b_());
         case CLOCKWISE_180:
            return new rfH_2(-this.b_(), this.c_(), -this.d_());
         case COUNTERCLOCKWISE_90:
            return new rfH_2(this.d_(), this.c_(), -this.b_());
      }
   }

   public static int id_class(long var0) {
      return (int)(var0 << 64 - id_volatile - id_break >> 64 - id_break);
   }

   public static Stream<rfH_2> id_class(rfi_3 var0) {
      return id_class(
         Math.min(var0.id_class, var0.id_protected),
         Math.min(var0.id_break, var0.id_throws),
         Math.min(var0.id_byte, var0.id_case),
         Math.max(var0.id_class, var0.id_protected),
         Math.max(var0.id_break, var0.id_throws),
         Math.max(var0.id_byte, var0.id_case)
      );
   }

   public rfH_2 id_class(int var1) {
      return this.id_class(rpr_3.WEST, var1);
   }

   public static Iterable<rfH_2> id_class(Random var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var5 - var2 + 1;
      int var9 = var6 - var3 + 1;
      int var10 = var7 - var4 + 1;
      return () -> new rfy_3(var1, var2, var0, var8, var3, var9, var4, var10);
   }

   public static Iterable<rfH_2> id_class(rfH_2 var0, int var1, int var2, int var3) {
      int var4 = var1 + var2 + var3;
      int var5 = var0.b_();
      int var6 = var0.c_();
      int var7 = var0.d_();
      return () -> new rfp_3(var7, var4, var1, var2, var3, var5, var6);
   }

   public static Optional<rfH_2> id_class(rfH_2 var0, int var1, int var2, Predicate<rfH_2> var3) {
      return id_break(var0, var1, var2, var1).filter(var3).findFirst();
   }

   public static Iterable<rfH_2> id_class(rfH_2 var0, rfH_2 var1) {
      return id_break(
         Math.min(var0.b_(), var1.b_()),
         Math.min(var0.c_(), var1.c_()),
         Math.min(var0.d_(), var1.d_()),
         Math.max(var0.b_(), var1.b_()),
         Math.max(var0.c_(), var1.c_()),
         Math.max(var0.d_(), var1.d_())
      );
   }

   public static Stream<rfH_2> id_class(rfl_3 var0) {
      return id_class(
         rfU_2.id_byte(var0.id_class),
         rfU_2.id_byte(var0.id_break),
         rfU_2.id_byte(var0.id_byte),
         rfU_2.id_byte(var0.id_protected),
         rfU_2.id_byte(var0.id_throws),
         rfU_2.id_byte(var0.id_case)
      );
   }

   public static long id_class(long var0, int var2, int var3, int var4) {
      return id_throws(id_class(var0) + var2, id_break(var0) + var3, id_byte(var0) + var4);
   }

   public static Stream<rfH_2> id_class(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.stream(id_break(var0, var1, var2, var3, var4, var5).spliterator(), false);
   }

   public static long id_class(long var0, rpr_3 var2) {
      return id_class(var0, var2.id_implements(), var2.id_finally(), var2.id_extends());
   }

   public static Iterable<rfw_3> id_class(rfH_2 var0, int var1, rpr_3 var2, rpr_3 var3) {
      Validate.validState(var2.id_final() != var3.id_final(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new rfT_2(var2, var3, var0, var1);
   }

   public rfH_2 id_break(rpr_3 var1) {
      return new rfH_2(this.b_() + var1.id_implements(), this.c_() + var1.id_finally(), this.d_() + var1.id_extends());
   }

   public rfH_2 id_break(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new rfH_2(this.b_() + var1, this.c_() + var2, this.d_() + var3);
   }

   public static Stream<rfH_2> id_break(rfH_2 var0, rfH_2 var1) {
      return StreamSupport.stream(id_class(var0, var1).spliterator(), false);
   }

   public static Stream<rfH_2> id_break(rfH_2 var0, int var1, int var2, int var3) {
      return StreamSupport.stream(id_class(var0, var1, var2, var3).spliterator(), false);
   }

   public static Iterable<rfH_2> id_break(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 - var0 + 1;
      int var7 = var4 - var1 + 1;
      int var8 = var5 - var2 + 1;
      int var9 = var6 * var7 * var8;
      return () -> new rfq_3(var9, var6, var7, var0, var1, var2);
   }

   public rfH_2 id_break() {
      return this.id_break(rpr_3.DOWN);
   }

   public rfH_2 id_break(rja_3 var1) {
      return this.id_break(var1.b_(), var1.c_(), var1.d_());
   }

   public static int id_break(long var0) {
      return (int)(var0 << 64 - id_private >> 64 - id_private);
   }

   public rfH_2 id_break(int var1) {
      return this.id_class(rpr_3.UP, var1);
   }

   public static long id_throws(int var0, int var1, int var2) {
      long var3 = 0L;
      var3 |= ((long)var0 & id_implements) << id_volatile;
      var3 |= ((long)var1 & id_finally) << 0;
      return var3 | ((long)var2 & id_extends) << id_native;
   }

   public static long id_throws(long var0) {
      return var0 & -16L;
   }

   public rfH_2 id_catch(int var1) {
      return this.id_class(rpr_3.DOWN, var1);
   }

   public rfH_2 id_extends() {
      return this.id_break(rpr_3.EAST);
   }

   public rfw_3 id_new() {
      return new rfw_3(this.b_(), this.c_(), this.d_());
   }

   public long id_package() {
      return id_throws(this.b_(), this.c_(), this.d_());
   }

   public static rfH_2 id_protected(long var0) {
      return new rfH_2(id_class(var0), id_break(var0), id_byte(var0));
   }

   public rfH_2 id_protected() {
      return this.id_break(rpr_3.SOUTH);
   }

   public rfH_2 id_protected(rja_3 var1) {
      return new rfH_2(
         this.c_() * var1.d_() - this.d_() * var1.c_(), this.d_() * var1.b_() - this.b_() * var1.d_(), this.b_() * var1.c_() - this.c_() * var1.b_()
      );
   }

   public rfH_2 id_private(int var1) {
      return this.id_class(rpr_3.SOUTH, var1);
   }

   public rfH_2 id_private() {
      return this.id_break(rpr_3.NORTH);
   }

   public rfH_2 id_final() {
      return this.id_break(rpr_3.UP);
   }

   public rfH_2 id_volatile(int var1) {
      return this.id_class(rpr_3.EAST, var1);
   }

   public rfH_2 id_native(int var1) {
      return this.id_class(rpr_3.NORTH, var1);
   }
}
