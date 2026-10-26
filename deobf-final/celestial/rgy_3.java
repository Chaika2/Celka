package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgy_3 {
   static final Logger class_ = LogManager.getLogger();
   private final rgp_3<?> break_;
   private final Object byte_;

   public JsonObject byte_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("action", this.break_.break_());
      var1.add("contents", this.break_.class_(this.byte_));
      return var1;
   }

   public <T> rgy_3(rgp_3<T> var1, T var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgy_3 var2 = (rgy_3)var1;
         return this.break_ == var2.break_ && Objects.equals(this.byte_, var2.byte_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "HoverEvent{action=" + this.break_ + ", value='" + this.byte_ + "'}";
   }

   @Override
   public int hashCode() {
      int var1 = this.break_.hashCode();
      return 31 * var1 + (this.byte_ != null ? this.byte_.hashCode() : 0);
   }

   public <T> T class_(rgp_3<T> var1) {
      return (T)(this.break_ == var1 ? var1.break_(this.byte_) : null);
   }

   public static rgy_3 class_(JsonObject var0) {
      String var1 = rpY_2.class_(var0, "action", (String)null);
      if (var1 == null) {
         return null;
      } else {
         rgp_3 var2 = rgp_3.class_(var1);
         if (var2 == null) {
            return null;
         } else {
            JsonElement var3 = var0.get("contents");
            if (var3 != null) {
               return var2.class_(var3);
            } else {
               rVi_1 var4 = rgB_2.class_(var0.get("value"));
               return var4 != null ? var2.class_((rgP_2)var4) : null;
            }
         }
      }
   }

   public rgp_3<?> class_() {
      return this.break_;
   }

   public Object break_() {
      return this.byte_;
   }
}
