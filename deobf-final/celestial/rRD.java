package celestial;

import java.util.Comparator;

public class rRD<T> {
   private static long protected_;
   private final T throws_;
   public final rfH_2 class_;
   public final long break_;
   public final rYr_1 byte_;
   private final long case_;

   public rRD(rfH_2 var1, T var2) {
      this(var1, (T)var2, 0L, rYr_1.NORMAL);
   }

   public rRD(rfH_2 var1, T var2, long var3, rYr_1 var5) {
      this.case_ = protected_++;
      this.class_ = var1.int_();
      this.throws_ = (T)var2;
      this.break_ = var3;
      this.byte_ = var5;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof rRD var2) ? false : this.class_.equals(var2.class_) && this.throws_ == var2.throws_;
   }

   @Override
   public String toString() {
      return this.throws_ + ": " + this.class_ + ", " + this.break_ + ", " + this.byte_ + ", " + this.case_;
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   public static <T> Comparator<rRD<T>> class_() {
      return Comparator.<rRD<T>>comparingLong(var0 -> var0.break_).thenComparing(var0 -> var0.byte_).thenComparingLong(var0 -> var0.case_);
   }

   public T break_() {
      return this.throws_;
   }
}
