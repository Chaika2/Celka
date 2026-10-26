package celestial;

public class rrMj_1 extends In_1 {
   public Iq_1 id_class;
   public Iq_1 id_break;
   public Iq_1 id_byte;
   public Iq_1 id_protected;
   public Iq_1 id_throws;
   public Iq_1 id_case;

   public rrMj_1() {
      super(HU::id_byte);
      jz_3 var1 = jz_3.id_break;
      jr_3 var2 = new jr_3(var1);
      this.id_class = (Iq_1)rrxr_3.Gu.id_class(var2, 3);
      this.id_break = (Iq_1)rrxr_3.Gu.id_class(var2, 4);
      this.id_byte = (Iq_1)rrxr_3.Gu.id_class(var2, 5);
      this.id_protected = (Iq_1)rrxr_3.Gu.id_class(var2, 6);
      this.id_throws = (Iq_1)rrxr_3.Gu.id_class(var2, 7);
      this.id_case = (Iq_1)rrxr_3.Gu.id_class(var2, 8);
   }

   public jW_2 id_class(jW_2 var1) {
      if (!rrxr_3.Gu.id_protected()) {
         rrbb_3.id_protected("Field not found: TileEntityChestRenderer.modelRenderers");
         return null;
      } else {
         rrxr_3.Gu.id_class(var1, 3, this.id_class);
         rrxr_3.Gu.id_class(var1, 4, this.id_break);
         rrxr_3.Gu.id_class(var1, 5, this.id_byte);
         rrxr_3.Gu.id_class(var1, 6, this.id_protected);
         rrxr_3.Gu.id_class(var1, 7, this.id_throws);
         rrxr_3.Gu.id_class(var1, 8, this.id_case);
         return var1;
      }
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
