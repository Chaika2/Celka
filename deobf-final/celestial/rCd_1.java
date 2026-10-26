package celestial;

import com.google.gson.JsonObject;

public abstract class rCd_1<T> {
   private final T class_;

   public rCd_1(T var1) {
      this.class_ = (T)var1;
   }

   protected abstract void class_(JsonObject var1);

   boolean throws_() {
      return false;
   }

   T case_() {
      return this.class_;
   }
}
