package celestial;

import java.util.Random;

public class rHC extends rHK {
   private static final Random id_class = new Random();
   private rqs_3<rdn_3> id_break = rqs_3.id_class(9, rdn_3.id_break);

   protected rHC(ryW_2<?> var1) {
      super(var1);
   }

   public rHC() {
      this(ryW_2.id_case);
   }

   @Override
   protected rJr_1 id_class(int var1, rhz_3 var2) {
      return new rJs_1(var1, var2, this);
   }

   @Override
   protected void id_class(rqs_3<rdn_3> var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_break = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      if (!this.id_break(var2)) {
         rXC.id_break(var2, this.id_break);
      }
   }

   public int id_class(rdn_3 var1) {
      for (int var2 = 0; var2 < this.id_break.size(); var2++) {
         if (this.id_break.get(var2).id_class()) {
            this.id_break(var2, var1);
            return var2;
         }
      }

      return -1;
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (!this.id_byte(var1)) {
         rXC.id_class(var1, this.id_break);
      }

      return var1;
   }

   public int id_catch() {
      this.id_protected((rhd_3)null);
      int var1 = -1;
      int var2 = 1;

      for (int var3 = 0; var3 < this.id_break.size(); var3++) {
         if (!this.id_break.get(var3).id_class() && id_class.nextInt(var2++) == 0) {
            var1 = var3;
         }
      }

      return var1;
   }

   @Override
   public int id_else() {
      return 9;
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.id_break;
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.dispenser");
   }
}
