package celestial;

public class tb_3 extends Tf_1<rOH, wV_2<rOH>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/wolf/wolf_collar.png");

   public tb_3(qE_2<rOH, wV_2<rOH>> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, rOH var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.sZ() && !var4.Pp()) {
         float[] var11 = var4.sx().protected_();
         if (rrbb_3.K()) {
            var11 = rrbN_2.class_(var4.sx(), var11);
         }

         class_(this.byte_(), class_, var1, var2, var3, var4, var11[0], var11[1], var11[2]);
      }
   }
}
