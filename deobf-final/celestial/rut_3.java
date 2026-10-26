package celestial;

public class rut_3<T> {
   private final int class_;
   private final rmb_3<T> break_;

   public rut_3(int var1, rmb_3<T> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rut_3 var2 = (rut_3)var1;
         return this.class_ == var2.class_;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "<entity data: " + this.class_ + ">";
   }

   @Override
   public int hashCode() {
      return this.class_;
   }

   public int class_() {
      return this.class_;
   }

   public rmb_3<T> break_() {
      return this.break_;
   }
}
