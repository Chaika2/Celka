package celestial;

import com.mojang.blaze3d.platform.GLX;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.lwjgl.system.Pointer;

public class gs_3 {
   private static final MethodHandle class_ = GLX.make(() -> {
      try {
         Lookup var0 = MethodHandles.lookup();
         Class var1 = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
         Method var2 = var1.getDeclaredMethod("untrack", long.class);
         var2.setAccessible(true);
         Field var3 = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
         var3.setAccessible(true);
         Object var4 = var3.get(null);
         return var1.isInstance(var4) ? var0.unreflect(var2) : null;
      } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException var5) {
         throw new RuntimeException(var5);
      }
   });

   public static void class_(long var0) {
      if (class_ != null) {
         try {
            class_.invoke((long)var0);
         } catch (Throwable var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   public static void class_(Pointer var0) {
      class_(var0.address());
   }
}
