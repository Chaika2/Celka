package celestial;

import java.util.Random;

public class xY_2 extends kE_2 implements kX_2 {
   public static final rCm_1 id_volatile = rCT.X;
   protected static final rjC_2[] id_final = new rjC_2[]{
      xd_3.id_class(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), xd_3.id_class(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), xd_3.id_class(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final rjC_2[] id_package = new rjC_2[]{
      xd_3.id_class(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), xd_3.id_class(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), xd_3.id_class(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final rjC_2[] id_int = new rjC_2[]{
      xd_3.id_class(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), xd_3.id_class(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), xd_3.id_class(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final rjC_2[] id_new = new rjC_2[]{
      xd_3.id_class(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), xd_3.id_class(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), xd_3.id_class(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public xY_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(p, rpr_3.NORTH).id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var3.id_byte(id_volatile) < 2;
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      var1.id_class(var3, var4.id_class(id_volatile, Integer.valueOf(var4.id_byte(id_volatile) + 1)), 2);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(p, id_volatile);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == var1.id_byte(p) && !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      xd_3 var4 = var2.id_byte(var3.id_break(var1.id_byte(p))).id_break();
      return var4.id_class(rls_3.id_public);
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_int.nextInt(5) == 0) {
         int var5 = var1.id_byte(id_volatile);
         if (var5 < 2) {
            var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(var5 + 1)), 2);
         }
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = this.id_continue();
      rYB var3 = var1.id_int();
      rfH_2 var4 = var1.id_class();

      for (rpr_3 var8 : var1.id_throws()) {
         if (var8.id_final().id_protected()) {
            var2 = var2.id_class(p, var8);
            if (var2.id_class((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      int var5 = var1.id_byte(id_volatile);
      switch ((rpr_3)var1.id_byte(p)) {
         case SOUTH:
            return id_new[var5];
         case NORTH:
         default:
            return id_int[var5];
         case WEST:
            return id_package[var5];
         case EAST:
            return id_final[var5];
      }
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_volatile) < 2;
   }
}
