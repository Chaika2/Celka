package celestial;

import java.util.function.IntConsumer;
import org.apache.commons.lang3.Validate;

public class ryl_3 {
   private static final int[] class_ = new int[]{
      -1,
      -1,
      0,
      Integer.MIN_VALUE,
      0,
      0,
      1431655765,
      1431655765,
      0,
      Integer.MIN_VALUE,
      0,
      1,
      858993459,
      858993459,
      0,
      715827882,
      715827882,
      0,
      613566756,
      613566756,
      0,
      Integer.MIN_VALUE,
      0,
      2,
      477218588,
      477218588,
      0,
      429496729,
      429496729,
      0,
      390451572,
      390451572,
      0,
      357913941,
      357913941,
      0,
      330382099,
      330382099,
      0,
      306783378,
      306783378,
      0,
      286331153,
      286331153,
      0,
      Integer.MIN_VALUE,
      0,
      3,
      252645135,
      252645135,
      0,
      238609294,
      238609294,
      0,
      226050910,
      226050910,
      0,
      214748364,
      214748364,
      0,
      204522252,
      204522252,
      0,
      195225786,
      195225786,
      0,
      186737708,
      186737708,
      0,
      178956970,
      178956970,
      0,
      171798691,
      171798691,
      0,
      165191049,
      165191049,
      0,
      159072862,
      159072862,
      0,
      153391689,
      153391689,
      0,
      148102320,
      148102320,
      0,
      143165576,
      143165576,
      0,
      138547332,
      138547332,
      0,
      Integer.MIN_VALUE,
      0,
      4,
      130150524,
      130150524,
      0,
      126322567,
      126322567,
      0,
      122713351,
      122713351,
      0,
      119304647,
      119304647,
      0,
      116080197,
      116080197,
      0,
      113025455,
      113025455,
      0,
      110127366,
      110127366,
      0,
      107374182,
      107374182,
      0,
      104755299,
      104755299,
      0,
      102261126,
      102261126,
      0,
      99882960,
      99882960,
      0,
      97612893,
      97612893,
      0,
      95443717,
      95443717,
      0,
      93368854,
      93368854,
      0,
      91382282,
      91382282,
      0,
      89478485,
      89478485,
      0,
      87652393,
      87652393,
      0,
      85899345,
      85899345,
      0,
      84215045,
      84215045,
      0,
      82595524,
      82595524,
      0,
      81037118,
      81037118,
      0,
      79536431,
      79536431,
      0,
      78090314,
      78090314,
      0,
      76695844,
      76695844,
      0,
      75350303,
      75350303,
      0,
      74051160,
      74051160,
      0,
      72796055,
      72796055,
      0,
      71582788,
      71582788,
      0,
      70409299,
      70409299,
      0,
      69273666,
      69273666,
      0,
      68174084,
      68174084,
      0,
      Integer.MIN_VALUE,
      0,
      5
   };
   private final long[] break_;
   private final int byte_;
   private final long protected_;
   private final int throws_;
   private final int case_;
   private final int catch_;
   private final int private_;
   private final int implements_;

   public ryl_3(int var1, int var2) {
      this(var1, var2, (long[])null);
   }

   public ryl_3(int var1, int var2, long[] var3) {
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      this.throws_ = var2;
      this.byte_ = var1;
      this.protected_ = (1L << var1) - 1L;
      this.case_ = (char)(64 / var1);
      int var4 = 3 * (this.case_ - 1);
      this.catch_ = class_[var4 + 0];
      this.private_ = class_[var4 + 1];
      this.implements_ = class_[var4 + 2];
      int var5 = (var2 + this.case_ - 1) / this.case_;
      if (var3 != null) {
         if (var3.length != var5) {
            throw (RuntimeException)rqR_2.byte_(new RuntimeException("Invalid length given for storage, got: " + var3.length + " but expected: " + var5));
         }

         this.break_ = var3;
      } else {
         this.break_ = new long[var5];
      }
   }

   public int class_(int var1) {
      Validate.inclusiveBetween(0L, (long)(this.throws_ - 1), (long)var1);
      int var2 = this.break_(var1);
      long var3 = this.break_[var2];
      int var5 = (var1 - var2 * this.case_) * this.byte_;
      return (int)(var3 >> var5 & this.protected_);
   }

   public void class_(IntConsumer var1) {
      int var2 = 0;

      for (long var6 : this.break_) {
         for (int var8 = 0; var8 < this.case_; var8++) {
            var1.accept((int)(var6 & this.protected_));
            var6 >>= this.byte_;
            if (++var2 >= this.throws_) {
               return;
            }
         }
      }
   }

   public long[] class_() {
      return this.break_;
   }

   public int class_(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.throws_ - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.protected_, (long)var2);
      int var3 = this.break_(var1);
      long var4 = this.break_[var3];
      int var6 = (var1 - var3 * this.case_) * this.byte_;
      int var7 = (int)(var4 >> var6 & this.protected_);
      this.break_[var3] = var4 & ~(this.protected_ << var6) | ((long)var2 & this.protected_) << var6;
      return var7;
   }

   private int break_(int var1) {
      long var2 = Integer.toUnsignedLong(this.catch_);
      long var4 = Integer.toUnsignedLong(this.private_);
      return (int)((long)var1 * var2 + var4 >> 32 >> this.implements_);
   }

   public void break_(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.throws_ - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.protected_, (long)var2);
      int var3 = this.break_(var1);
      long var4 = this.break_[var3];
      int var6 = (var1 - var3 * this.case_) * this.byte_;
      this.break_[var3] = var4 & ~(this.protected_ << var6) | ((long)var2 & this.protected_) << var6;
   }

   public int break_() {
      return this.throws_;
   }
}
