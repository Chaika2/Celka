package celestial;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class rrxg_3 implements rrxa_3 {
   private rrke_1 class_;
   private int break_;
   private int byte_;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rrxg_3(rrke_1 var1, rrkK var2, int var3, int var4, int var5, rrkD var6, rrkU var7, ByteBuffer var8, int var9, boolean var10, boolean var11) {
      this.class_ = var1;
      this.break_ = var9;
      this.byte_ = GL11.glGenTextures();
      GL11.glBindTexture(this.af_(), this.byte_);
      rrzJ_2.catch_();
      int var12 = var11 ? '脯' : 10497;
      int var13 = var10 ? 9729 : 9728;
      switch (var1) {
         case TEXTURE_1D:
            GL11.glTexImage1D(3552, 0, var2.class_(), var3, 0, var6.class_(), var7.class_(), var8);
            GL11.glTexParameteri(3552, 10242, var12);
            GL11.glTexParameteri(3552, 10240, var13);
            GL11.glTexParameteri(3552, 10241, var13);
            break;
         case TEXTURE_2D:
            GL11.glTexImage2D(3553, 0, var2.class_(), var3, var4, 0, var6.class_(), var7.class_(), var8);
            GL11.glTexParameteri(3553, 10242, var12);
            GL11.glTexParameteri(3553, 10243, var12);
            GL11.glTexParameteri(3553, 10240, var13);
            GL11.glTexParameteri(3553, 10241, var13);
            break;
         case TEXTURE_3D:
            GL20.glTexImage3D(32879, 0, var2.class_(), var3, var4, var5, 0, var6.class_(), var7.class_(), var8);
            GL11.glTexParameteri(32879, 10242, var12);
            GL11.glTexParameteri(32879, 10243, var12);
            GL11.glTexParameteri(32879, 32882, var12);
            GL11.glTexParameteri(32879, 10240, var13);
            GL11.glTexParameteri(32879, 10241, var13);
            break;
         case TEXTURE_RECTANGLE:
            GL11.glTexImage2D(34037, 0, var2.class_(), var3, var4, 0, var6.class_(), var7.class_(), var8);
            GL11.glTexParameteri(34037, 10242, var12);
            GL11.glTexParameteri(34037, 10243, var12);
            GL11.glTexParameteri(34037, 10240, var13);
            GL11.glTexParameteri(34037, 10241, var13);
      }

      GL11.glBindTexture(this.af_(), 0);
   }

   @Override
   public int class_() {
      return this.break_;
   }

   @Override
   public void throws_() {
      if (this.byte_ > 0) {
         GL11.glDeleteTextures(this.byte_);
         this.byte_ = 0;
      }
   }

   @Override
   public int protected_() {
      return this.byte_;
   }

   @Override
   public int af_() {
      return this.class_.class_();
   }
}
