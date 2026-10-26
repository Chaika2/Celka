package celestial;

import java.awt.Dimension;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class rrdF {
   private String id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;
   private int id_case;
   private boolean[] id_catch;
   private boolean[] id_private;
   private boolean[] id_implements;
   private rrWz_1[] id_finally;
   private int[] id_extends;
   private int[] id_native;
   private int[] id_volatile;
   private int[] id_final;
   private int id_package;
   private rrxD_2 id_int;
   private IntBuffer id_new;
   private final rrxY_2 id_continue;
   private rrxY_2 id_super;
   private int[] id_this;
   private int[] id_else;
   private boolean[] id_synchronized;
   private Map<rrWx_1, rrxK_2> id_return = new HashMap<>();

   public boolean id_byte(int var1) {
      return var1 >= 0 && var1 < this.id_case;
   }

   public String id_byte() {
      return this.id_class;
   }

   public rrdF(
      String var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      boolean[] var7,
      boolean[] var8,
      boolean[] var9,
      rrWz_1[] var10,
      int[] var11,
      int[] var12,
      int[] var13,
      int[] var14,
      rrxY_2 var15
   ) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
      this.id_finally = var10;
      this.id_extends = var11;
      this.id_native = var12;
      this.id_volatile = var13;
      this.id_final = var14;
      this.id_continue = var15;
   }

   @Override
   public String toString() {
      return this.id_class
         + ", width: "
         + this.id_break
         + ", height: "
         + this.id_byte
         + ", usedColorBuffers: "
         + this.id_protected
         + ", usedDepthBuffers: "
         + this.id_throws
         + ", maxDrawBuffers: "
         + this.id_case;
   }

   public void id_class(int var1, boolean var2) {
      if (this.id_final != null) {
         if (var1 >= 0 && var1 < this.id_final.length) {
            int var3 = rrdZ.id_break(this.id_extends[var1]);
            MT.id_class(this.id_final[var1], this.id_int.id_class(var2, var1), 0, false, 0, 35002, var3);
         }

         MT.id_new(33984);
      }
   }

   public void id_class(int[] var1) {
      for (int var2 = 0; var2 < this.id_throws; var2++) {
         MT.id_new(33984 + var1[var2]);
         MT.id_super(this.id_new.get(var2));
      }

      MT.id_new(33984);
   }

   public void id_class(rrxY_2 var1) {
      if (var1 == null) {
         var1 = rrdZ.EZ;
      }

      this.id_break(var1.id_protected());
      this.id_super = var1;
      this.id_private();
      GL30.glDrawBuffers(var1.id_throws());
      rrdZ.id_catch("setDrawBuffers");
   }

   public boolean id_class(int var1) {
      return var1 >= 0 && var1 < this.id_protected;
   }

   public rrxK_2 id_class(int var1, int var2, rrxY_2 var3, boolean var4) {
      IntBuffer var5 = var3.id_throws();
      int var6 = var3.id_break();
      int[] var7 = new int[var6];
      int[] var8 = new int[var6];

      for (int var9 = 0; var9 < var7.length; var9++) {
         int var10 = var3.id_class(var9);
         int var11 = var10 - 36064;
         if (this.id_class(var11)) {
            var7[var9] = this.id_int.id_class(var4, var11);
            var8[var9] = var5.get(var9);
         }
      }

      rrWx_1 var12 = new rrWx_1(new rrWJ(var7), new rrWJ(var8));
      rrxK_2 var13 = this.id_return.get(var12);
      if (var13 == null) {
         String var14 = this.id_class + ", [" + rrki_1.id_class(var7) + "], [" + rrki_1.id_class(var8) + "]";
         var13 = new rrxK_2(var14, var1, var2, var7, var8, this.id_catch[0], this.id_private[0]);
         var13.id_class();
         this.id_return.put(var12, var13);
      }

      return var13;
   }

   public void id_class(rji_3 var1) {
      this.id_class(36160, 36096, 3553, this.id_new.get(0), 0);
      GL30.glClearColor(var1.id_class(), var1.id_break(), var1.id_byte(), var1.id_protected());
      GL30.glClear(256);
   }

   public void id_class(boolean[] var1, rji_3[] var2) {
      for (int var3 = 0; var3 < this.id_protected; var3++) {
         if (var1[var3]) {
            rji_3 var4 = var2[var3];
            if (var4 != null) {
               GL30.glClearColor(var4.id_class(), var4.id_break(), var4.id_byte(), var4.id_protected());
            }

            if (this.id_finally[var3] != null) {
               if (this.id_int.id_case(var3)) {
                  this.id_break(var3, false);
               }

               this.id_break(var3, true);
            } else {
               if (this.id_int.id_case(var3)) {
                  this.id_class(36160, 36064 + var3, 3553, this.id_int.id_protected(var3), 0);
                  this.id_class(rrdZ.Ev[var3]);
                  GL30.glClear(16384);
                  this.id_class(36160, 36064 + var3, 3553, this.id_int.id_byte(var3), 0);
               }

               this.id_class(rrdZ.Ev[var3]);
               GL30.glClear(16384);
            }
         }
      }
   }

   public void id_class(boolean var1, boolean[] var2) {
      for (int var3 = 0; var3 < this.id_protected; var3++) {
         if (var2[var3]) {
            MT.id_new(33984 + this.id_native[var3]);
            MT.id_super(this.id_int.id_class(var1, var3));
            GL30.glGenerateMipmap(3553);
            GL30.glTexParameteri(3553, 10241, this.id_implements[var3] ? 9984 : 9987);
         }
      }

      MT.id_new(33984);
   }

   public void id_class(boolean[] var1) {
      for (int var2 = 0; var2 < this.id_throws; var2++) {
         if (var1[var2]) {
            MT.id_new(33984 + this.id_volatile[var2]);
            MT.id_super(this.id_new.get(var2));
            GL30.glGenerateMipmap(3553);
            GL30.glTexParameteri(3553, 10241, this.id_catch[var2] ? 9984 : 9987);
         }
      }

      MT.id_new(33984);
   }

   public void id_class() {
      if (this.id_catch()) {
         this.id_break();
      }

      this.id_int = new rrxD_2(this.id_class + "ColorTexturesFlip", this.id_protected);
      this.id_new = BufferUtils.createIntBuffer(this.id_throws);
      this.id_this = new int[this.id_protected];
      this.id_else = new int[this.id_protected];
      this.id_synchronized = new boolean[this.id_case];
      Arrays.fill(this.id_this, 0);
      Arrays.fill(this.id_else, -1);
      Arrays.fill(this.id_synchronized, false);

      for (int var1 = 0; var1 < this.id_continue.id_break(); var1++) {
         this.id_continue.id_class(var1, 36064 + var1);
      }

      this.id_package = EXTFramebufferObject.glGenFramebuffersEXT();
      this.id_private();
      GL30.glDrawBuffers(0);
      GL30.glReadBuffer(0);
      GL30.glGenTextures((IntBuffer)((Buffer)this.id_new).clear().limit(this.id_throws));
      this.id_int.id_catch().id_break(this.id_protected).id_throws();
      ((Buffer)this.id_new).position(0);
      this.id_int.id_class(0);

      for (int var4 = 0; var4 < this.id_throws; var4++) {
         MT.id_super(this.id_new.get(var4));
         GL30.glTexParameteri(3553, 10242, 33071);
         GL30.glTexParameteri(3553, 10243, 33071);
         int var2 = this.id_catch[var4] ? 9728 : 9729;
         GL30.glTexParameteri(3553, 10241, var2);
         GL30.glTexParameteri(3553, 10240, var2);
         if (this.id_private[var4]) {
            GL30.glTexParameteri(3553, 34892, 34894);
         }

         GL30.glTexImage2D(3553, 0, 6402, this.id_break, this.id_byte, 0, 6402, 5126, (FloatBuffer)null);
      }

      this.id_class(36160, 36096, 3553, this.id_new.get(0), 0);
      rrdZ.id_catch("FBS " + this.id_class + " depth");

      for (int var5 = 0; var5 < this.id_protected; var5++) {
         MT.id_super(this.id_int.id_byte(var5));
         GL30.glTexParameteri(3553, 10242, 33071);
         GL30.glTexParameteri(3553, 10243, 33071);
         int var8 = this.id_implements[var5] ? 9728 : 9729;
         GL30.glTexParameteri(3553, 10241, var8);
         GL30.glTexParameteri(3553, 10240, var8);
         Dimension var3 = this.id_finally[var5] != null
            ? this.id_finally[var5].id_class(this.id_break, this.id_byte)
            : new Dimension(this.id_break, this.id_byte);
         GL30.glTexImage2D(3553, 0, this.id_extends[var5], var3.width, var3.height, 0, rrdZ.id_byte(this.id_extends[var5]), 33639, (ByteBuffer)null);
         this.id_class(36160, 36064 + var5, 3553, this.id_int.id_byte(var5), 0);
         rrdZ.id_catch("FBS " + this.id_class + " colorA");
      }

      for (int var6 = 0; var6 < this.id_protected; var6++) {
         MT.id_super(this.id_int.id_protected(var6));
         GL30.glTexParameteri(3553, 10242, 33071);
         GL30.glTexParameteri(3553, 10243, 33071);
         int var9 = this.id_implements[var6] ? 9728 : 9729;
         GL30.glTexParameteri(3553, 10241, var9);
         GL30.glTexParameteri(3553, 10240, var9);
         Dimension var10 = this.id_finally[var6] != null
            ? this.id_finally[var6].id_class(this.id_break, this.id_byte)
            : new Dimension(this.id_break, this.id_byte);
         GL30.glTexImage2D(3553, 0, this.id_extends[var6], var10.width, var10.height, 0, rrdZ.id_byte(this.id_extends[var6]), 33639, (ByteBuffer)null);
         rrdZ.id_catch("FBS " + this.id_class + " colorB");
      }

      MT.id_super(0);
      if (this.id_protected > 0) {
         this.id_class(this.id_continue);
         GL30.glReadBuffer(0);
      }

      int var7 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var7 != 36053) {
         rrdZ.id_private("[Shaders] Error creating framebuffer: " + this.id_class + ", status: " + var7);
      } else {
         rrdJ.id_byte("Framebuffer created: " + this.id_class);
      }
   }

   public void id_class(boolean var1) {
      for (int var2 = 0; var2 < this.id_protected; var2++) {
         this.id_class(36160, 36064 + var2, 3553, this.id_int.id_class(var1, var2), 0);
      }
   }

   public void id_class(int var1, int var2) {
      MT.id_new(33984);

      for (int var3 = 0; var3 < this.id_protected; var3++) {
         MT.id_super(this.id_int.id_byte(var3));
         GL11.glTexParameteri(3553, 10241, var1);
         GL11.glTexParameteri(3553, 10240, var2);
         MT.id_super(this.id_int.id_protected(var3));
         GL11.glTexParameteri(3553, 10241, var1);
         GL11.glTexParameteri(3553, 10240, var2);
      }

      MT.id_super(0);
   }

   public void id_class(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - 36064;
      if (this.id_class(var6)) {
         if (this.id_finally[var6] != null) {
            if (this.id_break(var6)) {
               return;
            }

            var4 = 0;
         }

         this.id_this[var6] = var4;
         if (var6 >= this.id_case) {
            int var7 = this.id_else[var6];
            if (!this.id_byte(var7)) {
               return;
            }

            var2 = 36064 + var7;
         }
      }

      this.id_private();
      EXTFramebufferObject.glFramebufferTexture2DEXT(var1, var2, var3, var4, var5);
   }

   public boolean id_break(int var1) {
      return var1 >= this.id_case && var1 < this.id_protected;
   }

   private void id_break(int var1, boolean var2) {
      Dimension var3 = this.id_finally[var1].id_class(this.id_break, this.id_byte);
      if (var3 != null) {
         rrxK_2 var4 = this.id_class(var3.width, var3.height, rrdZ.Ev[var1], var2);
         var4.id_break();
         GL30.glClear(16384);
      }
   }

   public void id_break(boolean var1) {
      if (this.id_final != null) {
         for (int var2 = 0; var2 < this.id_protected; var2++) {
            this.id_class(var2, var1);
         }
      }
   }

   public void id_break(boolean[] var1) {
      for (int var2 = 0; var2 < this.id_int.id_byte(); var2++) {
         if (var1[var2]) {
            this.id_case(var2);
         }
      }
   }

   private void id_break(int[] var1) {
      this.id_private();

      for (int var2 = 0; var2 < this.id_case; var2++) {
         if (this.id_synchronized[var2]) {
            int var3 = this.id_this[var2];
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var2, 3553, var3, 0);
            this.id_synchronized[var2] = false;
         }
      }

      this.id_else = var1;

      for (int var5 = this.id_case; var5 < this.id_else.length; var5++) {
         int var6 = this.id_else[var5];
         if (var6 >= 0) {
            int var4 = this.id_this[var5];
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var6, 3553, var4, 0);
            this.id_synchronized[var6] = true;
         }
      }
   }

   public void id_break() {
      if (this.id_package != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(this.id_package);
         this.id_package = 0;
      }

      if (this.id_int != null) {
         this.id_int.id_case();
         this.id_int = null;
      }

      if (this.id_new != null) {
         MT.id_break(this.id_new);
         this.id_new = null;
      }

      this.id_continue.id_byte(0).id_throws(0);

      for (rrxK_2 var2 : this.id_return.values()) {
         var2.id_byte();
      }

      this.id_return.clear();
   }

   public void id_throws(int var1) {
      if (rrdZ.id_implements) {
         for (int var2 = 0; var2 < this.id_protected; var2++) {
            if ((var1 & 1 << var2) != 0) {
               MT.id_new(33984 + this.id_native[var2]);
               GL30.glTexParameteri(3553, 10241, 9987);
               GL30.glGenerateMipmap(3553);
            }
         }

         MT.id_new(33984);
      }
   }

   public int id_throws() {
      return this.id_byte;
   }

   public void id_finally() {
      this.id_class(this.id_continue);
   }

   public boolean id_catch() {
      return this.id_package != 0;
   }

   public rrxY_2 id_extends() {
      return this.id_super;
   }

   public void id_case(int var1) {
      this.id_int.id_throws(var1);
      MT.id_new(33984 + this.id_native[var1]);
      MT.id_super(this.id_int.id_byte(var1));
      this.id_class(var1, true);
      this.id_class(36160, 36064 + var1, 3553, this.id_int.id_protected(var1), 0);
      MT.id_new(33984);
   }

   public int id_case() {
      return this.id_package;
   }

   public void id_implements() {
      this.id_class(36160, 36096, 3553, this.id_new.get(0), 0);
   }

   public int id_protected() {
      return this.id_break;
   }

   public void id_protected(int var1) {
      for (int var2 = var1; var2 < this.id_protected; var2++) {
         MT.id_new(33984 + this.id_native[var2]);
         MT.id_super(this.id_int.id_byte(var2));
         this.id_class(var2, true);
      }
   }

   public void id_private() {
      rrxU_2.id_class(this);
   }
}
