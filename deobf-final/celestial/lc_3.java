package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class lc_3 {
   private final List<rqO_2> class_;

   private lc_3(List<rqO_2> var1) {
      this.class_ = var1;
   }

   public static lc_3 class_(JsonObject var0) {
      JsonArray var1 = rpY_2.class_(var0, "textures", (JsonArray)null);
      List var2;
      if (var1 != null) {
         var2 = Streams.stream(var1).map(var0x -> rpY_2.class_(var0x, "texture")).map(rqO_2::new).collect(ImmutableList.toImmutableList());
      } else {
         var2 = null;
      }

      return new lc_3(var2);
   }

   public List<rqO_2> class_() {
      return this.class_;
   }
}
