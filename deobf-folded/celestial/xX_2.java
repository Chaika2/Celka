package celestial;

public class xX_2 extends dB_2 {
   public static final rCc_1 id_volatile = kE_2.p;
   public static final rCu_1<rCq_1> id_final = rCT.id_for;
   public static final rCN id_package = rCT.id_return;
   private static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final rjC_2 id_new = xd_3.id_class(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final rjC_2 id_continue = xd_3.id_class(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final rjC_2 id_super = xd_3.id_class(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final rjC_2 id_this = rjw_3.id_class(id_super, id_continue);
   private static final rjC_2 id_else = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final rjC_2 id_synchronized = rjw_3.id_class(id_this, xd_3.id_class(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final rjC_2 id_return = rjw_3.id_class(id_this, xd_3.id_class(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final rjC_2 id_public = rjw_3.id_class(id_this, xd_3.id_class(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final rjC_2 id_goto = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final rjC_2 id_while = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final rjC_2 id_try = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));

   public xX_2(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, rCq_1.FLOOR).id_class(id_package, Boolean.valueOf(false))
      );
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = id_implements(var1).id_case();
      return var4 == rpr_3.UP ? xd_3.id_class(var2, var3.id_final(), rpr_3.DOWN) : kG_2.id_break(var2, var3, var4);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rCq_1 var7 = var1.id_byte(id_final);
      rpr_3 var8 = id_implements(var1).id_case();
      if (var8 == var2 && !var1.id_class(var4, var5) && var7 != rCq_1.DOUBLE_WALL) {
         return xu_3.id_class.id_continue();
      } else {
         if (var2.id_final() == var1.id_byte(id_volatile).id_final()) {
            if (var7 == rCq_1.DOUBLE_WALL && !var3.id_protected(var4, var6, var2)) {
               return var1.id_class(id_final, rCq_1.SINGLE_WALL).id_class(id_volatile, var2.id_case());
            }

            if (var7 == rCq_1.SINGLE_WALL && var8.id_case() == var2 && var3.id_protected(var4, var6, var1.id_byte(id_volatile))) {
               return var1.id_class(id_final, rCq_1.DOUBLE_WALL);
            }
         }

         return super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rpr_3 var2 = var1.id_finally();
      rfH_2 var3 = var1.id_class();
      rYB var4 = var1.id_int();
      rpB_2 var5 = var2.id_final();
      if (var5 == rpB_2.Y) {
         xc_3 var6 = this.id_continue().id_class(id_final, var2 == rpr_3.DOWN ? rCq_1.CEILING : rCq_1.FLOOR).id_class(id_volatile, var1.id_case());
         if (var6.id_class((rRR)var1.id_int(), var3)) {
            return var6;
         }
      } else {
         boolean var9 = var5 == rpB_2.X
               && var4.id_byte(var3.id_byte()).id_protected(var4, var3.id_byte(), rpr_3.EAST)
               && var4.id_byte(var3.id_extends()).id_protected(var4, var3.id_extends(), rpr_3.WEST)
            || var5 == rpB_2.Z
               && var4.id_byte(var3.id_private()).id_protected(var4, var3.id_private(), rpr_3.SOUTH)
               && var4.id_byte(var3.id_protected()).id_protected(var4, var3.id_protected(), rpr_3.NORTH);
         xc_3 var7 = this.id_continue().id_class(id_volatile, var2.id_case()).id_class(id_final, var9 ? rCq_1.DOUBLE_WALL : rCq_1.SINGLE_WALL);
         if (var7.id_class((rRR)var1.id_int(), var1.id_class())) {
            return var7;
         }

         boolean var8 = var4.id_byte(var3.id_break()).id_protected(var4, var3.id_break(), rpr_3.UP);
         var7 = var7.id_class(id_final, var8 ? rCq_1.FLOOR : rCq_1.CEILING);
         if (var7.id_class((rRR)var1.id_int(), var1.id_class())) {
            return var7;
         }
      }

      return null;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.id_public(var3);
      if (var7 != var1.id_byte(id_package)) {
         if (var7) {
            this.id_class(var2, var3, (rpr_3)null);
         }

         var2.id_class(var3, var1.id_class(id_package, Boolean.valueOf(var7)), 3);
      }
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHW();
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package);
   }

   @Override
   public void id_class(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      an_3 var5 = var4.id_else();
      rhd_3 var6 = var5 instanceof rhd_3 ? (rhd_3)var5 : null;
      this.id_class(var1, var2, var3, var6, true);
   }

   private boolean id_class(xc_3 var1, rpr_3 var2, double var3) {
      if (var2.id_final() != rpB_2.Y && !(var3 > 0.8124F)) {
         rpr_3 var5 = var1.id_byte(id_volatile);
         rCq_1 var6 = var1.id_byte(id_final);
         switch (var6) {
            case FLOOR:
               return var5.id_final() == var2.id_final();
            case SINGLE_WALL:
            case DOUBLE_WALL:
               return var5.id_final() != var2.id_final();
            case CEILING:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean id_class(rYB var1, xc_3 var2, rff_3 var3, rhd_3 var4, boolean var5) {
      rpr_3 var6 = var3.id_break();
      rfH_2 var7 = var3.id_class();
      boolean var8 = !var5 || this.id_class(var2, var6, var3.id_case().id_byte - (double)var7.c_());
      if (var8) {
         boolean var9 = this.id_class(var1, var7, var6);
         if (var9 && var4 != null) {
            var4.id_break(rlB_2.l);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      return this.id_class(var2, var1, var6, var4, true) ? ryZ_2.id_class(var2.id_continue) : ryZ_2.PASS;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_private(var1);
   }

   public boolean id_class(rYB var1, rfH_2 var2, rpr_3 var3) {
      ryO_2 var4 = var1.id_class(var2);
      if (!var1.id_continue && var4 instanceof rHW) {
         if (var3 == null) {
            var3 = var1.id_byte(var2).id_byte(id_volatile);
         }

         ((rHW)var4).id_class(var3);
         var1.id_class((rhd_3)null, var2, rqn_3.V, rqL_2.BLOCKS, 2.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_private(var1);
   }

   private static rpr_3 id_implements(xc_3 var0) {
      switch ((rCq_1)var0.id_byte(id_final)) {
         case FLOOR:
            return rpr_3.UP;
         case CEILING:
            return rpr_3.DOWN;
         default:
            return var0.id_byte(id_volatile).id_case();
      }
   }

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.DESTROY;
   }

   private rjC_2 id_private(xc_3 var1) {
      rpr_3 var2 = var1.id_byte(id_volatile);
      rCq_1 var3 = var1.id_byte(id_final);
      if (var3 == rCq_1.FLOOR) {
         return var2 != rpr_3.NORTH && var2 != rpr_3.SOUTH ? id_new : id_int;
      } else if (var3 == rCq_1.CEILING) {
         return id_try;
      } else if (var3 != rCq_1.DOUBLE_WALL) {
         if (var2 == rpr_3.NORTH) {
            return id_goto;
         } else if (var2 == rpr_3.SOUTH) {
            return id_while;
         } else {
            return var2 == rpr_3.EAST ? id_public : id_return;
         }
      } else {
         return var2 != rpr_3.NORTH && var2 != rpr_3.SOUTH ? id_synchronized : id_else;
      }
   }
}
