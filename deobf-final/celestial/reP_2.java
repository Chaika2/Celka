package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class reP_2<FC extends rUv_1, F extends rrrZ<FC>> {
   public static final Codec<reP_2<?, ?>> class_ = rVL.t.dispatch(var0 -> var0.protected_, rrrZ::case_);
   public static final Codec<Supplier<reP_2<?, ?>>> break_ = rVA.class_(rVL.F, class_);
   public static final Codec<List<Supplier<reP_2<?, ?>>>> byte_ = rVA.break_(rVL.F, class_);
   public final F protected_;
   public final FC throws_;

   public reP_2(F var1, FC var2) {
      this.protected_ = (F)var1;
      this.throws_ = (FC)var2;
   }

   public rrrH<?> class_(rVm_1 var1, rKd_1 var2, rYY var3, rrPt_1 var4, long var5, rfj_3 var7, rYG var8, int var9, rrSI var10) {
      return this.protected_.class_(var1, var2, var3, var4, var5, var7, var8, var9, new rqm_3(), var10, this.throws_);
   }
}
