package celestial;

import java.util.List;
import java.util.Random;

public class rJE extends rJr_1 {
   private final rXu_1 protected_ = new rJG(this, 2);
   private final rpq_3 catch_;
   private final Random private_ = new Random();
   private final rpj_3 implements_ = rpj_3.class_();
   public final int[] class_ = new int[3];
   public final int[] break_ = new int[]{-1, -1, -1};
   public final int[] byte_ = new int[]{-1, -1, -1};

   public rJE(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rJE(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.volatile_, var1);
      this.catch_ = var3;
      this.break_(new rJb_1(this, this.protected_, 0, 15, 47));
      this.break_(new rJM(this, this.protected_, 1, 35, 47));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.break_(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.break_(new rJY(var2, var6, 8 + var6 * 18, 142));
      }

      this.class_(rpj_3.class_(this.class_, 0));
      this.class_(rpj_3.class_(this.class_, 1));
      this.class_(rpj_3.class_(this.class_, 2));
      this.class_(this.implements_).class_(var2.throws_.sH());
      this.class_(rpj_3.class_(this.break_, 0));
      this.class_(rpj_3.class_(this.break_, 1));
      this.class_(rpj_3.class_(this.break_, 2));
      this.class_(rpj_3.class_(this.byte_, 0));
      this.class_(rpj_3.class_(this.byte_, 1));
      this.class_(rpj_3.class_(this.byte_, 2));
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return class_(this.catch_, var1, xu_3.SE);
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 == 0) {
            if (!this.class_(var5, 2, 38, true)) {
               return rdn_3.break_;
            }
         } else if (var2 == 1) {
            if (!this.class_(var5, 2, 38, true)) {
               return rdn_3.break_;
            }
         } else if (var5.break_() == rdy_3.XF) {
            if (!this.class_(var5, 1, 2, true)) {
               return rdn_3.break_;
            }
         } else {
            if (this.throws_.get(0).break_() || !this.throws_.get(0).class_(var5)) {
               return rdn_3.break_;
            }

            rdn_3 var6 = var5.implements_();
            var6.throws_(1);
            var5.catch_(1);
            this.throws_.get(0).break_(var6);
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

   @Override
   public void class_(rXu_1 var1) {
      if (var1 == this.protected_) {
         rdn_3 var2 = var1.extends_(0);
         if (!var2.class_() && var2.return_()) {
            this.catch_.class_((var2x, var3x) -> {
               int var4 = 0;

               for (int var5 = -1; var5 <= 1; var5++) {
                  for (int var6 = -1; var6 <= 1; var6++) {
                     if ((var5 != 0 || var6 != 0) && var2x.finally_(var3x.break_(var6, 0, var5)) && var2x.finally_(var3x.break_(var6, 1, var5))) {
                        if (var2x.byte_(var3x.break_(var6 * 2, 0, var5 * 2)).class_(xu_3.rj)) {
                           var4++;
                        }

                        if (var2x.byte_(var3x.break_(var6 * 2, 1, var5 * 2)).class_(xu_3.rj)) {
                           var4++;
                        }

                        if (var6 != 0 && var5 != 0) {
                           if (var2x.byte_(var3x.break_(var6 * 2, 0, var5)).class_(xu_3.rj)) {
                              var4++;
                           }

                           if (var2x.byte_(var3x.break_(var6 * 2, 1, var5)).class_(xu_3.rj)) {
                              var4++;
                           }

                           if (var2x.byte_(var3x.break_(var6, 0, var5 * 2)).class_(xu_3.rj)) {
                              var4++;
                           }

                           if (var2x.byte_(var3x.break_(var6, 1, var5 * 2)).class_(xu_3.rj)) {
                              var4++;
                           }
                        }
                     }
                  }
               }

               this.private_.setSeed((long)this.implements_.break_());

               for (int var8 = 0; var8 < 3; var8++) {
                  this.class_[var8] = eA_2.class_(this.private_, var8, var4, var2);
                  this.break_[var8] = -1;
                  this.byte_[var8] = -1;
                  if (this.class_[var8] < var8 + 1) {
                     this.class_[var8] = 0;
                  }
               }

               for (int var9 = 0; var9 < 3; var9++) {
                  if (this.class_[var9] > 0) {
                     List var10 = this.class_(var2, var9, this.class_[var9]);
                     if (var10 != null && !var10.isEmpty()) {
                        eL_2 var7 = (eL_2)var10.get(this.private_.nextInt(var10.size()));
                        this.break_[var9] = rVL.boolean_.class_(var7.class_);
                        this.byte_[var9] = var7.break_;
                     }
                  }
               }

               this.native_();
            });
         } else {
            for (int var3 = 0; var3 < 3; var3++) {
               this.class_[var3] = 0;
               this.break_[var3] = -1;
               this.byte_[var3] = -1;
            }
         }
      }
   }

   public int class_() {
      rdn_3 var1 = this.protected_.extends_(1);
      return var1.class_() ? 0 : var1.char_();
   }

   private List<eL_2> class_(rdn_3 var1, int var2, int var3) {
      this.private_.setSeed((long)(this.implements_.break_() + var2));
      List var4 = eA_2.break_(this.private_, var1, var3, false);
      if (var1.break_() == rdy_3.XM && var4.size() > 1) {
         var4.remove(this.private_.nextInt(var4.size()));
      }

      return var4;
   }

   public int break_() {
      return this.implements_.break_();
   }

   @Override
   public boolean break_(rhd_3 var1, int var2) {
      rdn_3 var3 = this.protected_.extends_(0);
      rdn_3 var4 = this.protected_.extends_(1);
      int var5 = var2 + 1;
      if ((var4.class_() || var4.char_() < var5) && !((rhx_3)var1.implements_[18]).protected_) {
         return false;
      } else if (this.class_[var2] > 0
         && !var3.class_()
         && ((Integer)var1.implements_[19] >= var5 && (Integer)var1.implements_[19] >= this.class_[var2] || ((rhx_3)var1.implements_[18]).protected_)) {
         this.catch_.class_((var6, var7) -> {
            rdn_3 var8 = var3;
            List var9 = this.class_(var3, var2, this.class_[var2]);
            if (!var9.isEmpty()) {
               var1.break_(var3, var5);
               boolean var10 = var3.break_() == rdy_3.XM;
               if (var10) {
                  var8 = new rdn_3(rdy_3.dm);
                  rcd_3 var11 = var3.package_();
                  if (var11 != null) {
                     var8.byte_(var11.catch_());
                  }

                  this.protected_.break_(0, var8);
               }

               for (int var13 = 0; var13 < var9.size(); var13++) {
                  eL_2 var12 = (eL_2)var9.get(var13);
                  if (var10) {
                     rxy_3.class_(var8, var12);
                  } else {
                     var8.class_(var12.class_, var12.break_);
                  }
               }

               if (!((rhx_3)var1.implements_[18]).protected_) {
                  var4.catch_(var5);
                  if (var4.class_()) {
                     this.protected_.break_(1, rdn_3.break_);
                  }
               }

               var1.break_(rlB_2.k);
               if (var1 instanceof rhN_2) {
                  Oo_1.implements_.class_((rhN_2)var1, var8, var5);
               }

               this.protected_.break_();
               this.implements_.class_(var1.sH());
               this.class_(this.protected_);
               var6.class_((rhd_3)null, var7, rqn_3.BQ, rqL_2.BLOCKS, 1.0F, var6.int_.nextFloat() * 0.1F + 0.9F);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.catch_.class_((var2, var3) -> this.class_(var1, (rYB)var1.throws_[7], this.protected_));
   }
}
