package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class rAB {
   private static final rVi_1 class_ = new rgn_3("effect.none").class_(rgF_2.GRAY);

   public static rLi_1 byte_(rcd_3 var0) {
      return var0 == null ? rAS.class_ : rLi_1.class_(var0.native_("Potion"));
   }

   public static int byte_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      if (var1 != null && var1.byte_("CustomPotionColor", 99)) {
         return var1.private_("CustomPotionColor");
      } else {
         return protected_(var0) == rAS.class_ ? 16253176 : class_(class_(var0));
      }
   }

   public static void class_(rdn_3 var0, List<rgP_2> var1, float var2) {
      List var3 = class_(var0);
      ArrayList var4 = Lists.newArrayList();
      if (var3.isEmpty()) {
         var1.add(class_);
      } else {
         for (rLY var6 : var3) {
            rgn_3 var7 = new rgn_3(var6.private_());
            rLR var8 = var6.class_();
            Map var9 = var8.catch_();
            if (!var9.isEmpty()) {
               for (Entry var11 : var9.entrySet()) {
                  ix_3 var12 = (ix_3)var11.getValue();
                  ix_3 var13 = new ix_3(var12.break_(), var8.class_(var6.byte_(), var12), var12.byte_());
                  var4.add(new Pair((iJ_2)var11.getKey(), var13));
               }
            }

            if (var6.byte_() > 0) {
               var7 = new rgn_3("potion.withAmplifier", var7, new rgn_3("potion.potency." + var6.byte_()));
            }

            if (var6.break_() > 20) {
               var7 = new rgn_3("potion.withDuration", var7, rLK.class_(var6, var2));
            }

            var1.add(var7.class_(var8.throws_().class_()));
         }
      }

      if (!var4.isEmpty()) {
         var1.add(rgN_2.byte_);
         var1.add(new rgn_3("potion.whenDrank").class_(rgF_2.DARK_PURPLE));

         for (Pair var15 : var4) {
            ix_3 var16 = (ix_3)var15.getSecond();
            double var17 = var16.protected_();
            double var18;
            if (var16.byte_() != id_3.MULTIPLY_BASE && var16.byte_() != id_3.MULTIPLY_TOTAL) {
               var18 = var16.protected_();
            } else {
               var18 = var16.protected_() * 100.0;
            }

            if (var17 > 0.0) {
               var1.add(
                  new rgn_3("attribute.modifier.plus." + var16.byte_().class_(), rdn_3.byte_.format(var18), new rgn_3(((iJ_2)var15.getFirst()).byte_()))
                     .class_(rgF_2.BLUE)
               );
            } else if (var17 < 0.0) {
               var18 *= -1.0;
               var1.add(
                  new rgn_3("attribute.modifier.take." + var16.byte_().class_(), rdn_3.byte_.format(var18), new rgn_3(((iJ_2)var15.getFirst()).byte_()))
                     .class_(rgF_2.RED)
               );
            }
         }
      }
   }

   public static boolean class_(rdn_3 var0, List<rLY> var1) {
      List var2 = class_(var0);

      for (rLY var4 : var1) {
         boolean var5 = false;

         for (rLY var7 : var2) {
            if (var7.class_() == var4.class_() && var7.byte_() == var4.byte_()) {
               var5 = true;
               break;
            }
         }

         if (!var5) {
            return false;
         }
      }

      return true;
   }

   public static boolean class_(rdn_3 var0, rLR... var1) {
      for (rLY var4 : class_(var0)) {
         boolean var5 = false;

         for (rLR var9 : var1) {
            if (var4.class_() == var9) {
               var5 = true;
               break;
            }
         }

         if (!var5) {
            return false;
         }
      }

      return true;
   }

   public static rdn_3 class_(rdn_3 var0, Collection<rLY> var1) {
      if (var1.isEmpty()) {
         return var0;
      } else {
         rcd_3 var2 = var0.int_();
         rcy_3 var3 = var2.protected_("CustomPotionEffects", 9);

         for (rLY var5 : var1) {
            var3.add(var5.class_(new rcd_3()));
         }

         var2.class_("CustomPotionEffects", var3);
         return var0;
      }
   }

   public static rdn_3 class_(rdn_3 var0, rLi_1 var1) {
      rqO_2 var2 = rVL.double_.break_(var1);
      if (var1 == rAS.class_) {
         var0.byte_("Potion");
      } else {
         var0.int_().class_("Potion", var2.toString());
      }

      return var0;
   }

   public static List<rLY> class_(rcd_3 var0) {
      ArrayList var1 = Lists.newArrayList();
      var1.addAll(byte_(var0).class_());
      class_(var0, var1);
      return var1;
   }

   public static String class_(rLY var0, rgF_2 var1) {
      String var2 = "";
      if (var0.byte_() >= 1 && var0.byte_() <= 9) {
         var2 = " " + jI_2.class_("enchantment.level." + (var0.byte_() + 1));
      } else if (var0.byte_() == 10) {
         var2 = " X";
      }

      Object var3 = var0.final_() + var2;
      if (var1 != null) {
         var3 = var3 + var1;
      }

      if (!var0.class_().class_()) {
         var3 = var3 + " (" + rLK.class_(var0, 1.0F) + ")";
      }

      return (String)var3;
   }

   public static boolean class_(rdn_3 var0, rLY... var1) {
      for (rLY var4 : class_(var0)) {
         boolean var5 = false;

         for (rLY var9 : var1) {
            if (var4.class_() == var9.class_()) {
               var5 = true;
               break;
            }
         }

         if (!var5) {
            return false;
         }
      }

      return true;
   }

   public static void class_(rcd_3 var0, List<rLY> var1) {
      if (var0 != null && var0.byte_("CustomPotionEffects", 9)) {
         rcy_3 var2 = var0.protected_("CustomPotionEffects", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rcd_3 var4 = var2.class_(var3);
            rLY var5 = rLY.break_(var4);
            if (var5 != null) {
               var1.add(var5);
            }
         }
      }
   }

   public static List<rLY> class_(rLi_1 var0, Collection<rLY> var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.addAll(var0.class_());
      var2.addAll(var1);
      return var2;
   }

   public static int class_(rLi_1 var0) {
      return var0 == rAS.class_ ? 16253176 : class_(var0.class_());
   }

   public static List<rLY> class_(rdn_3 var0) {
      return class_(var0.package_());
   }

   public static int class_(Collection<rLY> var0) {
      int var1 = 3694022;
      if (var0.isEmpty()) {
         return rrbb_3.K() ? rrbN_2.class_((rLR)null, var1) : 3694022;
      } else {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = 0.0F;
         int var5 = 0;

         for (rLY var7 : var0) {
            if (var7.throws_()) {
               int var8 = var7.class_().case_();
               if (rrbb_3.K()) {
                  var8 = rrbN_2.class_(var7.class_(), var8);
               }

               int var9 = var7.byte_() + 1;
               var2 += (float)(var9 * (var8 >> 16 & 0xFF)) / 255.0F;
               var3 += (float)(var9 * (var8 >> 8 & 0xFF)) / 255.0F;
               var4 += (float)(var9 * (var8 >> 0 & 0xFF)) / 255.0F;
               var5 += var9;
            }
         }

         if (var5 == 0) {
            return 0;
         } else {
            var2 = var2 / (float)var5 * 255.0F;
            var3 = var3 / (float)var5 * 255.0F;
            var4 = var4 / (float)var5 * 255.0F;
            return (int)var2 << 16 | (int)var3 << 8 | (int)var4;
         }
      }
   }

   public static List<rLY> break_(rdn_3 var0) {
      return break_(var0.package_());
   }

   public static List<rLY> break_(rcd_3 var0) {
      ArrayList var1 = Lists.newArrayList();
      class_(var0, var1);
      return var1;
   }

   public static String break_(Collection<rLY> var0) {
      StringBuilder var1 = new StringBuilder();
      int var2 = var0.size();
      int var3 = 0;

      for (rLY var5 : var0) {
         if (var5.break_() > 0) {
            var1.append(class_(var5, null));
            if (++var3 < var2) {
               var1.append("\n");
            }
         }
      }

      return var1.toString();
   }

   public static boolean break_(rdn_3 var0, List<rLR> var1) {
      List var2 = class_(var0).stream().map(var0x -> var0x.class_()).toList();

      for (rLR var4 : var1) {
         if (!var2.contains(var4)) {
            return false;
         }
      }

      return true;
   }

   public static rLi_1 protected_(rdn_3 var0) {
      return byte_(var0.package_());
   }
}
