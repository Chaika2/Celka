package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class rrPE extends rrPA {
   public static final Codec<rrPE> class_ = Codec.unit(() -> rrPE.break_);
   public static final rrPE break_ = new rrPE();
   private final Map<xd_3, xd_3> byte_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(xu_3.volatile_, xu_3.Ju);
      var0.put(xu_3.rV, xu_3.Ju);
      var0.put(xu_3.break_, xu_3.JF);
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
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      xd_3 var7 = this.byte_.get(var5.break_.break_());
      if (var7 == null) {
         return var5;
      } else {
         xc_3 var8 = var5.break_;
         xc_3 var9 = var7.continue_();
         if (var8.break_(zG_2.volatile_)) {
            var9 = var9.class_(zG_2.volatile_, var8.byte_(zG_2.volatile_));
         }

         if (var8.break_(zG_2.final_)) {
            var9 = var9.class_(zG_2.final_, var8.byte_(zG_2.final_));
         }

         if (var8.break_(Wg_1.volatile_)) {
            var9 = var9.class_(Wg_1.volatile_, var8.byte_(Wg_1.volatile_));
         }

         return new rrPp_1(var5.class_, var9, var5.byte_);
      }
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.private_;
   }
}
