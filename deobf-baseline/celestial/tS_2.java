package celestial;

public class tS_2 extends Tf_1<rOg_1, tp_3<rOg_1>> {
   private final wq_3<rOg_1> id_class = new wq_3<>(0.008F);
   private final wT_2<rOg_1> id_break = new wT_2<>(0.008F);

   public tS_2(qE_2<rOg_1, tp_3<rOg_1>> var1) {
      super(var1);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, rOg_1 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      Object var11 = var4.sZ() == 0 ? this.id_class : this.id_break;
      float[] var12 = var4.sm();
      id_class(this.id_byte(), (tp_3<rOg_1>)var11, var4.sv(), var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var12[0], var12[1], var12[2]);
   }
}
