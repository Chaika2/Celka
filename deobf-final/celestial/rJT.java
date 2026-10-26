package celestial;

public class rJT extends rJI<rXk_1> {
   public static final rqO_2 class_ = new rqO_2("textures/atlas/blocks.png");
   public static final rqO_2 break_ = new rqO_2("item/empty_armor_slot_helmet");
   public static final rqO_2 byte_ = new rqO_2("item/empty_armor_slot_chestplate");
   public static final rqO_2 protected_ = new rqO_2("item/empty_armor_slot_leggings");
   public static final rqO_2 catch_ = new rqO_2("item/empty_armor_slot_boots");
   public static final rqO_2 private_ = new rqO_2("item/empty_armor_slot_shield");
   public static final rqO_2[] implements_ = new rqO_2[]{catch_, protected_, byte_, break_};
   public static final rXQ[] finally_ = new rXQ[]{rXQ.HEAD, rXQ.CHEST, rXQ.LEGS, rXQ.FEET};
   private final rXk_1 native_ = new rXk_1(this, 2, 2);
   private final rXd_1 volatile_ = new rXd_1();
   public final boolean extends_;
   private final rhd_3 final_;

   @Override
   public int byte_() {
      return this.native_.protected_();
   }

   public rJT(rhz_3 var1, boolean var2, rhd_3 var3) {
      super((rJP<?>)null, 0);
      this.extends_ = var2;
      this.final_ = var3;
      this.break_(new rJS(var1.throws_, this.native_, this.volatile_, 0, 154, 28));

      for (int var4 = 0; var4 < 2; var4++) {
         for (int var5 = 0; var5 < 2; var5++) {
            this.break_(new rJY(this.native_, var5 + var4 * 2, 98 + var5 * 18, 18 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 4; var6++) {
         rXQ var9 = finally_[var6];
         this.break_(new rJt_1(this, var1, 39 - var6, 8, 8 + var6 * 18, var9));
      }

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.break_(new rJY(var1, var10 + (var7 + 1) * 9, 8 + var10 * 18, 84 + var7 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.break_(new rJY(var1, var8, 8 + var8 * 18, 142));
      }

      this.break_(new rJw_1(this, var1, 40, 77, 62));
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         rXQ var6 = is_3.finally_(var3);
         if (var2 == 0) {
            if (!this.class_(var5, 9, 45, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 >= 1 && var2 < 5) {
            if (!this.class_(var5, 9, 45, false)) {
               return rdn_3.break_;
            }
         } else if (var2 >= 5 && var2 < 9) {
            if (!this.class_(var5, 9, 45, false)) {
               return rdn_3.break_;
            }
         } else if (var6.class_() == rXN.ARMOR && !this.throws_.get(8 - var6.break_()).break_()) {
            int var7 = 8 - var6.break_();
            if (!this.class_(var5, var7, var7 + 1, false)) {
               return rdn_3.break_;
            }
         } else if (var6 == rXQ.OFFHAND && !this.throws_.get(45).break_()) {
            if (!this.class_(var5, 45, 46, false)) {
               return rdn_3.break_;
            }
         } else if (var2 >= 9 && var2 < 36) {
            if (!this.class_(var5, 36, 45, false)) {
               return rdn_3.break_;
            }
         } else if (var2 >= 36 && var2 < 45) {
            if (!this.class_(var5, 9, 36, false)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 9, 45, false)) {
            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         } else {
            var4.byte_();
         }

         if (var5.char_() == var3.char_()) {
            return rdn_3.break_;
         }

         rdn_3 var8 = var4.class_(var1, var5);
         if (var2 == 0) {
            var1.class_(var8, false);
         }
      }

      return var3;
   }

   @Override
   public void class_() {
      this.volatile_.public_();
      this.native_.public_();
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return var2.byte_ != this.volatile_ && super.class_(var1, var2);
   }

   @Override
   public void class_(rWr_1 var1) {
      this.native_.class_(var1);
   }

   @Override
   public boolean class_(rkw_3<? super rXk_1> var1) {
      return var1.class_(this.native_, (rYB)this.final_.throws_[7]);
   }

   @Override
   public void class_(rXu_1 var1) {
      rJa_1.class_(this.case_, (rYB)this.final_.throws_[7], this.final_, this.native_, this.volatile_);
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return true;
   }

   @Override
   public int break_() {
      return 0;
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.volatile_.public_();
      if (!((rYB)var1.throws_[7]).continue_) {
         this.class_(var1, (rYB)var1.throws_[7], this.native_);
      }
   }

   @Override
   public int throws_() {
      return 5;
   }

   public rXk_1 case_() {
      return this.native_;
   }

   @Override
   public rke_3 implements_() {
      return rke_3.CRAFTING;
   }

   @Override
   public int protected_() {
      return this.native_.byte_();
   }
}
