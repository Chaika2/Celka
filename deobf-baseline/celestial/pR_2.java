package celestial;

public class pR_2 extends pV_2<rhC_2> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/illager/evoker_fangs.png");
   private final tq_3<rhC_2> id_throws = new tq_3<>();

   public pR_2(pg_3 var1) {
      super(var1);
   }

   public void id_class(rhC_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      float var7 = var1.id_byte(var3);
      if (var7 != 0.0F) {
         float var8 = 2.0F;
         if (var7 > 0.9F) {
            var8 = (float)((double)var8 * ((1.0 - (double)var7) / 0.1F));
         }

         var4.id_class();
         var4.id_class(rje_3.id_protected.id_byte(90.0F - (Float)var1.id_throws[15]));
         var4.id_class(-var8, -var8, var8);
         float var9 = 0.03125F;
         var4.id_class(0.0, -0.626F, 0.0);
         var4.id_class(0.5F, 0.5F, 0.5F);
         this.id_throws.id_class(var1, var7, 0.0F, 0.0F, (Float)var1.id_throws[15], (Float)var1.id_throws[16]);
         Ok_1 var10 = var5.getBuffer(this.id_throws.id_class(id_class));
         this.id_throws.id_class(var4, var10, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
         var4.id_break();
         super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   public rqO_2 id_class(rhC_2 var1) {
      return id_class;
   }
}
