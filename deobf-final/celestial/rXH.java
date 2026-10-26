package celestial;

public abstract class rXH extends rJI<rXu_1> {
   private final rXu_1 break_;
   private final rpF_2 byte_;
   protected final rYB class_;
   private final rkj_3<? extends rkv_3> protected_;
   private final rke_3 catch_;

   @Override
   public int byte_() {
      return 1;
   }

   protected rXH(rJP<?> var1, rkj_3<? extends rkv_3> var2, rke_3 var3, int var4, rhz_3 var5) {
      this(var1, var2, var3, var4, var5, new rXA(3), new rpI_2(4));
   }

   protected rXH(rJP<?> var1, rkj_3<? extends rkv_3> var2, rke_3 var3, int var4, rhz_3 var5, rXu_1 var6, rpF_2 var7) {
      super(var1, var4);
      this.protected_ = var2;
      this.catch_ = var3;
      class_(var6, 3);
      class_(var7, 4);
      this.break_ = var6;
      this.byte_ = var7;
      this.class_ = (rYB)var5.throws_.throws_[7];
      this.break_(new rJY(var6, 0, 56, 17));
      this.break_(new rJh_1(this, var6, 1, 56, 53));
      this.break_(new rJX(var5.throws_, var6, 2, 116, 35));

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var9 = 0; var9 < 9; var9++) {
            this.break_(new rJY(var5, var9 + var8 * 9 + 9, 8 + var9 * 18, 84 + var8 * 18));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.break_(new rJY(var5, var10, 8 + var10 * 18, 142));
      }

      this.class_(var7);
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 == 2) {
            if (!this.class_(var5, 3, 39, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 != 1 && var2 != 0) {
            if (this.class_(var5)) {
               if (!this.class_(var5, 0, 1, false)) {
                  return rdn_3.break_;
               }
            } else if (this.break_(var5)) {
               if (!this.class_(var5, 1, 2, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= 3 && var2 < 30) {
               if (!this.class_(var5, 30, 39, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= 30 && var2 < 39 && !this.class_(var5, 3, 30, false)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 3, 39, false)) {
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

         var4.class_(var1, var5);
      }

      return var3;
   }

   protected boolean class_(rdn_3 var1) {
      return this.class_.implements_().class_(this.protected_, new rXA(var1), this.class_).isPresent();
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return this.break_.byte_(var1);
   }

   @Override
   public void class_(rWr_1 var1) {
      if (this.break_ instanceof rXZ) {
         ((rXZ)this.break_).class_(var1);
      }
   }

   @Override
   public void class_() {
      this.break_.public_();
   }

   @Override
   public boolean class_(rkw_3<? super rXu_1> var1) {
      return var1.class_(this.break_, this.class_);
   }

   @Override
   public void class_(boolean var1, rkw_3<?> var2, rhN_2 var3) {
      new rWG<>(this).class_(var3, var2, var1);
   }

   @Override
   public int break_() {
      return 2;
   }

   protected boolean break_(rdn_3 var1) {
      return rHS.break_(var1);
   }

   @Override
   public int throws_() {
      return 3;
   }

   public int catch_() {
      int var1 = this.byte_.class_(1);
      if (var1 == 0) {
         var1 = 200;
      }

      return this.byte_.class_(0) * 13 / var1;
   }

   public int case_() {
      int var1 = this.byte_.class_(2);
      int var2 = this.byte_.class_(3);
      return var2 != 0 && var1 != 0 ? var1 * 24 / var2 : 0;
   }

   @Override
   public rke_3 implements_() {
      return this.catch_;
   }

   @Override
   public int protected_() {
      return 1;
   }

   public boolean private_() {
      return this.byte_.class_(0) > 0;
   }
}
