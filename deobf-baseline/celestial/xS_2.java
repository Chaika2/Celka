package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class xS_2 extends JL {
   public static final rCm_1 id_volatile = rCT.T;
   private static final Map<rxL_2, xd_3> id_final = Maps.newHashMap();
   private static final rjC_2 id_package = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public xS_2(rxL_2 var1, Jq_1 var2) {
      super(var1, var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
      id_final.put(var1, this);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(id_volatile, Integer.valueOf(var2.id_class(var1.id_byte(id_volatile), 16)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   public static xd_3 id_class(rxL_2 var0) {
      return id_final.getOrDefault(var0, xu_3.GG);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, Integer.valueOf(var2.id_class(var1.id_byte(id_volatile), 16)));
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_package;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, Integer.valueOf(rfU_2.id_byte((double)((180.0F + var1.id_private()) * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.id_byte(var3.id_break()).id_byte().id_break();
   }
}
