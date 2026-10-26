package celestial;

public class hB_2<T extends hr_3> {
   private final T class_;
   private final OT break_;
   private final String byte_;

   public hB_2(T var1, OT var2, String var3) {
      this.class_ = (T)var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         hB_2 var2 = (hB_2)var1;
         if (!this.class_.equals(var2.class_)) {
            return false;
         } else {
            return !this.break_.equals(var2.break_) ? false : this.byte_.equals(var2.byte_);
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      var1 = 31 * var1 + this.break_.hashCode();
      return 31 * var1 + this.byte_.hashCode();
   }

   public T class_() {
      return this.class_;
   }

   public void class_(hs_3 var1) {
      var1.class_(this.break_, this.byte_);
   }
}
