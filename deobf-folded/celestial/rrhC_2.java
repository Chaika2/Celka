package celestial;

public class rrhC_2 extends rrMi_1 {
   public rrhC_2() {
      super(aI_2.F, "shulker_bullet", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qw_3 var4 = new qw_3(var3);
      if (!rrxr_3.GB.id_protected()) {
         rrbb_3.id_protected("Field not found: RenderShulkerBullet.model");
         return null;
      } else {
         rrxr_3.id_class(var4, rrxr_3.GB, var1);
         var4.id_byte = var2;
         return var4;
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wZ_2 var3)) {
         return null;
      } else {
         return var2.equals("bullet") ? (Iq_1)rrxr_3.EB.id_class(var3) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wZ_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{"bullet"};
   }
}
