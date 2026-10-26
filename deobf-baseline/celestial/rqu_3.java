package celestial;

import com.mojang.bridge.game.GameVersion;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;

public class rqu_3 {
   public static final Level id_class = Level.DISABLED;
   public static boolean id_break = true;
   public static boolean id_byte;
   public static final char[] id_protected = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   private static GameVersion id_throws;

   static {
      ResourceLeakDetector.setLevel(id_class);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new RB();
   }

   public static GameVersion id_class() {
      if (id_throws == null) {
         id_throws = rpe_3.id_class();
      }

      return id_throws;
   }

   public static boolean id_class(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String id_class(String var0) {
      StringBuilder var1 = new StringBuilder();

      for (char var5 : var0.toCharArray()) {
         if (id_class(var5)) {
            var1.append(var5);
         }
      }

      return var1.toString();
   }

   public static int id_break() {
      return 754;
   }
}
