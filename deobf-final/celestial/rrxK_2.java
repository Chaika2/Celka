package celestial;

import java.lang.invoke.StringConcatFactory;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL30;

public class rrxK_2 {
   private String class_;
   private int break_;
   private int byte_;
   private int[] protected_;
   private int[] throws_;
   private boolean case_;
   private boolean catch_;
   private int private_;
   private int implements_;
   private IntBuffer finally_;

   public void byte_() {
      if (this.private_ != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(this.private_);
         this.private_ = 0;
      }

      if (this.implements_ != 0) {
         MT.continue_(this.implements_);
         this.implements_ = 0;
      }

      this.finally_ = null;
   }

   public rrxK_2(String var1, int var2, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   @Override
   public String toString() {
      return StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(this.class_);
   }

   public void class_() {
      if (this.protected_()) {
         this.byte_();
      }

      this.private_ = EXTFramebufferObject.glGenFramebuffersEXT();
      this.break_();
      GL30.glDrawBuffers(0);
      GL30.glReadBuffer(0);
      this.implements_ = GL30.glGenTextures();
      MT.super_(this.implements_);
      GL30.glTexParameteri(3553, 10242, 33071);
      GL30.glTexParameteri(3553, 10243, 33071);
      int var1 = this.case_ ? 9728 : 9729;
      GL30.glTexParameteri(3553, 10241, var1);
      GL30.glTexParameteri(3553, 10240, var1);
      if (this.catch_) {
         GL30.glTexParameteri(3553, 34892, 34894);
      }

      GL30.glTexImage2D(3553, 0, 6402, this.break_, this.byte_, 0, 6402, 5126, (FloatBuffer)null);
      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, this.implements_, 0);
      rrdZ.catch_("FBS " + this.class_ + " depth");

      for (int var2 = 0; var2 < this.protected_.length; var2++) {
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, this.throws_[var2], 3553, this.protected_[var2], 0);
         rrdZ.catch_("FBS " + this.class_ + " color");
      }

      MT.super_(0);
      if (this.protected_.length > 0) {
         this.finally_ = BufferUtils.createIntBuffer(this.throws_.length);

         for (int var4 = 0; var4 < this.throws_.length; var4++) {
            int var3 = this.throws_[var4];
            this.finally_.put(var4, var3);
         }

         GL30.glDrawBuffers(this.finally_);
         GL30.glReadBuffer(0);
      }

      int var5 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var5 != 36053) {
         rrdZ.private_("[Shaders] Error creating framebuffer: " + this.class_ + ", status: " + var5);
      } else {
         rrdJ.byte_("Framebuffer created: " + this.class_);
      }
   }

   public void break_() {
      MT.private_(36160, this.private_);
   }

   public boolean protected_() {
      return this.private_ != 0;
   }
}
