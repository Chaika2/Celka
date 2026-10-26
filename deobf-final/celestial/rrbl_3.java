package celestial;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class rrbl_3 {
   private static QY byte_ = rrbb_3.X();
   private static rrJf_1 protected_ = null;
   private static rrbL_2[][] throws_ = (rrbL_2[][])null;
   public static boolean class_ = byte_();
   public static boolean break_ = protected_();

   private static boolean byte_() {
      Calendar var0 = Calendar.getInstance();
      return var0.get(2) + 1 == 12 && var0.get(5) >= 24 && var0.get(5) <= 26;
   }

   private static rqO_2 class_(rrbn_3 var0, rfH_2 var1, rRR var2, rqO_2 var3, vm_3 var4) {
      rrbL_2[] var5 = throws_[var0.ordinal()];
      if (var5 == null) {
         return var3;
      } else {
         for (int var6 = 0; var6 < var5.length; var6++) {
            rrbL_2 var7 = var5[var6];
            if (var7.class_(var0, var1, var2, var4)) {
               return var7.class_(var3);
            }
         }

         return var3;
      }
   }

   private static void class_(rrbL_2 var0, List<List<rrbL_2>> var1) {
      if (var0.class_() == null) {
         class_("Invalid container: " + var0.class_());
      } else {
         int var2 = var0.class_().ordinal();

         while (var1.size() <= var2) {
            var1.add((List)null);
         }

         Object var3 = (List)var1.get(var2);
         if (var3 == null) {
            var3 = new ArrayList();
            var1.set(var2, var3);
         }

         var3.add(var0);
      }
   }

   public static void class_(rrJf_1 var0) {
      protected_ = var0;
   }

   public static rqO_2 class_(rqO_2 var0) {
      if (throws_ == null) {
         return var0;
      } else {
         vm_3 var1 = (vm_3)byte_.class_[73];
         if (!(var1 instanceof Fu_1)) {
            return var0;
         } else if (!var0.byte_().equals("minecraft") || !var0.break_().startsWith("textures/gui/")) {
            return var0;
         } else if (protected_ == null) {
            return var0;
         } else {
            gm_3 var2 = (gm_3)byte_.class_[56];
            if (var2 == null) {
               return var0;
            } else if (var1 instanceof Fv_1) {
               return class_(rrbn_3.CREATIVE, ((cb_3)byte_.class_[57]).Bs(), var2, var0, var1);
            } else if (var1 instanceof FH) {
               return class_(rrbn_3.INVENTORY, ((cb_3)byte_.class_[57]).Bs(), var2, var0, var1);
            } else {
               rfH_2 var3 = protected_.continue_();
               if (var3 != null) {
                  if (var1 instanceof FO) {
                     return class_(rrbn_3.ANVIL, var3, var2, var0, var1);
                  }

                  if (var1 instanceof Fh_1) {
                     return class_(rrbn_3.BEACON, var3, var2, var0, var1);
                  }

                  if (var1 instanceof FQ) {
                     return class_(rrbn_3.BREWING_STAND, var3, var2, var0, var1);
                  }

                  if (var1 instanceof Fc_1) {
                     return class_(rrbn_3.CHEST, var3, var2, var0, var1);
                  }

                  if (var1 instanceof Fm_1) {
                     return class_(rrbn_3.CRAFTING, var3, var2, var0, var1);
                  }

                  if (var1 instanceof Fn_1) {
                     return class_(rrbn_3.DISPENSER, var3, var2, var0, var1);
                  }

                  if (var1 instanceof Zn_1) {
                     return class_(rrbn_3.ENCHANTMENT, var3, var2, var0, var1);
                  }

                  if (var1 instanceof FC) {
                     return class_(rrbn_3.FURNACE, var3, var2, var0, var1);
                  }

                  if (var1 instanceof ZV) {
                     return class_(rrbn_3.HOPPER, var3, var2, var0, var1);
                  }

                  if (var1 instanceof Fq_1) {
                     return class_(rrbn_3.SHULKER_BOX, var3, var2, var0, var1);
                  }
               }

               an_3 var4 = protected_.super_();
               if (var4 != null) {
                  if (var1 instanceof Fl_1) {
                     return class_(rrbn_3.HORSE, var4, var2, var0);
                  }

                  if (var1 instanceof Fy_1) {
                     return class_(rrbn_3.VILLAGER, var4, var2, var0);
                  }
               }

               return var0;
            }
         }
      }
   }

   private static void class_(String var0) {
      rrbb_3.protected_("[CustomGuis] " + var0);
   }

   private static rqO_2 class_(rrbn_3 var0, an_3 var1, rRR var2, rqO_2 var3) {
      rrbL_2[] var4 = throws_[var0.ordinal()];
      if (var4 == null) {
         return var3;
      } else {
         for (int var5 = 0; var5 < var4.length; var5++) {
            rrbL_2 var6 = var4[var5];
            if (var6.class_(var0, var1, var2)) {
               return var6.class_(var3);
            }
         }

         return var3;
      }
   }

   public static void class_() {
      throws_ = (rrbL_2[][])null;
      if (rrbb_3.rl()) {
         ArrayList var0 = new ArrayList();
         rAC[] var1 = rrbb_3.d();

         for (int var2 = var1.length - 1; var2 >= 0; var2--) {
            rAC var3 = var1[var2];
            class_(var3, var0);
         }

         throws_ = class_(var0);
      }
   }

   private static rrbL_2[][] class_(List<List<rrbL_2>> var0) {
      if (var0.isEmpty()) {
         return (rrbL_2[][])null;
      } else {
         rrbL_2[][] var1 = new rrbL_2[rrbn_3.values().length][];

         for (int var2 = 0; var2 < var1.length; var2++) {
            if (var0.size() > var2) {
               List var3 = (List)var0.get(var2);
               if (var3 != null) {
                  rrbL_2[] var4 = var3.toArray(new rrbL_2[var3.size()]);
                  var1[var2] = var4;
               }
            }
         }

         return var1;
      }
   }

   private static void class_(rAC var0, List<List<rrbL_2>> var1) {
      String[] var2 = rrzM_2.class_(var0, "optifine/gui/container/", ".properties", (String[])null);
      Arrays.sort(var2);

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         rrbb_3.byte_("CustomGuis: " + var4);

         try {
            rqO_2 var5 = new rqO_2(var4);
            InputStream var6 = var0.class_(rAI.CLIENT_RESOURCES, var5);
            if (var6 == null) {
               rrbb_3.protected_("CustomGuis file not found: " + var4);
            } else {
               rrzE_2 var7 = new rrzE_2();
               var7.load(var6);
               var6.close();
               rrbL_2 var8 = new rrbL_2(var7, var4);
               if (var8.class_(var4)) {
                  class_(var8, var1);
               }
            }
         } catch (FileNotFoundException var9) {
            rrbb_3.protected_("CustomGuis file not found: " + var4);
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }

   public static rrJf_1 break_() {
      return protected_;
   }

   private static boolean protected_() {
      Calendar var0 = Calendar.getInstance();
      return var0.get(2) + 1 == 4 && var0.get(5) == 1;
   }
}
