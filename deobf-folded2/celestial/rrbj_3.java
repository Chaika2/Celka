package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class rrbj_3 {
   public String id_class = null;
   private int id_case = -1;
   private int id_catch = -1;
   private int id_private = -1;
   private int id_implements = -1;
   private int id_finally = 1;
   private boolean id_extends = false;
   private float id_native = 1.0F;
   private float[] id_volatile;
   private rrMq_1 id_final;
   private int id_package;
   private boolean id_int;
   private boolean id_new;
   private boolean id_continue;
   public rrMk_1[] id_break;
   public rrMq_1 id_byte;
   private float id_super;
   private rrzO_2 id_this;
   public int id_protected;
   private rYB id_else;
   public static final float[] id_throws = new float[]{1.0F, 0.0F, 0.0F};
   private static final String id_synchronized = "clear";
   private static final String id_return = "rain";
   private static final String id_public = "thunder";

   private int id_byte(String var1) {
      if (var1 == null) {
         return -1;
      } else {
         String[] var2 = rrbb_3.id_class(var1, ":");
         if (var2.length != 2) {
            rrbb_3.id_protected("Invalid time: " + var1);
            return -1;
         } else {
            String var3 = var2[0];
            String var4 = var2[1];
            int var5 = rrbb_3.id_class(var3, -1);
            int var6 = rrbb_3.id_class(var4, -1);
            if (var5 >= 0 && var5 <= 23 && var6 >= 0 && var6 <= 59) {
               var5 -= 6;
               if (var5 < 0) {
                  var5 += 24;
               }

               return var5 * 1000 + (int)((double)var6 / 60.0 * 1000.0);
            } else {
               rrbb_3.id_protected("Invalid time: " + var1);
               return -1;
            }
         }
      }
   }

   public rrbj_3(Properties var1, String var2) {
      this.id_volatile = id_throws;
      this.id_final = null;
      this.id_package = 8;
      this.id_int = true;
      this.id_new = false;
      this.id_continue = false;
      this.id_break = null;
      this.id_byte = null;
      this.id_super = 1.0F;
      this.id_this = null;
      this.id_protected = -1;
      this.id_else = null;
      rrMz_1 var3 = new rrMz_1("CustomSky");
      this.id_class = var1.getProperty("source", var2);
      this.id_case = this.id_byte(var1.getProperty("startFadeIn"));
      this.id_catch = this.id_byte(var1.getProperty("endFadeIn"));
      this.id_private = this.id_byte(var1.getProperty("startFadeOut"));
      this.id_implements = this.id_byte(var1.getProperty("endFadeOut"));
      this.id_finally = rrxh_3.id_class(var1.getProperty("blend"));
      this.id_extends = this.id_class(var1.getProperty("rotate"), true);
      this.id_native = this.id_class(var1.getProperty("speed"), 1.0F);
      this.id_volatile = this.id_class(var1.getProperty("axis"), id_throws);
      this.id_final = var3.id_native(var1.getProperty("days"));
      this.id_package = var3.id_class(var1.getProperty("daysLoop"), 8);
      List var4 = this.id_break(var1.getProperty("weather", "clear"));
      this.id_int = var4.contains("clear");
      this.id_new = var4.contains("rain");
      this.id_continue = var4.contains("thunder");
      this.id_break = var3.id_case(var1.getProperty("biomes"));
      this.id_byte = var3.id_native(var1.getProperty("heights"));
      this.id_super = this.id_class(var1.getProperty("transition"), 1.0F);
   }

   @Override
   public String toString() {
      return this.id_class + ", " + this.id_case + "-" + this.id_catch + " " + this.id_private + "-" + this.id_implements;
   }

   private void id_class(yb_3 var1, int var2) {
      lD_2 var3 = var1.id_byte();
      float var4 = (float)(var2 % 3) / 3.0F;
      float var5 = (float)(var2 / 3) / 2.0F;
      var3.id_class(7, ju_3.id_synchronized);
      var3.id_class(-100.0, -100.0, -100.0).id_class(var4, var5).id_class();
      var3.id_class(-100.0, -100.0, 100.0).id_class(var4, var5 + 0.5F).id_class();
      var3.id_class(100.0, -100.0, 100.0).id_class(var4 + 0.33333334F, var5 + 0.5F).id_class();
      var3.id_class(100.0, -100.0, -100.0).id_class(var4 + 0.33333334F, var5).id_class();
      var1.id_break();
   }

   private float id_class(float var1, float var2) {
      float var3 = 1.0F - var1;
      float var4 = var1 - var2;
      float var5 = 0.0F;
      if (this.id_int) {
         var5 += var3;
      }

      if (this.id_new) {
         var5 += var4;
      }

      if (this.id_continue) {
         var5 += var2;
      }

      return rrzP_2.id_class(var5, 0.0F, 1.0F);
   }

   private float id_class(rYB var1) {
      if (this.id_break == null && this.id_byte == null) {
         return 1.0F;
      } else {
         float var2 = this.id_break(var1);
         if (this.id_this == null) {
            this.id_this = new rrzO_2(var2, this.id_super);
         }

         return this.id_this.id_class(var2);
      }
   }

   public boolean id_class(rYB var1, int var2) {
      if (var1 != this.id_else) {
         this.id_else = var1;
         this.id_this = null;
      }

      if (this.id_class(var2, this.id_implements, this.id_case)) {
         return false;
      } else {
         if (this.id_final != null) {
            long var3 = var1.P();
            long var5 = var3 - (long)this.id_case;

            while (var5 < 0L) {
               var5 += (long)(24000 * this.id_package);
            }

            int var7 = (int)(var5 / 24000L);
            int var8 = var7 % this.id_package;
            if (!this.id_final.id_class(var8)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean id_class(int var1, int var2, int var3) {
      return var2 <= var3 ? var1 >= var2 && var1 <= var3 : var1 >= var2 || var1 <= var3;
   }

   private float[] id_class(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         String[] var3 = rrbb_3.id_class(var1, " ");
         if (var3.length != 3) {
            rrbb_3.id_protected("Invalid axis: " + var1);
            return var2;
         } else {
            float[] var4 = new float[3];

            for (int var5 = 0; var5 < var3.length; var5++) {
               var4[var5] = rrbb_3.id_class(var3[var5], Float.MIN_VALUE);
               if (var4[var5] == Float.MIN_VALUE) {
                  rrbb_3.id_protected("Invalid axis: " + var1);
                  return var2;
               }
            }

            float var8 = var4[0];
            float var6 = var4[1];
            float var7 = var4[2];
            if (var8 * var8 + var6 * var6 + var7 * var7 < 1.0E-5F) {
               rrbb_3.id_protected("Invalid axis values: " + var1);
               return var2;
            } else {
               return new float[]{var7, var6, -var8};
            }
         }
      }
   }

   private boolean id_class(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      } else if (var1.toLowerCase().equals("true")) {
         return true;
      } else if (var1.toLowerCase().equals("false")) {
         return false;
      } else {
         rrbb_3.id_protected("Unknown boolean: " + var1);
         return var2;
      }
   }

   private float id_class(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         float var3 = rrbb_3.id_class(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            rrbb_3.id_protected("Invalid value: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   public boolean id_class(String var1) {
      if (this.id_class == null) {
         rrbb_3.id_protected("No source texture: " + var1);
         return false;
      } else {
         this.id_class = rrzJ_2.id_class(this.id_class, rrzJ_2.id_class(var1));
         if (this.id_case >= 0 && this.id_catch >= 0 && this.id_implements >= 0) {
            int var2 = this.id_class(this.id_catch - this.id_case);
            if (this.id_private < 0) {
               this.id_private = this.id_class(this.id_implements - var2);
               if (this.id_class(this.id_private, this.id_case, this.id_catch)) {
                  this.id_private = this.id_catch;
               }
            }

            int var3 = this.id_class(this.id_private - this.id_catch);
            int var4 = this.id_class(this.id_implements - this.id_private);
            int var5 = this.id_class(this.id_case - this.id_implements);
            int var6 = var2 + var3 + var4 + var5;
            if (var6 != 24000) {
               rrbb_3.id_protected("Invalid fadeIn/fadeOut times, sum is not 24h: " + var6);
               return false;
            } else if (this.id_native < 0.0F) {
               rrbb_3.id_protected("Invalid speed: " + this.id_native);
               return false;
            } else if (this.id_package <= 0) {
               rrbb_3.id_protected("Invalid daysLoop: " + this.id_package);
               return false;
            } else {
               return true;
            }
         } else {
            rrbb_3.id_protected("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
         }
      }
   }

   public void id_class(rYB var1, Ml_1 var2, int var3, float var4, float var5, float var6) {
      float var7 = this.id_class(var1);
      float var8 = this.id_class(var5, var6);
      float var9 = this.id_break(var3);
      float var10 = var7 * var8 * var9;
      var10 = rrbb_3.id_class(var10, 0.0F, 1.0F);
      if (!(var10 < 1.0E-4F)) {
         MT.id_super(this.id_protected);
         rrxh_3.id_class(this.id_finally, var10);
         MT.id_transient();
         MT.id_class(var2.id_byte().id_class());
         if (this.id_extends) {
            float var11 = 0.0F;
            if (this.id_native != (float)Math.round(this.id_native)) {
               long var12 = (var1.P() + 18000L) / 24000L;
               double var14 = (double)(this.id_native % 1.0F);
               double var16 = (double)var12 * var14;
               var11 = (float)(var16 % 1.0);
            }

            MT.id_byte(360.0F * (var11 + var4 * this.id_native), this.id_volatile[0], this.id_volatile[1], this.id_volatile[2]);
         }

         yb_3 var19 = yb_3.id_class();
         MT.id_byte(90.0F, 1.0F, 0.0F, 0.0F);
         MT.id_byte(-90.0F, 0.0F, 0.0F, 1.0F);
         this.id_class(var19, 4);
         MT.id_transient();
         MT.id_byte(90.0F, 1.0F, 0.0F, 0.0F);
         this.id_class(var19, 1);
         MT.id_for();
         MT.id_transient();
         MT.id_byte(-90.0F, 1.0F, 0.0F, 0.0F);
         this.id_class(var19, 0);
         MT.id_for();
         MT.id_byte(90.0F, 0.0F, 0.0F, 1.0F);
         this.id_class(var19, 5);
         MT.id_byte(90.0F, 0.0F, 0.0F, 1.0F);
         this.id_class(var19, 2);
         MT.id_byte(90.0F, 0.0F, 0.0F, 1.0F);
         this.id_class(var19, 3);
         MT.id_for();
      }
   }

   private int id_class(int var1) {
      while (var1 >= 24000) {
         var1 -= 24000;
      }

      while (var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   private float id_break(rYB var1) {
      an_3 var2 = QY.id_instanceof().id_catch();
      if (var2 == null) {
         return 0.0F;
      } else {
         rfH_2 var3 = var2.Bs();
         if (this.id_break != null) {
            rYG var4 = var1.id_implements(var3);
            if (var4 == null) {
               return 0.0F;
            }

            if (!rrMl_1.id_class(var4, this.id_break)) {
               return 0.0F;
            }
         }

         return this.id_byte != null && !this.id_byte.id_class(var3.c_()) ? 0.0F : 1.0F;
      }
   }

   private List<String> id_break(String var1) {
      List var2 = Arrays.asList("clear", "rain", "thunder");
      ArrayList var3 = new ArrayList();
      String[] var4 = rrbb_3.id_class(var1, " ");

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var4[var5];
         if (!var2.contains(var6)) {
            rrbb_3.id_protected("Unknown weather: " + var6);
         } else {
            var3.add(var6);
         }
      }

      return var3;
   }

   private float id_break(int var1) {
      if (this.id_class(var1, this.id_case, this.id_catch)) {
         int var4 = this.id_class(this.id_catch - this.id_case);
         int var5 = this.id_class(var1 - this.id_case);
         return (float)var5 / (float)var4;
      } else if (this.id_class(var1, this.id_catch, this.id_private)) {
         return 1.0F;
      } else if (this.id_class(var1, this.id_private, this.id_implements)) {
         int var2 = this.id_class(this.id_implements - this.id_private);
         int var3 = this.id_class(var1 - this.id_private);
         return 1.0F - (float)var3 / (float)var2;
      } else {
         return 0.0F;
      }
   }
}
