package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.io.IOUtils;

public class rlH_2 {
   public static String id_class = "gameteststructures";

   public static Collection<rfH_2> id_byte(rfH_2 var0, int var1, rrEm_1 var2) {
      ArrayList var3 = Lists.newArrayList();
      rfl_3 var4 = new rfl_3(var0);
      var4 = var4.id_class((double)var1);

      for (int var5 = (int)var4.id_class; var5 <= (int)var4.id_protected; var5++) {
         for (int var6 = (int)var4.id_break; var6 <= (int)var4.id_throws; var6++) {
            for (int var7 = (int)var4.id_byte; var7 <= (int)var4.id_case; var7++) {
               rfH_2 var8 = new rfH_2(var5, var6, var7);
               xc_3 var9 = var2.id_byte(var8);
               if (var9.id_class(xu_3.Js)) {
                  var3.add(var8);
               }
            }
         }
      }

      return var3;
   }

   private static boolean id_class(rfH_2 var0, rfH_2 var1, rrEm_1 var2) {
      ryG_2 var3 = (ryG_2)var2.id_class(var0);
      rfl_3 var4 = id_class(var3).id_class(1.0);
      return var4.id_case(rjU_2.id_class((rja_3)var1));
   }

   private static void id_class(int var0, rfH_2 var1, rrEm_1 var2) {
      xc_3 var3 = null;
      rKQ var4 = rKQ.id_class(var2.id_new().id_break(rVL.n));
      if (var4 instanceof rKQ) {
         xc_3[] var5 = var4.id_catch();
         if (var1.c_() < var0 && var1.c_() <= var5.length) {
            var3 = var5[var1.c_() - 1];
         }
      } else if (var1.c_() == var0 - 1) {
         var3 = var2.id_implements(var1).id_throws().id_throws().id_class();
      } else if (var1.c_() < var0 - 1) {
         var3 = var2.id_implements(var1).id_throws().id_throws().id_break();
      }

      if (var3 == null) {
         var3 = xu_3.id_class.id_continue();
      }

      Rd_1 var6 = new Rd_1(var3, Collections.emptySet(), (rcd_3)null);
      var6.id_class(var2, var1, 2);
      var2.id_class(var1, var3.id_break());
   }

   private static rcd_3 id_class(Path var0) {
      try {
         BufferedReader var1 = Files.newBufferedReader(var0);
         String var2 = IOUtils.toString(var1);
         return rcH_2.id_class(var2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + var0, var4);
      }
   }

   private static ryG_2 id_class(String var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3, boolean var4) {
      var3.id_break(var1, xu_3.Js.id_continue());
      ryG_2 var5 = (ryG_2)var3.id_class(var1);
      var5.id_class(rCD.LOAD);
      var5.id_class(var2);
      var5.id_class(false);
      var5.id_class(new rqO_2(var0));
      var5.id_class(var3, var4);
      if (var5.id_extends() != rfH_2.id_protected) {
         return var5;
      } else {
         rrPl_1 var6 = id_class(var0, var3);
         var5.id_class(var3, var4, var6);
         if (var5.id_extends() == rfH_2.id_protected) {
            throw new RuntimeException("Failed to load structure " + var0);
         } else {
            return var5;
         }
      }
   }

   public static rqd_3 id_class(int var0) {
      switch (var0) {
         case 0:
            return rqd_3.NONE;
         case 1:
            return rqd_3.CLOCKWISE_90;
         case 2:
            return rqd_3.CLOCKWISE_180;
         case 3:
            return rqd_3.COUNTERCLOCKWISE_90;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + var0);
      }
   }

   private static void id_class(rfH_2 var0, rrEm_1 var1) {
      rfj_3 var2 = new rfj_3(var0);

      for (int var3 = -1; var3 < 4; var3++) {
         for (int var4 = -1; var4 < 4; var4++) {
            int var5 = var2.id_break + var3;
            int var6 = var2.id_byte + var4;
            var1.id_class(var5, var6, true);
         }
      }
   }

   public static ryG_2 id_class(String var0, rfH_2 var1, rqd_3 var2, int var3, rrEm_1 var4, boolean var5) {
      rfH_2 var6 = id_class(var0, var4).id_class();
      rfi_3 var7 = id_class(var1, var6, var2);
      rfH_2 var8;
      if (var2 == rqd_3.NONE) {
         var8 = var1;
      } else if (var2 == rqd_3.CLOCKWISE_90) {
         var8 = var1.id_break(var6.d_() - 1, 0, 0);
      } else if (var2 == rqd_3.CLOCKWISE_180) {
         var8 = var1.id_break(var6.b_() - 1, 0, var6.d_() - 1);
      } else {
         if (var2 != rqd_3.COUNTERCLOCKWISE_90) {
            throw new IllegalArgumentException("Invalid rotation: " + var2);
         }

         var8 = var1.id_break(0, 0, var6.b_() - 1);
      }

      id_class(var1, var4);
      id_class(var7, var1.c_(), var4);
      ryG_2 var9 = id_class(var0, var8, var2, var4, var5);
      var4.id_synchronized().id_class(var7, true, false);
      var4.id_class(var7);
      return var9;
   }

   public static void id_class(String var0, rfH_2 var1, rfH_2 var2, rqd_3 var3, rrEm_1 var4) {
      rfi_3 var5 = id_class(var1, var2, var3);
      id_class(var5, var1.c_(), var4);
      var4.id_break(var1, xu_3.Js.id_continue());
      ryG_2 var6 = (ryG_2)var4.id_class(var1);
      var6.id_class(false);
      var6.id_class(new rqO_2(var0));
      var6.id_break(var2);
      var6.id_class(rCD.SAVE);
      var6.id_throws(true);
   }

   public static void id_class(rfH_2 var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3) {
      rfH_2 var4 = rrPl_1.id_class(var0.id_break(var1), rpa_3.NONE, var2, var0);
      var3.id_break(var4, xu_3.SZ.id_continue());
      rHZ var5 = (rHZ)var3.id_class(var4);
      var5.id_throws().id_class("test runthis");
      rfH_2 var6 = rrPl_1.id_class(var4.id_break(0, 0, -1), rpa_3.NONE, var2, var4);
      var3.id_break(var6, xu_3.Pp.id_continue().id_class(var2));
   }

   private static rrPl_1 id_class(String var0, rrEm_1 var1) {
      rrPt_1 var2 = var1.O();
      rrPl_1 var3 = var2.id_break(new rqO_2(var0));
      if (var3 != null) {
         return var3;
      } else {
         String var4 = var0 + ".snbt";
         Path var5 = Paths.get(id_class, var4);
         rcd_3 var6 = id_class(var5);
         if (var6 == null) {
            throw new RuntimeException("Could not find structure file " + var5 + ", and the structure is not available in the world structures either.");
         } else {
            return var2.id_class(var6);
         }
      }
   }

   public static rfl_3 id_class(ryG_2 var0) {
      rfH_2 var1 = var0.id_char();
      rfH_2 var2 = var1.id_break(var0.id_extends().id_break(-1, -1, -1));
      rfH_2 var3 = rrPl_1.id_class(var2, rpa_3.NONE, var0.id_volatile(), var1);
      return new rfl_3(var1, var3);
   }

   public static Optional<rfH_2> id_class(rfH_2 var0, int var1, rrEm_1 var2) {
      return id_byte(var0, var1, var2).stream().filter(var2x -> id_class(var2x, var0, var2)).findFirst();
   }

   public static rfi_3 id_class(rfH_2 var0, rfH_2 var1, rqd_3 var2) {
      rfH_2 var3 = var0.id_break(var1).id_break(-1, -1, -1);
      rfH_2 var4 = rrPl_1.id_class(var3, rpa_3.NONE, var2, var0);
      rfi_3 var5 = rfi_3.id_class(var0.b_(), var0.c_(), var0.d_(), var4.b_(), var4.c_(), var4.d_());
      int var6 = Math.min(var5.id_class, var5.id_protected);
      int var7 = Math.min(var5.id_byte, var5.id_case);
      rfH_2 var8 = new rfH_2(var0.b_() - var6, 0, var0.d_() - var7);
      var5.id_class(var8);
      return var5;
   }

   public static void id_class(rfi_3 var0, int var1, rrEm_1 var2) {
      rfi_3 var3 = new rfi_3(var0.id_class - 2, var0.id_break - 3, var0.id_byte - 3, var0.id_protected + 3, var0.id_throws + 20, var0.id_case + 3);
      rfH_2.id_class(var3).forEach(var2x -> id_class(var1, var2x, var2));
      var2.id_synchronized().id_class(var3, true, false);
      var2.id_class(var3);
      rfl_3 var4 = new rfl_3(
         (double)var3.id_class, (double)var3.id_break, (double)var3.id_byte, (double)var3.id_protected, (double)var3.id_throws, (double)var3.id_case
      );
      List var5 = var2.id_class(an_3.class, var4, var0x -> !(var0x instanceof rhd_3));
      var5.forEach(an_3::PD);
   }

   public static rfH_2 id_break(rfH_2 var0, int var1, rrEm_1 var2) {
      Comparator var3 = Comparator.comparingInt(var1x -> var1x.id_implements(var0));
      Collection var4 = id_byte(var0, var1, var2);
      Optional var5 = var4.stream().min(var3);
      return (rfH_2)var5.orElse((rfH_2)null);
   }

   public static rfi_3 id_break(ryG_2 var0) {
      rfH_2 var1 = var0.id_char();
      rfH_2 var2 = var1.id_break(var0.id_extends().id_break(-1, -1, -1));
      rfH_2 var3 = rrPl_1.id_class(var2, rpa_3.NONE, var0.id_volatile(), var1);
      return new rfi_3(var1, var3);
   }
}
