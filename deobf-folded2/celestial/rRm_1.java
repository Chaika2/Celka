package celestial;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class rRm_1 extends rRC<rRm_1> {
   private boolean id_break;

   @Override
   public int id_byte() {
      return this.id_break ? 1 : 0;
   }

   public rRm_1(rRn_1<rRm_1> var1, boolean var2) {
      super(var1);
      this.id_break = var2;
   }

   @Override
   protected void id_class(String var1) {
      this.id_break = Boolean.parseBoolean(var1);
   }

   public void id_class(rRm_1 var1, rnW_2 var2) {
      this.id_break = var1.id_break;
      this.id_class(var2);
   }

   static rRn_1<rRm_1> id_class(boolean var0, BiConsumer<rnW_2, rRm_1> var1) {
      return new rRn_1<>(BoolArgumentType::bool, var1x -> new rRm_1(var1x, var0), var1, rRF::id_class);
   }

   static rRn_1<rRm_1> id_class(boolean var0) {
      return id_class(var0, (var0x, var1) -> {
      });
   }

   public boolean id_class() {
      return this.id_break;
   }

   @Override
   protected void id_class(CommandContext<gy_3> var1, String var2) {
      this.id_break = BoolArgumentType.getBool(var1, var2);
   }

   public void id_class(boolean var1, rnW_2 var2) {
      this.id_break = var1;
      this.id_class(var2);
   }

   @Override
   public String id_break() {
      return Boolean.toString(this.id_break);
   }

   protected rRm_1 id_throws() {
      return new rRm_1(this.id_class, this.id_break);
   }

   protected rRm_1 id_protected() {
      return this;
   }
}
