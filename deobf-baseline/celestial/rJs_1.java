package celestial;

public class rJs_1 extends rJr_1 {
   private final rXu_1 id_class;

   public rJs_1(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(9));
   }

   public rJs_1(int var1, rhz_3 var2, rXu_1 var3) {
      super(rJP.id_catch, var1);
      id_class(var3, 9);
      this.id_class = var3;
      var3.b_(var2.id_throws);

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 3; var5++) {
            this.id_break(new rJY(var3, var5 + var4 * 3, 62 + var5 * 18, 17 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.id_break(new rJY(var2, var8 + var6 * 9 + 9, 8 + var8 * 18, 84 + var6 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.id_break(new rJY(var2, var7, 8 + var7 * 18, 142));
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 < 9) {
            if (!this.id_class(var5, 9, 45, true)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 0, 9, false)) {
            return rdn_3.id_break;
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         } else {
            var4.id_byte();
         }

         if (var5.id_char() == var3.id_char()) {
            return rdn_3.id_break;
         }

         var4.id_class(var1, var5);
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
