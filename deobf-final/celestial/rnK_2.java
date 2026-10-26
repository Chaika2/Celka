package celestial;

public class rnK_2 extends rni_3 {
   private boolean byte_;
   private boolean protected_;
   private int throws_;
   private int case_;

   public rnK_2(rrEm_1 var1) {
      super(var1);
   }

   @Override
   public void class_(rfH_2 var1, rZM var2, rpr_3 var3, int var4) {
      if (this.protected_) {
         this.case_();
      } else {
         super.class_(var1, var2, var3, var4);
      }
   }

   @Override
   public ryZ_2 class_(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4) {
      if (this.protected_) {
         this.case_();
         return ryZ_2.PASS;
      } else {
         return super.class_(var1, var2, var3, var4);
      }
   }

   @Override
   public ryZ_2 class_(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4, rff_3 var5) {
      if (this.protected_) {
         this.case_();
         return ryZ_2.PASS;
      } else {
         return super.class_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void class_() {
      super.class_();
      this.case_++;
      long var1 = this.class_.r();
      long var3 = var1 / 24000L + 1L;
      if (!this.byte_ && this.case_ > 20) {
         this.byte_ = true;
         this.break_.class_.class_(new rZY(rZY.case_, 0.0F));
      }

      this.protected_ = var1 > 120500L;
      if (this.protected_) {
         this.throws_++;
      }

      if (var1 % 24000L == 500L) {
         if (var3 <= 6L) {
            if (var3 == 6L) {
               this.break_.class_.class_(new rZY(rZY.case_, 104.0F));
            } else {
               this.break_.class_(new rgn_3("demo.day." + var3), rqR_2.break_);
            }
         }
      } else if (var3 == 1L) {
         if (var1 == 100L) {
            this.break_.class_.class_(new rZY(rZY.case_, 101.0F));
         } else if (var1 == 175L) {
            this.break_.class_.class_(new rZY(rZY.case_, 102.0F));
         } else if (var1 == 250L) {
            this.break_.class_.class_(new rZY(rZY.case_, 103.0F));
         }
      } else if (var3 == 5L && var1 % 24000L == 22000L) {
         this.break_.class_(new rgn_3("demo.day.warning"), rqR_2.break_);
      }
   }

   private void case_() {
      if (this.throws_ > 100) {
         this.break_.class_(new rgn_3("demo.reminder"), rqR_2.break_);
         this.throws_ = 0;
      }
   }
}
