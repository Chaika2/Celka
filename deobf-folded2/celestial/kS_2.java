package celestial;

public class kS_2 extends dB_2 {
   public static final rCc_1 id_volatile = rCT.id_const;
   public static final rCN id_final = rCT.id_case;
   private static final rjC_2 id_package = xd_3.id_class(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 id_int = xd_3.id_class(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final rjC_2 id_new = rjw_3.id_class(id_int, id_package);
   private static final rjC_2 id_continue = rjw_3.id_class(id_new, rHI.id_class, rjN_2.id_throws);
   private static final rjC_2 id_super = rjw_3.id_class(id_continue, xd_3.id_class(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final rjC_2 id_this = rjw_3.id_class(id_continue, xd_3.id_class(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final rjC_2 id_else = rjw_3.id_class(id_continue, xd_3.id_class(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final rjC_2 id_synchronized = rjw_3.id_class(id_continue, xd_3.id_class(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final rjC_2 id_return = rjw_3.id_class(id_continue, xd_3.id_class(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final rjC_2 id_public = rHI.id_class;
   private static final rjC_2 id_goto = rjw_3.id_class(rHI.id_class, xd_3.id_class(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final rjC_2 id_while = rjw_3.id_class(rHI.id_class, xd_3.id_class(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final rjC_2 id_try = rjw_3.id_class(rHI.id_class, xd_3.id_class(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final rjC_2 id_instanceof = rjw_3.id_class(rHI.id_class, xd_3.id_class(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      switch ((rpr_3)var1.id_byte(id_volatile)) {
         case DOWN:
            return id_public;
         case NORTH:
            return id_while;
         case SOUTH:
            return id_try;
         case WEST:
            return id_instanceof;
         case EAST:
            return id_goto;
         default:
            return rHI.id_class;
      }
   }

   public kS_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.DOWN).id_class(id_final, Boolean.valueOf(true)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpr_3)var1.id_byte(id_volatile)) {
         case DOWN:
            return id_super;
         case NORTH:
            return id_else;
         case SOUTH:
            return id_synchronized;
         case WEST:
            return id_return;
         case EAST:
            return id_this;
         default:
            return id_continue;
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      ryO_2 var5 = var2.id_class(var3);
      if (var5 instanceof rHt_1) {
         ((rHt_1)var5).id_class(var4);
      }
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
         ryO_2 var7 = var2.id_class(var3);
         if (var7 instanceof rHt_1) {
            var4.id_class((rHt_1)var7);
            var4.id_break(rlB_2.M);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break())) {
         this.id_class(var2, var3, var1);
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHt_1) {
            ((rHt_1)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHt_1();
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rpr_3 var2 = var1.id_finally().id_case();
      return this.id_continue().id_class(id_volatile, var2.id_final() == rpB_2.Y ? rpr_3.DOWN : var2).id_class(id_final, Boolean.valueOf(true));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      this.id_class(var2, var3, var1);
   }

   private void id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      boolean var4 = !var1.id_public(var2);
      if (var4 != var3.id_byte(id_final)) {
         var1.id_class(var2, var3.id_class(id_final, Boolean.valueOf(var4)), 4);
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof rHt_1) {
            rXn_1.id_class(var2, var3, (rHt_1)var6);
            var2.id_byte(var3, this);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.id_class(var2.id_class(var3));
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
