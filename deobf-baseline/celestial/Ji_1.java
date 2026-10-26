package celestial;

public class Ji_1 extends dH_2 {
   public static final rCc_1 id_volatile = kE_2.p;
   private static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final rjC_2 id_package = xd_3.id_class(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final rjC_2 id_int = xd_3.id_class(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final rjC_2 id_new = xd_3.id_class(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final rjC_2 id_continue = xd_3.id_class(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final rjC_2 id_super = xd_3.id_class(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final rjC_2 id_this = xd_3.id_class(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final rjC_2 id_else = rjw_3.id_class(id_final, id_package, id_int, id_new);
   private static final rjC_2 id_synchronized = rjw_3.id_class(id_final, id_continue, id_super, id_this);
   private static final rgP_2 id_return = new rgn_3("container.repair");

   public Ji_1(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH));
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, var1.id_case().id_catch());
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, rsB_2 var3) {
      if (!var3.BF()) {
         var1.id_byte(1029, var2, 0);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         var4.id_class(var1.id_break(var2, var3));
         var4.id_break(rlB_2.p);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public rJZ id_class(xc_3 var1, rYB var2, rfH_2 var3) {
      return new rJR((var2x, var3x, var4) -> new rJf_1(var2x, var3x, rpq_3.id_class(var2, var3)), id_return);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rpr_3 var5 = var1.id_byte(id_volatile);
      return var5.id_final() == rpB_2.X ? id_else : id_synchronized;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4, rsB_2 var5) {
      if (!var5.BF()) {
         var1.id_byte(1031, var2, 0);
      }
   }

   @Override
   protected void id_class(rsB_2 var1) {
      var1.id_class(true);
   }

   @Override
   public int id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_protected(var2, var3).d;
   }

   public static xc_3 id_private(xc_3 var0) {
      if (var0.id_class(xu_3.sc)) {
         return xu_3.su.id_continue().id_class(id_volatile, var0.id_byte(id_volatile));
      } else {
         return var0.id_class(xu_3.su) ? xu_3.sm.id_continue().id_class(id_volatile, var0.id_byte(id_volatile)) : null;
      }
   }
}
