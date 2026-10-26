package celestial;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class rnY_2<T> extends rCd_1<T> {
   public static final SimpleDateFormat class_ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   protected final Date break_;
   protected final String byte_;
   protected final Date protected_;
   protected final String throws_;

   public String byte_() {
      return this.throws_;
   }

   public rnY_2(T var1, Date var2, String var3, Date var4, String var5) {
      super((T)var1);
      this.break_ = var2 == null ? new Date() : var2;
      this.byte_ = var3 == null ? "(Unknown)" : var3;
      this.protected_ = var4;
      this.throws_ = var5 == null ? "Banned by an operator." : var5;
   }

   protected rnY_2(T var1, JsonObject var2) {
      super((T)var1);

      Date var3;
      try {
         var3 = var2.has("created") ? class_.parse(var2.get("created").getAsString()) : new Date();
      } catch (ParseException var7) {
         var3 = new Date();
      }

      this.break_ = var3;
      this.byte_ = var2.has("source") ? var2.get("source").getAsString() : "(Unknown)";

      Date var4;
      try {
         var4 = var2.has("expires") ? class_.parse(var2.get("expires").getAsString()) : null;
      } catch (ParseException var6) {
         var4 = null;
      }

      this.protected_ = var4;
      this.throws_ = var2.has("reason") ? var2.get("reason").getAsString() : "Banned by an operator.";
   }

   @Override
   protected void class_(JsonObject var1) {
      var1.addProperty("created", class_.format(this.break_));
      var1.addProperty("source", this.byte_);
      var1.addProperty("expires", this.protected_ == null ? "forever" : class_.format(this.protected_));
      var1.addProperty("reason", this.throws_);
   }

   public String class_() {
      return this.byte_;
   }

   public Date break_() {
      return this.protected_;
   }

   @Override
   boolean throws_() {
      return this.protected_ == null ? false : this.protected_.before(new Date());
   }

   public abstract rgP_2 protected_();
}
