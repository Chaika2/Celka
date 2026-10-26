package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgy_3 {
   static final Logger id_class = LogManager.getLogger();
   private final rgp_3<?> id_break;
   private final Object id_byte;

   public JsonObject id_byte() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("action", this.id_break.id_break());
      var1.add("contents", this.id_break.id_class(this.id_byte));
      return var1;
   }

   public <T> rgy_3(rgp_3<T> var1, T var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgy_3 var2 = (rgy_3)var1;
         return this.id_break == var2.id_break && Objects.equals(this.id_byte, var2.id_byte);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "HoverEvent{action=" + this.id_break + ", value='" + this.id_byte + "'}";
   }

   @Override
   public int hashCode() {
      int var1 = this.id_break.hashCode();
      return 31 * var1 + (this.id_byte != null ? this.id_byte.hashCode() : 0);
   }

   public <T> T id_class(rgp_3<T> var1) {
      return (T)(this.id_break == var1 ? var1.id_break(this.id_byte) : null);
   }

   public static rgy_3 id_class(JsonObject var0) {
      String var1 = rpY_2.id_class(var0, "action", (String)null);
      if (var1 == null) {
         return null;
      } else {
         rgp_3 var2 = rgp_3.id_class(var1);
         if (var2 == null) {
            return null;
         } else {
            JsonElement var3 = var0.get("contents");
            if (var3 != null) {
               return var2.id_class(var3);
            } else {
               rVi_1 var4 = rgB_2.id_class(var0.get("value"));
               return var4 != null ? var2.id_class((rgP_2)var4) : null;
            }
         }
      }
   }

   public rgp_3<?> id_class() {
      return this.id_break;
   }

   public Object id_break() {
      return this.id_byte;
   }
}
