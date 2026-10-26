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
   public static int byte_(iB_2 var0) {
      return class_(eY_2.new_, var0);
   }

   public static int byte_(rdn_3 var0) {
      return class_(eY_2.throw_, var0);
   }

   public static rdn_3 class_(Random var0, rdn_3 var1, int var2, boolean var3) {
      List var4 = break_(var0, var1, var2, var3);
      boolean var5 = var1.break_() == rdy_3.XM;
      if (var5) {
         var1 = new rdn_3(rdy_3.dm);
      }

      for (eL_2 var7 : var4) {
         if (var5) {
            rxy_3.class_(var1, var7);
         } else {
            var1.class_(var7.class_, var7.break_);
         }
      }

      return var1;
   }

   public static int class_(Random var0, int var1, int var2, rdn_3 var3) {
      rdb_3 var4 = var3.break_();
      int var5 = var4.protected_();
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

   public static Entry<rXQ, rdn_3> class_(ev_3 var0, iB_2 var1, Predicate<rdn_3> var2) {
      Map var3 = var0.class_(var1);
      if (var3.isEmpty()) {
         return null;
      } else {
         ArrayList var4 = Lists.newArrayList();

         for (Entry var6 : var3.entrySet()) {
            rdn_3 var7 = (rdn_3)var6.getValue();
            if (!var7.class_() && class_(var0, var7) > 0 && var2.test(var7)) {
               var4.add(var6);
            }
         }

         return var4.isEmpty() ? null : (Entry)var4.get(var1.Sa().nextInt(var4.size()));
      }
   }

   public static boolean class_(Collection<ev_3> var0, ev_3 var1) {
      for (ev_3 var3 : var0) {
         if (!var3.break_(var1)) {
            return false;
         }
      }

      return true;
   }

   public static List<eL_2> class_(int var0, rdn_3 var1, boolean var2) {
      ArrayList var3 = Lists.newArrayList();
      rdb_3 var4 = var1.break_();
      boolean var5 = var1.break_() == rdy_3.XM;

      for (ev_3 var7 : rVL.boolean_) {
         if ((!var7.break_() || var2) && var7.implements_() && (var7.break_.class_(var4) || var5)) {
            for (int var8 = var7.class_(); var8 > var7.throws_() - 1; var8--) {
               if (var0 >= var7.class_(var8) && var0 <= var7.break_(var8)) {
                  var3.add(new eL_2(var7, var8));
                  break;
               }
            }
         }
      }

      return var3;
   }

   public static void class_(List<eL_2> var0, eL_2 var1) {
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         if (!var1.class_.break_(((eL_2)var2.next()).class_)) {
            var2.remove();
         }
      }
   }

   private static void class_(en_3 var0, Iterable<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         class_(var0, var3);
      }
   }

   private static void class_(en_3 var0, rdn_3 var1) {
      if (!var1.class_()) {
         rcy_3 var2 = var1.new_();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            String var4 = var2.class_(var3).native_("id");
            int var5 = var2.class_(var3).private_("lvl");
            rVL.boolean_.break_(rqO_2.break_(var4)).ifPresent(var2x -> var0.accept(var2x, var5));
         }
      }
   }

   public static void class_(iB_2 var0, an_3 var1) {
      en_3 var2 = (var2x, var3) -> var2x.break_(var0, var1, var3);
      if (var0 != null) {
         class_(var2, var0.PY());
      }

      if (var1 instanceof rhd_3) {
         class_(var2, var0.ss());
      }
   }

   public static void class_(Map<ev_3, Integer> var0, rdn_3 var1) {
      rcy_3 var2 = new rcy_3();

      for (Entry var4 : var0.entrySet()) {
         ev_3 var5 = (ev_3)var4.getKey();
         if (var5 != null) {
            int var6 = (Integer)var4.getValue();
            rcd_3 var7 = new rcd_3();
            var7.class_("id", String.valueOf(rVL.boolean_.break_(var5)));
            var7.class_("lvl", (short)var6);
            var2.add(var7);
            if (var1.break_() == rdy_3.dm) {
               rxy_3.class_(var1, new eL_2(var5, var6));
            }
         }
      }

      if (var2.isEmpty()) {
         var1.byte_("Enchantments");
      } else if (var1.break_() != rdy_3.dm) {
         var1.class_("Enchantments", var2);
      }
   }

   public static int class_(Iterable<rdn_3> var0, rye_3 var1) {
      MutableInt var2 = new MutableInt();
      class_((var2x, var3) -> var2.add(var2x.class_(var3, var1)), var0);
      return var2.intValue();
   }

   public static float class_(rdn_3 var0, aL_2 var1) {
      MutableFloat var2 = new MutableFloat();
      class_((var2x, var3) -> var2.add(var2x.class_(var3, var1)), var0);
      return var2.floatValue();
   }

   public static float class_(iB_2 var0) {
      int var1 = class_(eY_2.super_, var0);
      return var1 > 0 ? aW_2.throws_(var1) : 0.0F;
   }

   public static Map<ev_3, Integer> class_(rdn_3 var0, List<ev_3> var1) {
      rcy_3 var2 = var0.break_() == rdy_3.dm ? rxy_3.protected_(var0) : var0.new_();
      return class_(var2, var1);
   }

   public static int class_(ev_3 var0, rdn_3 var1) {
      if (var1 != null && !var1.class_()) {
         rqO_2 var2 = rVL.boolean_.break_(var0);
         rcy_3 var3 = var1.new_();

         for (int var4 = 0; var4 < var3.size(); var4++) {
            rcd_3 var5 = var3.class_(var4);
            rqO_2 var6 = rqO_2.break_(var5.native_("id"));
            if (var6 != null && var6.equals(var2)) {
               return rfU_2.class_(var5.private_("lvl"), 0, 255);
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static Map<ev_3, Integer> class_(rdn_3 var0) {
      rcy_3 var1 = var0.break_() == rdy_3.dm ? rxy_3.protected_(var0) : var0.new_();
      return class_(var1);
   }

   public static int class_(ev_3 var0, iB_2 var1) {
      Collection var2 = var0.class_(var1).values();
      if (var2 == null) {
         return 0;
      } else {
         int var3 = 0;

         for (rdn_3 var5 : var2) {
            int var6 = class_(var0, var5);
            if (var6 > var3) {
               var3 = var6;
            }
         }

         return var3;
      }
   }

   public static Map<ev_3, Integer> class_(rcy_3 var0) {
      LinkedHashMap var1 = Maps.newLinkedHashMap();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         rcd_3 var3 = var0.class_(var2);
         rVL.boolean_.break_(rqO_2.break_(var3.native_("id"))).ifPresent(var2x -> var1.put(var2x, var3.private_("lvl")));
      }

      return var1;
   }

   public static Map<ev_3, Integer> class_(rcy_3 var0, List<ev_3> var1) {
      LinkedHashMap var2 = Maps.newLinkedHashMap();

      for (int var3 = 0; var3 < var0.size(); var3++) {
         rcd_3 var4 = var0.class_(var3);
         rVL.boolean_.break_(rqO_2.break_(var4.native_("id"))).ifPresent(var3x -> {
            if (var1.contains(var3x)) {
               var2.put(var3x, var4.private_("lvl"));
            }
         });
      }

      return var2;
   }

   public static Entry<rXQ, rdn_3> break_(ev_3 var0, iB_2 var1) {
      return class_(var0, var1, var0x -> true);
   }

   public static List<eL_2> break_(Random var0, rdn_3 var1, int var2, boolean var3) {
      ArrayList var4 = Lists.newArrayList();
      rdb_3 var5 = var1.break_();
      int var6 = var5.protected_();
      if (var6 <= 0) {
         return var4;
      } else {
         var2 = var2 + 1 + var0.nextInt(var6 / 4 + 1) + var0.nextInt(var6 / 4 + 1);
         float var7 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         var2 = rfU_2.class_(Math.round((float)var2 + (float)var2 * var7), 1, Integer.MAX_VALUE);
         List var8 = class_(var2, var1, var3);
         if (!var8.isEmpty()) {
            var4.add((eL_2)rTE.class_(var0, var8));

            while (var0.nextInt(50) <= var2) {
               class_(var8, rqR_2.class_(var4));
               if (var8.isEmpty()) {
                  break;
               }

               var4.add((eL_2)rTE.class_(var0, var8));
               var2 /= 2;
            }
         }

         return var4;
      }
   }

   public static int break_(rdn_3 var0) {
      return class_(eY_2.instanceof_, var0);
   }

   public static void break_(iB_2 var0, an_3 var1) {
      en_3 var2 = (var2x, var3) -> var2x.class_(var0, var1, var3);
      if (var0 != null) {
         class_(var2, var0.PY());
      }

      if (var0 instanceof rhd_3) {
         class_(var2, var0.ss());
      }
   }

   public static int break_(iB_2 var0) {
      return class_(eY_2.int_, var0);
   }

   public static boolean throws_(rdn_3 var0) {
      return class_(eY_2.short_, var0) > 0;
   }

   public static int throws_(iB_2 var0) {
      return class_(eY_2.implements_, var0);
   }

   public static boolean finally_(iB_2 var0) {
      return class_(eY_2.native_, var0) > 0;
   }

   public static int catch_(iB_2 var0) {
      return class_(eY_2.continue_, var0);
   }

   public static int catch_(rdn_3 var0) {
      return class_(eY_2.abstract_, var0);
   }

   public static int case_(rdn_3 var0) {
      return class_(eY_2.interface_, var0);
   }

   public static int case_(iB_2 var0) {
      return class_(eY_2.this_, var0);
   }

   public static boolean implements_(iB_2 var0) {
      return class_(eY_2.finally_, var0) > 0;
   }

   public static boolean protected_(rdn_3 var0) {
      return class_(eY_2.extends_, var0) > 0;
   }

   public static int protected_(iB_2 var0) {
      return class_(eY_2.case_, var0);
   }

   public static boolean private_(iB_2 var0) {
      return class_(eY_2.catch_, var0) > 0;
   }

   public static boolean private_(rdn_3 var0) {
      return class_(eY_2.long_, var0) > 0;
   }
}
