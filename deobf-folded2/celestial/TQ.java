package celestial;

public class TQ<T extends iB_2, M extends wh_3<T>> extends tB_2<T, M> {
   private final pg_3 id_class;
   private rhF_2 id_break;

   public TQ(qd_3<T, M> var1) {
      super(var1);
      this.id_class = var1.id_break();
   }

   @Override
   protected int id_class(T var1) {
      return var1.BY();
   }

   @Override
   protected void id_class(Ml_1 var1, Hx_1 var2, int var3, an_3 var4, float var5, float var6, float var7, float var8) {
      float var9 = rfU_2.id_byte(var5 * var5 + var7 * var7);
      this.id_break = new rhF_2((rYB)var4.id_throws[7], var4.rx(), var4.re(), var4.BO());
      rhF_2 var10000 = this.id_break;
      Float var14 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      var10000.id_throws[15] = var14;
      var10000 = this.id_break;
      Float var15 = (float)(Math.atan2((double)var6, (double)var9) * 180.0F / (float)Math.PI);
      var10000.id_throws[16] = var15;
      var10000 = this.id_break;
      Float var16 = (Float)this.id_break.id_throws[15];
      var10000.id_throws[17] = var16;
      var10000 = this.id_break;
      Float var17 = (Float)this.id_break.id_throws[16];
      var10000.id_throws[18] = var17;
      this.id_class.id_class(this.id_break, 0.0, 0.0, 0.0, 0.0F, var8, var1, var2, var3);
   }
}
