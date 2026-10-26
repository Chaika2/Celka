package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class rAB {
   private static final rVi_1 id_class = new rgn_3("effect.none").id_class(rgF_2.GRAY);

   public static rLi_1 id_byte(rcd_3 var0) {
      return var0 == null ? rAS.id_class : rLi_1.id_class(var0.id_native("Potion"));
   }

   public static int id_byte(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      if (var1 != null && var1.id_byte("CustomPotionColor", 99)) {
         return var1.id_private("CustomPotionColor");
      } else {
         return id_protected(var0) == rAS.id_class ? 16253176 : id_class(id_class(var0));
      }
   }

   public static void id_class(rdn_3 var0, List<rgP_2> var1, float var2) {
      List var3 = id_class(var0);
      ArrayList var4 = Lists.newArrayList();
      if (var3.isEmpty()) {
         var1.add(id_class);
      } else {
         for (rLY var6 : var3) {
            rgn_3 var7 = new rgn_3(var6.id_private());
            rLR var8 = var6.id_class();
            Map var9 = var8.id_catch();
            if (!var9.isEmpty()) {
               for (Entry var11 : var9.entrySet()) {
                  ix_3 var12 = (ix_3)var11.getValue();
                  ix_3 var13 = new ix_3(var12.id_break(), var8.id_class(var6.id_byte(), var12), var12.id_byte());
                  var4.add(new Pair((iJ_2)var11.getKey(), var13));
               }
            }

            if (var6.id_byte() > 0) {
               var7 = new rgn_3("potion.withAmplifier", var7, new rgn_3("potion.potency." + var6.id_byte()));
            }

            if (var6.id_break() > 20) {
               var7 = new rgn_3("potion.withDuration", var7, rLK.id_class(var6, var2));
            }

            var1.add(var7.id_class(var8.id_throws().id_class()));
         }
      }

      if (!var4.isEmpty()) {
         var1.add(rgN_2.id_byte);
         var1.add(new rgn_3("potion.whenDrank").id_class(rgF_2.DARK_PURPLE));

         for (Pair var15 : var4) {
            ix_3 var16 = (ix_3)var15.getSecond();
            double var17 = var16.id_protected();
            double var18;
            if (var16.id_byte() != id_3.MULTIPLY_BASE && var16.id_byte() != id_3.MULTIPLY_TOTAL) {
               var18 = var16.id_protected();
            } else {
               var18 = var16.id_protected() * 100.0;
            }

            if (var17 > 0.0) {
               var1.add(
                  new rgn_3("attribute.modifier.plus." + var16.id_byte().id_class(), rdn_3.id_byte.format(var18), new rgn_3(((iJ_2)var15.getFirst()).id_byte()))
                     .id_class(rgF_2.BLUE)
               );
            } else if (var17 < 0.0) {
               var18 *= -1.0;
               var1.add(
                  new rgn_3("attribute.modifier.take." + var16.id_byte().id_class(), rdn_3.id_byte.format(var18), new rgn_3(((iJ_2)var15.getFirst()).id_byte()))
                     .id_class(rgF_2.RED)
               );
            }
         }
      }
   }

   public static boolean id_class(rdn_3 var0, List<rLY> var1) {
      List var2 = id_class(var0);

      for (rLY var4 : var1) {
         boolean var5 = false;

         for (rLY var7 : var2) {
            if (var7.id_class() == var4.id_class() && var7.id_byte() == var4.id_byte()) {
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

   public static boolean id_class(rdn_3 var0, rLR... var1) {
      for (rLY var4 : id_class(var0)) {
         boolean var5 = false;

         for (rLR var9 : var1) {
            if (var4.id_class() == var9) {
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

   public static rdn_3 id_class(rdn_3 var0, Collection<rLY> var1) {
      if (var1.isEmpty()) {
         return var0;
      } else {
         rcd_3 var2 = var0.id_int();
         rcy_3 var3 = var2.id_protected("CustomPotionEffects", 9);

         for (rLY var5 : var1) {
            var3.add(var5.id_class(new rcd_3()));
         }

         var2.id_class("CustomPotionEffects", var3);
         return var0;
      }
   }

   public static rdn_3 id_class(rdn_3 var0, rLi_1 var1) {
      rqO_2 var2 = rVL.id_double.id_break(var1);
      if (var1 == rAS.id_class) {
         var0.id_byte("Potion");
      } else {
         var0.id_int().id_class("Potion", var2.toString());
      }

      return var0;
   }

   public static List<rLY> id_class(rcd_3 var0) {
      ArrayList var1 = Lists.newArrayList();
      var1.addAll(id_byte(var0).id_class());
      id_class(var0, var1);
      return var1;
   }

   public static String id_class(rLY var0, rgF_2 var1) {
      String var2 = "";
      if (var0.id_byte() >= 1 && var0.id_byte() <= 9) {
         var2 = " " + jI_2.id_class("enchantment.level." + (var0.id_byte() + 1));
      } else if (var0.id_byte() == 10) {
         var2 = " X";
      }

      Object var3 = var0.id_final() + var2;
      if (var1 != null) {
         var3 = var3 + var1;
      }

      if (!var0.id_class().id_class()) {
         var3 = var3 + " (" + rLK.id_class(var0, 1.0F) + ")";
      }

      return (String)var3;
   }

   public static boolean id_class(rdn_3 var0, rLY... var1) {
      for (rLY var4 : id_class(var0)) {
         boolean var5 = false;

         for (rLY var9 : var1) {
            if (var4.id_class() == var9.id_class()) {
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

   public static void id_class(rcd_3 var0, List<rLY> var1) {
      if (var0 != null && var0.id_byte("CustomPotionEffects", 9)) {
         rcy_3 var2 = var0.id_protected("CustomPotionEffects", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rcd_3 var4 = var2.id_class(var3);
            rLY var5 = rLY.id_break(var4);
            if (var5 != null) {
               var1.add(var5);
            }
         }
      }
   }

   public static List<rLY> id_class(rLi_1 var0, Collection<rLY> var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.addAll(var0.id_class());
      var2.addAll(var1);
      return var2;
   }

   public static int id_class(rLi_1 var0) {
      return var0 == rAS.id_class ? 16253176 : id_class(var0.id_class());
   }

   public static List<rLY> id_class(rdn_3 var0) {
      return id_class(var0.id_package());
   }

   public static int id_class(Collection<rLY> var0) {
      int var1 = 3694022;
      if (var0.isEmpty()) {
         return rrbb_3.K() ? rrbN_2.id_class((rLR)null, var1) : 3694022;
      } else {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = 0.0F;
         int var5 = 0;

         for (rLY var7 : var0) {
            if (var7.id_throws()) {
               int var8 = var7.id_class().id_case();
               if (rrbb_3.K()) {
                  var8 = rrbN_2.id_class(var7.id_class(), var8);
               }

               int var9 = var7.id_byte() + 1;
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

   public static List<rLY> id_break(rdn_3 var0) {
      return id_break(var0.id_package());
   }

   public static List<rLY> id_break(rcd_3 var0) {
      ArrayList var1 = Lists.newArrayList();
      id_class(var0, var1);
      return var1;
   }

   public static String id_break(Collection<rLY> var0) {
      StringBuilder var1 = new StringBuilder();
      int var2 = var0.size();
      int var3 = 0;

      for (rLY var5 : var0) {
         if (var5.id_break() > 0) {
            var1.append(id_class(var5, null));
            if (++var3 < var2) {
               var1.append("\n");
            }
         }
      }

      return var1.toString();
   }

   public static boolean id_break(rdn_3 var0, List<rLR> var1) {
      List var2 = id_class(var0).stream().map(var0x -> var0x.id_class()).toList();

      for (rLR var4 : var1) {
         if (!var2.contains(var4)) {
            return false;
         }
      }

      return true;
   }

   public static rLi_1 id_protected(rdn_3 var0) {
      return id_byte(var0.id_package());
   }
}
