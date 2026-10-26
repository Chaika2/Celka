package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class reP_2<FC extends rUv_1, F extends rrrZ<FC>> {
   public static final Codec<reP_2<?, ?>> id_class = rVL.t.dispatch(var0 -> var0.id_protected, rrrZ::id_case);
   public static final Codec<Supplier<reP_2<?, ?>>> id_break = rVA.id_class(rVL.F, id_class);
   public static final Codec<List<Supplier<reP_2<?, ?>>>> id_byte = rVA.id_break(rVL.F, id_class);
   public final F id_protected;
   public final FC id_throws;

   public reP_2(F var1, FC var2) {
      this.id_protected = (F)var1;
      this.id_throws = (FC)var2;
   }

   public rrrH<?> id_class(rVm_1 var1, rKd_1 var2, rYY var3, rrPt_1 var4, long var5, rfj_3 var7, rYG var8, int var9, rrSI var10) {
      return this.id_protected.id_class(var1, var2, var3, var4, var5, var7, var8, var9, new rqm_3(), var10, this.id_throws);
   }
}
