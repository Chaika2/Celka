package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.stream.Stream;

public class hQ_2 extends hZ_2 {
   private final ho_3[] id_class;

   public hQ_2(ho_3 var1, ho_3[] var2) {
      super(hz_3.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("victims", ho_3.id_class(this.id_class, var1));
      return var2;
   }

   public boolean id_class(Collection<? extends rzr_3> var1) {
      for (ho_3 var5 : this.id_class) {
         boolean var6 = false;

         for (rzr_3 var8 : var1) {
            if (var5.id_class(var8)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            return false;
         }
      }

      return true;
   }

   public static hQ_2 id_class(hY_2... var0) {
      return new hQ_2(ho_3.id_class, Stream.of(var0).map(ho_3::id_class).toArray(ho_3[]::new));
   }
}
