package celestial;

public class rJz_1 extends rJr_1 {
   private final rXu_1 id_class;

   public rJz_1(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(5));
   }

   public rJz_1(int var1, rhz_3 var2, rXu_1 var3) {
      super(rJP.id_int, var1);
      this.id_class = var3;
      id_class(var3, 5);
      var3.b_(var2.id_throws);
      byte var4 = 51;

      for (int var5 = 0; var5 < 5; var5++) {
         this.id_break(new rJY(var3, var5, 44 + var5 * 18, 20));
      }

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.id_break(new rJY(var2, var6 + var7 * 9 + 9, 8 + var6 * 18, var7 * 18 + 51));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.id_break(new rJY(var2, var8, 8 + var8 * 18, 109));
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 < this.id_class.id_else()) {
            if (!this.id_class(var5, this.id_class.id_else(), this.id_throws.size(), true)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 0, this.id_class.id_else(), false)) {
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
      return this.id_class.id_byte(var1);
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_class.id_break(var1);
   }
}
