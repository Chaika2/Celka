package celestial;

import com.google.gson.JsonObject;

public class VE implements rAo_1<Vs_1> {
   @Override
   public String class_() {
      return "texture";
   }

   public Vs_1 class_(JsonObject var1) {
      boolean var2 = rpY_2.class_(var1, "blur", false);
      boolean var3 = rpY_2.class_(var1, "clamp", false);
      return new Vs_1(var2, var3);
   }
}
