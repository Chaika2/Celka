package celestial;

public final class rCv_1<T extends Comparable<T>> {
   private final rCZ<T> class_;
   private final T break_;

   rCv_1(rCZ<T> var1, T var2) {
      if (!var1.class_().contains(var2)) {
         throw new IllegalArgumentException("Value " + var2 + " does not belong to property " + var1);
      } else {
         this.class_ = var1;
         this.break_ = (T)var2;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rCv_1 var2) ? false : this.class_ == var2.class_ && this.break_.equals(var2.break_);
      }
   }

   @Override
   public String toString() {
      return this.class_.throws_() + "=" + this.class_.class_(this.break_);
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      return 31 * var1 + this.break_.hashCode();
   }

   public rCZ<T> class_() {
      return this.class_;
   }

   public T break_() {
      return this.break_;
   }
}
