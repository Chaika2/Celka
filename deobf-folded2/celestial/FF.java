package celestial;

public class FF extends rJr_1 {
   public final rqs_3<rdn_3> id_class = rqs_3.id_class();

   public FF(rhd_3 var1) {
      super((rJP<?>)null, 0);
      rhz_3 var2 = (rhz_3)var1.id_implements[1];

      for (int var3 = 0; var3 < 5; var3++) {
         for (int var4 = 0; var4 < 9; var4++) {
            this.id_break(new FA(Fv_1.id_case, var3 * 9 + var4, 9 + var4 * 18, 18 + var3 * 18));
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         this.id_break(new rJY(var2, var5, 9 + var5 * 18, 112));
      }

      this.id_class(0.0F);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      if (var2 >= this.id_throws.size() - 9 && var2 < this.id_throws.size()) {
         rJY var3 = this.id_throws.get(var2);
         if (var3 != null && var3.id_break()) {
            var3.id_break(rdn_3.id_break);
         }
      }

      return rdn_3.id_break;
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return var2.id_byte != Fv_1.id_case;
   }

   @Override
   public boolean id_class(rJY var1) {
      return var1.id_byte != Fv_1.id_case;
   }

   public boolean id_class() {
      return this.id_class.size() > 45;
   }

   public void id_class(float var1) {
      int var2 = (this.id_class.size() + 9 - 1) / 9 - 5;
      int var3 = (int)((double)(var1 * (float)var2) + 0.5);
      if (var3 < 0) {
         var3 = 0;
      }

      for (int var4 = 0; var4 < 5; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            int var6 = var5 + (var4 + var3) * 9;
            if (var6 >= 0 && var6 < this.id_class.size()) {
               Fv_1.id_case.id_break(var5 + var4 * 9, this.id_class.get(var6));
            } else {
               Fv_1.id_case.id_break(var5 + var4 * 9, rdn_3.id_break);
            }
         }
      }
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return true;
   }
}
