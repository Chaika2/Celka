package offline.launcher;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class OfflineLauncher {
   private OfflineLauncher() {
   }

   public static void main(String[] gameArguments) throws Throwable {
      System.out.println("Network policy: ALLOW ALL (Discord webhooks disabled in bytecode)");
      ViaProtocolDiagnostics.start();

      try {
         Class<?> launcher = Class.forName("ru.argentoz.launcher.Launcher", true, OfflineLauncher.class.getClassLoader());
         Method main = launcher.getMethod("main", String[].class);
         main.invoke(null, gameArguments);
      } catch (InvocationTargetException var3) {
         throw var3.getCause();
      }
   }
}
