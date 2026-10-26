package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Streams;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class rHr_1 {
   public static rll_3 class_ = new rlg_3();

   public static void class_(rrEm_1 var0, rfH_2 var1, rlT_2 var2, int var3) {
      var2.class_();
      rfH_2 var4 = var1.break_(-var3, 0, -var3);
      rfH_2 var5 = var1.break_(var3, 0, var3);
      rfH_2.break_(var4, var5).filter(var1x -> var0.byte_(var1x).class_(xu_3.Js)).forEach(var1x -> {
         ryG_2 var2x = (ryG_2)var0.class_(var1x);
         rfH_2 var3x = var2x.char_();
         rfi_3 var4x = rlH_2.break_(var2x);
         rlH_2.class_(var4x, var3x.c_(), var0);
      });
   }

   private static void class_(rrEm_1 var0, rfH_2 var1, String var2) {
      ruP_2.class_(var0, var1, var2, -2130771968, Integer.MAX_VALUE);
   }

   static void class_(rle_3 var0, String var1) {
      rrEm_1 var2 = var0.throws_();
      rfH_2 var3 = var0.protected_();
      rfH_2 var4 = new rfH_2(-1, 1, -1);
      rfH_2 var5 = rrPl_1.class_(var3.break_(var4), rpa_3.NONE, var0.final_(), var3);
      var2.break_(var5, xu_3.Xs.continue_().class_(var0.final_()));
      xc_3 var6 = var2.byte_(var5);
      rdn_3 var7 = class_(var0.byte_(), var0.extends_(), var1);
      kv_3.class_(var2, var5, var6, var7);
   }

   static void class_(rle_3 var0, xd_3 var1) {
      rrEm_1 var2 = var0.throws_();
      rfH_2 var3 = var0.protected_();
      rfH_2 var4 = new rfH_2(-1, -1, -1);
      rfH_2 var5 = rrPl_1.class_(var3.break_(var4), rpa_3.NONE, var0.final_(), var3);
      var2.break_(var5, xu_3.Sv.continue_().class_(var0.final_()));
      rfH_2 var6 = var5.break_(0, 1, 0);
      var2.break_(var6, var1.continue_());

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            rfH_2 var9 = var5.break_(var7, -1, var8);
            var2.break_(var9, xu_3.rw.continue_());
         }
      }
   }

   static void class_(rle_3 var0) {
      Throwable var1 = var0.finally_();
      String var2 = (var0.extends_() ? "" : "(optional) ") + var0.byte_() + " failed! " + rqR_2.protected_(var1);
      class_(var0.throws_(), var0.extends_() ? rgF_2.RED : rgF_2.YELLOW, var2);
      if (var1 instanceof rlq_3 var3) {
         class_(var0.throws_(), var3.break_(), var3.class_());
      }

      class_.class_(var0);
   }

   public static Collection<rlp_3> class_(Collection<rlj_3> var0) {
      HashMap var1 = Maps.newHashMap();
      var0.forEach(var1x -> {
         String var2 = var1x.throws_();
         Collection var3 = var1.computeIfAbsent(var2, var0xx -> Lists.newArrayList());
         var3.add(var1x);
      });
      return var1.keySet().stream().flatMap(var1x -> {
         Collection var2 = (Collection)var1.get(var1x);
         Consumer var3 = rlR_2.byte_(var1x);
         MutableInt var4 = new MutableInt();
         return Streams.stream(Iterables.partition(var2, 100)).map(var4x -> new rlp_3(var1x + ":" + var4.incrementAndGet(), var2, var3));
      }).collect(Collectors.toList());
   }

   public static Collection<rle_3> class_(Collection<rlp_3> var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3, rlT_2 var4, int var5) {
      rlI_2 var6 = new rlI_2(var0, var1, var2, var3, var4, var5);
      var6.break_();
      return var6.class_();
   }

   public static void class_(rle_3 var0, rfH_2 var1, rlT_2 var2) {
      var0.class_();
      var2.class_(var0);
      var0.class_(new rHP());
      var0.class_(var1, 2);
   }

   public static void class_(rrEm_1 var0) {
      ruP_2.class_(var0);
   }

   private static rdn_3 class_(String var0, boolean var1, String var2) {
      rdn_3 var3 = new rdn_3(rdy_3.xi);
      rcy_3 var4 = new rcy_3();
      StringBuffer var5 = new StringBuffer();
      Arrays.stream(var0.split("\\.")).forEach(var1x -> var5.append(var1x).append('\n'));
      if (!var1) {
         var5.append("(optional)\n");
      }

      var5.append("-------------------\n");
      var4.add(rca_3.class_(var5.toString() + var2));
      var3.class_("pages", var4);
      return var3;
   }

   private static void class_(rrEm_1 var0, rgF_2 var1, String var2) {
      var0.class_(var0x -> true).forEach(var2x -> var2x.class_(new rgN_2(var2).class_(var1), rqR_2.break_));
   }

   public static Collection<rle_3> break_(Collection<rlj_3> var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3, rlT_2 var4, int var5) {
      return class_(class_(var0), var1, var2, var3, var4, var5);
   }
}
