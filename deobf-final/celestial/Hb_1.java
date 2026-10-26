package celestial;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Hb_1 {
   public static FloatBuffer byte_(int var0) {
      return class_(var0 << 2).asFloatBuffer();
   }

   public static synchronized ByteBuffer class_(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer break_(int var0) {
      return class_(var0 << 2).asIntBuffer();
   }
}
