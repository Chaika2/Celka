package celestial;

import com.google.gson.JsonObject;
import java.io.IOException;

public class uC_2 implements uu_3 {
   private final rqO_2 id_class;
   private final String id_break;

   public uC_2(rqO_2 var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public static uu_3 id_class(JsonObject var0) {
      return new uC_2(new rqO_2(rpY_2.id_case(var0, "sizes")), rpY_2.id_case(var0, "template"));
   }

   @Override
   public uc_3 id_class(rAL var1) {
      try {
         un_3 var4;
         try (rAF var2 = QY.id_instanceof().F().id_class(this.id_class)) {
            byte[] var3 = new byte[65536];
            var2.id_break().read(var3);
            var4 = new un_3(var1, var3, this.id_break);
         }

         return var4;
      } catch (IOException var7) {
         un_3.id_class.error("Cannot load {}, unicode glyphs will not render correctly", this.id_class);
         return null;
      }
   }
}
