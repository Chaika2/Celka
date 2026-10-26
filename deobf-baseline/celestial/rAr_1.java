package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class rAr_1 {
   private static final List<rAP<rLi_1>> id_class = Lists.newArrayList();
   private static final List<rAP<rdb_3>> id_break = Lists.newArrayList();
   private static final List<rkg_3> id_byte = Lists.newArrayList();
   private static final Predicate<rdn_3> id_protected = var0 -> {
      for (rkg_3 var2 : id_byte) {
         if (var2.id_class(var0)) {
            return true;
         }
      }

      return false;
   };

   protected static boolean id_byte(rdn_3 var0, rdn_3 var1) {
      rLi_1 var2 = rAB.id_protected(var0);
      int var3 = 0;

      for (int var4 = id_class.size(); var3 < var4; var3++) {
         rAP var5 = id_class.get(var3);
         if (var5.id_class == var2 && var5.id_break.id_class(var1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean id_byte(rdn_3 var0) {
      int var1 = 0;

      for (int var2 = id_class.size(); var1 < var2; var1++) {
         if (id_class.get(var1).id_break.id_class(var0)) {
            return true;
         }
      }

      return false;
   }

   public static void id_class() {
      id_class(rdy_3.JA);
      id_class(rdy_3.kk);
      id_class(rdy_3.kQ);
      id_class(rdy_3.JA, rdy_3.hr, rdy_3.kk);
      id_class(rdy_3.kk, rdy_3.kd, rdy_3.kQ);
      id_class(rAS.id_break, rdy_3.Jt, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.Jv, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.dy, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.JH, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.JC, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.XY, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.Jy, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.XW, rAS.id_protected);
      id_class(rAS.id_break, rdy_3.hD, rAS.id_byte);
      id_class(rAS.id_break, rdy_3.JL, rAS.id_throws);
      id_class(rAS.id_throws, rdy_3.dO, rAS.id_case);
      id_class(rAS.id_case, rdy_3.hD, rAS.id_catch);
      id_class(rAS.id_case, rdy_3.Jl, rAS.id_private);
      id_class(rAS.id_catch, rdy_3.Jl, rAS.id_implements);
      id_class(rAS.id_private, rdy_3.hD, rAS.id_implements);
      id_class(rAS.id_throws, rdy_3.Jy, rAS.id_volatile);
      id_class(rAS.id_volatile, rdy_3.hD, rAS.id_final);
      id_class(rAS.id_throws, rdy_3.dy, rAS.id_finally);
      id_class(rAS.id_finally, rdy_3.hD, rAS.id_extends);
      id_class(rAS.id_finally, rdy_3.XW, rAS.id_native);
      id_class(rAS.id_finally, rdy_3.Jl, rAS.id_continue);
      id_class(rAS.id_extends, rdy_3.Jl, rAS.id_super);
      id_class(rAS.id_continue, rdy_3.hD, rAS.id_super);
      id_class(rAS.id_continue, rdy_3.XW, rAS.id_this);
      id_class(rAS.id_throws, rdy_3.Os, rAS.id_else);
      id_class(rAS.id_else, rdy_3.hD, rAS.id_synchronized);
      id_class(rAS.id_else, rdy_3.XW, rAS.id_return);
      id_class(rAS.id_package, rdy_3.Jl, rAS.id_continue);
      id_class(rAS.id_int, rdy_3.Jl, rAS.id_super);
      id_class(rAS.id_throws, rdy_3.XY, rAS.id_package);
      id_class(rAS.id_package, rdy_3.hD, rAS.id_int);
      id_class(rAS.id_package, rdy_3.XW, rAS.id_new);
      id_class(rAS.id_throws, rdy_3.Xc, rAS.id_public);
      id_class(rAS.id_public, rdy_3.hD, rAS.id_goto);
      id_class(rAS.id_throws, rdy_3.Jt, rAS.id_while);
      id_class(rAS.id_while, rdy_3.XW, rAS.id_try);
      id_class(rAS.id_while, rdy_3.Jl, rAS.id_instanceof);
      id_class(rAS.id_try, rdy_3.Jl, rAS.id_throw);
      id_class(rAS.id_instanceof, rdy_3.XW, rAS.id_throw);
      id_class(rAS.id_interface, rdy_3.Jl, rAS.id_instanceof);
      id_class(rAS.id_char, rdy_3.Jl, rAS.id_instanceof);
      id_class(rAS.id_abstract, rdy_3.Jl, rAS.id_throw);
      id_class(rAS.id_throws, rdy_3.JC, rAS.id_interface);
      id_class(rAS.id_interface, rdy_3.hD, rAS.id_char);
      id_class(rAS.id_interface, rdy_3.XW, rAS.id_abstract);
      id_class(rAS.id_throws, rdy_3.Jv, rAS.id_long);
      id_class(rAS.id_long, rdy_3.hD, rAS.id_float);
      id_class(rAS.id_long, rdy_3.XW, rAS.id_void);
      id_class(rAS.id_throws, rdy_3.JH, rAS.id_static);
      id_class(rAS.id_static, rdy_3.hD, rAS.id_import);
      id_class(rAS.id_static, rdy_3.XW, rAS.id_short);
      id_class(rAS.id_break, rdy_3.Jl, rAS.id_default);
      id_class(rAS.id_default, rdy_3.hD, rAS.id_const);
      id_class(rAS.id_throws, rdy_3.ko, rAS.id_boolean);
      id_class(rAS.id_boolean, rdy_3.hD, rAS.id_transient);
   }

   private static void id_class(rdb_3 var0, rdb_3 var1, rdb_3 var2) {
      if (!(var0 instanceof rdU_2)) {
         throw new IllegalArgumentException("Expected a potion, got: " + rVL.id_for.id_break(var0));
      } else if (!(var2 instanceof rdU_2)) {
         throw new IllegalArgumentException("Expected a potion, got: " + rVL.id_for.id_break(var2));
      } else {
         id_break.add(new rAP<>(var0, rkg_3.id_class(var1), var2));
      }
   }

   private static void id_class(rdb_3 var0) {
      if (!(var0 instanceof rdU_2)) {
         throw new IllegalArgumentException("Expected a potion, got: " + rVL.id_for.id_break(var0));
      } else {
         id_byte.add(rkg_3.id_class(var0));
      }
   }

   private static void id_class(rLi_1 var0, rdb_3 var1, rLi_1 var2) {
      id_class.add(new rAP<>(var0, rkg_3.id_class(var1), var2));
   }

   public static boolean id_class(rLi_1 var0) {
      int var1 = 0;

      for (int var2 = id_class.size(); var1 < var2; var1++) {
         if (id_class.get(var1).id_byte == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean id_class(rdn_3 var0) {
      return id_break(var0) || id_byte(var0);
   }

   public static boolean id_class(rdn_3 var0, rdn_3 var1) {
      return !id_protected.test(var0) ? false : id_break(var0, var1) || id_byte(var0, var1);
   }

   protected static boolean id_break(rdn_3 var0) {
      int var1 = 0;

      for (int var2 = id_break.size(); var1 < var2; var1++) {
         if (id_break.get(var1).id_break.id_class(var0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean id_break(rdn_3 var0, rdn_3 var1) {
      rdb_3 var2 = var0.id_break();
      int var3 = 0;

      for (int var4 = id_break.size(); var3 < var4; var3++) {
         rAP var5 = id_break.get(var3);
         if (var5.id_class == var2 && var5.id_break.id_class(var1)) {
            return true;
         }
      }

      return false;
   }

   public static rdn_3 id_protected(rdn_3 var0, rdn_3 var1) {
      if (!var1.id_class()) {
         rLi_1 var2 = rAB.id_protected(var1);
         rdb_3 var3 = var1.id_break();
         int var4 = 0;

         for (int var5 = id_break.size(); var4 < var5; var4++) {
            rAP var6 = id_break.get(var4);
            if (var6.id_class == var3 && var6.id_break.id_class(var0)) {
               return rAB.id_class(new rdn_3((rpL_2)var6.id_byte), var2);
            }
         }

         var4 = 0;

         for (int var8 = id_class.size(); var4 < var8; var4++) {
            rAP var9 = id_class.get(var4);
            if (var9.id_class == var2 && var9.id_break.id_class(var0)) {
               return rAB.id_class(new rdn_3(var3), (rLi_1)var9.id_byte);
            }
         }
      }

      return var1;
   }
}
