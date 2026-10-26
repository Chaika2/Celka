package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OD {
   private static final SimpleDateFormat class_ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private Date break_;

   public void byte_() {
      this.break_ = null;
   }

   @Override
   public String toString() {
      return "CriterionProgress{obtained=" + (this.break_ == null ? "false" : this.break_) + "}";
   }

   public void class_(ruu_3 var1) {
      var1.writeBoolean(this.break_ != null);
      if (this.break_ != null) {
         var1.class_(this.break_);
      }
   }

   public boolean class_() {
      return this.break_ != null;
   }

   public static OD class_(String var0) {
      OD var1 = new OD();

      try {
         var1.break_ = class_.parse(var0);
         return var1;
      } catch (ParseException var3) {
         throw new JsonSyntaxException("Invalid datetime: " + var0, var3);
      }
   }

   public static OD break_(ruu_3 var0) {
      OD var1 = new OD();
      if (var0.readBoolean()) {
         var1.break_ = var0.final_();
      }

      return var1;
   }

   public void break_() {
      this.break_ = new Date();
   }

   public JsonElement throws_() {
      return (JsonElement)(this.break_ != null ? new JsonPrimitive(class_.format(this.break_)) : JsonNull.INSTANCE);
   }

   public Date protected_() {
      return this.break_;
   }
}
