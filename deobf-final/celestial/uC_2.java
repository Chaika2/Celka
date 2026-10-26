package celestial;

import com.google.gson.JsonObject;
import java.io.IOException;

public class uC_2 implements uu_3 {
   private final rqO_2 class_;
   private final String break_;

   public uC_2(rqO_2 var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public static uu_3 class_(JsonObject var0) {
      return new uC_2(new rqO_2(rpY_2.case_(var0, "sizes")), rpY_2.case_(var0, "template"));
   }

   @Override
   public uc_3 class_(rAL var1) {
      try {
         un_3 var4;
         try (rAF var2 = QY.instanceof_().F().class_(this.class_)) {
            byte[] var3 = new byte[65536];
            var2.break_().read(var3);
            var4 = new un_3(var1, var3, this.break_);
         }

         return var4;
      } catch (IOException var7) {
         un_3.class_.error("Cannot load {}, unicode glyphs will not render correctly", this.class_);
         return null;
      }
   }
}
