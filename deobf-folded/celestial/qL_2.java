package celestial;

public class qL_2 extends qc_3<rGB, wb_3<rGB>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/phantom.png");

   public qL_2(pg_3 var1) {
      super(var1, new wb_3<>(), 0.75F);
      this.id_class(new To_1<>(this));
   }

   public rqO_2 id_class(rGB var1) {
      return id_class;
   }

   protected void id_class(rGB var1, Ml_1 var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      var2.id_class(rje_3.id_break.id_byte((Float)var1.id_throws[16]));
   }

   protected void id_class(rGB var1, Ml_1 var2, float var3) {
      int var4 = var1.id_throws();
      float var5 = 1.0F + 0.15F * (float)var4;
      var2.id_class(var5, var5, var5);
      var2.id_class(0.0, 1.3125, 0.1875);
   }
}
