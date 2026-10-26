package celestial;

public class pa_3 extends qc_3<rba_3, tT_2<rba_3>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/fox/fox.png");
   private static final rqO_2 id_package = new rqO_2("textures/entity/fox/fox_sleep.png");
   private static final rqO_2 id_int = new rqO_2("textures/entity/fox/snow_fox.png");
   private static final rqO_2 id_new = new rqO_2("textures/entity/fox/snow_fox_sleep.png");

   public pa_3(pg_3 var1) {
      super(var1, new tT_2<>(), 0.4F);
      this.id_class(new Ty_1(this));
   }

   protected void id_class(rba_3 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      if (var1.sd() || var1.sx()) {
         float var6 = -rfU_2.id_catch(var5, (Float)var1.id_throws[18], (Float)var1.id_throws[16]);
         var2.id_class(rje_3.id_break.id_byte(var6));
      }
   }

   public rqO_2 id_class(rba_3 var1) {
      if (var1.n() == rMN.RED) {
         return var1.Sc() ? id_package : id_class;
      } else {
         return var1.Sc() ? id_new : id_int;
      }
   }
}
