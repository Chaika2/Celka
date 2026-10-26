package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;

public final class Va_1 {
   private final String id_class;
   private final Vi_1 id_break;
   private final int id_byte;
   private final rpo_3<rgP_2> id_protected;
   static final Map<String, Va_1> id_throws = Maps.newHashMap();

   public String id_byte() {
      return this.id_class;
   }

   Va_1(String var1, Vi_1 var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = new rpo_3<>(() -> var2.field_237522_f_.apply(var3, var1));
      id_throws.put(var1, this);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Va_1 var2 = (Va_1)var1;
         return this.id_byte == var2.id_byte && this.id_break == var2.id_break;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.id_class;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_break, this.id_byte);
   }

   public Vi_1 id_class() {
      return this.id_break;
   }

   public int id_break() {
      return this.id_byte;
   }

   public OptionalInt id_throws() {
      if (this.id_byte >= 48 && this.id_byte <= 57) {
         return OptionalInt.of(this.id_byte - 48);
      } else {
         return this.id_byte >= 320 && this.id_byte <= 329 ? OptionalInt.of(this.id_byte - 320) : OptionalInt.empty();
      }
   }

   public rgP_2 id_protected() {
      return this.id_protected.id_class();
   }
}
