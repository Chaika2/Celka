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
   public static rll_3 id_class = new rlg_3();

   public static void id_class(rrEm_1 var0, rfH_2 var1, rlT_2 var2, int var3) {
      var2.id_class();
      rfH_2 var4 = var1.id_break(-var3, 0, -var3);
      rfH_2 var5 = var1.id_break(var3, 0, var3);
      rfH_2.id_break(var4, var5).filter(var1x -> var0.id_byte(var1x).id_class(xu_3.Js)).forEach(var1x -> {
         ryG_2 var2x = (ryG_2)var0.id_class(var1x);
         rfH_2 var3x = var2x.id_char();
         rfi_3 var4x = rlH_2.id_break(var2x);
         rlH_2.id_class(var4x, var3x.c_(), var0);
      });
   }

   private static void id_class(rrEm_1 var0, rfH_2 var1, String var2) {
      ruP_2.id_class(var0, var1, var2, -2130771968, Integer.MAX_VALUE);
   }

   static void id_class(rle_3 var0, String var1) {
      rrEm_1 var2 = var0.id_throws();
      rfH_2 var3 = var0.id_protected();
      rfH_2 var4 = new rfH_2(-1, 1, -1);
      rfH_2 var5 = rrPl_1.id_class(var3.id_break(var4), rpa_3.NONE, var0.id_final(), var3);
      var2.id_break(var5, xu_3.Xs.id_continue().id_class(var0.id_final()));
      xc_3 var6 = var2.id_byte(var5);
      rdn_3 var7 = id_class(var0.id_byte(), var0.id_extends(), var1);
      kv_3.id_class(var2, var5, var6, var7);
   }

   static void id_class(rle_3 var0, xd_3 var1) {
      rrEm_1 var2 = var0.id_throws();
      rfH_2 var3 = var0.id_protected();
      rfH_2 var4 = new rfH_2(-1, -1, -1);
      rfH_2 var5 = rrPl_1.id_class(var3.id_break(var4), rpa_3.NONE, var0.id_final(), var3);
      var2.id_break(var5, xu_3.Sv.id_continue().id_class(var0.id_final()));
      rfH_2 var6 = var5.id_break(0, 1, 0);
      var2.id_break(var6, var1.id_continue());

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            rfH_2 var9 = var5.id_break(var7, -1, var8);
            var2.id_break(var9, xu_3.rw.id_continue());
         }
      }
   }

   static void id_class(rle_3 var0) {
      Throwable var1 = var0.id_finally();
      String var2 = (var0.id_extends() ? "" : "(optional) ") + var0.id_byte() + " failed! " + rqR_2.id_protected(var1);
      id_class(var0.id_throws(), var0.id_extends() ? rgF_2.RED : rgF_2.YELLOW, var2);
      if (var1 instanceof rlq_3 var3) {
         id_class(var0.id_throws(), var3.id_break(), var3.id_class());
      }

      id_class.id_class(var0);
   }

   public static Collection<rlp_3> id_class(Collection<rlj_3> var0) {
      HashMap var1 = Maps.newHashMap();
      var0.forEach(var1x -> {
         String var2 = var1x.id_throws();
         Collection var3 = var1.computeIfAbsent(var2, var0xx -> Lists.newArrayList());
         var3.add(var1x);
      });
      return var1.keySet().stream().flatMap(var1x -> {
         Collection var2 = (Collection)var1.get(var1x);
         Consumer var3 = rlR_2.id_byte(var1x);
         MutableInt var4 = new MutableInt();
         return Streams.stream(Iterables.partition(var2, 100)).map(var4x -> new rlp_3(var1x + ":" + var4.incrementAndGet(), var2, var3));
      }).collect(Collectors.toList());
   }

   public static Collection<rle_3> id_class(Collection<rlp_3> var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3, rlT_2 var4, int var5) {
      rlI_2 var6 = new rlI_2(var0, var1, var2, var3, var4, var5);
      var6.id_break();
      return var6.id_class();
   }

   public static void id_class(rle_3 var0, rfH_2 var1, rlT_2 var2) {
      var0.id_class();
      var2.id_class(var0);
      var0.id_class(new rHP());
      var0.id_class(var1, 2);
   }

   public static void id_class(rrEm_1 var0) {
      ruP_2.id_class(var0);
   }

   private static rdn_3 id_class(String var0, boolean var1, String var2) {
      rdn_3 var3 = new rdn_3(rdy_3.xi);
      rcy_3 var4 = new rcy_3();
      StringBuffer var5 = new StringBuffer();
      Arrays.stream(var0.split("\\.")).forEach(var1x -> var5.append(var1x).append('\n'));
      if (!var1) {
         var5.append("(optional)\n");
      }

      var5.append("-------------------\n");
      var4.add(rca_3.id_class(var5.toString() + var2));
      var3.id_class("pages", var4);
      return var3;
   }

   private static void id_class(rrEm_1 var0, rgF_2 var1, String var2) {
      var0.id_class(var0x -> true).forEach(var2x -> var2x.id_class(new rgN_2(var2).id_class(var1), rqR_2.id_break));
   }

   public static Collection<rle_3> id_break(Collection<rlj_3> var0, rfH_2 var1, rqd_3 var2, rrEm_1 var3, rlT_2 var4, int var5) {
      return id_class(id_class(var0), var1, var2, var3, var4, var5);
   }
}
