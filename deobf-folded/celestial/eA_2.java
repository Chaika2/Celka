package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class eA_2 {
   public static int id_byte(iB_2 var0) {
      return id_class(eY_2.id_new, var0);
   }

   public static int id_byte(rdn_3 var0) {
      return id_class(eY_2.id_throw, var0);
   }

   public static rdn_3 id_class(Random var0, rdn_3 var1, int var2, boolean var3) {
      List var4 = id_break(var0, var1, var2, var3);
      boolean var5 = var1.id_break() == rdy_3.XM;
      if (var5) {
         var1 = new rdn_3(rdy_3.dm);
      }

      for (eL_2 var7 : var4) {
         if (var5) {
            rxy_3.id_class(var1, var7);
         } else {
            var1.id_class(var7.id_class, var7.id_break);
         }
      }

      return var1;
   }

   public static int id_class(Random var0, int var1, int var2, rdn_3 var3) {
      rdb_3 var4 = var3.id_break();
      int var5 = var4.id_protected();
      if (var5 <= 0) {
         return 0;
      } else {
         if (var2 > 15) {
            var2 = 15;
         }

         int var6 = var0.nextInt(8) + 1 + (var2 >> 1) + var0.nextInt(var2 + 1);
         if (var1 == 0) {
            return Math.max(var6 / 3, 1);
         } else {
            return var1 == 1 ? var6 * 2 / 3 + 1 : Math.max(var6, var2 * 2);
         }
      }
   }

   public static Entry<rXQ, rdn_3> id_class(ev_3 var0, iB_2 var1, Predicate<rdn_3> var2) {
      Map var3 = var0.id_class(var1);
      if (var3.isEmpty()) {
         return null;
      } else {
         ArrayList var4 = Lists.newArrayList();

         for (Entry var6 : var3.entrySet()) {
            rdn_3 var7 = (rdn_3)var6.getValue();
            if (!var7.id_class() && id_class(var0, var7) > 0 && var2.test(var7)) {
               var4.add(var6);
            }
         }

         return var4.isEmpty() ? null : (Entry)var4.get(var1.Sa().nextInt(var4.size()));
      }
   }

   public static boolean id_class(Collection<ev_3> var0, ev_3 var1) {
      for (ev_3 var3 : var0) {
         if (!var3.id_break(var1)) {
            return false;
         }
      }

      return true;
   }

   public static List<eL_2> id_class(int var0, rdn_3 var1, boolean var2) {
      ArrayList var3 = Lists.newArrayList();
      rdb_3 var4 = var1.id_break();
      boolean var5 = var1.id_break() == rdy_3.XM;

      for (ev_3 var7 : rVL.id_boolean) {
         if ((!var7.id_break() || var2) && var7.id_implements() && (var7.id_break.id_class(var4) || var5)) {
            for (int var8 = var7.id_class(); var8 > var7.id_throws() - 1; var8--) {
               if (var0 >= var7.id_class(var8) && var0 <= var7.id_break(var8)) {
                  var3.add(new eL_2(var7, var8));
                  break;
               }
            }
         }
      }

      return var3;
   }

   public static void id_class(List<eL_2> var0, eL_2 var1) {
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         if (!var1.id_class.id_break(((eL_2)var2.next()).id_class)) {
            var2.remove();
         }
      }
   }

   private static void id_class(en_3 var0, Iterable<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         id_class(var0, var3);
      }
   }

   private static void id_class(en_3 var0, rdn_3 var1) {
      if (!var1.id_class()) {
         rcy_3 var2 = var1.id_new();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            String var4 = var2.id_class(var3).id_native("id");
            int var5 = var2.id_class(var3).id_private("lvl");
            rVL.id_boolean.id_break(rqO_2.id_break(var4)).ifPresent(var2x -> var0.accept(var2x, var5));
         }
      }
   }

   public static void id_class(iB_2 var0, an_3 var1) {
      en_3 var2 = (var2x, var3) -> var2x.id_break(var0, var1, var3);
      if (var0 != null) {
         id_class(var2, var0.PY());
      }

      if (var1 instanceof rhd_3) {
         id_class(var2, var0.ss());
      }
   }

   public static void id_class(Map<ev_3, Integer> var0, rdn_3 var1) {
      rcy_3 var2 = new rcy_3();

      for (Entry var4 : var0.entrySet()) {
         ev_3 var5 = (ev_3)var4.getKey();
         if (var5 != null) {
            int var6 = (Integer)var4.getValue();
            rcd_3 var7 = new rcd_3();
            var7.id_class("id", String.valueOf(rVL.id_boolean.id_break(var5)));
            var7.id_class("lvl", (short)var6);
            var2.add(var7);
            if (var1.id_break() == rdy_3.dm) {
               rxy_3.id_class(var1, new eL_2(var5, var6));
            }
         }
      }

      if (var2.isEmpty()) {
         var1.id_byte("Enchantments");
      } else if (var1.id_break() != rdy_3.dm) {
         var1.id_class("Enchantments", var2);
      }
   }

   public static int id_class(Iterable<rdn_3> var0, rye_3 var1) {
      MutableInt var2 = new MutableInt();
      id_class((var2x, var3) -> var2.add(var2x.id_class(var3, var1)), var0);
      return var2.intValue();
   }

   public static float id_class(rdn_3 var0, aL_2 var1) {
      MutableFloat var2 = new MutableFloat();
      id_class((var2x, var3) -> var2.add(var2x.id_class(var3, var1)), var0);
      return var2.floatValue();
   }

   public static float id_class(iB_2 var0) {
      int var1 = id_class(eY_2.id_super, var0);
      return var1 > 0 ? aW_2.id_throws(var1) : 0.0F;
   }

   public static Map<ev_3, Integer> id_class(rdn_3 var0, List<ev_3> var1) {
      rcy_3 var2 = var0.id_break() == rdy_3.dm ? rxy_3.id_protected(var0) : var0.id_new();
      return id_class(var2, var1);
   }

   public static int id_class(ev_3 var0, rdn_3 var1) {
      if (var1 != null && !var1.id_class()) {
         rqO_2 var2 = rVL.id_boolean.id_break(var0);
         rcy_3 var3 = var1.id_new();

         for (int var4 = 0; var4 < var3.size(); var4++) {
            rcd_3 var5 = var3.id_class(var4);
            rqO_2 var6 = rqO_2.id_break(var5.id_native("id"));
            if (var6 != null && var6.equals(var2)) {
               return rfU_2.id_class(var5.id_private("lvl"), 0, 255);
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static Map<ev_3, Integer> id_class(rdn_3 var0) {
      rcy_3 var1 = var0.id_break() == rdy_3.dm ? rxy_3.id_protected(var0) : var0.id_new();
      return id_class(var1);
   }

   public static int id_class(ev_3 var0, iB_2 var1) {
      Collection var2 = var0.id_class(var1).values();
      if (var2 == null) {
         return 0;
      } else {
         int var3 = 0;

         for (rdn_3 var5 : var2) {
            int var6 = id_class(var0, var5);
            if (var6 > var3) {
               var3 = var6;
            }
         }

         return var3;
      }
   }

   public static Map<ev_3, Integer> id_class(rcy_3 var0) {
      LinkedHashMap var1 = Maps.newLinkedHashMap();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         rcd_3 var3 = var0.id_class(var2);
         rVL.id_boolean.id_break(rqO_2.id_break(var3.id_native("id"))).ifPresent(var2x -> var1.put(var2x, var3.id_private("lvl")));
      }

      return var1;
   }

   public static Map<ev_3, Integer> id_class(rcy_3 var0, List<ev_3> var1) {
      LinkedHashMap var2 = Maps.newLinkedHashMap();

      for (int var3 = 0; var3 < var0.size(); var3++) {
         rcd_3 var4 = var0.id_class(var3);
         rVL.id_boolean.id_break(rqO_2.id_break(var4.id_native("id"))).ifPresent(var3x -> {
            if (var1.contains(var3x)) {
               var2.put(var3x, var4.id_private("lvl"));
            }
         });
      }

      return var2;
   }

   public static Entry<rXQ, rdn_3> id_break(ev_3 var0, iB_2 var1) {
      return id_class(var0, var1, var0x -> true);
   }

   public static List<eL_2> id_break(Random var0, rdn_3 var1, int var2, boolean var3) {
      ArrayList var4 = Lists.newArrayList();
      rdb_3 var5 = var1.id_break();
      int var6 = var5.id_protected();
      if (var6 <= 0) {
         return var4;
      } else {
         var2 = var2 + 1 + var0.nextInt(var6 / 4 + 1) + var0.nextInt(var6 / 4 + 1);
         float var7 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         var2 = rfU_2.id_class(Math.round((float)var2 + (float)var2 * var7), 1, Integer.MAX_VALUE);
         List var8 = id_class(var2, var1, var3);
         if (!var8.isEmpty()) {
            var4.add((eL_2)rTE.id_class(var0, var8));

            while (var0.nextInt(50) <= var2) {
               id_class(var8, rqR_2.id_class(var4));
               if (var8.isEmpty()) {
                  break;
               }

               var4.add((eL_2)rTE.id_class(var0, var8));
               var2 /= 2;
            }
         }

         return var4;
      }
   }

   public static int id_break(rdn_3 var0) {
      return id_class(eY_2.id_instanceof, var0);
   }

   public static void id_break(iB_2 var0, an_3 var1) {
      en_3 var2 = (var2x, var3) -> var2x.id_class(var0, var1, var3);
      if (var0 != null) {
         id_class(var2, var0.PY());
      }

      if (var0 instanceof rhd_3) {
         id_class(var2, var0.ss());
      }
   }

   public static int id_break(iB_2 var0) {
      return id_class(eY_2.id_int, var0);
   }

   public static boolean id_throws(rdn_3 var0) {
      return id_class(eY_2.id_short, var0) > 0;
   }

   public static int id_throws(iB_2 var0) {
      return id_class(eY_2.id_implements, var0);
   }

   public static boolean id_finally(iB_2 var0) {
      return id_class(eY_2.id_native, var0) > 0;
   }

   public static int id_catch(iB_2 var0) {
      return id_class(eY_2.id_continue, var0);
   }

   public static int id_catch(rdn_3 var0) {
      return id_class(eY_2.id_abstract, var0);
   }

   public static int id_case(rdn_3 var0) {
      return id_class(eY_2.id_interface, var0);
   }

   public static int id_case(iB_2 var0) {
      return id_class(eY_2.id_this, var0);
   }

   public static boolean id_implements(iB_2 var0) {
      return id_class(eY_2.id_finally, var0) > 0;
   }

   public static boolean id_protected(rdn_3 var0) {
      return id_class(eY_2.id_extends, var0) > 0;
   }

   public static int id_protected(iB_2 var0) {
      return id_class(eY_2.id_case, var0);
   }

   public static boolean id_private(iB_2 var0) {
      return id_class(eY_2.id_catch, var0) > 0;
   }

   public static boolean id_private(rdn_3 var0) {
      return id_class(eY_2.id_long, var0) > 0;
   }
}
