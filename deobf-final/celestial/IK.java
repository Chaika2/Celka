package celestial;

import java.util.Objects;

public class IK implements Ix_1 {
   private final rqO_2 class_;
   private final rjo_3 break_;
   private final boolean byte_;
   private final int protected_;

   public rqO_2 byte_() {
      return this.class_;
   }

   public IK(rqO_2 var1, rjo_3 var2, boolean var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof IK var2)
            ? false
            : this.class_.equals(var2.class_) && Objects.equals(this.break_, var2.break_) && this.byte_ == var2.byte_ && this.protected_ == var2.protected_;
      }
   }

   @Override
   public String toString() {
      return "Variant{modelLocation=" + this.class_ + ", rotation=" + this.break_ + ", uvLock=" + this.byte_ + ", weight=" + this.protected_ + "}";
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      var1 = 31 * var1 + this.break_.hashCode();
      var1 = 31 * var1 + Boolean.valueOf(this.byte_).hashCode();
      return 31 * var1 + this.protected_;
   }

   @Override
   public rjo_3 class_() {
      return this.break_;
   }

   @Override
   public boolean break_() {
      return this.byte_;
   }

   public int protected_() {
      return this.protected_;
   }
}
