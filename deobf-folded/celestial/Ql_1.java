package celestial;

import com.google.common.base.Charsets;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;

public class Ql_1 {
   private final ByteBuffer id_class = BufferUtils.createByteBuffer(8192);

   public void id_class(long var1, String var3) {
      byte[] var4 = var3.getBytes(Charsets.UTF_8);
      int var5 = var4.length + 1;
      if (var5 < this.id_class.capacity()) {
         id_class(var1, this.id_class, var4);
      } else {
         ByteBuffer var6 = MemoryUtil.memAlloc(var5);

         try {
            id_class(var1, var6, var4);
         } finally {
            MemoryUtil.memFree(var6);
         }
      }
   }

   private static void id_class(long var0, ByteBuffer var2, byte[] var3) {
      ((Buffer)var2).clear();
      var2.put(var3);
      var2.put((byte)0);
      ((Buffer)var2).flip();
      GLFW.glfwSetClipboardString(var0, var2);
   }

   public String id_class(long var1, GLFWErrorCallbackI var3) {
      GLFWErrorCallback var4 = GLFW.glfwSetErrorCallback(var3);
      String var5 = GLFW.glfwGetClipboardString(var1);
      var5 = var5 != null ? rgL_2.id_class(var5) : "";
      GLFWErrorCallback var6 = GLFW.glfwSetErrorCallback(var4);
      if (var6 != null) {
         var6.free();
      }

      return var5;
   }
}
