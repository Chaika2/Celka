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
   private String class_;
   private int break_;
   private int byte_;
   private int protected_;
   private int throws_;
   private int case_;
   private boolean[] catch_;
   private boolean[] private_;
   private boolean[] implements_;
   private rrWz_1[] finally_;
   private int[] extends_;
   private int[] native_;
   private int[] volatile_;
   private int[] final_;
   private int package_;
   private rrxD_2 int_;
   private IntBuffer new_;
   private final rrxY_2 continue_;
   private rrxY_2 super_;
   private int[] this_;
   private int[] else_;
   private boolean[] synchronized_;
   private Map<rrWx_1, rrxK_2> return_ = new HashMap<>();

   public boolean byte_(int var1) {
      return var1 >= 0 && var1 < this.case_;
   }

   public String byte_() {
      return this.class_;
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
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
      this.finally_ = var10;
      this.extends_ = var11;
      this.native_ = var12;
      this.volatile_ = var13;
      this.final_ = var14;
      this.continue_ = var15;
   }

   @Override
   public String toString() {
      return this.class_
         + ", width: "
         + this.break_
         + ", height: "
         + this.byte_
         + ", usedColorBuffers: "
         + this.protected_
         + ", usedDepthBuffers: "
         + this.throws_
         + ", maxDrawBuffers: "
         + this.case_;
   }

   public void class_(int var1, boolean var2) {
      if (this.final_ != null) {
         if (var1 >= 0 && var1 < this.final_.length) {
            int var3 = rrdZ.break_(this.extends_[var1]);
            MT.class_(this.final_[var1], this.int_.class_(var2, var1), 0, false, 0, 35002, var3);
         }

         MT.new_(33984);
      }
   }

   public void class_(int[] var1) {
      for (int var2 = 0; var2 < this.throws_; var2++) {
         MT.new_(33984 + var1[var2]);
         MT.super_(this.new_.get(var2));
      }

      MT.new_(33984);
   }

   public void class_(rrxY_2 var1) {
      if (var1 == null) {
         var1 = rrdZ.EZ;
      }

      this.break_(var1.protected_());
      this.super_ = var1;
      this.private_();
      GL30.glDrawBuffers(var1.throws_());
      rrdZ.catch_("setDrawBuffers");
   }

   public boolean class_(int var1) {
      return var1 >= 0 && var1 < this.protected_;
   }

   public rrxK_2 class_(int var1, int var2, rrxY_2 var3, boolean var4) {
      IntBuffer var5 = var3.throws_();
      int var6 = var3.break_();
      int[] var7 = new int[var6];
      int[] var8 = new int[var6];

      for (int var9 = 0; var9 < var7.length; var9++) {
         int var10 = var3.class_(var9);
         int var11 = var10 - 36064;
         if (this.class_(var11)) {
            var7[var9] = this.int_.class_(var4, var11);
            var8[var9] = var5.get(var9);
         }
      }

      rrWx_1 var12 = new rrWx_1(new rrWJ(var7), new rrWJ(var8));
      rrxK_2 var13 = this.return_.get(var12);
      if (var13 == null) {
         String var14 = this.class_ + ", [" + rrki_1.class_(var7) + "], [" + rrki_1.class_(var8) + "]";
         var13 = new rrxK_2(var14, var1, var2, var7, var8, this.catch_[0], this.private_[0]);
         var13.class_();
         this.return_.put(var12, var13);
      }

      return var13;
   }

   public void class_(rji_3 var1) {
      this.class_(36160, 36096, 3553, this.new_.get(0), 0);
      GL30.glClearColor(var1.class_(), var1.break_(), var1.byte_(), var1.protected_());
      GL30.glClear(256);
   }

   public void class_(boolean[] var1, rji_3[] var2) {
      for (int var3 = 0; var3 < this.protected_; var3++) {
         if (var1[var3]) {
            rji_3 var4 = var2[var3];
            if (var4 != null) {
               GL30.glClearColor(var4.class_(), var4.break_(), var4.byte_(), var4.protected_());
            }

            if (this.finally_[var3] != null) {
               if (this.int_.case_(var3)) {
                  this.break_(var3, false);
               }

               this.break_(var3, true);
            } else {
               if (this.int_.case_(var3)) {
                  this.class_(36160, 36064 + var3, 3553, this.int_.protected_(var3), 0);
                  this.class_(rrdZ.Ev[var3]);
                  GL30.glClear(16384);
                  this.class_(36160, 36064 + var3, 3553, this.int_.byte_(var3), 0);
               }

               this.class_(rrdZ.Ev[var3]);
               GL30.glClear(16384);
            }
         }
      }
   }

   public void class_(boolean var1, boolean[] var2) {
      for (int var3 = 0; var3 < this.protected_; var3++) {
         if (var2[var3]) {
            MT.new_(33984 + this.native_[var3]);
            MT.super_(this.int_.class_(var1, var3));
            GL30.glGenerateMipmap(3553);
            GL30.glTexParameteri(3553, 10241, this.implements_[var3] ? 9984 : 9987);
         }
      }

      MT.new_(33984);
   }

   public void class_(boolean[] var1) {
      for (int var2 = 0; var2 < this.throws_; var2++) {
         if (var1[var2]) {
            MT.new_(33984 + this.volatile_[var2]);
            MT.super_(this.new_.get(var2));
            GL30.glGenerateMipmap(3553);
            GL30.glTexParameteri(3553, 10241, this.catch_[var2] ? 9984 : 9987);
         }
      }

      MT.new_(33984);
   }

   public void class_() {
      if (this.catch_()) {
         this.break_();
      }

      this.int_ = new rrxD_2(this.class_ + "ColorTexturesFlip", this.protected_);
      this.new_ = BufferUtils.createIntBuffer(this.throws_);
      this.this_ = new int[this.protected_];
      this.else_ = new int[this.protected_];
      this.synchronized_ = new boolean[this.case_];
      Arrays.fill(this.this_, 0);
      Arrays.fill(this.else_, -1);
      Arrays.fill(this.synchronized_, false);

      for (int var1 = 0; var1 < this.continue_.break_(); var1++) {
         this.continue_.class_(var1, 36064 + var1);
      }

      this.package_ = EXTFramebufferObject.glGenFramebuffersEXT();
      this.private_();
      GL30.glDrawBuffers(0);
      GL30.glReadBuffer(0);
      GL30.glGenTextures((IntBuffer)((Buffer)this.new_).clear().limit(this.throws_));
      this.int_.catch_().break_(this.protected_).throws_();
      ((Buffer)this.new_).position(0);
      this.int_.class_(0);

      for (int var4 = 0; var4 < this.throws_; var4++) {
         MT.super_(this.new_.get(var4));
         GL30.glTexParameteri(3553, 10242, 33071);
         GL30.glTexParameteri(3553, 10243, 33071);
         int var2 = this.catch_[var4] ? 9728 : 9729;
         GL30.glTexParameteri(3553, 10241, var2);
         GL30.glTexParameteri(3553, 10240, var2);
         if (this.private_[var4]) {
            GL30.glTexParameteri(3553, 34892, 34894);
         }

         GL30.glTexImage2D(3553, 0, 6402, this.break_, this.byte_, 0, 6402, 5126, (FloatBuffer)null);
      }

      this.class_(36160, 36096, 3553, this.new_.get(0), 0);
      rrdZ.catch_("FBS " + this.class_ + " depth");

      for (int var5 = 0; var5 < this.protected_; var5++) {
         MT.super_(this.int_.byte_(var5));
         GL30.glTexParameteri(3553, 10242, 33071);
         GL30.glTexParameteri(3553, 10243, 33071);
         int var8 = this.implements_[var5] ? 9728 : 9729;
         GL30.glTexParameteri(3553, 10241, var8);
         GL30.glTexParameteri(3553, 10240, var8);
         Dimension var3 = this.finally_[var5] != null ? this.finally_[var5].class_(this.break_, this.byte_) : new Dimension(this.break_, this.byte_);
         GL30.glTexImage2D(3553, 0, this.extends_[var5], var3.width, var3.height, 0, rrdZ.byte_(this.extends_[var5]), 33639, (ByteBuffer)null);
         this.class_(36160, 36064 + var5, 3553, this.int_.byte_(var5), 0);
         rrdZ.catch_("FBS " + this.class_ + " colorA");
      }

      for (int var6 = 0; var6 < this.protected_; var6++) {
         MT.super_(this.int_.protected_(var6));
         GL30.glTexParameteri(3553, 10242, 33071);
         GL30.glTexParameteri(3553, 10243, 33071);
         int var9 = this.implements_[var6] ? 9728 : 9729;
         GL30.glTexParameteri(3553, 10241, var9);
         GL30.glTexParameteri(3553, 10240, var9);
         Dimension var10 = this.finally_[var6] != null ? this.finally_[var6].class_(this.break_, this.byte_) : new Dimension(this.break_, this.byte_);
         GL30.glTexImage2D(3553, 0, this.extends_[var6], var10.width, var10.height, 0, rrdZ.byte_(this.extends_[var6]), 33639, (ByteBuffer)null);
         rrdZ.catch_("FBS " + this.class_ + " colorB");
      }

      MT.super_(0);
      if (this.protected_ > 0) {
         this.class_(this.continue_);
         GL30.glReadBuffer(0);
      }

      int var7 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var7 != 36053) {
         rrdZ.private_("[Shaders] Error creating framebuffer: " + this.class_ + ", status: " + var7);
      } else {
         rrdJ.byte_("Framebuffer created: " + this.class_);
      }
   }

   public void class_(boolean var1) {
      for (int var2 = 0; var2 < this.protected_; var2++) {
         this.class_(36160, 36064 + var2, 3553, this.int_.class_(var1, var2), 0);
      }
   }

   public void class_(int var1, int var2) {
      MT.new_(33984);

      for (int var3 = 0; var3 < this.protected_; var3++) {
         MT.super_(this.int_.byte_(var3));
         GL11.glTexParameteri(3553, 10241, var1);
         GL11.glTexParameteri(3553, 10240, var2);
         MT.super_(this.int_.protected_(var3));
         GL11.glTexParameteri(3553, 10241, var1);
         GL11.glTexParameteri(3553, 10240, var2);
      }

      MT.super_(0);
   }

   public void class_(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - 36064;
      if (this.class_(var6)) {
         if (this.finally_[var6] != null) {
            if (this.break_(var6)) {
               return;
            }

            var4 = 0;
         }

         this.this_[var6] = var4;
         if (var6 >= this.case_) {
            int var7 = this.else_[var6];
            if (!this.byte_(var7)) {
               return;
            }

            var2 = 36064 + var7;
         }
      }

      this.private_();
      EXTFramebufferObject.glFramebufferTexture2DEXT(var1, var2, var3, var4, var5);
   }

   public boolean break_(int var1) {
      return var1 >= this.case_ && var1 < this.protected_;
   }

   private void break_(int var1, boolean var2) {
      Dimension var3 = this.finally_[var1].class_(this.break_, this.byte_);
      if (var3 != null) {
         rrxK_2 var4 = this.class_(var3.width, var3.height, rrdZ.Ev[var1], var2);
         var4.break_();
         GL30.glClear(16384);
      }
   }

   public void break_(boolean var1) {
      if (this.final_ != null) {
         for (int var2 = 0; var2 < this.protected_; var2++) {
            this.class_(var2, var1);
         }
      }
   }

   public void break_(boolean[] var1) {
      for (int var2 = 0; var2 < this.int_.byte_(); var2++) {
         if (var1[var2]) {
            this.case_(var2);
         }
      }
   }

   private void break_(int[] var1) {
      this.private_();

      for (int var2 = 0; var2 < this.case_; var2++) {
         if (this.synchronized_[var2]) {
            int var3 = this.this_[var2];
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var2, 3553, var3, 0);
            this.synchronized_[var2] = false;
         }
      }

      this.else_ = var1;

      for (int var5 = this.case_; var5 < this.else_.length; var5++) {
         int var6 = this.else_[var5];
         if (var6 >= 0) {
            int var4 = this.this_[var5];
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var6, 3553, var4, 0);
            this.synchronized_[var6] = true;
         }
      }
   }

   public void break_() {
      if (this.package_ != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(this.package_);
         this.package_ = 0;
      }

      if (this.int_ != null) {
         this.int_.case_();
         this.int_ = null;
      }

      if (this.new_ != null) {
         MT.break_(this.new_);
         this.new_ = null;
      }

      this.continue_.byte_(0).throws_(0);

      for (rrxK_2 var2 : this.return_.values()) {
         var2.byte_();
      }

      this.return_.clear();
   }

   public void throws_(int var1) {
      if (rrdZ.implements_) {
         for (int var2 = 0; var2 < this.protected_; var2++) {
            if ((var1 & 1 << var2) != 0) {
               MT.new_(33984 + this.native_[var2]);
               GL30.glTexParameteri(3553, 10241, 9987);
               GL30.glGenerateMipmap(3553);
            }
         }

         MT.new_(33984);
      }
   }

   public int throws_() {
      return this.byte_;
   }

   public void finally_() {
      this.class_(this.continue_);
   }

   public boolean catch_() {
      return this.package_ != 0;
   }

   public rrxY_2 extends_() {
      return this.super_;
   }

   public void case_(int var1) {
      this.int_.throws_(var1);
      MT.new_(33984 + this.native_[var1]);
      MT.super_(this.int_.byte_(var1));
      this.class_(var1, true);
      this.class_(36160, 36064 + var1, 3553, this.int_.protected_(var1), 0);
      MT.new_(33984);
   }

   public int case_() {
      return this.package_;
   }

   public void implements_() {
      this.class_(36160, 36096, 3553, this.new_.get(0), 0);
   }

   public int protected_() {
      return this.break_;
   }

   public void protected_(int var1) {
      for (int var2 = var1; var2 < this.protected_; var2++) {
         MT.new_(33984 + this.native_[var2]);
         MT.super_(this.int_.byte_(var2));
         this.class_(var2, true);
      }
   }

   public void private_() {
      rrxU_2.class_(this);
   }
}
