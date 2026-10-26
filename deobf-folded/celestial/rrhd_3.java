package celestial;

import java.util.ArrayList;
import java.util.Arrays;

public class rrhd_3 extends rrOG {
   public rrhd_3() {
      super(aI_2.d, "piglin", 0.5F);
   }

   protected rrhd_3(aI_2 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (var1 instanceof wO_2 var3) {
         if (var2.equals("left_ear")) {
            return var3.id_native;
         }

         if (var2.equals("right_ear")) {
            return var3.id_volatile;
         }
      }

      return super.id_class(var1, var2);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qn_3 var4 = new qn_3(var3, false);
      var4.id_throws = (wO_2<is_3>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public In_1 id_throws() {
      return new wO_2(0.0F, 64, 64);
   }

   @Override
   public String[] id_case() {
      ArrayList var1 = new ArrayList<>(Arrays.asList(super.id_case()));
      var1.add("left_ear");
      var1.add("right_ear");
      return var1.toArray(new String[var1.size()]);
   }
}
