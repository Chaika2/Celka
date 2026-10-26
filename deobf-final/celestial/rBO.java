package celestial;

import java.util.EnumSet;
import java.util.Random;

public class rBO extends rBk_1 {
   protected final aA_2 class_;
   private double break_;
   private double byte_;
   private double protected_;
   private final double throws_;
   private final rYB case_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.break_, this.byte_, this.protected_, this.throws_);
   }

   public rBO(aA_2 var1, double var2) {
      this.class_ = var1;
      this.throws_ = var2;
      this.case_ = (rYB)var1.throws_[7];
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (this.class_.I_() != null) {
         return false;
      } else if (!this.case_.strictfp_()) {
         return false;
      } else if (!this.class_.Pz()) {
         return false;
      } else if (!this.case_.case_(this.class_.Bs())) {
         return false;
      } else {
         return !this.class_.class_(rXQ.HEAD).class_() ? false : this.catch_();
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.public_().native_();
   }

   protected boolean catch_() {
      rjU_2 var1 = this.private_();
      if (var1 == null) {
         return false;
      } else {
         this.break_ = var1.break_;
         this.byte_ = var1.byte_;
         this.protected_ = var1.protected_;
         return true;
      }
   }

   protected rjU_2 private_() {
      Random var1 = this.class_.Sa();
      rfH_2 var2 = this.class_.Bs();

      for (int var3 = 0; var3 < 10; var3++) {
         rfH_2 var4 = var2.break_(var1.nextInt(20) - 10, var1.nextInt(6) - 3, var1.nextInt(20) - 10);
         if (!this.case_.case_(var4) && this.class_.class_(var4) < 0.0F) {
            return rjU_2.protected_(var4);
         }
      }

      return null;
   }
}
