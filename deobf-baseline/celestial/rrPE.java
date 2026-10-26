package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class rrPE extends rrPA {
   public static final Codec<rrPE> id_class = Codec.unit(() -> rrPE.id_break);
   public static final rrPE id_break = new rrPE();
   private final Map<xd_3, xd_3> id_byte = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put(xu_3.id_volatile, xu_3.Ju);
      var0.put(xu_3.rV, xu_3.Ju);
      var0.put(xu_3.id_break, xu_3.JF);
      var0.put(xu_3.BL, xu_3.JL);
      var0.put(xu_3.BA, xu_3.JL);
      var0.put(xu_3.Pd, xu_3.Jm);
      var0.put(xu_3.hx, xu_3.Jm);
      var0.put(xu_3.hk, xu_3.Jp);
      var0.put(xu_3.Ba, xu_3.Jl);
      var0.put(xu_3.hX, xu_3.Jl);
      var0.put(xu_3.bP, xu_3.Jv);
      var0.put(xu_3.hA, xu_3.Jv);
      var0.put(xu_3.Ge, xu_3.Jq);
      var0.put(xu_3.GU, xu_3.Jq);
      var0.put(xu_3.bS, xu_3.JC);
      var0.put(xu_3.hF, xu_3.JC);
      var0.put(xu_3.hV, xu_3.JH);
      var0.put(xu_3.hf, xu_3.JH);
      var0.put(xu_3.SF, xu_3.JZ);
      var0.put(xu_3.SL, xu_3.JZ);
      var0.put(xu_3.BC, xu_3.Jn);
      var0.put(xu_3.Bn, xu_3.JA);
      var0.put(xu_3.Bf, xu_3.Bj);
   });

   private rrPE() {
   }

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      xd_3 var7 = this.id_byte.get(var5.id_break.id_break());
      if (var7 == null) {
         return var5;
      } else {
         xc_3 var8 = var5.id_break;
         xc_3 var9 = var7.id_continue();
         if (var8.id_break(zG_2.id_volatile)) {
            var9 = var9.id_class(zG_2.id_volatile, var8.id_byte(zG_2.id_volatile));
         }

         if (var8.id_break(zG_2.id_final)) {
            var9 = var9.id_class(zG_2.id_final, var8.id_byte(zG_2.id_final));
         }

         if (var8.id_break(Wg_1.id_volatile)) {
            var9 = var9.id_class(Wg_1.id_volatile, var8.id_byte(Wg_1.id_volatile));
         }

         return new rrPp_1(var5.id_class, var9, var5.id_byte);
      }
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_private;
   }
}
