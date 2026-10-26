package celestial;

public class rrMV extends In_1 {
   public Iq_1 id_class;
   public Iq_1 id_break;
   public Iq_1 id_byte;

   public rrMV() {
      super(HU::id_byte);
      jz_3 var1 = jz_3.id_break;
      jr_3 var2 = new jr_3(var1);
      this.id_class = (Iq_1)rrxr_3.Gu.id_class(var2, 0);
      this.id_break = (Iq_1)rrxr_3.Gu.id_class(var2, 1);
      this.id_byte = (Iq_1)rrxr_3.Gu.id_class(var2, 2);
   }

   public jW_2 id_class(jW_2 var1) {
      if (!rrxr_3.Gu.id_protected()) {
         rrbb_3.id_protected("Field not found: TileEntityChestRenderer.modelRenderers");
         return null;
      } else {
         rrxr_3.Gu.id_class(var1, 0, this.id_class);
         rrxr_3.Gu.id_class(var1, 1, this.id_break);
         rrxr_3.Gu.id_class(var1, 2, this.id_byte);
         return var1;
      }
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
