package celestial;

public class rrMV extends In_1 {
   public Iq_1 class_;
   public Iq_1 break_;
   public Iq_1 byte_;

   public rrMV() {
      super(HU::byte_);
      jz_3 var1 = jz_3.break_;
      jr_3 var2 = new jr_3(var1);
      this.class_ = (Iq_1)rrxr_3.Gu.class_(var2, 0);
      this.break_ = (Iq_1)rrxr_3.Gu.class_(var2, 1);
      this.byte_ = (Iq_1)rrxr_3.Gu.class_(var2, 2);
   }

   public jW_2 class_(jW_2 var1) {
      if (!rrxr_3.Gu.protected_()) {
         rrbb_3.protected_("Field not found: TileEntityChestRenderer.modelRenderers");
         return null;
      } else {
         rrxr_3.Gu.class_(var1, 0, this.class_);
         rrxr_3.Gu.class_(var1, 1, this.break_);
         rrxr_3.Gu.class_(var1, 2, this.byte_);
         return var1;
      }
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
