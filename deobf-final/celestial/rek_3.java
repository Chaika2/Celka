package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class rek_3 {
   private final int class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final rem_3 throws_;

   public int byte_() {
      return this.byte_;
   }

   public rek_3(int var1, int var2, int var3, int var4, rem_3 var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rek_3 var2 = (rek_3)var1;
         if (this.class_ != var2.class_) {
            return false;
         } else if (this.byte_ != var2.byte_) {
            return false;
         } else {
            return this.protected_ != var2.protected_ ? false : this.throws_ == var2.throws_;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "JigsawJunction{sourceX="
         + this.class_
         + ", sourceGroundY="
         + this.break_
         + ", sourceZ="
         + this.byte_
         + ", deltaY="
         + this.protected_
         + ", destProjection="
         + this.throws_
         + "}";
   }

   @Override
   public int hashCode() {
      int var1 = this.class_;
      var1 = 31 * var1 + this.break_;
      var1 = 31 * var1 + this.byte_;
      var1 = 31 * var1 + this.protected_;
      return 31 * var1 + this.throws_.hashCode();
   }

   public <T> Dynamic<T> class_(DynamicOps<T> var1) {
      Builder var2 = ImmutableMap.builder();
      var2.put(var1.createString("source_x"), var1.createInt(this.class_))
         .put(var1.createString("source_ground_y"), var1.createInt(this.break_))
         .put(var1.createString("source_z"), var1.createInt(this.byte_))
         .put(var1.createString("delta_y"), var1.createInt(this.protected_))
         .put(var1.createString("dest_proj"), var1.createString(this.throws_.break_()));
      return new Dynamic(var1, var1.createMap(var2.build()));
   }

   public static <T> rek_3 class_(Dynamic<T> var0) {
      return new rek_3(
         var0.get("source_x").asInt(0),
         var0.get("source_ground_y").asInt(0),
         var0.get("source_z").asInt(0),
         var0.get("delta_y").asInt(0),
         rem_3.class_(var0.get("dest_proj").asString(""))
      );
   }

   public int class_() {
      return this.class_;
   }

   public int break_() {
      return this.break_;
   }
}
