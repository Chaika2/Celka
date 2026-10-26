package celestial;

import java.awt.Dimension;

public class rrWz_1 {
   private boolean class_ = false;
   private float break_;
   private float byte_;

   public float byte_() {
      return this.byte_;
   }

   public rrWz_1(boolean var1, float var2, float var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof rrWz_1 var2)) {
         return false;
      } else if (this.class_ != var2.class_) {
         return false;
      } else {
         return this.break_ != var2.break_ ? false : this.byte_ == var2.byte_;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_ ? 1 : 0;
      var1 = var1 * 37 + (int)this.break_;
      return var1 * 37 + (int)this.byte_;
   }

   public Dimension class_(int var1, int var2) {
      return this.class_ ? new Dimension((int)(this.break_ * (float)var1), (int)(this.byte_ * (float)var2)) : new Dimension((int)this.break_, (int)this.byte_);
   }

   public boolean class_() {
      return this.class_;
   }

   public float break_() {
      return this.break_;
   }
}
