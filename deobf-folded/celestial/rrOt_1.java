package celestial;

import java.util.Map;

public class rrOt_1 extends rrMi_1 {
   public rrOt_1() {
      super(ryW_2.id_package, "head_dragon", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_package);
      if (!(var4 instanceof jx_3)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new jx_3(var3);
         }

         Map var5 = (Map)rrxr_3.Gp.id_byte();
         if (var5 == null) {
            rrbb_3.id_protected("Field not found: TileEntitySkullRenderer.MODELS");
            return null;
         } else {
            var5.put(Wf_1.DRAGON, var1);
            return (rrMa_1)var4;
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof jQ_2 var3)) {
         return null;
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sG);
      } else {
         return var2.equals("jaw") ? (Iq_1)rrxr_3.id_class(var3, rrxr_3.sb) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new jQ_2(0.0F);
   }

   @Override
   public String[] id_case() {
      return new String[]{"head", "jaw"};
   }
}
