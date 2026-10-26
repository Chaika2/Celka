package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hl_3 {
   public static final hl_3 id_class = new hl_3(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws);
   private final Xm_1 id_break;
   private final Xm_1 id_byte;
   private final Xm_1 id_protected;
   private final Xm_1 id_throws;
   private final Xm_1 id_case;

   public hl_3(Xm_1 var1, Xm_1 var2, Xm_1 var3, Xm_1 var4, Xm_1 var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("x", this.id_break.id_protected());
         var1.add("y", this.id_byte.id_protected());
         var1.add("z", this.id_protected.id_protected());
         var1.add("horizontal", this.id_throws.id_protected());
         var1.add("absolute", this.id_case.id_protected());
         return var1;
      }
   }

   public boolean id_class(double var1, double var3, double var5, double var7, double var9, double var11) {
      float var13 = (float)(var1 - var7);
      float var14 = (float)(var3 - var9);
      float var15 = (float)(var5 - var11);
      if (!this.id_break.id_break(rfU_2.id_throws(var13))
         || !this.id_byte.id_break(rfU_2.id_throws(var14))
         || !this.id_protected.id_break(rfU_2.id_throws(var15))) {
         return false;
      } else {
         return !this.id_throws.id_class((double)(var13 * var13 + var15 * var15))
            ? false
            : this.id_case.id_class((double)(var13 * var13 + var14 * var14 + var15 * var15));
      }
   }

   public static hl_3 id_class(Xm_1 var0) {
      return new hl_3(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, var0, Xm_1.id_throws);
   }

   public static hl_3 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "distance");
         Xm_1 var2 = Xm_1.id_class(var1.get("x"));
         Xm_1 var3 = Xm_1.id_class(var1.get("y"));
         Xm_1 var4 = Xm_1.id_class(var1.get("z"));
         Xm_1 var5 = Xm_1.id_class(var1.get("horizontal"));
         Xm_1 var6 = Xm_1.id_class(var1.get("absolute"));
         return new hl_3(var2, var3, var4, var5, var6);
      } else {
         return id_class;
      }
   }

   public static hl_3 id_break(Xm_1 var0) {
      return new hl_3(Xm_1.id_throws, var0, Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws);
   }
}
