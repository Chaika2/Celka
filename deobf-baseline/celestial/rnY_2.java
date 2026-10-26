package celestial;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class rnY_2<T> extends rCd_1<T> {
   public static final SimpleDateFormat id_class = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   protected final Date id_break;
   protected final String id_byte;
   protected final Date id_protected;
   protected final String id_throws;

   public String id_byte() {
      return this.id_throws;
   }

   public rnY_2(T var1, Date var2, String var3, Date var4, String var5) {
      super((T)var1);
      this.id_break = var2 == null ? new Date() : var2;
      this.id_byte = var3 == null ? "(Unknown)" : var3;
      this.id_protected = var4;
      this.id_throws = var5 == null ? "Banned by an operator." : var5;
   }

   protected rnY_2(T var1, JsonObject var2) {
      super((T)var1);

      Date var3;
      try {
         var3 = var2.has("created") ? id_class.parse(var2.get("created").getAsString()) : new Date();
      } catch (ParseException var7) {
         var3 = new Date();
      }

      this.id_break = var3;
      this.id_byte = var2.has("source") ? var2.get("source").getAsString() : "(Unknown)";

      Date var4;
      try {
         var4 = var2.has("expires") ? id_class.parse(var2.get("expires").getAsString()) : null;
      } catch (ParseException var6) {
         var4 = null;
      }

      this.id_protected = var4;
      this.id_throws = var2.has("reason") ? var2.get("reason").getAsString() : "Banned by an operator.";
   }

   @Override
   protected void id_class(JsonObject var1) {
      var1.addProperty("created", id_class.format(this.id_break));
      var1.addProperty("source", this.id_byte);
      var1.addProperty("expires", this.id_protected == null ? "forever" : id_class.format(this.id_protected));
      var1.addProperty("reason", this.id_throws);
   }

   public String id_class() {
      return this.id_byte;
   }

   public Date id_break() {
      return this.id_protected;
   }

   @Override
   boolean id_throws() {
      return this.id_protected == null ? false : this.id_protected.before(new Date());
   }

   public abstract rgP_2 id_protected();
}
