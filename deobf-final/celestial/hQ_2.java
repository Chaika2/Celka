package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.stream.Stream;

public class hQ_2 extends hZ_2 {
   private final ho_3[] class_;

   public hQ_2(ho_3 var1, ho_3[] var2) {
      super(hz_3.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("victims", ho_3.class_(this.class_, var1));
      return var2;
   }

   public boolean class_(Collection<? extends rzr_3> var1) {
      for (ho_3 var5 : this.class_) {
         boolean var6 = false;

         for (rzr_3 var8 : var1) {
            if (var5.class_(var8)) {
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

   public static hQ_2 class_(hY_2... var0) {
      return new hQ_2(ho_3.class_, Stream.of(var0).map(ho_3::class_).toArray(ho_3[]::new));
   }
}
