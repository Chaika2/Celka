package celestial;

public class dq_3 extends kE_2 {
   public static final rCN id_volatile = rCT.id_else;
   public static final rCN id_final = rCT.id_return;
   public static final rCN id_package = rCT.id_new;
   protected static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final rjC_2 id_new = xd_3.id_class(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final rjC_2 id_super = xd_3.id_class(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final rjC_2 id_this = xd_3.id_class(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final rjC_2 id_else = xd_3.id_class(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final rjC_2 id_synchronized = rjw_3.id_class(xd_3.id_class(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), xd_3.id_class(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final rjC_2 id_return = rjw_3.id_class(xd_3.id_class(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), xd_3.id_class(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final rjC_2 id_public = rjw_3.id_class(xd_3.id_class(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), xd_3.id_class(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final rjC_2 id_goto = rjw_3.id_class(xd_3.id_class(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), xd_3.id_class(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));

   public dq_3(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
      );
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      boolean var4 = var2.id_public(var3);
      rpr_3 var5 = var1.id_case();
      rpB_2 var6 = var5.id_final();
      boolean var7 = var6 == rpB_2.Z && (this.id_private(var2.id_byte(var3.id_byte())) || this.id_private(var2.id_byte(var3.id_extends())))
         || var6 == rpB_2.X && (this.id_private(var2.id_byte(var3.id_private())) || this.id_private(var2.id_byte(var3.id_protected())));
      return this.id_continue()
         .id_class(p, var5)
         .id_class(id_volatile, Boolean.valueOf(var4))
         .id_class(id_final, Boolean.valueOf(var4))
         .id_class(id_package, Boolean.valueOf(var7));
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var1.id_byte(id_volatile)) {
         var1 = var1.id_class(id_volatile, Boolean.valueOf(false));
         var2.id_class(var3, var1, 10);
      } else {
         rpr_3 var7 = var4.Pg();
         if (var1.id_byte(p) == var7.id_case()) {
            var1 = var1.id_class(p, var7);
         }

         var1 = var1.id_class(id_volatile, Boolean.valueOf(true));
         var2.id_class(var3, var1, 10);
      }

      var2.id_class(var4, var1.id_byte(id_volatile) ? 1008 : 1014, var3, 0);
      return ryZ_2.id_class(var2.id_continue);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue) {
         boolean var7 = var2.id_public(var3);
         if (var1.id_byte(id_final) != var7) {
            var2.id_class(var3, var1.id_class(id_final, Boolean.valueOf(var7)).id_class(id_volatile, Boolean.valueOf(var7)), 2);
            if (var1.id_byte(id_volatile) != var7) {
               var2.id_class((rhd_3)null, var7 ? 1008 : 1014, var3, 0);
            }
         }
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(p, id_volatile, id_final, id_package);
   }

   public static boolean id_class(xc_3 var0, rpr_3 var1) {
      return var0.id_byte(p).id_final() == var1.id_catch().id_final();
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rpB_2 var7 = var2.id_final();
      if (var1.id_byte(p).id_catch().id_final() != var7) {
         return super.id_class(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var8 = this.id_private(var3) || this.id_private(var4.id_byte(var5.id_break(var2.id_case())));
         return var1.id_class(id_package, Boolean.valueOf(var8));
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      if (var1.id_byte(id_package)) {
         return var1.id_byte(p).id_final() == rpB_2.X ? id_goto : id_public;
      } else {
         return var1.id_byte(p).id_final() == rpB_2.X ? id_return : id_synchronized;
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.id_byte(id_volatile);
         case WATER:
            return false;
         case AIR:
            return var1.id_byte(id_volatile);
         default:
            return false;
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.id_byte(id_package)) {
         return var1.id_byte(p).id_final() == rpB_2.X ? id_super : id_continue;
      } else {
         return var1.id_byte(p).id_final() == rpB_2.X ? id_new : id_int;
      }
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.id_byte(id_volatile)) {
         return rjw_3.id_class();
      } else {
         return var1.id_byte(p).id_final() == rpB_2.Z ? id_this : id_else;
      }
   }

   private boolean id_private(xc_3 var1) {
      return var1.id_break().id_class(rls_3.id_abstract);
   }
}
