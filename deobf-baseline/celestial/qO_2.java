package celestial;

public class qO_2 extends qc_3<rMZ, tD_2<rMZ>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/iron_golem/iron_golem.png");

   public qO_2(pg_3 var1) {
      super(var1, new tD_2<>(), 0.7F);
      this.id_class(new Tw_1(this));
      this.id_class(new TI(this));
   }

   public rqO_2 id_class(rMZ var1) {
      return id_class;
   }

   protected void id_class(rMZ var1, Ml_1 var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      if (!((double)((Float)var1.id_private[18]).floatValue() < 0.01)) {
         float var6 = 13.0F;
         float var7 = (Float)var1.id_private[19] - (Float)var1.id_private[18] * (1.0F - var5) + 6.0F;
         float var8 = (Math.abs(var7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         var2.id_class(rje_3.id_case.id_byte(6.5F * var8));
      }
   }
}
