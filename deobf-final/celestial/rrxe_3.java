package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrxe_3 implements rrxa_3 {
   private int class_ = GL11.glGenTextures();
   private int break_ = 15;

   public int byte_() {
      return this.class_;
   }

   public rrxe_3(int var1, int var2) {
      byte[] var3 = this.class_(var1, var2);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var3.length);
      var4.put(var3);
      ((Buffer)var4).flip();
      MT.super_(this.class_);
      rrzJ_2.catch_();
      GL11.glTexImage2D(3553, 0, 6407, var1, var2, 0, 6407, 5121, var4);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      MT.super_(0);
   }

   private byte[] class_(int var1, int var2) {
      byte[] var3 = new byte[var1 * var2 * 3];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         for (int var6 = 0; var6 < var1; var6++) {
            for (int var7 = 1; var7 < 4; var7++) {
               var3[var4++] = this.class_(var6, var5, var7);
            }
         }
      }

      return var3;
   }

   private byte class_(int var1, int var2, int var3) {
      int var4 = (this.class_(var1) + this.class_(var2 * 19)) * this.class_(var3 * 23) - var3;
      return (byte)(this.class_(var4) % 128);
   }

   @Override
   public int class_() {
      return this.break_;
   }

   private int class_(int var1) {
      var1 ^= var1 << 13;
      var1 ^= var1 >> 17;
      return var1 ^ var1 << 5;
   }

   @Override
   public void throws_() {
      MT.continue_(this.class_);
      this.class_ = 0;
   }

   @Override
   public int protected_() {
      return this.class_;
   }
}
