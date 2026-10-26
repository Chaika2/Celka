package celestial;

public class rXR extends rJr_1 {
   private final rpq_3 id_break;
   long id_byte;
   public final rXu_1 id_class = new rXY(this, 2);
   private final rXd_1 id_protected = new rXo_1(this);

   public rXR(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rXR(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_return, var1);
      this.id_break = var3;
      this.id_break(new rXK(this, this.id_class, 0, 15, 15));
      this.id_break(new rXD(this, this.id_class, 1, 15, 52));
      this.id_break(new rXU(this, this.id_protected, 2, 145, 39, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.id_break(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.id_break(new rJY(var2, var6, 8 + var6 * 18, 142));
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         rdb_3 var6 = var5.id_break();
         var3 = var5.id_implements();
         if (var2 == 2) {
            var6.id_break(var5, (rYB)var1.id_throws[7], var1);
            if (!this.id_class(var5, 3, 39, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (var2 != 1 && var2 != 0) {
            if (var6 == rdy_3.JX) {
               if (!this.id_class(var5, 0, 1, false)) {
                  return rdn_3.id_break;
               }
            } else if (var6 != rdy_3.Xb && var6 != rdy_3.dM && var6 != rdy_3.BD) {
               if (var2 >= 3 && var2 < 30) {
                  if (!this.id_class(var5, 30, 39, false)) {
                     return rdn_3.id_break;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.id_class(var5, 3, 30, false)) {
                  return rdn_3.id_break;
               }
            } else if (!this.id_class(var5, 1, 2, false)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 3, 39, false)) {
            return rdn_3.id_break;
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         }

         var4.id_byte();
         if (var5.id_char() == var3.id_char()) {
            return rdn_3.id_break;
         }

         var4.id_class(var1, var5);
         this.id_native();
      }

      return var3;
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return var2.id_byte != this.id_protected && super.id_class(var1, var2);
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class(this.id_break, var1, xu_3.XP);
   }

   @Override
   public void id_class(rXu_1 var1) {
      rdn_3 var2 = this.id_class.id_extends(0);
      rdn_3 var3 = this.id_class.id_extends(1);
      rdn_3 var4 = this.id_protected.id_extends(2);
      if (var4.id_class() || !var2.id_class() && !var3.id_class()) {
         if (!var2.id_class() && !var3.id_class()) {
            this.id_class(var2, var3, var4);
         }
      } else {
         this.id_protected.id_native(2);
      }
   }

   private void id_class(rdn_3 var1, rdn_3 var2, rdn_3 var3) {
      this.id_break.id_class((var4, var5) -> {
         rdb_3 var6 = var2.id_break();
         rrGb_1 var7 = rxI_2.id_class(var1, var4);
         if (var7 != null) {
            rdn_3 var8;
            if (var6 == rdy_3.Xb && !var7.id_private && var7.id_case < 4) {
               var8 = var1.id_implements();
               var8.id_throws(1);
               var8.id_int().id_break("map_scale_direction", 1);
               this.id_native();
            } else if (var6 == rdy_3.BD && !var7.id_private) {
               var8 = var1.id_implements();
               var8.id_throws(1);
               var8.id_int().id_class("map_to_lock", true);
               this.id_native();
            } else {
               if (var6 != rdy_3.dM) {
                  this.id_protected.id_native(2);
                  this.id_native();
                  return;
               }

               var8 = var1.id_implements();
               var8.id_throws(2);
               this.id_native();
            }

            if (!rdn_3.id_break(var8, var3)) {
               this.id_protected.id_break(2, var8);
               this.id_native();
            }
         }
      });
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_protected.id_native(2);
      this.id_break.id_class((var2, var3) -> this.id_class(var1, (rYB)var1.id_throws[7], this.id_class));
   }
}
