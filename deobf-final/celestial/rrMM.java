package celestial;

import java.util.Properties;

public class rrMM {
   private String byte_ = null;
   private rqO_2 protected_ = null;
   private int throws_;
   private int[] case_ = null;
   private rqO_2[] catch_ = null;
   private int[] private_ = null;
   private rrMk_1[] implements_ = null;
   private rrMq_1 finally_ = null;
   private rrMq_1 extends_ = null;
   private boolean native_ = false;
   private rrMH volatile_ = null;
   public int[] class_ = null;
   public int break_ = 1;
   private rrMC[] final_ = null;
   private rxL_2[] package_ = null;
   private Boolean int_ = null;
   private rrMq_1 new_ = null;
   private rrMq_1 continue_ = null;
   private rrMt_1[] super_ = null;

   public rrMM(Properties var1, String var2, rqO_2 var3, int var4, String var5, rrMz_1 var6) {
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var6.private_(var5);
      this.private_ = var6.private_(var1.getProperty("weights." + var4));
      this.implements_ = var6.case_(var1.getProperty("biomes." + var4));
      this.finally_ = var6.native_(var1.getProperty("heights." + var4));
      if (this.finally_ == null) {
         this.finally_ = this.class_(var1, var4);
      }

      String var7 = var1.getProperty("health." + var4);
      if (var7 != null) {
         this.native_ = var7.contains("%");
         var7 = var7.replace("%", "");
         this.extends_ = var6.native_(var7);
      }

      this.volatile_ = var6.break_("name", var1.getProperty("name." + var4));
      this.final_ = var6.final_(var1.getProperty("professions." + var4));
      this.package_ = var6.class_(var1.getProperty("collarColors." + var4), "collar color", rrMz_1.break_);
      this.int_ = var6.volatile_(var1.getProperty("baby." + var4));
      this.new_ = var6.native_(var1.getProperty("moonPhase." + var4));
      this.continue_ = var6.native_(var1.getProperty("dayTime." + var4));
      this.super_ = var6.class_(var1.getProperty("weather." + var4), "weather." + var4, (rrMt_1[])null);
   }

   public rqO_2 class_(rqO_2 var1, int var2) {
      if (this.catch_ != null && this.catch_.length != 0) {
         int var3 = 0;
         if (this.private_ == null) {
            var3 = var2 % this.catch_.length;
         } else {
            int var4 = var2 % this.break_;

            for (int var5 = 0; var5 < this.class_.length; var5++) {
               if (this.class_[var5] > var4) {
                  var3 = var5;
                  break;
               }
            }
         }

         return this.catch_[var3];
      } else {
         return var1;
      }
   }

   public boolean class_(rrbD_2 var1) {
      if (this.implements_ != null && !rrMl_1.class_(var1.byte_(), this.implements_)) {
         return false;
      } else {
         if (this.finally_ != null) {
            rfH_2 var2 = var1.break_();
            if (var2 != null && !this.finally_.class_(var2.c_())) {
               return false;
            }
         }

         if (this.extends_ != null) {
            int var8 = var1.throws_();
            if (this.native_) {
               int var3 = var1.case_();
               if (var3 > 0) {
                  var8 = (int)((double)(var8 * 100) / (double)var3);
               }
            }

            if (!this.extends_.class_(var8)) {
               return false;
            }
         }

         if (this.volatile_ != null) {
            String var9 = var1.protected_();
            if (!this.volatile_.class_(var9)) {
               return false;
            }
         }

         if (this.final_ != null && var1 instanceof rrMG var10 && var10.catch_() instanceof rsq_3 var4) {
            rsp_3 var5 = var4.su();
            rsT_2 var6 = var5.break_();
            int var7 = var5.byte_();
            if (!rrMC.class_(var6, var7, this.final_)) {
               return false;
            }
         }

         if (this.package_ != null && var1 instanceof rrMG var11) {
            an_3 var17 = var11.catch_();
            if (var17 instanceof rOH var22) {
               if (!var22.sZ()) {
                  return false;
               }

               rxL_2 var25 = var22.sx();
               if (!rrbb_3.class_(var25, this.package_)) {
                  return false;
               }
            }

            if (var17 instanceof rbf_3 var23) {
               if (!var23.sZ()) {
                  return false;
               }

               rxL_2 var26 = var23.sd();
               if (!rrbb_3.class_(var26, this.package_)) {
                  return false;
               }
            }
         }

         if (this.int_ != null && var1 instanceof rrMG var12 && var12.catch_() instanceof iB_2 var24 && var24.n_() != this.int_) {
            return false;
         }

         if (this.new_ != null) {
            gm_3 var13 = (gm_3)rrbb_3.X().class_[56];
            if (var13 != null) {
               int var19 = var13.char_();
               if (!this.new_.class_(var19)) {
                  return false;
               }
            }
         }

         if (this.continue_ != null) {
            gm_3 var14 = (gm_3)rrbb_3.X().class_[56];
            if (var14 != null) {
               int var20 = (int)var14.P();
               if (!this.continue_.class_(var20)) {
                  return false;
               }
            }
         }

         if (this.super_ != null) {
            gm_3 var15 = (gm_3)rrbb_3.X().class_[56];
            if (var15 != null) {
               rrMt_1 var21 = rrMt_1.class_(var15, 0.0F);
               if (!rrki_1.class_(this.super_, var21)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean class_(String var1) {
      if (this.case_ == null || this.case_.length == 0) {
         rrbb_3.protected_("Invalid skins for rule: " + this.throws_);
         return false;
      } else if (this.catch_ != null) {
         return true;
      } else {
         this.catch_ = new rqO_2[this.case_.length];
         boolean var2 = this.byte_.startsWith("optifine/mob/");
         rqO_2 var3 = rrME.class_(this.protected_, var2);
         if (var3 == null) {
            rrbb_3.protected_("Invalid path: " + this.protected_.break_());
            return false;
         } else {
            for (int var4 = 0; var4 < this.catch_.length; var4++) {
               int var5 = this.case_[var4];
               if (var5 <= 1) {
                  this.catch_[var4] = this.protected_;
               } else {
                  rqO_2 var6 = rrME.class_(var3, var5);
                  if (var6 == null) {
                     rrbb_3.protected_("Invalid path: " + this.protected_.break_());
                     return false;
                  }

                  if (!rrbb_3.byte_(var6)) {
                     rrbb_3.protected_("Texture not found: " + var6.break_());
                     return false;
                  }

                  this.catch_[var4] = var6;
               }
            }

            if (this.private_ != null) {
               if (this.private_.length > this.catch_.length) {
                  rrbb_3.protected_("More weights defined than skins, trimming weights: " + var1);
                  int[] var7 = new int[this.catch_.length];
                  System.arraycopy(this.private_, 0, var7, 0, var7.length);
                  this.private_ = var7;
               }

               if (this.private_.length < this.catch_.length) {
                  rrbb_3.protected_("Less weights defined than skins, expanding weights: " + var1);
                  int[] var8 = new int[this.catch_.length];
                  System.arraycopy(this.private_, 0, var8, 0, this.private_.length);
                  int var10 = rrWD.class_(this.private_);

                  for (int var12 = this.private_.length; var12 < var8.length; var12++) {
                     var8[var12] = var10;
                  }

                  this.private_ = var8;
               }

               this.class_ = new int[this.private_.length];
               int var9 = 0;

               for (int var11 = 0; var11 < this.private_.length; var11++) {
                  if (this.private_[var11] < 0) {
                     rrbb_3.protected_("Invalid weight: " + this.private_[var11]);
                     return false;
                  }

                  var9 += this.private_[var11];
                  this.class_[var11] = var9;
               }

               this.break_ = var9;
               if (this.break_ <= 0) {
                  rrbb_3.protected_("Invalid sum of all weights: " + var9);
                  this.break_ = 1;
               }
            }

            if (this.final_ == rrMz_1.class_) {
               rrbb_3.protected_("Invalid professions or careers: " + var1);
               return false;
            } else if (this.package_ == rrMz_1.break_) {
               rrbb_3.protected_("Invalid collar colors: " + var1);
               return false;
            } else {
               return true;
            }
         }
      }
   }

   private rrMq_1 class_(Properties var1, int var2) {
      String var3 = var1.getProperty("minHeight." + var2);
      String var4 = var1.getProperty("maxHeight." + var2);
      if (var3 == null && var4 == null) {
         return null;
      } else {
         int var5 = 0;
         if (var3 != null) {
            var5 = rrbb_3.class_(var3, -1);
            if (var5 < 0) {
               rrbb_3.protected_("Invalid minHeight: " + var3);
               return null;
            }
         }

         int var6 = 256;
         if (var4 != null) {
            var6 = rrbb_3.class_(var4, -1);
            if (var6 < 0) {
               rrbb_3.protected_("Invalid maxHeight: " + var4);
               return null;
            }
         }

         if (var6 < 0) {
            rrbb_3.protected_("Invalid minHeight, maxHeight: " + var3 + ", " + var4);
            return null;
         } else {
            rrMq_1 var7 = new rrMq_1();
            var7.class_(new rrMp_1(var5, var6));
            return var7;
         }
      }
   }
}
