package celestial;

public class rrhl_3 extends rrMi_1 {
   public rrhl_3() {
      super(ryW_2.private_, "sign", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.private_);
      if (!(var4 instanceof jX_2)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new jX_2(var3);
         }

         if (!rrxr_3.GH.protected_()) {
            rrbb_3.protected_("Field not found: TileEntitySignRenderer.model");
            return null;
         } else {
            rrxr_3.class_(var4, rrxr_3.GH, var1);
            return (rrMa_1)var4;
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof jJ_2 var3)) {
         return null;
      } else if (var2.equals("board")) {
         return (Iq_1)rrxr_3.Es.class_(var3, 0);
      } else {
         return var2.equals("stick") ? (Iq_1)rrxr_3.Es.class_(var3, 1) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new jJ_2();
   }

   @Override
   public String[] case_() {
      return new String[]{"board", "stick"};
   }
}
