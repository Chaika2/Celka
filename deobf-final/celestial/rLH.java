package celestial;

public class rLH {
   private rLq_1[] class_ = new rLq_1[128];
   private int break_;

   public boolean byte_() {
      return this.break_ == 0;
   }

   public void class_(rLq_1 var1, float var2) {
      float var3 = var1.catch_;
      var1.catch_ = var2;
      if (var2 < var3) {
         this.class_(var1.protected_);
      } else {
         this.break_(var1.protected_);
      }
   }

   private void class_(int var1) {
      rLq_1 var2 = this.class_[var1];
      float var4 = var2.catch_;

      while (var1 > 0) {
         int var3 = var1 - 1 >> 1;
         rLq_1 var5 = this.class_[var3];
         if (!(var4 < var5.catch_)) {
            break;
         }

         this.class_[var1] = var5;
         var5.protected_ = var1;
         var1 = var3;
      }

      this.class_[var1] = var2;
      var2.protected_ = var1;
   }

   public rLq_1 class_(rLq_1 var1) {
      if (var1.protected_ >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if (this.break_ == this.class_.length) {
            rLq_1[] var2 = new rLq_1[this.break_ << 1];
            System.arraycopy(this.class_, 0, var2, 0, this.break_);
            this.class_ = var2;
         }

         this.class_[this.break_] = var1;
         var1.protected_ = this.break_;
         this.class_(this.break_++);
         return var1;
      }
   }

   public void class_() {
      this.break_ = 0;
   }

   private void break_(int var1) {
      rLq_1 var2 = this.class_[var1];
      float var3 = var2.catch_;

      while (true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if (var4 >= this.break_) {
            break;
         }

         rLq_1 var6 = this.class_[var4];
         float var7 = var6.catch_;
         rLq_1 var8;
         float var9;
         if (var5 >= this.break_) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.class_[var5];
            var9 = var8.catch_;
         }

         if (var7 < var9) {
            if (!(var7 < var3)) {
               break;
            }

            this.class_[var1] = var6;
            var6.protected_ = var1;
            var1 = var4;
         } else {
            if (!(var9 < var3)) {
               break;
            }

            this.class_[var1] = var8;
            var8.protected_ = var1;
            var1 = var5;
         }
      }

      this.class_[var1] = var2;
      var2.protected_ = var1;
   }

   public rLq_1 break_() {
      rLq_1 var1 = this.class_[0];
      this.class_[0] = this.class_[--this.break_];
      this.class_[this.break_] = null;
      if (this.break_ > 0) {
         this.break_(0);
      }

      var1.protected_ = -1;
      return var1;
   }
}
