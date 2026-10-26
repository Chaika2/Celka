package celestial;

public class rnK_2 extends rni_3 {
   private boolean id_byte;
   private boolean id_protected;
   private int id_throws;
   private int id_case;

   public rnK_2(rrEm_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(rfH_2 var1, rZM var2, rpr_3 var3, int var4) {
      if (this.id_protected) {
         this.id_case();
      } else {
         super.id_class(var1, var2, var3, var4);
      }
   }

   @Override
   public ryZ_2 id_class(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4) {
      if (this.id_protected) {
         this.id_case();
         return ryZ_2.PASS;
      } else {
         return super.id_class(var1, var2, var3, var4);
      }
   }

   @Override
   public ryZ_2 id_class(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4, rff_3 var5) {
      if (this.id_protected) {
         this.id_case();
         return ryZ_2.PASS;
      } else {
         return super.id_class(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void id_class() {
      super.id_class();
      this.id_case++;
      long var1 = this.id_class.r();
      long var3 = var1 / 24000L + 1L;
      if (!this.id_byte && this.id_case > 20) {
         this.id_byte = true;
         this.id_break.id_class.id_class(new rZY(rZY.id_case, 0.0F));
      }

      this.id_protected = var1 > 120500L;
      if (this.id_protected) {
         this.id_throws++;
      }

      if (var1 % 24000L == 500L) {
         if (var3 <= 6L) {
            if (var3 == 6L) {
               this.id_break.id_class.id_class(new rZY(rZY.id_case, 104.0F));
            } else {
               this.id_break.id_class(new rgn_3("demo.day." + var3), rqR_2.id_break);
            }
         }
      } else if (var3 == 1L) {
         if (var1 == 100L) {
            this.id_break.id_class.id_class(new rZY(rZY.id_case, 101.0F));
         } else if (var1 == 175L) {
            this.id_break.id_class.id_class(new rZY(rZY.id_case, 102.0F));
         } else if (var1 == 250L) {
            this.id_break.id_class.id_class(new rZY(rZY.id_case, 103.0F));
         }
      } else if (var3 == 5L && var1 % 24000L == 22000L) {
         this.id_break.id_class(new rgn_3("demo.day.warning"), rqR_2.id_break);
      }
   }

   private void id_case() {
      if (this.id_throws > 100) {
         this.id_break.id_class(new rgn_3("demo.reminder"), rqR_2.id_break);
         this.id_throws = 0;
      }
   }
}
