package celestial;

public class TZ extends Tf_1<rbf_3, tZ_2<rbf_3>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/cat/cat_collar.png");
   private final tZ_2<rbf_3> id_break = new tZ_2<>(0.01F);

   public TZ(qE_2<rbf_3, tZ_2<rbf_3>> var1) {
      super(var1);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, rbf_3 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.sZ()) {
         float[] var11 = var4.sd().id_protected();
         if (rrbb_3.K()) {
            var11 = rrbN_2.id_class(var4.sd(), var11);
         }

         id_class(this.id_byte(), this.id_break, id_class, var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var11[0], var11[1], var11[2]);
      }
   }
}
