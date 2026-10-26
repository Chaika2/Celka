package celestial;

import java.util.Random;

public class kL_2 extends kG_2 {
   public static final rCN id_volatile = rCT.id_return;
   protected static final rjC_2 id_final = xd_3.id_class(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final rjC_2 id_package = xd_3.id_class(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final rjC_2 id_int = xd_3.id_class(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final rjC_2 id_new = xd_3.id_class(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final rjC_2 id_continue = xd_3.id_class(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final rjC_2 id_super = xd_3.id_class(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final rjC_2 id_this = xd_3.id_class(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final rjC_2 id_else = xd_3.id_class(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   public xc_3 id_byte(xc_3 var1, rYB var2, rfH_2 var3) {
      var1 = var1.id_class(id_volatile);
      var2.id_class(var3, var1, 3);
      this.id_throws(var1, var2, var3);
      return var1;
   }

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   protected kL_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(p, rpr_3.NORTH).id_class(id_volatile, Boolean.valueOf(false)).id_class(q, rCH.WALL));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(q, p, id_volatile);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rCH)var1.id_byte(q)) {
         case FLOOR:
            switch (var1.id_byte(p).id_final()) {
               case X:
                  return id_super;
               case Z:
               default:
                  return id_continue;
            }
         case WALL:
            switch ((rpr_3)var1.id_byte(p)) {
               case EAST:
                  return id_new;
               case WEST:
                  return id_int;
               case SOUTH:
                  return id_package;
               case NORTH:
               default:
                  return id_final;
            }
         case CEILING:
         default:
            switch (var1.id_byte(p).id_final()) {
               case X:
                  return id_else;
               case Z:
               default:
                  return id_this;
            }
      }
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_volatile) ? 15 : 0;
   }

   private static void id_class(xc_3 var0, rRg_1 var1, rfH_2 var2, float var3) {
      rpr_3 var4 = var0.id_byte(p).id_case();
      rpr_3 var5 = id_private(var0).id_case();
      double var6 = (double)var2.b_() + 0.5 + 0.1 * (double)var4.id_implements() + 0.2 * (double)var5.id_implements();
      double var8 = (double)var2.c_() + 0.5 + 0.1 * (double)var4.id_finally() + 0.2 * (double)var5.id_finally();
      double var10 = (double)var2.d_() + 0.5 + 0.1 * (double)var4.id_extends() + 0.2 * (double)var5.id_extends();
      var1.id_class(new rLc_1(1.0F, 0.0F, 0.0F, var3), var6, var8, var10, 0.0, 0.0, 0.0);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile) && var4.nextFloat() < 0.25F) {
         id_class(var1, var2, var3, 0.5F);
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         xc_3 var9 = var1.id_class(id_volatile);
         if (var9.id_byte(id_volatile)) {
            id_class(var9, var2, var3, 1.0F);
         }

         return ryZ_2.SUCCESS;
      } else {
         xc_3 var7 = this.id_byte(var1, var2, var3);
         float var8 = var7.id_byte(id_volatile) ? 0.6F : 0.5F;
         var2.id_class((rhd_3)null, var3, rqn_3.Gb, rqL_2.BLOCKS, 0.3F, var8);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.id_class(var4.id_break())) {
         if (var1.id_byte(id_volatile)) {
            this.id_throws(var1, var2, var3);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_volatile) && id_private(var1) == var4 ? 15 : 0;
   }

   private void id_throws(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.id_break(var3, this);
      var2.id_break(var3.id_break(id_private(var1).id_case()), this);
   }
}
