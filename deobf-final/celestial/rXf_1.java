package celestial;

public class rXf_1 extends rJr_1 {
   private final rXu_1 class_;
   private final rpF_2 break_;
   private final rJY byte_;

   public rXf_1(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(5), new rpI_2(2));
   }

   public rXf_1(int var1, rhz_3 var2, rXu_1 var3, rpF_2 var4) {
      super(rJP.extends_, var1);
      class_(var3, 5);
      class_(var4, 2);
      this.class_ = var3;
      this.break_ = var4;
      this.break_(new rXg_1(var3, 0, 56, 51));
      this.break_(new rXg_1(var3, 1, 79, 58));
      this.break_(new rXg_1(var3, 2, 102, 51));
      this.byte_ = this.break_(new rXV(var3, 3, 79, 17));
      this.break_(new rXj_1(var3, 4, 17, 17));
      this.class_(var4);

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.break_(new rJY(var2, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.break_(new rJY(var2, var7, 8 + var7 * 18, 142));
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if ((var2 < 0 || var2 > 2) && var2 != 3 && var2 != 4) {
            if (rXj_1.protected_(var3)) {
               if (this.class_(var5, 4, 5, false) || this.byte_.class_(var5) && !this.class_(var5, 3, 4, false)) {
                  return rdn_3.break_;
               }
            } else if (this.byte_.class_(var5)) {
               if (!this.class_(var5, 3, 4, false)) {
                  return rdn_3.break_;
               }
            } else if (rXg_1.protected_(var3) && var3.char_() == 1) {
               if (!this.class_(var5, 0, 3, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= 5 && var2 < 32) {
               if (!this.class_(var5, 32, 41, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= 32 && var2 < 41) {
               if (!this.class_(var5, 5, 32, false)) {
                  return rdn_3.break_;
               }
            } else if (!this.class_(var5, 5, 41, false)) {
               return rdn_3.break_;
            }
         } else {
            if (!this.class_(var5, 5, 41, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
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

   public int class_() {
      return this.break_.class_(1);
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return this.class_.byte_(var1);
   }

   public int break_() {
      return this.break_.class_(0);
   }
}
