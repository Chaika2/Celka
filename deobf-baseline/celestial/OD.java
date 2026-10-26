package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OD {
   private static final SimpleDateFormat id_class = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private Date id_break;

   public void id_byte() {
      this.id_break = null;
   }

   @Override
   public String toString() {
      return "CriterionProgress{obtained=" + (this.id_break == null ? "false" : this.id_break) + "}";
   }

   public void id_class(ruu_3 var1) {
      var1.writeBoolean(this.id_break != null);
      if (this.id_break != null) {
         var1.id_class(this.id_break);
      }
   }

   public boolean id_class() {
      return this.id_break != null;
   }

   public static OD id_class(String var0) {
      OD var1 = new OD();

      try {
         var1.id_break = id_class.parse(var0);
         return var1;
      } catch (ParseException var3) {
         throw new JsonSyntaxException("Invalid datetime: " + var0, var3);
      }
   }

   public static OD id_break(ruu_3 var0) {
      OD var1 = new OD();
      if (var0.readBoolean()) {
         var1.id_break = var0.id_final();
      }

      return var1;
   }

   public void id_break() {
      this.id_break = new Date();
   }

   public JsonElement id_throws() {
      return (JsonElement)(this.id_break != null ? new JsonPrimitive(id_class.format(this.id_break)) : JsonNull.INSTANCE);
   }

   public Date id_protected() {
      return this.id_break;
   }
}
