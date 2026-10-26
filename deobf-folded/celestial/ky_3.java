package celestial;

import java.util.Collections;
import java.util.List;

public class ky_3 extends dB_2 {
   public static final rCc_1 id_volatile = ka_3.id_volatile;
   public static final rCu_1<rCg_1> id_final = ka_3.id_final;

   public ky_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, rCg_1.DEFAULT));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.id_break;
   }

   private rHa_1 id_class(rRq_1 var1, rfH_2 var2) {
      ryO_2 var3 = var1.id_class(var2);
      return var3 instanceof rHa_1 ? (rHa_1)var3 : null;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return null;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   public static ryO_2 id_class(xc_3 var0, rpr_3 var1, boolean var2, boolean var3) {
      return new rHa_1(var0, var1, var2, var3);
   }

   @Override
   public void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      super.id_class(var1, var2, var3);
      rfH_2 var4 = var2.id_break(var3.id_byte(id_volatile).id_case());
      xc_3 var5 = var1.id_byte(var4);
      if (var5.id_break() instanceof kD_2 && var5.id_byte(kD_2.id_final)) {
         var1.id_class(var4, false);
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!var2.id_continue && var2.id_class(var3) == null) {
         var2.id_class(var3, false);
         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.id_class();
   }

   @Override
   public List<rdn_3> id_class(xc_3 var1, rzP_2 var2) {
      rHa_1 var3 = this.id_class(var2.id_class(), new rfH_2(var2.id_class(rzQ_2.id_case)));
      return var3 == null ? Collections.emptyList() : var3.id_native().id_class(var2);
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof rHa_1) {
            ((rHa_1)var6).id_volatile();
         }
      }
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rHa_1 var5 = this.id_class(var2, var3);
      return var5 != null ? var5.id_class(var2, var3) : rjw_3.id_class();
   }
}
