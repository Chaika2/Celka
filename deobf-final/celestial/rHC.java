package celestial;

import java.util.Random;

public class rHC extends rHK {
   private static final Random class_ = new Random();
   private rqs_3<rdn_3> break_ = rqs_3.class_(9, rdn_3.break_);

   protected rHC(ryW_2<?> var1) {
      super(var1);
   }

   public rHC() {
      this(ryW_2.case_);
   }

   @Override
   protected rJr_1 class_(int var1, rhz_3 var2) {
      return new rJs_1(var1, var2, this);
   }

   @Override
   protected void class_(rqs_3<rdn_3> var1) {
      this.break_ = var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.break_ = rqs_3.class_(this.else_(), rdn_3.break_);
      if (!this.break_(var2)) {
         rXC.break_(var2, this.break_);
      }
   }

   public int class_(rdn_3 var1) {
      for (int var2 = 0; var2 < this.break_.size(); var2++) {
         if (this.break_.get(var2).class_()) {
            this.break_(var2, var1);
            return var2;
         }
      }

      return -1;
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (!this.byte_(var1)) {
         rXC.class_(var1, this.break_);
      }

      return var1;
   }

   public int catch_() {
      this.protected_((rhd_3)null);
      int var1 = -1;
      int var2 = 1;

      for (int var3 = 0; var3 < this.break_.size(); var3++) {
         if (!this.break_.get(var3).class_() && class_.nextInt(var2++) == 0) {
            var1 = var3;
         }
      }

      return var1;
   }

   @Override
   public int else_() {
      return 9;
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.break_;
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.dispenser");
   }
}
