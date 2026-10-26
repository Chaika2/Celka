package celestial;

public class zK_2 extends JY {
   public static final rCm_1 id_int = rCT.H;
   private final int id_new;

   protected zK_2(int var1, Jq_1 var2) {
      super(var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_int, Integer.valueOf(0)));
      this.id_new = var1;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_int);
   }

   @Override
   protected xc_3 id_class(xc_3 var1, int var2) {
      return var1.id_class(id_int, Integer.valueOf(var2));
   }

   @Override
   protected void id_class(rRg_1 var1, rfH_2 var2) {
      var1.id_class((rhd_3)null, var2, rqn_3.GI, rqL_2.BLOCKS, 0.3F, 0.90000004F);
   }

   @Override
   protected int id_break() {
      return 10;
   }

   @Override
   protected void id_break(rRg_1 var1, rfH_2 var2) {
      var1.id_class((rhd_3)null, var2, rqn_3.Gw, rqL_2.BLOCKS, 0.3F, 0.75F);
   }

   @Override
   protected int id_break(rYB var1, rfH_2 var2) {
      int var3 = Math.min(var1.id_class(an_3.class, id_package.id_class(var2)).size(), this.id_new);
      if (var3 > 0) {
         float var4 = (float)Math.min(this.id_new, var3) / (float)this.id_new;
         return rfU_2.id_case(var4 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int id_catch(xc_3 var1) {
      return var1.id_byte(id_int);
   }
}
