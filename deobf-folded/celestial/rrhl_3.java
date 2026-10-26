package celestial;

public class rrhl_3 extends rrMi_1 {
   public rrhl_3() {
      super(ryW_2.id_private, "sign", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_private);
      if (!(var4 instanceof jX_2)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new jX_2(var3);
         }

         if (!rrxr_3.GH.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntitySignRenderer.model");
            return null;
         } else {
            rrxr_3.id_class(var4, rrxr_3.GH, var1);
            return (rrMa_1)var4;
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof jJ_2 var3)) {
         return null;
      } else if (var2.equals("board")) {
         return (Iq_1)rrxr_3.Es.id_class(var3, 0);
      } else {
         return var2.equals("stick") ? (Iq_1)rrxr_3.Es.id_class(var3, 1) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new jJ_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{"board", "stick"};
   }
}
