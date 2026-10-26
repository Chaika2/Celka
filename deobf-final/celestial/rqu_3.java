package celestial;

import com.mojang.bridge.game.GameVersion;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;

public class rqu_3 {
   public static final Level class_ = Level.DISABLED;
   public static boolean break_ = true;
   public static boolean byte_;
   public static final char[] protected_ = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   private static GameVersion throws_;

   static {
      ResourceLeakDetector.setLevel(class_);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new RB();
   }

   public static GameVersion class_() {
      if (throws_ == null) {
         throws_ = rpe_3.class_();
      }

      return throws_;
   }

   public static boolean class_(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String class_(String var0) {
      StringBuilder var1 = new StringBuilder();

      for (char var5 : var0.toCharArray()) {
         if (class_(var5)) {
            var1.append(var5);
         }
      }

      return var1.toString();
   }

   public static int break_() {
      return 754;
   }
}
