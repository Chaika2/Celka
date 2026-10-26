package celestial;

public class rrMI extends In_1 {
   public Iq_1 class_;
   public Iq_1 break_;
   public Iq_1[] byte_ = new Iq_1[4];

   public rrMI() {
      super(HU::protected_);
      jz_3 var1 = jz_3.break_;
      fe_3 var2 = new fe_3(var1);
      this.class_ = (Iq_1)rrxr_3.Gx.class_(var2);
      this.break_ = (Iq_1)rrxr_3.Gd.class_(var2);
      this.byte_ = (Iq_1[])rrxr_3.Gk.class_(var2);
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }

   public jW_2 class_(jW_2 var1) {
      if (!rrxr_3.Gx.protected_()) {
         rrbb_3.protected_("Field not found: TileEntityBedRenderer.head");
         return null;
      } else if (!rrxr_3.Gd.protected_()) {
         rrbb_3.protected_("Field not found: TileEntityBedRenderer.footModel");
         return null;
      } else if (!rrxr_3.Gk.protected_()) {
         rrbb_3.protected_("Field not found: TileEntityBedRenderer.legModels");
         return null;
      } else {
         rrxr_3.class_(var1, rrxr_3.Gx, this.class_);
         rrxr_3.class_(var1, rrxr_3.Gd, this.break_);
         rrxr_3.class_(var1, rrxr_3.Gk, this.byte_);
         return var1;
      }
   }
}
