package celestial;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ix_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final double id_break;
   private final id_3 id_byte;
   private final Supplier<String> id_protected;
   private final UUID id_throws;

   public id_3 id_byte() {
      return this.id_byte;
   }

   public ix_3(String var1, double var2, id_3 var4) {
      this(rfU_2.id_class(ThreadLocalRandom.current()), () -> var1, var2, var4);
   }

   public ix_3(UUID var1, Supplier<String> var2, double var3, id_3 var5) {
      this.id_throws = var1;
      this.id_protected = var2;
      this.id_break = var3;
      this.id_byte = var5;
   }

   public ix_3(UUID var1, String var2, double var3, id_3 var5) {
      this(var1, () -> var2, var3, var5);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ix_3 var2 = (ix_3)var1;
         return Objects.equals(this.id_throws, var2.id_throws);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount="
         + this.id_break
         + ", operation="
         + this.id_byte
         + ", name='"
         + this.id_protected.get()
         + "', id="
         + this.id_throws
         + "}";
   }

   @Override
   public int hashCode() {
      return this.id_throws.hashCode();
   }

   public static ix_3 id_class(rcd_3 var0) {
      try {
         UUID var1 = var0.id_class("UUID");
         id_3 var2 = id_3.id_class(var0.id_private("Operation"));
         return new ix_3(var1, var0.id_native("Name"), var0.id_extends("Amount"), var2);
      } catch (Exception var3) {
         id_class.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public UUID id_class() {
      return this.id_throws;
   }

   public String id_break() {
      return this.id_protected.get();
   }

   public rcd_3 id_throws() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("Name", this.id_break());
      var1.id_class("Amount", this.id_break);
      var1.id_break("Operation", this.id_byte.id_class());
      var1.id_class("UUID", this.id_throws);
      return var1;
   }

   public double id_protected() {
      return this.id_break;
   }
}
