package celestial;

public class pq_3 extends pW_2<rEx_1, tC_2<rEx_1>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/zombie/drowned.png");

   public pq_3(pg_3 var1) {
      super(var1, new tC_2<>(0.0F, 0.0F, 64, 64), new tC_2<>(0.5F, true), new tC_2<>(1.0F, true));
      this.id_class(new Tn_1<>(this));
   }

   @Override
   public rqO_2 id_class(rbB_2 var1) {
      return id_class;
   }

   protected void id_class(rEx_1 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = var1.id_synchronized(var5);
      if (var6 > 0.0F) {
         var2.id_class(rje_3.id_break.id_byte(rfU_2.id_catch(var6, (Float)var1.id_throws[16], -10.0F - (Float)var1.id_throws[16])));
      }
   }
}
