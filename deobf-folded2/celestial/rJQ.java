package celestial;

public class rJQ extends rJr_1 {
   private final rXu_1 id_class;
   private final rOD id_break;

   public rJQ(int var1, rhz_3 var2, rXu_1 var3, rOD var4) {
      super((rJP<?>)null, var1);
      this.id_class = var3;
      this.id_break = var4;
      byte var5 = 3;
      var3.b_(var2.id_throws);
      byte var6 = -18;
      this.id_break(new rJN(this, var3, 0, 8, 18, var4));
      this.id_break(new rJc_1(this, var3, 1, 8, 36, var4));
      if (var4 instanceof rOK && ((rOK)var4).sJ()) {
         for (int var7 = 0; var7 < 3; var7++) {
            for (int var8 = 0; var8 < ((rOK)var4).sc(); var8++) {
               this.id_break(new rJY(var3, 2 + var8 + var7 * ((rOK)var4).sc(), 80 + var8 * 18, 18 + var7 * 18));
            }
         }
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var11 = 0; var11 < 9; var11++) {
            this.id_break(new rJY(var2, var11 + var9 * 9 + 9, 8 + var11 * 18, 102 + var9 * 18 + -18));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.id_break(new rJY(var2, var10, 8 + var10 * 18, 142));
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         int var6 = this.id_class.id_else();
         if (var2 < var6) {
            if (!this.id_class(var5, var6, this.id_throws.size(), true)) {
               return rdn_3.id_break;
            }
         } else if (this.id_class(1).id_class(var5) && !this.id_class(1).id_break()) {
            if (!this.id_class(var5, 1, 2, false)) {
               return rdn_3.id_break;
            }
         } else if (this.id_class(0).id_class(var5)) {
            if (!this.id_class(var5, 0, 1, false)) {
               return rdn_3.id_break;
            }
         } else if (var6 <= 2 || !this.id_class(var5, 2, var6, false)) {
            int var7 = var6 + 27;
            int var8 = var7 + 9;
            if (var2 >= var7 && var2 < var8) {
               if (!this.id_class(var5, var6, var7, false)) {
                  return rdn_3.id_break;
               }
            } else if (var2 >= var6 && var2 < var7) {
               if (!this.id_class(var5, var7, var8, false)) {
                  return rdn_3.id_break;
               }
            } else if (!this.id_class(var5, var7, var7, false)) {
               return rdn_3.id_break;
            }

            return rdn_3.id_break;
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         } else {
            var4.id_byte();
         }
      }

      return var3;
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return this.id_class.id_byte(var1) && this.id_break.BM() && this.id_break.id_implements(var1) < 8.0F;
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_class.id_break(var1);
   }
}
