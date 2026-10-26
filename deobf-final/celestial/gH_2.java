package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gH_2 extends RuntimeException {
   private final rgP_2 class_;

   public gH_2(rgP_2 var1) {
      super(var1.getString(), (Throwable)null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.class_ = var1;
   }

   public rgP_2 class_() {
      return this.class_;
   }
}
