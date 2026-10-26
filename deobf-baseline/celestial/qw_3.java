package celestial;

public class qw_3 extends pV_2<rhg_3> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/shulker/spark.png");
   private static final HU id_throws = HU.id_private(id_class);
   private final wZ_2<rhg_3> id_case = new wZ_2<>();

   public qw_3(pg_3 var1) {
      super(var1);
   }

   protected int id_class(rhg_3 var1, rfH_2 var2) {
      return 15;
   }

   public rqO_2 id_class(rhg_3 var1) {
      return id_class;
   }

   public void id_class(rhg_3 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      float var7 = rfU_2.id_implements((Float)var1.id_throws[17], (Float)var1.id_throws[15], var3);
      float var8 = rfU_2.id_catch(var3, (Float)var1.id_throws[18], (Float)var1.id_throws[16]);
      float var9 = (float)((Integer)var1.id_throws[41]).intValue() + var3;
      var4.id_class(0.0, 0.15F, 0.0);
      var4.id_class(rje_3.id_protected.id_byte(rfU_2.id_class(var9 * 0.1F) * 180.0F));
      var4.id_class(rje_3.id_break.id_byte(rfU_2.id_break(var9 * 0.1F) * 180.0F));
      var4.id_class(rje_3.id_case.id_byte(rfU_2.id_class(var9 * 0.15F) * 360.0F));
      var4.id_class(-0.5F, -0.5F, 0.5F);
      this.id_case.id_class(var1, 0.0F, 0.0F, 0.0F, var7, var8);
      Ok_1 var10 = var5.getBuffer(this.id_case.id_class(id_class));
      this.id_case.id_class(var4, var10, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.id_class(1.5F, 1.5F, 1.5F);
      Ok_1 var11 = var5.getBuffer(id_throws);
      this.id_case.id_class(var4, var11, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 0.15F);
      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
