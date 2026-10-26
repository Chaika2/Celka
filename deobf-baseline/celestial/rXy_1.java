package celestial;

public abstract class rXy_1 extends rJr_1 {
   protected final rXd_1 id_class = new rXd_1();
   protected final rXu_1 id_break = new rXp_1(this, 2);
   protected final rpq_3 id_byte;
   protected final rhd_3 id_protected;

   public rXy_1(rJP<?> var1, int var2, rhz_3 var3, rpq_3 var4) {
      super(var1, var2);
      this.id_byte = var4;
      this.id_protected = var3.id_throws;
      this.id_break(new rJY(this.id_break, 0, 27, 47));
      this.id_break(new rJY(this.id_break, 1, 76, 47));
      this.id_break(new rXq_1(this, this.id_class, 2, 134, 47));

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.id_break(new rJY(var3, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.id_break(new rJY(var3, var7, 8 + var7 * 18, 142));
      }
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return this.id_byte
         .id_class(
            (var2, var3) -> !this.id_class(var2.id_byte(var3))
                  ? false
                  : var1.id_class((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5) <= 64.0,
            true
         );
   }

   @Override
   public void id_class(rXu_1 var1) {
      super.id_class(var1);
      if (var1 == this.id_break) {
         this.id_class();
      }
   }

   protected boolean id_class(rdn_3 var1) {
      return false;
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 == 2) {
            if (!this.id_class(var5, 3, 39, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 39) {
               int var6 = this.id_class(var3) ? 1 : 0;
               if (!this.id_class(var5, var6, 2, false)) {
                  return rdn_3.id_break;
               }
            }
         } else if (!this.id_class(var5, 3, 39, false)) {
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

   protected abstract rdn_3 id_class(rhd_3 var1, rdn_3 var2);

   protected abstract boolean id_class(rhd_3 var1, boolean var2);

   public abstract void id_class();

   protected abstract boolean id_class(xc_3 var1);

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_byte.id_class((var2, var3) -> this.id_class(var1, var2, this.id_break));
   }
}
