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
   public static String class_ = "gameteststructures";

   public static Collection<rfH_2> byte_(rfH_2 var0, int var1, rrEm_1 var2) {
      ArrayList var3 = Lists.newArrayList();
      rfl_3 var4 = new rfl_3(var0);
      var4 = var4.class_((double)var1);

      for (int var5 = (int)var4.class_; var5 <= (int)var4.protected_; var5++) {
         for (int var6 = (int)var4.break_; var6 <= (int)var4.throws_; var6++) {
            for (int var7 = (int)var4.byte_; var7 <= (int)var4.case_; var7++) {
               rfH_2 var8 = new rfH_2(var5, var6, var7);
               xc_3 var9 = var2.byte_(var8);
               if (var9.class_(xu_3.Js)) {
                  var3.add(var8);
               }
            }
         }
      }

      return var3;
   }

   private static boolean class_(rfH_2 var0, rfH_2 var1, rrEm_1 var2) {
      ryG_2 var3 = (ryG_2)var2.class_(var0);
      rfl_3 var4 = class_(var3).class_(1.0);
      return var4.case_(rjU_2.class_((rja_3)var1));
   }

   private static void class_(int var0, rfH_2 var1, rrEm_1 var2) {
      xc_3 var3 = null;
      rKQ var4 = rKQ.class_(var2.new_().break_(rVL.n));
      if (var4 instanceof rKQ) {
         xc_3[] var5 = var4.catch_();
         if (var1.c_() < var0 && var1.c_() <= var5.length) {
            var3 = var5[var1.c_() - 1];
         }
      } else if (var1.c_() == var0 - 1) {
         var3 = var2.implements_(var1).throws_().throws_().class_();
      } else if (var1.c_() < var0 - 1) {
         var3 = var2.implements_(var1).throws_().throws_().break_();
      }

      if (var3 == null) {
         var3 = xu_3.class_.continue_();
      }

      Rd_1 var6 = new Rd_1(var3, Collections.emptySet(), (rcd_3)null);
      var6.class_(var2, var1, 2);
      var2.class_(var1, var3.break_());
   }

   private static rcd_3 class_(Path var0) {
      try {
         BufferedReader var1 = Files.newBufferedReader(var0);
         String var2 = IOUtils.toString(var1);
         return rcH_2.class_(var2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + var0, var4);
      }
   }

   private static ryG_2 class_(String var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3, boolean var4) {
      var3.break_(var1, xu_3.Js.continue_());
      ryG_2 var5 = (ryG_2)var3.class_(var1);
      var5.class_(rCD.LOAD);
      var5.class_(var2);
      var5.class_(false);
      var5.class_(new rqO_2(var0));
      var5.class_(var3, var4);
      if (var5.extends_() != rfH_2.protected_) {
         return var5;
      } else {
         rrPl_1 var6 = class_(var0, var3);
         var5.class_(var3, var4, var6);
         if (var5.extends_() == rfH_2.protected_) {
            throw new RuntimeException("Failed to load structure " + var0);
         } else {
            return var5;
         }
      }
   }

   public static rqd_3 class_(int var0) {
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

   private static void class_(rfH_2 var0, rrEm_1 var1) {
      rfj_3 var2 = new rfj_3(var0);

      for (int var3 = -1; var3 < 4; var3++) {
         for (int var4 = -1; var4 < 4; var4++) {
            int var5 = var2.break_ + var3;
            int var6 = var2.byte_ + var4;
            var1.class_(var5, var6, true);
         }
      }
   }

   public static ryG_2 class_(String var0, rfH_2 var1, rqd_3 var2, int var3, rrEm_1 var4, boolean var5) {
      rfH_2 var6 = class_(var0, var4).class_();
      rfi_3 var7 = class_(var1, var6, var2);
      rfH_2 var8;
      if (var2 == rqd_3.NONE) {
         var8 = var1;
      } else if (var2 == rqd_3.CLOCKWISE_90) {
         var8 = var1.break_(var6.d_() - 1, 0, 0);
      } else if (var2 == rqd_3.CLOCKWISE_180) {
         var8 = var1.break_(var6.b_() - 1, 0, var6.d_() - 1);
      } else {
         if (var2 != rqd_3.COUNTERCLOCKWISE_90) {
            throw new IllegalArgumentException("Invalid rotation: " + var2);
         }

         var8 = var1.break_(0, 0, var6.b_() - 1);
      }

      class_(var1, var4);
      class_(var7, var1.c_(), var4);
      ryG_2 var9 = class_(var0, var8, var2, var4, var5);
      var4.synchronized_().class_(var7, true, false);
      var4.class_(var7);
      return var9;
   }

   public static void class_(String var0, rfH_2 var1, rfH_2 var2, rqd_3 var3, rrEm_1 var4) {
      rfi_3 var5 = class_(var1, var2, var3);
      class_(var5, var1.c_(), var4);
      var4.break_(var1, xu_3.Js.continue_());
      ryG_2 var6 = (ryG_2)var4.class_(var1);
      var6.class_(false);
      var6.class_(new rqO_2(var0));
      var6.break_(var2);
      var6.class_(rCD.SAVE);
      var6.throws_(true);
   }

   public static void class_(rfH_2 var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3) {
      rfH_2 var4 = rrPl_1.class_(var0.break_(var1), rpa_3.NONE, var2, var0);
      var3.break_(var4, xu_3.SZ.continue_());
      rHZ var5 = (rHZ)var3.class_(var4);
      var5.throws_().class_("test runthis");
      rfH_2 var6 = rrPl_1.class_(var4.break_(0, 0, -1), rpa_3.NONE, var2, var4);
      var3.break_(var6, xu_3.Pp.continue_().class_(var2));
   }

   private static rrPl_1 class_(String var0, rrEm_1 var1) {
      rrPt_1 var2 = var1.O();
      rrPl_1 var3 = var2.break_(new rqO_2(var0));
      if (var3 != null) {
         return var3;
      } else {
         String var4 = var0 + ".snbt";
         Path var5 = Paths.get(class_, var4);
         rcd_3 var6 = class_(var5);
         if (var6 == null) {
            throw new RuntimeException("Could not find structure file " + var5 + ", and the structure is not available in the world structures either.");
         } else {
            return var2.class_(var6);
         }
      }
   }

   public static rfl_3 class_(ryG_2 var0) {
      rfH_2 var1 = var0.char_();
      rfH_2 var2 = var1.break_(var0.extends_().break_(-1, -1, -1));
      rfH_2 var3 = rrPl_1.class_(var2, rpa_3.NONE, var0.volatile_(), var1);
      return new rfl_3(var1, var3);
   }

   public static Optional<rfH_2> class_(rfH_2 var0, int var1, rrEm_1 var2) {
      return byte_(var0, var1, var2).stream().filter(var2x -> class_(var2x, var0, var2)).findFirst();
   }

   public static rfi_3 class_(rfH_2 var0, rfH_2 var1, rqd_3 var2) {
      rfH_2 var3 = var0.break_(var1).break_(-1, -1, -1);
      rfH_2 var4 = rrPl_1.class_(var3, rpa_3.NONE, var2, var0);
      rfi_3 var5 = rfi_3.class_(var0.b_(), var0.c_(), var0.d_(), var4.b_(), var4.c_(), var4.d_());
      int var6 = Math.min(var5.class_, var5.protected_);
      int var7 = Math.min(var5.byte_, var5.case_);
      rfH_2 var8 = new rfH_2(var0.b_() - var6, 0, var0.d_() - var7);
      var5.class_(var8);
      return var5;
   }

   public static void class_(rfi_3 var0, int var1, rrEm_1 var2) {
      rfi_3 var3 = new rfi_3(var0.class_ - 2, var0.break_ - 3, var0.byte_ - 3, var0.protected_ + 3, var0.throws_ + 20, var0.case_ + 3);
      rfH_2.class_(var3).forEach(var2x -> class_(var1, var2x, var2));
      var2.synchronized_().class_(var3, true, false);
      var2.class_(var3);
      rfl_3 var4 = new rfl_3((double)var3.class_, (double)var3.break_, (double)var3.byte_, (double)var3.protected_, (double)var3.throws_, (double)var3.case_);
      List var5 = var2.class_(an_3.class, var4, var0x -> !(var0x instanceof rhd_3));
      var5.forEach(an_3::PD);
   }

   public static rfH_2 break_(rfH_2 var0, int var1, rrEm_1 var2) {
      Comparator var3 = Comparator.comparingInt(var1x -> var1x.implements_(var0));
      Collection var4 = byte_(var0, var1, var2);
      Optional var5 = var4.stream().min(var3);
      return (rfH_2)var5.orElse((rfH_2)null);
   }

   public static rfi_3 break_(ryG_2 var0) {
      rfH_2 var1 = var0.char_();
      rfH_2 var2 = var1.break_(var0.extends_().break_(-1, -1, -1));
      rfH_2 var3 = rrPl_1.class_(var2, rpa_3.NONE, var0.volatile_(), var1);
      return new rfi_3(var1, var3);
   }
}
