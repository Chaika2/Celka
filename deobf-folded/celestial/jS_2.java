package celestial;

public class jS_2 extends jW_2<rHH> {
   public static final Ig_1 id_class = new Ig_1(fJ_2.id_class, new rqO_2("entity/enchanting_table_book"));
   private final tm_3 id_break = new tm_3();

   public jS_2(jz_3 var1) {
      super(var1);
   }

   public void id_class(rHH var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      var3.id_class();
      var3.id_class(0.5, 0.75, 0.5);
      float var7 = (float)var1.id_class + var2;
      var3.id_class(0.0, (double)(0.1F + rfU_2.id_class(var7 * 0.1F) * 0.01F), 0.0);
      float var8 = var1.id_private - var1.id_implements;

      while (var8 >= (float) Math.PI) {
         var8 -= (float) (Math.PI * 2);
      }

      while (var8 < (float) -Math.PI) {
         var8 += (float) (Math.PI * 2);
      }

      float var9 = var1.id_implements + var8 * var2;
      var3.id_class(rje_3.id_protected.id_break(-var9));
      var3.id_class(rje_3.id_case.id_byte(80.0F));
      float var10 = rfU_2.id_catch(var2, var1.id_byte, var1.id_break);
      float var11 = rfU_2.id_private(var10 + 0.25F) * 1.6F - 0.3F;
      float var12 = rfU_2.id_private(var10 + 0.75F) * 1.6F - 0.3F;
      float var13 = rfU_2.id_catch(var2, var1.id_catch, var1.id_case);
      this.id_break.id_class(var7, rfU_2.id_class(var11, 0.0F, 1.0F), rfU_2.id_class(var12, 0.0F, 1.0F), var13);
      Ok_1 var14 = id_class.id_class(var4, HU::id_break);
      this.id_break.id_break(var3, var14, var5, var6, 1.0F, 1.0F, 1.0F, 1.0F);
      var3.id_break();
   }
}
