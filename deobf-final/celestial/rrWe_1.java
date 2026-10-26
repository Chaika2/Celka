package celestial;

import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.LongSupplier;

public class rrWe_1 {
   private static long class_ = 0L;
   private static LongSupplier break_ = class_(
      new String[][]{
         {"sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"},
         {"jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}
      },
      throws_()
   );
   private static LongSupplier byte_ = class_(new String[][]{{"sun.misc.VM", "maxDirectMemory"}, {"jdk.internal.misc.VM", "maxDirectMemory"}}, case_());

   public static long byte_() {
      return class_;
   }

   private static LongSupplier class_(String[][] var0, LongSupplier var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var0.length; var3++) {
         String[] var4 = var0[var3];

         try {
            LongSupplier var5 = class_(var4);
            if (var5 != null) {
               return var5;
            }
         } catch (Throwable var6) {
            var2.add(var6);
         }
      }

      for (Throwable var8 : var2) {
         rrbb_3.protected_("(Reflector) " + var8.getClass().getName() + ": " + var8.getMessage());
      }

      return var1;
   }

   private static LongSupplier class_(String[] var0) throws Exception {
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

   public static long class_() {
      return break_ == null ? -1L : break_.getAsLong();
   }

   public static synchronized void class_(fN_2 var0) {
      class_ = class_ + var0.implements_();
   }

   public static synchronized void break_(fN_2 var0) {
      class_ = class_ - var0.implements_();
   }

   public static long break_() {
      return byte_ == null ? -1L : byte_.getAsLong();
   }

   private static LongSupplier throws_() {
      BufferPoolMXBean var0 = protected_();
      return var0 == null ? null : new rrWa_1(var0);
   }

   private static LongSupplier case_() {
      return new rrWi_1();
   }

   private static BufferPoolMXBean protected_() {
      for (BufferPoolMXBean var1 : ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class)) {
         if (rrbb_3.class_(var1.getName(), "direct")) {
            return var1;
         }
      }

      return null;
   }
}
