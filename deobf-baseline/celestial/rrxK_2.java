package celestial;

import java.lang.invoke.StringConcatFactory;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL30;

public class rrxK_2 {
   private String id_class;
   private int id_break;
   private int id_byte;
   private int[] id_protected;
   private int[] id_throws;
   private boolean id_case;
   private boolean id_catch;
   private int id_private;
   private int id_implements;
   private IntBuffer id_finally;

   public void id_byte() {
      if (this.id_private != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(this.id_private);
         this.id_private = 0;
      }

      if (this.id_implements != 0) {
         MT.id_continue(this.id_implements);
         this.id_implements = 0;
      }

      this.id_finally = null;
   }

   public rrxK_2(String var1, int var2, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   @Override
   public String toString() {
      return StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(this.id_class);
   }

   public void id_class() {
      if (this.id_protected()) {
         this.id_byte();
      }

      this.id_private = EXTFramebufferObject.glGenFramebuffersEXT();
      this.id_break();
      GL30.glDrawBuffers(0);
      GL30.glReadBuffer(0);
      this.id_implements = GL30.glGenTextures();
      MT.id_super(this.id_implements);
      GL30.glTexParameteri(3553, 10242, 33071);
      GL30.glTexParameteri(3553, 10243, 33071);
      int var1 = this.id_case ? 9728 : 9729;
      GL30.glTexParameteri(3553, 10241, var1);
      GL30.glTexParameteri(3553, 10240, var1);
      if (this.id_catch) {
         GL30.glTexParameteri(3553, 34892, 34894);
      }

      GL30.glTexImage2D(3553, 0, 6402, this.id_break, this.id_byte, 0, 6402, 5126, (FloatBuffer)null);
      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, this.id_implements, 0);
      rrdZ.id_catch("FBS " + this.id_class + " depth");

      for (int var2 = 0; var2 < this.id_protected.length; var2++) {
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, this.id_throws[var2], 3553, this.id_protected[var2], 0);
         rrdZ.id_catch("FBS " + this.id_class + " color");
      }

      MT.id_super(0);
      if (this.id_protected.length > 0) {
         this.id_finally = BufferUtils.createIntBuffer(this.id_throws.length);

         for (int var4 = 0; var4 < this.id_throws.length; var4++) {
            int var3 = this.id_throws[var4];
            this.id_finally.put(var4, var3);
         }

         GL30.glDrawBuffers(this.id_finally);
         GL30.glReadBuffer(0);
      }

      int var5 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var5 != 36053) {
         rrdZ.id_private("[Shaders] Error creating framebuffer: " + this.id_class + ", status: " + var5);
      } else {
         rrdJ.id_byte("Framebuffer created: " + this.id_class);
      }
   }

   public void id_break() {
      MT.id_private(36160, this.id_private);
   }

   public boolean id_protected() {
      return this.id_private != 0;
   }
}
