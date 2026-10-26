package celestial;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCharModsCallbackI;
import org.lwjgl.glfw.GLFWCursorPosCallbackI;
import org.lwjgl.glfw.GLFWDropCallbackI;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWScrollCallbackI;

public class Ve_1 {
   private static final MethodHandle break_;
   private static final int byte_;
   public static final Va_1 class_;

   static {
      Lookup var0 = MethodHandles.lookup();
      MethodType var1 = MethodType.methodType(boolean.class);
      MethodHandle var2 = null;
      int var3 = 0;

      try {
         var2 = var0.findStatic(GLFW.class, "glfwRawMouseMotionSupported", var1);
         MethodHandle var4 = var0.findStaticGetter(GLFW.class, "GLFW_RAW_MOUSE_MOTION", int.class);
         var3 = (int)var4.invokeExact();
      } catch (NoSuchMethodException | NoSuchFieldException var5) {
      } catch (Throwable var6) {
         throw new RuntimeException(var6);
      }

      break_ = var2;
      byte_ = var3;
      class_ = Vi_1.KEYSYM.class_(-1);
   }

   public static void class_(long var0, GLFWCursorPosCallbackI var2, GLFWMouseButtonCallbackI var3, GLFWScrollCallbackI var4, GLFWDropCallbackI var5) {
      GLFW.glfwSetCursorPosCallback(var0, var2);
      GLFW.glfwSetMouseButtonCallback(var0, var3);
      GLFW.glfwSetScrollCallback(var0, var4);
      GLFW.glfwSetDropCallback(var0, var5);
   }

   public static void class_(long var0, int var2, double var3, double var5) {
      GLFW.glfwSetCursorPos(var0, var3, var5);
      GLFW.glfwSetInputMode(var0, 208897, var2);
   }

   public static boolean class_() {
      try {
         return break_ != null && (boolean)break_.invokeExact();
      } catch (Throwable var1) {
         throw new RuntimeException(var1);
      }
   }

   public static void class_(long var0, boolean var2) {
      if (class_()) {
         GLFW.glfwSetInputMode(var0, byte_, var2 ? 1 : 0);
      }
   }

   public static void class_(long var0, GLFWKeyCallbackI var2, GLFWCharModsCallbackI var3) {
      GLFW.glfwSetKeyCallback(var0, var2);
      GLFW.glfwSetCharModsCallback(var0, var3);
   }

   public static Va_1 class_(String var0) {
      if (Va_1.throws_.containsKey(var0)) {
         return Va_1.throws_.get(var0);
      } else {
         for (Vi_1 var4 : Vi_1.values()) {
            if (var0.startsWith(var4.name)) {
               String var5 = var0.substring(var4.name.length() + 1);
               return var4.class_(Integer.parseInt(var5));
            }
         }

         throw new IllegalArgumentException("Unknown key name: " + var0);
      }
   }

   public static boolean class_(long var0, int var2) {
      return GLFW.glfwGetKey(var0, var2) == 1;
   }

   public static Va_1 class_(int var0, int var1) {
      return var0 == -1 ? Vi_1.SCANCODE.class_(var1) : Vi_1.KEYSYM.class_(var0);
   }

   public static boolean break_(long var0, int var2) {
      return GLFW.glfwGetMouseButton(var0, var2) == 1;
   }
}
