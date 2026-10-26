package celestial;

public class rrMI extends In_1 {
   public Iq_1 id_class;
   public Iq_1 id_break;
   public Iq_1[] id_byte = new Iq_1[4];

   public rrMI() {
      super(HU::id_protected);
      jz_3 var1 = jz_3.id_break;
      fe_3 var2 = new fe_3(var1);
      this.id_class = (Iq_1)rrxr_3.Gx.id_class(var2);
      this.id_break = (Iq_1)rrxr_3.Gd.id_class(var2);
      this.id_byte = (Iq_1[])rrxr_3.Gk.id_class(var2);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }

   public jW_2 id_class(jW_2 var1) {
      if (!rrxr_3.Gx.id_protected()) {
         rrbb_3.id_protected("Field not found: TileEntityBedRenderer.head");
         return null;
      } else if (!rrxr_3.Gd.id_protected()) {
         rrbb_3.id_protected("Field not found: TileEntityBedRenderer.footModel");
         return null;
      } else if (!rrxr_3.Gk.id_protected()) {
         rrbb_3.id_protected("Field not found: TileEntityBedRenderer.legModels");
         return null;
      } else {
         rrxr_3.id_class(var1, rrxr_3.Gx, this.id_class);
         rrxr_3.id_class(var1, rrxr_3.Gd, this.id_break);
         rrxr_3.id_class(var1, rrxr_3.Gk, this.id_byte);
         return var1;
      }
   }
}
