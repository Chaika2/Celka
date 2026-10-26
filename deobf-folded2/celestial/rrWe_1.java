package celestial;

import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.LongSupplier;

public class rrWe_1 {
   private static long id_class = 0L;
   private static LongSupplier id_break = id_class(
      new String[][]{
         {"sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"},
         {"jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}
      },
      id_throws()
   );
   private static LongSupplier id_byte = id_class(new String[][]{{"sun.misc.VM", "maxDirectMemory"}, {"jdk.internal.misc.VM", "maxDirectMemory"}}, id_case());

   public static long id_byte() {
      return id_class;
   }

   private static LongSupplier id_class(String[][] var0, LongSupplier var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var0.length; var3++) {
         String[] var4 = var0[var3];

         try {
            LongSupplier var5 = id_class(var4);
            if (var5 != null) {
               return var5;
            }
         } catch (Throwable var6) {
            var2.add(var6);
         }
      }

      for (Throwable var8 : var2) {
         rrbb_3.id_protected("(Reflector) " + var8.getClass().getName() + ": " + var8.getMessage());
      }

      return var1;
   }

   private static LongSupplier id_class(String[] var0) throws Exception {
      if (var0.length < 2) {
         return null;
      } else {
         Class var1 = Class.forName(var0[0]);
         Method var2 = var1.getMethod(var0[1]);
         var2.setAccessible(true);
         Object var3 = null;

         for (int var4 = 2; var4 < var0.length; var4++) {
            String var5 = var0[var4];
            var3 = var2.invoke(var3);
            var2 = var3.getClass().getMethod(var5);
            var2.setAccessible(true);
         }

         return new rrzr_3(var2, var3);
      }
   }

   public static long id_class() {
      return id_break == null ? -1L : id_break.getAsLong();
   }

   public static synchronized void id_class(fN_2 var0) {
      id_class = id_class + var0.id_implements();
   }

   public static synchronized void id_break(fN_2 var0) {
      id_class = id_class - var0.id_implements();
   }

   public static long id_break() {
      return id_byte == null ? -1L : id_byte.getAsLong();
   }

   private static LongSupplier id_throws() {
      BufferPoolMXBean var0 = id_protected();
      return var0 == null ? null : new rrWa_1(var0);
   }

   private static LongSupplier id_case() {
      return new rrWi_1();
   }

   private static BufferPoolMXBean id_protected() {
      for (BufferPoolMXBean var1 : ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class)) {
         if (rrbb_3.id_class(var1.getName(), "direct")) {
            return var1;
         }
      }

      return null;
   }
}
