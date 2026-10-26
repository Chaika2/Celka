package celestial;

public class TD extends Tf_1<rOb_1, wc_3<rOb_1>> {
   private static final rqO_2 break_ = new rqO_2("textures/entity/sheep/sheep_fur.png");
   public wu_3<rOb_1> class_ = new wu_3<>();

   public TD(qE_2<rOb_1, wc_3<rOb_1>> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, rOb_1 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.sJ() && !var4.Pp()) {
         float var11;
         float var12;
         float var13;
         if (var4.Bk() && "jeb_".equals(var4.g().break_())) {
            byte var22 = 25;
            int var15 = (Integer)var4.throws_[41] / 25 + var4.V();
            int var16 = rxL_2.values().length;
            int var17 = var15 % var16;
            int var18 = (var15 + 1) % var16;
            float var19 = ((float)((Integer)var4.throws_[41] % 25) + var7) / 25.0F;
            float[] var20 = rOb_1.class_(rxL_2.class_(var17));
            float[] var21 = rOb_1.class_(rxL_2.class_(var18));
            if (rrbb_3.K()) {
               var20 = rrbN_2.break_(rxL_2.class_(var17), var20);
               var21 = rrbN_2.break_(rxL_2.class_(var18), var21);
            }

            var11 = var20[0] * (1.0F - var19) + var21[0] * var19;
            var12 = var20[1] * (1.0F - var19) + var21[1] * var19;
            var13 = var20[2] * (1.0F - var19) + var21[2] * var19;
         } else {
            float[] var14 = rOb_1.class_(var4.n());
            if (rrbb_3.K()) {
               var14 = rrbN_2.break_(var4.n(), var14);
            }

            var11 = var14[0];
            var12 = var14[1];
            var13 = var14[2];
         }

         class_(this.byte_(), this.class_, break_, var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var11, var12, var13);
      }
   }
}
