package celestial;

import java.util.EnumSet;

public class rBU extends rBk_1 {
   protected final aA_2 class_;
   protected double break_;
   protected double byte_;
   protected double protected_;
   protected final double throws_;
   protected int case_;
   protected boolean catch_;
   private boolean private_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.break_, this.byte_, this.protected_, this.throws_);
   }

   public rBU(aA_2 var1, double var2, int var4, boolean var5) {
      this.class_ = var1;
      this.throws_ = var2;
      this.case_ = var4;
      this.private_ = var5;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   public rBU(aA_2 var1, double var2, int var4) {
      this(var1, var2, var4, true);
   }

   public rBU(aA_2 var1, double var2) {
      this(var1, var2, 120);
   }

   public void class_(int var1) {
      this.case_ = var1;
   }

   @Override
   public boolean class_() {
      if (this.class_.BP()) {
         return false;
      } else {
         if (!this.catch_) {
            if (this.private_ && this.class_.BI() >= 100) {
               return false;
            }

            if (this.class_.Sa().nextInt(this.case_) != 0) {
               return false;
            }
         }

         rjU_2 var1 = this.catch_();
         if (var1 == null) {
            return false;
         } else {
            this.break_ = var1.break_;
            this.byte_ = var1.byte_;
            this.protected_ = var1.protected_;
            this.catch_ = false;
            return true;
         }
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.public_().native_() && !this.class_.BP();
   }

   protected rjU_2 catch_() {
      return iX_2.class_(this.class_, 10, 7);
   }

   @Override
   public void protected_() {
      this.class_.public_().final_();
      super.protected_();
   }

   public void private_() {
      this.catch_ = true;
   }
}
