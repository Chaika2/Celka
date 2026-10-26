package celestial;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ix_3 {
   private static final Logger class_ = LogManager.getLogger();
   private final double break_;
   private final id_3 byte_;
   private final Supplier<String> protected_;
   private final UUID throws_;

   public id_3 byte_() {
      return this.byte_;
   }

   public ix_3(String var1, double var2, id_3 var4) {
      this(rfU_2.class_(ThreadLocalRandom.current()), () -> var1, var2, var4);
   }

   public ix_3(UUID var1, Supplier<String> var2, double var3, id_3 var5) {
      this.throws_ = var1;
      this.protected_ = var2;
      this.break_ = var3;
      this.byte_ = var5;
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
         return Objects.equals(this.throws_, var2.throws_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount=" + this.break_ + ", operation=" + this.byte_ + ", name='" + this.protected_.get() + "', id=" + this.throws_ + "}";
   }

   @Override
   public int hashCode() {
      return this.throws_.hashCode();
   }

   public static ix_3 class_(rcd_3 var0) {
      try {
         UUID var1 = var0.class_("UUID");
         id_3 var2 = id_3.class_(var0.private_("Operation"));
         return new ix_3(var1, var0.native_("Name"), var0.extends_("Amount"), var2);
      } catch (Exception var3) {
         class_.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public UUID class_() {
      return this.throws_;
   }

   public String break_() {
      return this.protected_.get();
   }

   public rcd_3 throws_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("Name", this.break_());
      var1.class_("Amount", this.break_);
      var1.break_("Operation", this.byte_.class_());
      var1.class_("UUID", this.throws_);
      return var1;
   }

   public double protected_() {
      return this.break_;
   }
}
