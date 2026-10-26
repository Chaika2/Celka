package celestial;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class rRm_1 extends rRC<rRm_1> {
   private boolean break_;

   @Override
   public int byte_() {
      return this.break_ ? 1 : 0;
   }

   public rRm_1(rRn_1<rRm_1> var1, boolean var2) {
      super(var1);
      this.break_ = var2;
   }

   @Override
   protected void class_(String var1) {
      this.break_ = Boolean.parseBoolean(var1);
   }

   public void class_(rRm_1 var1, rnW_2 var2) {
      this.break_ = var1.break_;
      this.class_(var2);
   }

   static rRn_1<rRm_1> class_(boolean var0, BiConsumer<rnW_2, rRm_1> var1) {
      return new rRn_1<>(BoolArgumentType::bool, var1x -> new rRm_1(var1x, var0), var1, rRF::class_);
   }

   static rRn_1<rRm_1> class_(boolean var0) {
      return class_(var0, (var0x, var1) -> {
      });
   }

   public boolean class_() {
      return this.break_;
   }

   @Override
   protected void class_(CommandContext<gy_3> var1, String var2) {
      this.break_ = BoolArgumentType.getBool(var1, var2);
   }

   public void class_(boolean var1, rnW_2 var2) {
      this.break_ = var1;
      this.class_(var2);
   }

   @Override
   public String break_() {
      return Boolean.toString(this.break_);
   }

   protected rRm_1 throws_() {
      return new rRm_1(this.class_, this.break_);
   }

   protected rRm_1 protected_() {
      return this;
   }
}
