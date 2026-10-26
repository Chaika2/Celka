package celestial;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Hb_1 {
   public static FloatBuffer id_byte(int var0) {
      return id_class(var0 << 2).asFloatBuffer();
   }

   public static synchronized ByteBuffer id_class(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer id_break(int var0) {
      return id_class(var0 << 2).asIntBuffer();
   }
}
