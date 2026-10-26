package celestial;

import com.google.gson.JsonObject;

public class fR_2 implements rAo_1<VG> {
   @Override
   public String id_class() {
      return "villager";
   }

   public VG id_class(JsonObject var1) {
      return new VG(Vb_1.id_class(rpY_2.id_class(var1, "hat", "none")));
   }
}
