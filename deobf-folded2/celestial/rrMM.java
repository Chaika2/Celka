package celestial;

import java.util.Properties;

public class rrMM {
   private String id_byte = null;
   private rqO_2 id_protected = null;
   private int id_throws;
   private int[] id_case = null;
   private rqO_2[] id_catch = null;
   private int[] id_private = null;
   private rrMk_1[] id_implements = null;
   private rrMq_1 id_finally = null;
   private rrMq_1 id_extends = null;
   private boolean id_native = false;
   private rrMH id_volatile = null;
   public int[] id_class = null;
   public int id_break = 1;
   private rrMC[] id_final = null;
   private rxL_2[] id_package = null;
   private Boolean id_int = null;
   private rrMq_1 id_new = null;
   private rrMq_1 id_continue = null;
   private rrMt_1[] id_super = null;

   public rrMM(Properties var1, String var2, rqO_2 var3, int var4, String var5, rrMz_1 var6) {
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var6.id_private(var5);
      this.id_private = var6.id_private(var1.getProperty("weights." + var4));
      this.id_implements = var6.id_case(var1.getProperty("biomes." + var4));
      this.id_finally = var6.id_native(var1.getProperty("heights." + var4));
      if (this.id_finally == null) {
         this.id_finally = this.id_class(var1, var4);
      }

      String var7 = var1.getProperty("health." + var4);
      if (var7 != null) {
         this.id_native = var7.contains("%");
         var7 = var7.replace("%", "");
         this.id_extends = var6.id_native(var7);
      }

      this.id_volatile = var6.id_break("name", var1.getProperty("name." + var4));
      this.id_final = var6.id_final(var1.getProperty("professions." + var4));
      this.id_package = var6.id_class(var1.getProperty("collarColors." + var4), "collar color", rrMz_1.id_break);
      this.id_int = var6.id_volatile(var1.getProperty("baby." + var4));
      this.id_new = var6.id_native(var1.getProperty("moonPhase." + var4));
      this.id_continue = var6.id_native(var1.getProperty("dayTime." + var4));
      this.id_super = var6.id_class(var1.getProperty("weather." + var4), "weather." + var4, (rrMt_1[])null);
   }

   public rqO_2 id_class(rqO_2 var1, int var2) {
      if (this.id_catch != null && this.id_catch.length != 0) {
         int var3 = 0;
         if (this.id_private == null) {
            var3 = var2 % this.id_catch.length;
         } else {
            int var4 = var2 % this.id_break;

            for (int var5 = 0; var5 < this.id_class.length; var5++) {
               if (this.id_class[var5] > var4) {
                  var3 = var5;
                  break;
               }
            }
         }

         return this.id_catch[var3];
      } else {
         return var1;
      }
   }

   public boolean id_class(rrbD_2 var1) {
      if (this.id_implements != null && !rrMl_1.id_class(var1.id_byte(), this.id_implements)) {
         return false;
      } else {
         if (this.id_finally != null) {
            rfH_2 var2 = var1.id_break();
            if (var2 != null && !this.id_finally.id_class(var2.c_())) {
               return false;
            }
         }

         if (this.id_extends != null) {
            int var8 = var1.id_throws();
            if (this.id_native) {
               int var3 = var1.id_case();
               if (var3 > 0) {
                  var8 = (int)((double)(var8 * 100) / (double)var3);
               }
            }

            if (!this.id_extends.id_class(var8)) {
               return false;
            }
         }

         if (this.id_volatile != null) {
            String var9 = var1.id_protected();
            if (!this.id_volatile.id_class(var9)) {
               return false;
            }
         }

         if (this.id_final != null && var1 instanceof rrMG var10 && var10.id_catch() instanceof rsq_3 var4) {
            rsp_3 var5 = var4.su();
            rsT_2 var6 = var5.id_break();
            int var7 = var5.id_byte();
            if (!rrMC.id_class(var6, var7, this.id_final)) {
               return false;
            }
         }

         if (this.id_package != null && var1 instanceof rrMG var11) {
            an_3 var17 = var11.id_catch();
            if (var17 instanceof rOH var22) {
               if (!var22.sZ()) {
                  return false;
               }

               rxL_2 var25 = var22.sx();
               if (!rrbb_3.id_class(var25, this.id_package)) {
                  return false;
               }
            }

            if (var17 instanceof rbf_3 var23) {
               if (!var23.sZ()) {
                  return false;
               }

               rxL_2 var26 = var23.sd();
               if (!rrbb_3.id_class(var26, this.id_package)) {
                  return false;
               }
            }
         }

         if (this.id_int != null && var1 instanceof rrMG var12 && var12.id_catch() instanceof iB_2 var24 && var24.n_() != this.id_int) {
            return false;
         }

         if (this.id_new != null) {
            gm_3 var13 = (gm_3)rrbb_3.X().id_class[56];
            if (var13 != null) {
               int var19 = var13.id_char();
               if (!this.id_new.id_class(var19)) {
                  return false;
               }
            }
         }

         if (this.id_continue != null) {
            gm_3 var14 = (gm_3)rrbb_3.X().id_class[56];
            if (var14 != null) {
               int var20 = (int)var14.P();
               if (!this.id_continue.id_class(var20)) {
                  return false;
               }
            }
         }

         if (this.id_super != null) {
            gm_3 var15 = (gm_3)rrbb_3.X().id_class[56];
            if (var15 != null) {
               rrMt_1 var21 = rrMt_1.id_class(var15, 0.0F);
               if (!rrki_1.id_class(this.id_super, var21)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean id_class(String var1) {
      if (this.id_case == null || this.id_case.length == 0) {
         rrbb_3.id_protected("Invalid skins for rule: " + this.id_throws);
         return false;
      } else if (this.id_catch != null) {
         return true;
      } else {
         this.id_catch = new rqO_2[this.id_case.length];
         boolean var2 = this.id_byte.startsWith("optifine/mob/");
         rqO_2 var3 = rrME.id_class(this.id_protected, var2);
         if (var3 == null) {
            rrbb_3.id_protected("Invalid path: " + this.id_protected.id_break());
            return false;
         } else {
            for (int var4 = 0; var4 < this.id_catch.length; var4++) {
               int var5 = this.id_case[var4];
               if (var5 <= 1) {
                  this.id_catch[var4] = this.id_protected;
               } else {
                  rqO_2 var6 = rrME.id_class(var3, var5);
                  if (var6 == null) {
                     rrbb_3.id_protected("Invalid path: " + this.id_protected.id_break());
                     return false;
                  }

                  if (!rrbb_3.id_byte(var6)) {
                     rrbb_3.id_protected("Texture not found: " + var6.id_break());
                     return false;
                  }

                  this.id_catch[var4] = var6;
               }
            }

            if (this.id_private != null) {
               if (this.id_private.length > this.id_catch.length) {
                  rrbb_3.id_protected("More weights defined than skins, trimming weights: " + var1);
                  int[] var7 = new int[this.id_catch.length];
                  System.arraycopy(this.id_private, 0, var7, 0, var7.length);
                  this.id_private = var7;
               }

               if (this.id_private.length < this.id_catch.length) {
                  rrbb_3.id_protected("Less weights defined than skins, expanding weights: " + var1);
                  int[] var8 = new int[this.id_catch.length];
                  System.arraycopy(this.id_private, 0, var8, 0, this.id_private.length);
                  int var10 = rrWD.id_class(this.id_private);

                  for (int var12 = this.id_private.length; var12 < var8.length; var12++) {
                     var8[var12] = var10;
                  }

                  this.id_private = var8;
               }

               this.id_class = new int[this.id_private.length];
               int var9 = 0;

               for (int var11 = 0; var11 < this.id_private.length; var11++) {
                  if (this.id_private[var11] < 0) {
                     rrbb_3.id_protected("Invalid weight: " + this.id_private[var11]);
                     return false;
                  }

                  var9 += this.id_private[var11];
                  this.id_class[var11] = var9;
               }

               this.id_break = var9;
               if (this.id_break <= 0) {
                  rrbb_3.id_protected("Invalid sum of all weights: " + var9);
                  this.id_break = 1;
               }
            }

            if (this.id_final == rrMz_1.id_class) {
               rrbb_3.id_protected("Invalid professions or careers: " + var1);
               return false;
            } else if (this.id_package == rrMz_1.id_break) {
               rrbb_3.id_protected("Invalid collar colors: " + var1);
               return false;
            } else {
               return true;
            }
         }
      }
   }

   private rrMq_1 id_class(Properties var1, int var2) {
      String var3 = var1.getProperty("minHeight." + var2);
      String var4 = var1.getProperty("maxHeight." + var2);
      if (var3 == null && var4 == null) {
         return null;
      } else {
         int var5 = 0;
         if (var3 != null) {
            var5 = rrbb_3.id_class(var3, -1);
            if (var5 < 0) {
               rrbb_3.id_protected("Invalid minHeight: " + var3);
               return null;
            }
         }

         int var6 = 256;
         if (var4 != null) {
            var6 = rrbb_3.id_class(var4, -1);
            if (var6 < 0) {
               rrbb_3.id_protected("Invalid maxHeight: " + var4);
               return null;
            }
         }

         if (var6 < 0) {
            rrbb_3.id_protected("Invalid minHeight, maxHeight: " + var3 + ", " + var4);
            return null;
         } else {
            rrMq_1 var7 = new rrMq_1();
            var7.id_class(new rrMp_1(var5, var6));
            return var7;
         }
      }
   }
}
