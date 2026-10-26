package celestial;

public class rJT extends rJI<rXk_1> {
   public static final rqO_2 id_class = new rqO_2("textures/atlas/blocks.png");
   public static final rqO_2 id_break = new rqO_2("item/empty_armor_slot_helmet");
   public static final rqO_2 id_byte = new rqO_2("item/empty_armor_slot_chestplate");
   public static final rqO_2 id_protected = new rqO_2("item/empty_armor_slot_leggings");
   public static final rqO_2 id_catch = new rqO_2("item/empty_armor_slot_boots");
   public static final rqO_2 id_private = new rqO_2("item/empty_armor_slot_shield");
   public static final rqO_2[] id_implements = new rqO_2[]{id_catch, id_protected, id_byte, id_break};
   public static final rXQ[] id_finally = new rXQ[]{rXQ.HEAD, rXQ.CHEST, rXQ.LEGS, rXQ.FEET};
   private final rXk_1 id_native = new rXk_1(this, 2, 2);
   private final rXd_1 id_volatile = new rXd_1();
   public final boolean id_extends;
   private final rhd_3 id_final;

   @Override
   public int id_byte() {
      return this.id_native.id_protected();
   }

   public rJT(rhz_3 var1, boolean var2, rhd_3 var3) {
      super((rJP<?>)null, 0);
      this.id_extends = var2;
      this.id_final = var3;
      this.id_break(new rJS(var1.id_throws, this.id_native, this.id_volatile, 0, 154, 28));

      for (int var4 = 0; var4 < 2; var4++) {
         for (int var5 = 0; var5 < 2; var5++) {
            this.id_break(new rJY(this.id_native, var5 + var4 * 2, 98 + var5 * 18, 18 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 4; var6++) {
         rXQ var9 = id_finally[var6];
         this.id_break(new rJt_1(this, var1, 39 - var6, 8, 8 + var6 * 18, var9));
      }

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.id_break(new rJY(var1, var10 + (var7 + 1) * 9, 8 + var10 * 18, 84 + var7 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.id_break(new rJY(var1, var8, 8 + var8 * 18, 142));
      }

      this.id_break(new rJw_1(this, var1, 40, 77, 62));
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         rXQ var6 = is_3.id_finally(var3);
         if (var2 == 0) {
            if (!this.id_class(var5, 9, 45, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (var2 >= 1 && var2 < 5) {
            if (!this.id_class(var5, 9, 45, false)) {
               return rdn_3.id_break;
            }
         } else if (var2 >= 5 && var2 < 9) {
            if (!this.id_class(var5, 9, 45, false)) {
               return rdn_3.id_break;
            }
         } else if (var6.id_class() == rXN.ARMOR && !this.id_throws.get(8 - var6.id_break()).id_break()) {
            int var7 = 8 - var6.id_break();
            if (!this.id_class(var5, var7, var7 + 1, false)) {
               return rdn_3.id_break;
            }
         } else if (var6 == rXQ.OFFHAND && !this.id_throws.get(45).id_break()) {
            if (!this.id_class(var5, 45, 46, false)) {
               return rdn_3.id_break;
            }
         } else if (var2 >= 9 && var2 < 36) {
            if (!this.id_class(var5, 36, 45, false)) {
               return rdn_3.id_break;
            }
         } else if (var2 >= 36 && var2 < 45) {
            if (!this.id_class(var5, 9, 36, false)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 9, 45, false)) {
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

         rdn_3 var8 = var4.id_class(var1, var5);
         if (var2 == 0) {
            var1.id_class(var8, false);
         }
      }

      return var3;
   }

   @Override
   public void id_class() {
      this.id_volatile.id_public();
      this.id_native.id_public();
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return var2.id_byte != this.id_volatile && super.id_class(var1, var2);
   }

   @Override
   public void id_class(rWr_1 var1) {
      this.id_native.id_class(var1);
   }

   @Override
   public boolean id_class(rkw_3<? super rXk_1> var1) {
      return var1.id_class(this.id_native, (rYB)this.id_final.id_throws[7]);
   }

   @Override
   public void id_class(rXu_1 var1) {
      rJa_1.id_class(this.id_case, (rYB)this.id_final.id_throws[7], this.id_final, this.id_native, this.id_volatile);
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return true;
   }

   @Override
   public int id_break() {
      return 0;
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_volatile.id_public();
      if (!((rYB)var1.id_throws[7]).id_continue) {
         this.id_class(var1, (rYB)var1.id_throws[7], this.id_native);
      }
   }

   @Override
   public int id_throws() {
      return 5;
   }

   public rXk_1 id_case() {
      return this.id_native;
   }

   @Override
   public rke_3 id_implements() {
      return rke_3.CRAFTING;
   }

   @Override
   public int id_protected() {
      return this.id_native.id_byte();
   }
}
