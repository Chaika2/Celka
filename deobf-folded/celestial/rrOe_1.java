package celestial;

import java.util.Iterator;
import java.util.List;

public class rrOe_1 extends rrOU {
   public rrOe_1() {
      super(aI_2.id_transient, "llama_decor", 0.7F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      Object var4 = var3.id_throws().get(aI_2.id_transient);
      if (!(var4 instanceof qW_2)) {
         rrbb_3.id_protected("Not a RenderLlama: " + var4);
         return null;
      } else {
         if (((pV_2)var4).id_byte() == null) {
            qW_2 var5 = new qW_2(var3);
            var5.id_throws = new te_3<>(0.0F);
            var5.id_byte = 0.7F;
            var4 = var5;
         }

         qW_2 var9 = (qW_2)var4;
         List var6 = var9.id_throws();
         Iterator var7 = var6.iterator();

         while (var7.hasNext()) {
            Tf_1 var8 = (Tf_1)var7.next();
            if (var8 instanceof TV) {
               var7.remove();
            }
         }

         TV var10 = new TV(var9);
         if (!rrxr_3.SN.id_protected()) {
            rrbb_3.id_protected("Field not found: LayerLlamaDecor.model");
            return null;
         } else {
            rrxr_3.SN.id_class(var10, var1);
            var9.id_class(var10);
            return var9;
         }
      }
   }

   @Override
   public In_1 id_throws() {
      return new te_3(0.5F);
   }
}
