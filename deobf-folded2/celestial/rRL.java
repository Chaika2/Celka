package celestial;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class rRL extends rRC<rRL> {
   private int id_break;

   private static int id_byte(String var0) {
      if (!var0.isEmpty()) {
         try {
            return Integer.parseInt(var0);
         } catch (NumberFormatException var2) {
            rRu_1.id_float.warn("Failed to parse integer {}", var0);
         }
      }

      return 0;
   }

   @Override
   public int id_byte() {
      return this.id_break;
   }

   public rRL(rRn_1<rRL> var1, int var2) {
      super(var1);
      this.id_break = var2;
   }

   private static rRn_1<rRL> id_class(int var0, BiConsumer<rnW_2, rRL> var1) {
      return new rRn_1<>(IntegerArgumentType::integer, var1x -> new rRL(var1x, var0), var1, rRF::id_break);
   }

   public void id_class(rRL var1, rnW_2 var2) {
      this.id_break = var1.id_break;
      this.id_class(var2);
   }

   @Override
   protected void id_class(String var1) {
      this.id_break = id_byte(var1);
   }

   public int id_class() {
      return this.id_break;
   }

   @Override
   protected void id_class(CommandContext<gy_3> var1, String var2) {
      this.id_break = IntegerArgumentType.getInteger(var1, var2);
   }

   static rRn_1<rRL> id_class(int var0) {
      return id_class(var0, (var0x, var1) -> {
      });
   }

   public boolean id_break(String var1) {
      try {
         this.id_break = Integer.parseInt(var1);
         return true;
      } catch (NumberFormatException var3) {
         return false;
      }
   }

   @Override
   public String id_break() {
      return Integer.toString(this.id_break);
   }

   protected rRL id_throws() {
      return new rRL(this.id_class, this.id_break);
   }

   protected rRL id_protected() {
      return this;
   }
}
