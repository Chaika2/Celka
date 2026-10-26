package celestial;

public class rJL extends rJr_1 {
   private final rpq_3 id_class;
   final rpj_3 id_break = rpj_3.id_class();
   Runnable id_byte = () -> {
   };
   final rJY id_protected;
   final rJY id_catch;
   private final rJY id_private;
   private final rJY id_implements;
   long id_finally;
   private final rXu_1 id_extends = new rJA(this, 3);
   private final rXu_1 id_native = new rJn_1(this, 1);

   public rJY id_byte() {
      return this.id_catch;
   }

   public rJL(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rJL(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_continue, var1);
      this.id_class = var3;
      this.id_protected = this.id_break(new rJC(this, this.id_extends, 0, 13, 26));
      this.id_catch = this.id_break(new rJl_1(this, this.id_extends, 1, 33, 26));
      this.id_private = this.id_break(new rJH(this, this.id_extends, 2, 23, 45));
      this.id_implements = this.id_break(new rJy_1(this, this.id_native, 0, 143, 58, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.id_break(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.id_break(new rJY(var2, var6, 8 + var6 * 18, 142));
      }

      this.id_class(this.id_break);
   }

   @Override
   public void id_class(rXu_1 var1) {
      rdn_3 var2 = this.id_protected.id_class();
      rdn_3 var3 = this.id_catch.id_class();
      rdn_3 var4 = this.id_private.id_class();
      rdn_3 var5 = this.id_implements.id_class();
      if (var5.id_class()
         || !var2.id_class()
            && !var3.id_class()
            && this.id_break.id_break() > 0
            && (this.id_break.id_break() < rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS || !var4.id_class())) {
         if (!var4.id_class() && var4.id_break() instanceof rxh_3) {
            rcd_3 var6 = var2.id_class("BlockEntityTag");
            boolean var7 = var6.id_byte("Patterns", 9) && !var2.id_class() && var6.id_protected("Patterns", 10).size() >= 6;
            if (var7) {
               this.id_break.id_class(0);
            } else {
               this.id_break.id_class(((rxh_3)var4.id_break()).id_byte().ordinal());
            }
         }
      } else {
         this.id_implements.id_break(rdn_3.id_break);
         this.id_break.id_class(0);
      }

      this.id_case();
      this.id_native();
   }

   public void id_class(Runnable var1) {
      this.id_byte = var1;
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 == this.id_implements.id_protected) {
            if (!this.id_class(var5, 4, 40, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (var2 != this.id_catch.id_protected && var2 != this.id_protected.id_protected && var2 != this.id_private.id_protected) {
            if (var5.id_break() instanceof rxO_2) {
               if (!this.id_class(var5, this.id_protected.id_protected, this.id_protected.id_protected + 1, false)) {
                  return rdn_3.id_break;
               }
            } else if (var5.id_break() instanceof rxA_2) {
               if (!this.id_class(var5, this.id_catch.id_protected, this.id_catch.id_protected + 1, false)) {
                  return rdn_3.id_break;
               }
            } else if (var5.id_break() instanceof rxh_3) {
               if (!this.id_class(var5, this.id_private.id_protected, this.id_private.id_protected + 1, false)) {
                  return rdn_3.id_break;
               }
            } else if (var2 >= 4 && var2 < 31) {
               if (!this.id_class(var5, 31, 40, false)) {
                  return rdn_3.id_break;
               }
            } else if (var2 >= 31 && var2 < 40 && !this.id_class(var5, 4, 31, false)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 4, 40, false)) {
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

   public int id_class() {
      return this.id_break.id_break();
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class(this.id_class, var1, xu_3.he);
   }

   public rJY id_break() {
      return this.id_protected;
   }

   @Override
   public boolean id_break(rhd_3 var1, int var2) {
      if (var2 > 0 && var2 <= rHE.PATTERN_ITEM_INDEX) {
         this.id_break.id_class(var2);
         this.id_case();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_class.id_class((var2, var3) -> this.id_class(var1, (rYB)var1.id_throws[7], this.id_extends));
   }

   public rJY id_throws() {
      return this.id_implements;
   }

   private void id_case() {
      if (this.id_break.id_break() > 0) {
         rdn_3 var1 = this.id_protected.id_class();
         rdn_3 var2 = this.id_catch.id_class();
         rdn_3 var3 = rdn_3.id_break;
         if (!var1.id_class() && !var2.id_class()) {
            var3 = var1.id_implements();
            var3.id_throws(1);
            rHE var4 = rHE.values()[this.id_break.id_break()];
            rxL_2 var5 = ((rxA_2)var2.id_break()).id_byte();
            rcd_3 var6 = var3.id_class("BlockEntityTag");
            rcy_3 var7;
            if (var6.id_byte("Patterns", 9)) {
               var7 = var6.id_protected("Patterns", 10);
            } else {
               var7 = new rcy_3();
               var6.id_class("Patterns", var7);
            }

            rcd_3 var8 = new rcd_3();
            var8.id_class("Pattern", var4.id_break());
            var8.id_break("Color", var5.id_break());
            var7.add(var8);
         }

         if (!rdn_3.id_break(var3, this.id_implements.id_class())) {
            this.id_implements.id_break(var3);
         }
      }
   }

   public rJY id_protected() {
      return this.id_private;
   }
}
