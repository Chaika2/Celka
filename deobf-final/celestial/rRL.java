package celestial;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class rRL extends rRC<rRL> {
   private int break_;

   private static int byte_(String var0) {
      if (!var0.isEmpty()) {
         try {
            return Integer.parseInt(var0);
         } catch (NumberFormatException var2) {
            rRu_1.float_.warn("Failed to parse integer {}", var0);
         }
      }

      return 0;
   }

   @Override
   public int byte_() {
      return this.break_;
   }

   public rRL(rRn_1<rRL> var1, int var2) {
      super(var1);
      this.break_ = var2;
   }

   private static rRn_1<rRL> class_(int var0, BiConsumer<rnW_2, rRL> var1) {
      return new rRn_1<>(IntegerArgumentType::integer, var1x -> new rRL(var1x, var0), var1, rRF::break_);
   }

   public void class_(rRL var1, rnW_2 var2) {
      this.break_ = var1.break_;
      this.class_(var2);
   }

   @Override
   protected void class_(String var1) {
      this.break_ = byte_(var1);
   }

   public int class_() {
      return this.break_;
   }

   @Override
   protected void class_(CommandContext<gy_3> var1, String var2) {
      this.break_ = IntegerArgumentType.getInteger(var1, var2);
   }

   static rRn_1<rRL> class_(int var0) {
      return class_(var0, (var0x, var1) -> {
      });
   }

   public boolean break_(String var1) {
      try {
         this.break_ = Integer.parseInt(var1);
         return true;
      } catch (NumberFormatException var3) {
         return false;
      }
   }

   @Override
   public String break_() {
      return Integer.toString(this.break_);
   }

   protected rRL throws_() {
      return new rRL(this.class_, this.break_);
   }

   protected rRL protected_() {
      return this;
   }
}
