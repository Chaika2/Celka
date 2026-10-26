package celestial;

public class dN_2 extends xd_3 {
   public static final rCc_1 id_volatile = kE_2.p;
   public static final rCN id_final = rCT.id_else;
   public static final rCu_1<rCI> id_package = rCT.f;
   public static final rCN id_int = rCT.id_return;
   public static final rCu_1<rCf_1> id_new = rCT.G;
   protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 id_this = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 id_else = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);

   protected dN_2(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, rpr_3.NORTH)
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, rCI.LEFT)
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, rCf_1.LOWER)
      );
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   private void id_class(rYB var1, rfH_2 var2, boolean var3) {
      var1.id_class((rhd_3)null, var3 ? this.id_implements() : this.id_break(), var2, 0);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break();
      xc_3 var5 = var2.id_byte(var4);
      return var1.id_byte(id_new) == rCf_1.LOWER ? var5.id_protected(var2, var4, rpr_3.UP) : var5.id_class(this);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.id_public(var3) || var2.id_public(var3.id_break(var1.id_byte(id_new) == rCf_1.LOWER ? rpr_3.UP : rpr_3.DOWN));
      if (var4 != this && var7 != var1.id_byte(id_int)) {
         if (var7 != var1.id_byte(id_final)) {
            this.id_class(var2, var3, var7);
         }

         var2.id_class(var3, var1.id_class(id_int, Boolean.valueOf(var7)).id_class(id_final, Boolean.valueOf(var7)), 2);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rpr_3 var5 = var1.id_byte(id_volatile);
      boolean var6 = !var1.id_byte(id_final);
      boolean var7 = var1.id_byte(id_package) == rCI.RIGHT;
      switch (var5) {
         case EAST:
         default:
            return var6 ? id_else : (var7 ? id_super : id_continue);
         case SOUTH:
            return var6 ? id_continue : (var7 ? id_else : id_this);
         case WEST:
            return var6 ? id_this : (var7 ? id_continue : id_super);
         case NORTH:
            return var6 ? id_super : (var7 ? id_this : id_else);
      }
   }

   public void id_class(rYB var1, xc_3 var2, rfH_2 var3, boolean var4) {
      if (var2.id_class(this) && var2.id_byte(id_final) != var4) {
         var1.id_class(var3, var2.id_class(id_final, Boolean.valueOf(var4)), 10);
         this.id_class(var1, var3, var4);
      }
   }

   public static boolean id_class(rYB var0, rfH_2 var1) {
      return id_implements(var0.id_byte(var1));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_new, id_volatile, id_final, id_package, id_int);
   }

   @Override
   public long id_class(xc_3 var1, rfH_2 var2) {
      return rfU_2.id_byte(var2.b_(), var2.id_catch(var1.id_byte(id_new) == rCf_1.LOWER ? 0 : 1).c_(), var2.d_());
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var2 == rpa_3.NONE ? var1 : var1.id_class(var2.id_class(var1.id_byte(id_volatile))).id_class(id_package);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      var1.id_class(var2.id_final(), var3.id_class(id_new, rCf_1.UPPER), 3);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.id_byte(id_final);
         case WATER:
            return false;
         case AIR:
            return var1.id_byte(id_final);
         default:
            return false;
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rfH_2 var2 = var1.id_class();
      if (var2.c_() < 255 && var1.id_int().id_byte(var2.id_final()).id_class(var1)) {
         rYB var3 = var1.id_int();
         boolean var4 = var3.id_public(var2) || var3.id_public(var2.id_final());
         return this.id_continue()
            .id_class(id_volatile, var1.id_case())
            .id_class(id_package, this.id_break(var1))
            .id_class(id_int, Boolean.valueOf(var4))
            .id_class(id_final, Boolean.valueOf(var4))
            .id_class(id_new, rCf_1.LOWER);
      } else {
         return null;
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.id_continue && var4.id_implements()) {
         du_3.id_break(var1, var2, var3, var4);
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rCf_1 var7 = var1.id_byte(id_new);
      if (var2.id_final() == rpB_2.Y && var7 == rCf_1.LOWER == (var2 == rpr_3.UP)) {
         return var3.id_class(this) && var3.id_byte(id_new) != var7
            ? var1.id_class(id_volatile, var3.id_byte(id_volatile))
               .id_class(id_final, var3.id_byte(id_final))
               .id_class(id_package, var3.id_byte(id_package))
               .id_class(id_int, var3.id_byte(id_int))
            : xu_3.id_class.id_continue();
      } else {
         return var7 == rCf_1.LOWER && var2 == rpr_3.DOWN && !var1.id_class(var4, var5)
            ? xu_3.id_class.id_continue()
            : super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (this.id_break == QP.id_static) {
         return ryZ_2.PASS;
      } else {
         var1 = var1.id_class(id_final);
         var2.id_class(var3, var1, 10);
         var2.id_class(var4, var1.id_byte(id_final) ? this.id_implements() : this.id_break(), var3, 0);
         return ryZ_2.id_class(var2.id_continue);
      }
   }

   private int id_break() {
      return this.id_break == QP.id_static ? 1011 : 1012;
   }

   private rCI id_break(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      rpr_3 var4 = var1.id_case();
      rfH_2 var5 = var3.id_final();
      rpr_3 var6 = var4.id_private();
      rfH_2 var7 = var3.id_break(var6);
      xc_3 var8 = var2.id_byte(var7);
      rfH_2 var9 = var5.id_break(var6);
      xc_3 var10 = var2.id_byte(var9);
      rpr_3 var11 = var4.id_catch();
      rfH_2 var12 = var3.id_break(var11);
      xc_3 var13 = var2.id_byte(var12);
      rfH_2 var14 = var5.id_break(var11);
      xc_3 var15 = var2.id_byte(var14);
      int var16 = (var8.id_new(var2, var7) ? -1 : 0)
         + (var10.id_new(var2, var9) ? -1 : 0)
         + (var13.id_new(var2, var12) ? 1 : 0)
         + (var15.id_new(var2, var14) ? 1 : 0);
      boolean var17 = var8.id_class(this) && var8.id_byte(id_new) == rCf_1.LOWER;
      boolean var18 = var13.id_class(this) && var13.id_byte(id_new) == rCf_1.LOWER;
      if ((!var17 || var18) && var16 <= 0) {
         if ((!var18 || var17) && var16 >= 0) {
            int var19 = var4.id_implements();
            int var20 = var4.id_extends();
            rjU_2 var21 = var1.id_extends();
            double var22 = var21.id_break - (double)var3.b_();
            double var24 = var21.id_protected - (double)var3.d_();
            return var19 < 0 && var24 < 0.5 || var19 > 0 && var24 > 0.5 || var20 < 0 && var22 > 0.5 || var20 > 0 && var22 < 0.5 ? rCI.RIGHT : rCI.LEFT;
         } else {
            return rCI.LEFT;
         }
      } else {
         return rCI.RIGHT;
      }
   }

   public static boolean id_implements(xc_3 var0) {
      return var0.id_break() instanceof dN_2 && (var0.id_byte() == QP.id_goto || var0.id_byte() == QP.id_while);
   }

   private int id_implements() {
      return this.id_break == QP.id_static ? 1005 : 1006;
   }

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.DESTROY;
   }

   public boolean id_private(xc_3 var1) {
      return var1.id_byte(id_final);
   }
}
