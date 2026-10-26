package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrxe_3 implements rrxa_3 {
   private int id_class = GL11.glGenTextures();
   private int id_break = 15;

   public int id_byte() {
      return this.id_class;
   }

   public rrxe_3(int var1, int var2) {
      byte[] var3 = this.id_class(var1, var2);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var3.length);
      var4.put(var3);
      ((Buffer)var4).flip();
      MT.id_super(this.id_class);
      rrzJ_2.id_catch();
      GL11.glTexImage2D(3553, 0, 6407, var1, var2, 0, 6407, 5121, var4);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      MT.id_super(0);
   }

   private byte[] id_class(int var1, int var2) {
      byte[] var3 = new byte[var1 * var2 * 3];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         for (int var6 = 0; var6 < var1; var6++) {
            for (int var7 = 1; var7 < 4; var7++) {
               var3[var4++] = this.id_class(var6, var5, var7);
            }
         }
      }

      return var3;
   }

   private byte id_class(int var1, int var2, int var3) {
      int var4 = (this.id_class(var1) + this.id_class(var2 * 19)) * this.id_class(var3 * 23) - var3;
      return (byte)(this.id_class(var4) % 128);
   }

   @Override
   public int id_class() {
      return this.id_break;
   }

   private int id_class(int var1) {
      var1 ^= var1 << 13;
      var1 ^= var1 >> 17;
      return var1 ^ var1 << 5;
   }

   @Override
   public void id_throws() {
      MT.id_continue(this.id_class);
      this.id_class = 0;
   }

   @Override
   public int id_protected() {
      return this.id_class;
   }
}
