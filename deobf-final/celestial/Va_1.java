package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;

public final class Va_1 {
   private final String class_;
   private final Vi_1 break_;
   private final int byte_;
   private final rpo_3<rgP_2> protected_;
   static final Map<String, Va_1> throws_ = Maps.newHashMap();

   public String byte_() {
      return this.class_;
   }

   Va_1(String var1, Vi_1 var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = new rpo_3<>(() -> var2.field_237522_f_.apply(var3, var1));
      throws_.put(var1, this);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Va_1 var2 = (Va_1)var1;
         return this.byte_ == var2.byte_ && this.break_ == var2.break_;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.break_, this.byte_);
   }

   public Vi_1 class_() {
      return this.break_;
   }

   public int break_() {
      return this.byte_;
   }

   public OptionalInt throws_() {
      if (this.byte_ >= 48 && this.byte_ <= 57) {
         return OptionalInt.of(this.byte_ - 48);
      } else {
         return this.byte_ >= 320 && this.byte_ <= 329 ? OptionalInt.of(this.byte_ - 320) : OptionalInt.empty();
      }
   }

   public rgP_2 protected_() {
      return this.protected_.class_();
   }
}
