package celestial;

public class qz_3 extends pV_2<rhw_3> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/llama/spit.png");
   private final ta_3<rhw_3> id_throws = new ta_3<>();

   public qz_3(pg_3 var1) {
      super(var1);
   }

   public void id_class(rhw_3 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(0.0, 0.15F, 0.0);
      var4.id_class(rje_3.id_protected.id_byte(rfU_2.id_catch(var3, (Float)var1.id_throws[17], (Float)var1.id_throws[15]) - 90.0F));
      var4.id_class(rje_3.id_case.id_byte(rfU_2.id_catch(var3, (Float)var1.id_throws[18], (Float)var1.id_throws[16])));
      this.id_throws.id_class(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      Ok_1 var7 = var5.getBuffer(this.id_throws.id_class(id_class));
      this.id_throws.id_class(var4, var7, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public rqO_2 id_class(rhw_3 var1) {
      return id_class;
   }
}
