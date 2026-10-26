package celestial;

import java.util.function.Predicate;

public class ay_3 {
   public static final ay_3 class_ = new ay_3();
   private double break_ = -1.0;
   private boolean byte_;
   private boolean protected_;
   private boolean throws_;
   private boolean case_;
   private boolean catch_ = true;
   private Predicate<iB_2> private_;

   public ay_3 byte_() {
      this.throws_ = true;
      return this;
   }

   public boolean class_(iB_2 var1, iB_2 var2) {
      if (var1 == var2) {
         return false;
      } else if (var2.native_()) {
         return false;
      } else if (!var2.BM()) {
         return false;
      } else if (!this.byte_ && var2.rg()) {
         return false;
      } else if (this.private_ != null && !this.private_.test(var2)) {
         return false;
      } else {
         if (var1 != null) {
            if (!this.case_) {
               if (!var1.catch_(var2)) {
                  return false;
               }

               if (!var1.class_(var2.BC())) {
                  return false;
               }
            }

            if (!this.protected_ && var1.final_(var2)) {
               return false;
            }

            if (this.break_ > 0.0) {
               double var3 = this.catch_ ? var2.goto_(var1) : 1.0;
               double var5 = Math.max(this.break_ * var3, 2.0);
               double var7 = var1.class_(var2.rx(), var2.re(), var2.BO());
               if (var7 > var5 * var5) {
                  return false;
               }
            }

            if (!this.throws_ && var1 instanceof is_3 && !((is_3)var1).goto_().class_(var2)) {
               return false;
            }
         }

         return true;
      }
   }

   public ay_3 class_(Predicate<iB_2> var1) {
      this.private_ = var1;
      return this;
   }

   public ay_3 class_() {
      this.byte_ = true;
      return this;
   }

   public ay_3 class_(double var1) {
      this.break_ = var1;
      return this;
   }

   public ay_3 break_() {
      this.protected_ = true;
      return this;
   }

   public ay_3 throws_() {
      this.catch_ = false;
      return this;
   }

   public ay_3 protected_() {
      this.case_ = true;
      return this;
   }
}
