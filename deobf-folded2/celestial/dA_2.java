package celestial;

import com.google.common.base.Predicates;

public class dA_2 extends xd_3 {
   public static final rCc_1 id_volatile = kE_2.p;
   public static final rCN id_final = rCT.id_private;
   protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final rjC_2 id_int = xd_3.id_class(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final rjC_2 id_new = rjw_3.id_class(id_package, id_int);
   private static Qh_1 id_continue;

   public dA_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)));
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

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, var1.id_case().id_case()).id_class(id_final, Boolean.valueOf(false));
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return var1.id_byte(id_final) ? id_new : id_package;
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return true;
   }

   public static Qh_1 id_break() {
      if (id_continue == null) {
         id_continue = Qx_1.id_class()
            .id_class("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .id_class('?', ryw_3.id_class(Qd_1.id_class))
            .id_class(
               '^', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, Predicates.equalTo(true)).id_class(id_volatile, Predicates.equalTo(rpr_3.SOUTH)))
            )
            .id_class(
               '>', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, Predicates.equalTo(true)).id_class(id_volatile, Predicates.equalTo(rpr_3.WEST)))
            )
            .id_class(
               'v', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, Predicates.equalTo(true)).id_class(id_volatile, Predicates.equalTo(rpr_3.NORTH)))
            )
            .id_class(
               '<', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, Predicates.equalTo(true)).id_class(id_volatile, Predicates.equalTo(rpr_3.EAST)))
            )
            .id_break();
      }

      return id_continue;
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return var1.id_byte(id_final) ? 15 : 0;
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
