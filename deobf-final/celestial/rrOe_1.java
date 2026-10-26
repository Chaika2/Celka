package celestial;

import java.util.Iterator;
import java.util.List;

public class rrOe_1 extends rrOU {
   public rrOe_1() {
      super(aI_2.transient_, "llama_decor", 0.7F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Object var4 = var3.throws_().get(aI_2.transient_);
      if (!(var4 instanceof qW_2)) {
         rrbb_3.protected_("Not a RenderLlama: " + var4);
         return null;
      } else {
         if (((pV_2)var4).byte_() == null) {
            qW_2 var5 = new qW_2(var3);
            var5.throws_ = new te_3<>(0.0F);
            var5.byte_ = 0.7F;
            var4 = var5;
         }

         qW_2 var9 = (qW_2)var4;
         List var6 = var9.throws_();
         Iterator var7 = var6.iterator();

         while (var7.hasNext()) {
            Tf_1 var8 = (Tf_1)var7.next();
            if (var8 instanceof TV) {
               var7.remove();
            }
         }

         TV var10 = new TV(var9);
         if (!rrxr_3.SN.protected_()) {
            rrbb_3.protected_("Field not found: LayerLlamaDecor.model");
            return null;
         } else {
            rrxr_3.SN.class_(var10, var1);
            var9.class_(var10);
            return var9;
         }
      }
   }

   @Override
   public In_1 throws_() {
      return new te_3(0.5F);
   }
}
