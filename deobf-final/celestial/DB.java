package celestial;

import com.google.gson.JsonObject;

public class DB {
   private final T break_;

   public DB(T var1, Object var2) {
      this.class_ = var1;
      this.break_ = (T)var2;
   }

   @Override
   public String toString() {
      return this.class_.class_ + "=" + this.break_;
   }

   public void class_(JsonObject var1) {
      var1.add(this.class_.class_, this.class_.break_.apply(this.break_));
   }
}
