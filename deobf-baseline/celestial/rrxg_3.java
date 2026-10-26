package celestial;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class rrxg_3 implements rrxa_3 {
   private rrke_1 id_class;
   private int id_break;
   private int id_byte;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rrxg_3(rrke_1 var1, rrkK var2, int var3, int var4, int var5, rrkD var6, rrkU var7, ByteBuffer var8, int var9, boolean var10, boolean var11) {
      this.id_class = var1;
      this.id_break = var9;
      this.id_byte = GL11.glGenTextures();
      GL11.glBindTexture(this.af_(), this.id_byte);
      rrzJ_2.id_catch();
      int var12 = var11 ? '脯' : 10497;
      int var13 = var10 ? 9729 : 9728;
      switch (var1) {
         case TEXTURE_1D:
            GL11.glTexImage1D(3552, 0, var2.id_class(), var3, 0, var6.id_class(), var7.id_class(), var8);
            GL11.glTexParameteri(3552, 10242, var12);
            GL11.glTexParameteri(3552, 10240, var13);
            GL11.glTexParameteri(3552, 10241, var13);
            break;
         case TEXTURE_2D:
            GL11.glTexImage2D(3553, 0, var2.id_class(), var3, var4, 0, var6.id_class(), var7.id_class(), var8);
            GL11.glTexParameteri(3553, 10242, var12);
            GL11.glTexParameteri(3553, 10243, var12);
            GL11.glTexParameteri(3553, 10240, var13);
            GL11.glTexParameteri(3553, 10241, var13);
            break;
         case TEXTURE_3D:
            GL20.glTexImage3D(32879, 0, var2.id_class(), var3, var4, var5, 0, var6.id_class(), var7.id_class(), var8);
            GL11.glTexParameteri(32879, 10242, var12);
            GL11.glTexParameteri(32879, 10243, var12);
            GL11.glTexParameteri(32879, 32882, var12);
            GL11.glTexParameteri(32879, 10240, var13);
            GL11.glTexParameteri(32879, 10241, var13);
            break;
         case TEXTURE_RECTANGLE:
            GL11.glTexImage2D(34037, 0, var2.id_class(), var3, var4, 0, var6.id_class(), var7.id_class(), var8);
            GL11.glTexParameteri(34037, 10242, var12);
            GL11.glTexParameteri(34037, 10243, var12);
            GL11.glTexParameteri(34037, 10240, var13);
            GL11.glTexParameteri(34037, 10241, var13);
      }

      GL11.glBindTexture(this.af_(), 0);
   }

   @Override
   public int id_class() {
      return this.id_break;
   }

   @Override
   public void id_throws() {
      if (this.id_byte > 0) {
         GL11.glDeleteTextures(this.id_byte);
         this.id_byte = 0;
      }
   }

   @Override
   public int id_protected() {
      return this.id_byte;
   }

   @Override
   public int af_() {
      return this.id_class.id_class();
   }
}
