package celestial;

public class zK_2 extends JY {
   public static final rCm_1 int_ = rCT.H;
   private final int new_;

   protected zK_2(int var1, Jq_1 var2) {
      super(var2);
      this.extends_(this.abstract_.break_().class_(int_, Integer.valueOf(0)));
      this.new_ = var1;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(int_);
   }

   @Override
   protected xc_3 class_(xc_3 var1, int var2) {
      return var1.class_(int_, Integer.valueOf(var2));
   }

   @Override
   protected void class_(rRg_1 var1, rfH_2 var2) {
      var1.class_((rhd_3)null, var2, rqn_3.GI, rqL_2.BLOCKS, 0.3F, 0.90000004F);
   }

   @Override
   protected int break_() {
      return 10;
   }

   @Override
   protected void break_(rRg_1 var1, rfH_2 var2) {
      var1.class_((rhd_3)null, var2, rqn_3.Gw, rqL_2.BLOCKS, 0.3F, 0.75F);
   }

   @Override
   protected int break_(rYB var1, rfH_2 var2) {
      int var3 = Math.min(var1.class_(an_3.class, package_.class_(var2)).size(), this.new_);
      if (var3 > 0) {
         float var4 = (float)Math.min(this.new_, var3) / (float)this.new_;
         return rfU_2.case_(var4 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int catch_(xc_3 var1) {
      return var1.byte_(int_);
   }
}
