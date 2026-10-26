package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class rrbj_3 {
   public String class_ = null;
   private int case_ = -1;
   private int catch_ = -1;
   private int private_ = -1;
   private int implements_ = -1;
   private int finally_ = 1;
   private boolean extends_ = false;
   private float native_ = 1.0F;
   private float[] volatile_;
   private rrMq_1 final_;
   private int package_;
   private boolean int_;
   private boolean new_;
   private boolean continue_;
   public rrMk_1[] break_;
   public rrMq_1 byte_;
   private float super_;
   private rrzO_2 this_;
   public int protected_;
   private rYB else_;
   public static final float[] throws_ = new float[]{1.0F, 0.0F, 0.0F};
   private static final String synchronized_ = "clear";
   private static final String return_ = "rain";
   private static final String public_ = "thunder";

   private int byte_(String var1) {
      if (var1 == null) {
         return -1;
      } else {
         String[] var2 = rrbb_3.class_(var1, ":");
         if (var2.length != 2) {
            rrbb_3.protected_("Invalid time: " + var1);
            return -1;
         } else {
            String var3 = var2[0];
            String var4 = var2[1];
            int var5 = rrbb_3.class_(var3, -1);
            int var6 = rrbb_3.class_(var4, -1);
            if (var5 >= 0 && var5 <= 23 && var6 >= 0 && var6 <= 59) {
               var5 -= 6;
               if (var5 < 0) {
                  var5 += 24;
               }

               return var5 * 1000 + (int)((double)var6 / 60.0 * 1000.0);
            } else {
               rrbb_3.protected_("Invalid time: " + var1);
               return -1;
            }
         }
      }
   }

   public rrbj_3(Properties var1, String var2) {
      this.volatile_ = throws_;
      this.final_ = null;
      this.package_ = 8;
      this.int_ = true;
      this.new_ = false;
      this.continue_ = false;
      this.break_ = null;
      this.byte_ = null;
      this.super_ = 1.0F;
      this.this_ = null;
      this.protected_ = -1;
      this.else_ = null;
      rrMz_1 var3 = new rrMz_1("CustomSky");
      this.class_ = var1.getProperty("source", var2);
      this.case_ = this.byte_(var1.getProperty("startFadeIn"));
      this.catch_ = this.byte_(var1.getProperty("endFadeIn"));
      this.private_ = this.byte_(var1.getProperty("startFadeOut"));
      this.implements_ = this.byte_(var1.getProperty("endFadeOut"));
      this.finally_ = rrxh_3.class_(var1.getProperty("blend"));
      this.extends_ = this.class_(var1.getProperty("rotate"), true);
      this.native_ = this.class_(var1.getProperty("speed"), 1.0F);
      this.volatile_ = this.class_(var1.getProperty("axis"), throws_);
      this.final_ = var3.native_(var1.getProperty("days"));
      this.package_ = var3.class_(var1.getProperty("daysLoop"), 8);
      List var4 = this.break_(var1.getProperty("weather", "clear"));
      this.int_ = var4.contains("clear");
      this.new_ = var4.contains("rain");
      this.continue_ = var4.contains("thunder");
      this.break_ = var3.case_(var1.getProperty("biomes"));
      this.byte_ = var3.native_(var1.getProperty("heights"));
      this.super_ = this.class_(var1.getProperty("transition"), 1.0F);
   }

   @Override
   public String toString() {
      return this.class_ + ", " + this.case_ + "-" + this.catch_ + " " + this.private_ + "-" + this.implements_;
   }

   private void class_(yb_3 var1, int var2) {
      lD_2 var3 = var1.byte_();
      float var4 = (float)(var2 % 3) / 3.0F;
      float var5 = (float)(var2 / 3) / 2.0F;
      var3.class_(7, ju_3.synchronized_);
      var3.class_(-100.0, -100.0, -100.0).class_(var4, var5).class_();
      var3.class_(-100.0, -100.0, 100.0).class_(var4, var5 + 0.5F).class_();
      var3.class_(100.0, -100.0, 100.0).class_(var4 + 0.33333334F, var5 + 0.5F).class_();
      var3.class_(100.0, -100.0, -100.0).class_(var4 + 0.33333334F, var5).class_();
      var1.break_();
   }

   private float class_(float var1, float var2) {
      float var3 = 1.0F - var1;
      float var4 = var1 - var2;
      float var5 = 0.0F;
      if (this.int_) {
         var5 += var3;
      }

      if (this.new_) {
         var5 += var4;
      }

      if (this.continue_) {
         var5 += var2;
      }

      return rrzP_2.class_(var5, 0.0F, 1.0F);
   }

   private float class_(rYB var1) {
      if (this.break_ == null && this.byte_ == null) {
         return 1.0F;
      } else {
         float var2 = this.break_(var1);
         if (this.this_ == null) {
            this.this_ = new rrzO_2(var2, this.super_);
         }

         return this.this_.class_(var2);
      }
   }

   public boolean class_(rYB var1, int var2) {
      if (var1 != this.else_) {
         this.else_ = var1;
         this.this_ = null;
      }

      if (this.class_(var2, this.implements_, this.case_)) {
         return false;
      } else {
         if (this.final_ != null) {
            long var3 = var1.P();
            long var5 = var3 - (long)this.case_;

            while (var5 < 0L) {
               var5 += (long)(24000 * this.package_);
            }

            int var7 = (int)(var5 / 24000L);
            int var8 = var7 % this.package_;
            if (!this.final_.class_(var8)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean class_(int var1, int var2, int var3) {
      return var2 <= var3 ? var1 >= var2 && var1 <= var3 : var1 >= var2 || var1 <= var3;
   }

   private float[] class_(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         String[] var3 = rrbb_3.class_(var1, " ");
         if (var3.length != 3) {
            rrbb_3.protected_("Invalid axis: " + var1);
            return var2;
         } else {
            float[] var4 = new float[3];

            for (int var5 = 0; var5 < var3.length; var5++) {
               var4[var5] = rrbb_3.class_(var3[var5], Float.MIN_VALUE);
               if (var4[var5] == Float.MIN_VALUE) {
                  rrbb_3.protected_("Invalid axis: " + var1);
                  return var2;
               }
            }

            float var8 = var4[0];
            float var6 = var4[1];
            float var7 = var4[2];
            if (var8 * var8 + var6 * var6 + var7 * var7 < 1.0E-5F) {
               rrbb_3.protected_("Invalid axis values: " + var1);
               return var2;
            } else {
               return new float[]{var7, var6, -var8};
            }
         }
      }
   }

   private boolean class_(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      } else if (var1.toLowerCase().equals("true")) {
         return true;
      } else if (var1.toLowerCase().equals("false")) {
         return false;
      } else {
         rrbb_3.protected_("Unknown boolean: " + var1);
         return var2;
      }
   }

   private float class_(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         float var3 = rrbb_3.class_(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            rrbb_3.protected_("Invalid value: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   public boolean class_(String var1) {
      if (this.class_ == null) {
         rrbb_3.protected_("No source texture: " + var1);
         return false;
      } else {
         this.class_ = rrzJ_2.class_(this.class_, rrzJ_2.class_(var1));
         if (this.case_ >= 0 && this.catch_ >= 0 && this.implements_ >= 0) {
            int var2 = this.class_(this.catch_ - this.case_);
            if (this.private_ < 0) {
               this.private_ = this.class_(this.implements_ - var2);
               if (this.class_(this.private_, this.case_, this.catch_)) {
                  this.private_ = this.catch_;
               }
            }

            int var3 = this.class_(this.private_ - this.catch_);
            int var4 = this.class_(this.implements_ - this.private_);
            int var5 = this.class_(this.case_ - this.implements_);
            int var6 = var2 + var3 + var4 + var5;
            if (var6 != 24000) {
               rrbb_3.protected_("Invalid fadeIn/fadeOut times, sum is not 24h: " + var6);
               return false;
            } else if (this.native_ < 0.0F) {
               rrbb_3.protected_("Invalid speed: " + this.native_);
               return false;
            } else if (this.package_ <= 0) {
               rrbb_3.protected_("Invalid daysLoop: " + this.package_);
               return false;
            } else {
               return true;
            }
         } else {
            rrbb_3.protected_("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
         }
      }
   }

   public void class_(rYB var1, Ml_1 var2, int var3, float var4, float var5, float var6) {
      float var7 = this.class_(var1);
      float var8 = this.class_(var5, var6);
      float var9 = this.break_(var3);
      float var10 = var7 * var8 * var9;
      var10 = rrbb_3.class_(var10, 0.0F, 1.0F);
      if (!(var10 < 1.0E-4F)) {
         MT.super_(this.protected_);
         rrxh_3.class_(this.finally_, var10);
         MT.transient_();
         MT.class_(var2.byte_().class_());
         if (this.extends_) {
            float var11 = 0.0F;
            if (this.native_ != (float)Math.round(this.native_)) {
               long var12 = (var1.P() + 18000L) / 24000L;
               double var14 = (double)(this.native_ % 1.0F);
               double var16 = (double)var12 * var14;
               var11 = (float)(var16 % 1.0);
            }

            MT.byte_(360.0F * (var11 + var4 * this.native_), this.volatile_[0], this.volatile_[1], this.volatile_[2]);
         }

         yb_3 var19 = yb_3.class_();
         MT.byte_(90.0F, 1.0F, 0.0F, 0.0F);
         MT.byte_(-90.0F, 0.0F, 0.0F, 1.0F);
         this.class_(var19, 4);
         MT.transient_();
         MT.byte_(90.0F, 1.0F, 0.0F, 0.0F);
         this.class_(var19, 1);
         MT.for_();
         MT.transient_();
         MT.byte_(-90.0F, 1.0F, 0.0F, 0.0F);
         this.class_(var19, 0);
         MT.for_();
         MT.byte_(90.0F, 0.0F, 0.0F, 1.0F);
         this.class_(var19, 5);
         MT.byte_(90.0F, 0.0F, 0.0F, 1.0F);
         this.class_(var19, 2);
         MT.byte_(90.0F, 0.0F, 0.0F, 1.0F);
         this.class_(var19, 3);
         MT.for_();
      }
   }

   private int class_(int var1) {
      while (var1 >= 24000) {
         var1 -= 24000;
      }

      while (var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   private float break_(rYB var1) {
      an_3 var2 = QY.instanceof_().catch_();
      if (var2 == null) {
         return 0.0F;
      } else {
         rfH_2 var3 = var2.Bs();
         if (this.break_ != null) {
            rYG var4 = var1.implements_(var3);
            if (var4 == null) {
               return 0.0F;
            }

            if (!rrMl_1.class_(var4, this.break_)) {
               return 0.0F;
            }
         }

         return this.byte_ != null && !this.byte_.class_(var3.c_()) ? 0.0F : 1.0F;
      }
   }

   private List<String> break_(String var1) {
      List var2 = Arrays.asList("clear", "rain", "thunder");
      ArrayList var3 = new ArrayList();
      String[] var4 = rrbb_3.class_(var1, " ");

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var4[var5];
         if (!var2.contains(var6)) {
            rrbb_3.protected_("Unknown weather: " + var6);
         } else {
            var3.add(var6);
         }
      }

      return var3;
   }

   private float break_(int var1) {
      if (this.class_(var1, this.case_, this.catch_)) {
         int var4 = this.class_(this.catch_ - this.case_);
         int var5 = this.class_(var1 - this.case_);
         return (float)var5 / (float)var4;
      } else if (this.class_(var1, this.catch_, this.private_)) {
         return 1.0F;
      } else if (this.class_(var1, this.private_, this.implements_)) {
         int var2 = this.class_(this.implements_ - this.private_);
         int var3 = this.class_(var1 - this.private_);
         return 1.0F - (float)var3 / (float)var2;
      } else {
         return 0.0F;
      }
   }
}
