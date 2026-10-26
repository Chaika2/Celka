package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class rek_3 {
   private final int id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final rem_3 id_throws;

   public int id_byte() {
      return this.id_byte;
   }

   public rek_3(int var1, int var2, int var3, int var4, rem_3 var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rek_3 var2 = (rek_3)var1;
         if (this.id_class != var2.id_class) {
            return false;
         } else if (this.id_byte != var2.id_byte) {
            return false;
         } else {
            return this.id_protected != var2.id_protected ? false : this.id_throws == var2.id_throws;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "JigsawJunction{sourceX="
         + this.id_class
         + ", sourceGroundY="
         + this.id_break
         + ", sourceZ="
         + this.id_byte
         + ", deltaY="
         + this.id_protected
         + ", destProjection="
         + this.id_throws
         + "}";
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class;
      var1 = 31 * var1 + this.id_break;
      var1 = 31 * var1 + this.id_byte;
      var1 = 31 * var1 + this.id_protected;
      return 31 * var1 + this.id_throws.hashCode();
   }

   public <T> Dynamic<T> id_class(DynamicOps<T> var1) {
      Builder var2 = ImmutableMap.builder();
      var2.put(var1.createString("source_x"), var1.createInt(this.id_class))
         .put(var1.createString("source_ground_y"), var1.createInt(this.id_break))
         .put(var1.createString("source_z"), var1.createInt(this.id_byte))
         .put(var1.createString("delta_y"), var1.createInt(this.id_protected))
         .put(var1.createString("dest_proj"), var1.createString(this.id_throws.id_break()));
      return new Dynamic(var1, var1.createMap(var2.build()));
   }

   public static <T> rek_3 id_class(Dynamic<T> var0) {
      return new rek_3(
         var0.get("source_x").asInt(0),
         var0.get("source_ground_y").asInt(0),
         var0.get("source_z").asInt(0),
         var0.get("delta_y").asInt(0),
         rem_3.id_class(var0.get("dest_proj").asString(""))
      );
   }

   public int id_class() {
      return this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }
}
