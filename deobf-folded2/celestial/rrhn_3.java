package celestial;

public class rrhn_3 extends rrMi_1 {
   public rrhn_3() {
      super(ryW_2.id_return, "shulker_box", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_return);
      if (!(var4 instanceof jh_3)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new jh_3((wv_3<?>)var1, var3);
         }

         if (!rrxr_3.GC.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityShulkerBoxRenderer.model");
            return null;
         } else {
            rrxr_3.id_class(var4, rrxr_3.GC, var1);
            return (rrMa_1)var4;
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wv_3 var3)) {
         return null;
      } else if (var2.equals("base")) {
         return (Iq_1)rrxr_3.Er.id_class(var3, 0);
      } else if (var2.equals("lid")) {
         return (Iq_1)rrxr_3.Er.id_class(var3, 1);
      } else {
         return var2.equals("head") ? (Iq_1)rrxr_3.Er.id_class(var3, 2) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wv_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"base", "lid", "head"};
   }
}
