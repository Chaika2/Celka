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
   public static final Codec<rfH_2> byte_ = Codec.INT_STREAM
      .comapFlatMap(var0 -> rqR_2.class_(var0, 3).map(var0x -> new rfH_2(var0x[0], var0x[1], var0x[2])), var0 -> IntStream.of(var0.b_(), var0.c_(), var0.d_()))
      .stable();
   private static final Logger class_ = LogManager.getLogger();
   public static final rfH_2 protected_ = new rfH_2(0, 0, 0);
   private static final int break_ = 1 + rfU_2.case_(rfU_2.byte_(30000000));
   private static final int catch_ = break_;
   private static final int private_ = 64 - break_ - catch_;
   private static final long implements_ = (1L << break_) - 1L;
   private static final long finally_ = (1L << private_) - 1L;
   private static final long extends_ = (1L << catch_) - 1L;
   private static final int native_ = private_;
   private static final int volatile_ = private_ + catch_;

   public rfH_2 byte_(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0 ? this : new rfH_2((double)this.b_() + var1, (double)this.c_() + var3, (double)this.d_() + var5);
   }

   public rfH_2 byte_() {
      return this.break_(rpr_3.WEST);
   }

   public static int byte_(long var0) {
      return (int)(var0 << 64 - native_ - catch_ >> 64 - catch_);
   }

   public rfH_2 byte_(rja_3 var1) {
      return this.break_(-var1.b_(), -var1.c_(), -var1.d_());
   }

   public rfH_2 int_() {
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
      this(rfU_2.byte_(var1.class_), rfU_2.byte_(var1.break_), rfU_2.byte_(var1.byte_));
   }

   public rfH_2(eX_2 var1) {
      this(var1.class_(), var1.break_(), var1.byte_());
   }

   public rfH_2(rja_3 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rfH_2(rjU_2 var1) {
      this(var1.break_, var1.byte_, var1.protected_);
   }

   public rfH_2 class_(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0 ? this : new rfH_2((double)this.b_() + var1, (double)this.c_() + var3, (double)this.d_() + var5);
   }

   public rfH_2 class_(rpr_3 var1, int var2) {
      return var2 == 0 ? this : new rfH_2(this.b_() + var1.implements_() * var2, this.c_() + var1.finally_() * var2, this.d_() + var1.extends_() * var2);
   }

   public rfH_2 class_(rpB_2 var1, int var2) {
      if (var2 == 0) {
         return this;
      } else {
         int var3 = var1 == rpB_2.X ? var2 : 0;
         int var4 = var1 == rpB_2.Y ? var2 : 0;
         int var5 = var1 == rpB_2.Z ? var2 : 0;
         return new rfH_2(this.b_() + var3, this.c_() + var4, this.d_() + var5);
      }
   }

   public rfH_2 class_(rqd_3 var1) {
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

   public static int class_(long var0) {
      return (int)(var0 << 64 - volatile_ - break_ >> 64 - break_);
   }

   public static Stream<rfH_2> class_(rfi_3 var0) {
      return class_(
         Math.min(var0.class_, var0.protected_),
         Math.min(var0.break_, var0.throws_),
         Math.min(var0.byte_, var0.case_),
         Math.max(var0.class_, var0.protected_),
         Math.max(var0.break_, var0.throws_),
         Math.max(var0.byte_, var0.case_)
      );
   }

   public rfH_2 class_(int var1) {
      return this.class_(rpr_3.WEST, var1);
   }

   public static Iterable<rfH_2> class_(Random var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var5 - var2 + 1;
      int var9 = var6 - var3 + 1;
      int var10 = var7 - var4 + 1;
      return () -> new rfy_3(var1, var2, var0, var8, var3, var9, var4, var10);
   }

   public static Iterable<rfH_2> class_(rfH_2 var0, int var1, int var2, int var3) {
      int var4 = var1 + var2 + var3;
      int var5 = var0.b_();
      int var6 = var0.c_();
      int var7 = var0.d_();
      return () -> new rfp_3(var7, var4, var1, var2, var3, var5, var6);
   }

   public static Optional<rfH_2> class_(rfH_2 var0, int var1, int var2, Predicate<rfH_2> var3) {
      return break_(var0, var1, var2, var1).filter(var3).findFirst();
   }

   public static Iterable<rfH_2> class_(rfH_2 var0, rfH_2 var1) {
      return break_(
         Math.min(var0.b_(), var1.b_()),
         Math.min(var0.c_(), var1.c_()),
         Math.min(var0.d_(), var1.d_()),
         Math.max(var0.b_(), var1.b_()),
         Math.max(var0.c_(), var1.c_()),
         Math.max(var0.d_(), var1.d_())
      );
   }

   public static Stream<rfH_2> class_(rfl_3 var0) {
      return class_(
         rfU_2.byte_(var0.class_),
         rfU_2.byte_(var0.break_),
         rfU_2.byte_(var0.byte_),
         rfU_2.byte_(var0.protected_),
         rfU_2.byte_(var0.throws_),
         rfU_2.byte_(var0.case_)
      );
   }

   public static long class_(long var0, int var2, int var3, int var4) {
      return throws_(class_(var0) + var2, break_(var0) + var3, byte_(var0) + var4);
   }

   public static Stream<rfH_2> class_(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.stream(break_(var0, var1, var2, var3, var4, var5).spliterator(), false);
   }

   public static long class_(long var0, rpr_3 var2) {
      return class_(var0, var2.implements_(), var2.finally_(), var2.extends_());
   }

   public static Iterable<rfw_3> class_(rfH_2 var0, int var1, rpr_3 var2, rpr_3 var3) {
      Validate.validState(var2.final_() != var3.final_(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new rfT_2(var2, var3, var0, var1);
   }

   public rfH_2 break_(rpr_3 var1) {
      return new rfH_2(this.b_() + var1.implements_(), this.c_() + var1.finally_(), this.d_() + var1.extends_());
   }

   public rfH_2 break_(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new rfH_2(this.b_() + var1, this.c_() + var2, this.d_() + var3);
   }

   public static Stream<rfH_2> break_(rfH_2 var0, rfH_2 var1) {
      return StreamSupport.stream(class_(var0, var1).spliterator(), false);
   }

   public static Stream<rfH_2> break_(rfH_2 var0, int var1, int var2, int var3) {
      return StreamSupport.stream(class_(var0, var1, var2, var3).spliterator(), false);
   }

   public static Iterable<rfH_2> break_(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 - var0 + 1;
      int var7 = var4 - var1 + 1;
      int var8 = var5 - var2 + 1;
      int var9 = var6 * var7 * var8;
      return () -> new rfq_3(var9, var6, var7, var0, var1, var2);
   }

   public rfH_2 break_() {
      return this.break_(rpr_3.DOWN);
   }

   public rfH_2 break_(rja_3 var1) {
      return this.break_(var1.b_(), var1.c_(), var1.d_());
   }

   public static int break_(long var0) {
      return (int)(var0 << 64 - private_ >> 64 - private_);
   }

   public rfH_2 break_(int var1) {
      return this.class_(rpr_3.UP, var1);
   }

   public static long throws_(int var0, int var1, int var2) {
      long var3 = 0L;
      var3 |= ((long)var0 & implements_) << volatile_;
      var3 |= ((long)var1 & finally_) << 0;
      return var3 | ((long)var2 & extends_) << native_;
   }

   public static long throws_(long var0) {
      return var0 & -16L;
   }

   public rfH_2 catch_(int var1) {
      return this.class_(rpr_3.DOWN, var1);
   }

   public rfH_2 extends_() {
      return this.break_(rpr_3.EAST);
   }

   public rfw_3 new_() {
      return new rfw_3(this.b_(), this.c_(), this.d_());
   }

   public long package_() {
      return throws_(this.b_(), this.c_(), this.d_());
   }

   public static rfH_2 protected_(long var0) {
      return new rfH_2(class_(var0), break_(var0), byte_(var0));
   }

   public rfH_2 protected_() {
      return this.break_(rpr_3.SOUTH);
   }

   public rfH_2 protected_(rja_3 var1) {
      return new rfH_2(
         this.c_() * var1.d_() - this.d_() * var1.c_(), this.d_() * var1.b_() - this.b_() * var1.d_(), this.b_() * var1.c_() - this.c_() * var1.b_()
      );
   }

   public rfH_2 private_(int var1) {
      return this.class_(rpr_3.SOUTH, var1);
   }

   public rfH_2 private_() {
      return this.break_(rpr_3.NORTH);
   }

   public rfH_2 final_() {
      return this.break_(rpr_3.UP);
   }

   public rfH_2 volatile_(int var1) {
      return this.class_(rpr_3.EAST, var1);
   }

   public rfH_2 native_(int var1) {
      return this.class_(rpr_3.NORTH, var1);
   }
}
