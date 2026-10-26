package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.datafixers.util.Pair;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryStack;

public class lD_2 extends Od_1 implements OW {
   private static final Logger native_ = LogManager.getLogger();
   private ByteBuffer volatile_;
   private final List<lU_2> final_ = Lists.newArrayList();
   private int package_ = 0;
   private int int_ = 0;
   private int new_ = 0;
   private int continue_ = 0;
   private int super_;
   private jv_3 this_;
   private int else_;
   private int synchronized_;
   private jZ_2 return_;
   private boolean public_;
   private boolean goto_;
   private boolean while_;
   private HU try_;
   private boolean instanceof_;
   private fj_3[] throw_ = null;
   private fj_3[] interface_ = null;
   private fj_3 char_ = null;
   private final rrxu_3 abstract_ = new rrxu_3();
   public rrdk_1 private_;
   public rrxF_2 implements_ = null;
   public BitSet finally_ = null;
   public BitSet extends_ = new BitSet();
   private ByteBuffer long_;
   private final rje_3 float_ = new rje_3();
   private final float[] void_ = new float[4];
   private final int[] static_ = new int[4];
   private IntBuffer import_;
   private FloatBuffer short_;
   private Hd_1 default_;
   private FloatBuffer const_;
   private rrxq_3[] strictfp_;
   private final rje_3 boolean_ = new rje_3();

   @Override
   public HU byte_() {
      return this.try_;
   }

   @Override
   public void byte_(float var1, float var2, float var3) {
      this.boolean_.break_(var1, var2, var3);
   }

   @Override
   public int[] byte_(int var1, int var2, int var3, int var4) {
      this.static_[0] = var1;
      this.static_[1] = var2;
      this.static_[2] = var3;
      this.static_[3] = var4;
      return this.static_;
   }

   public int int_() {
      return this.super_;
   }

   public lD_2(int var1) {
      this.volatile_ = Hb_1.class_(var1 * 4);
      this.import_ = this.volatile_.asIntBuffer();
      this.short_ = this.volatile_.asFloatBuffer();
      rrdk_1.class_(this);
   }

   public int this_() {
      return this.super_ * this.return_.class_();
   }

   @Override
   public void class_() {
      if (this.else_ != 0) {
         throw new IllegalStateException("Not filled all elements of the vertex");
      } else {
         this.super_++;
         this.private_();
         if (rrbb_3.rs()) {
            rrdk_1.protected_(this);
         }
      }
   }

   private static void class_(int[] var0, float[] var1) {
      class_(var0, 0, var0.length, var1, Arrays.copyOf(var0, var0.length));
   }

   @Override
   public void class_(HU var1) {
      this.try_ = var1;
   }

   @Override
   public void class_(boolean var1) {
      this.instanceof_ = var1;
      if (rrbb_3.w()) {
         this.try_();
      }
   }

   @Override
   public void class_(fj_3 var1) {
      if (this.finally_ != null && var1 != null && var1.try_() && var1.continue_() >= 0) {
         this.finally_.set(var1.continue_());
      }

      if (this.throw_ != null) {
         int var2 = this.super_ / 4;
         this.throw_[var2] = var1;
      }
   }

   @Override
   public void class_(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      if (this.class_) {
         throw new IllegalStateException();
      } else {
         if (this.public_) {
            this.class_(0, var1);
            this.class_(4, var2);
            this.class_(8, var3);
            this.class_(12, (byte)((int)(var4 * 255.0F)));
            this.class_(13, (byte)((int)(var5 * 255.0F)));
            this.class_(14, (byte)((int)(var6 * 255.0F)));
            this.class_(15, (byte)((int)(var7 * 255.0F)));
            this.class_(16, var8);
            this.class_(20, var9);
            byte var15;
            if (this.goto_) {
               this.class_(24, (short)(var10 & 65535));
               this.class_(26, (short)(var10 >> 16 & 65535));
               var15 = 28;
            } else {
               var15 = 24;
            }

            this.class_(var15, (short)(var11 & 65535));
            this.class_(var15 + 2, (short)(var11 >> 16 & 65535));
            this.class_(var15 + 4, OW.class_(var12));
            this.class_(var15 + 5, OW.class_(var13));
            this.class_(var15 + 6, OW.class_(var14));
            this.new_ = this.new_ + this.return_.break_();
            this.class_();
         } else {
            super.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
         }
      }
   }

   @Override
   public Ok_1 class_(int var1) {
      if (this.class_) {
         throw new IllegalStateException();
      } else {
         return this.break_(var1 >> 16 & 0xFF, var1 >> 8 & 0xFF, var1 & 0xFF, var1 >> 24 & 0xFF);
      }
   }

   public void class_(Hd_1 var1) {
      this.default_ = var1;
   }

   public void class_(float var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11) {
      if (this.return_.break_() != ju_3.goto_.break_()) {
         throw new IllegalStateException("Invalid text vertex format: " + this.return_);
      } else {
         this.class_(0, var1);
         this.class_(4, var2);
         this.class_(8, var3);
         this.class_(12, (byte)var4);
         this.class_(13, (byte)var5);
         this.class_(14, (byte)var6);
         this.class_(15, (byte)var7);
         this.class_(16, var8);
         this.class_(20, var9);
         this.class_(24, (short)var10);
         this.class_(26, (short)var11);
         this.new_ = this.new_ + this.return_.break_();
         this.class_();
      }
   }

   @Override
   public void class_(rrxq_3[] var1) {
      this.strictfp_ = var1;
   }

   public void class_(ByteBuffer var1) {
      if (rrbb_3.rs()) {
         rrdk_1.class_(this, var1);
      }

      this.throws_(var1.limit() + this.return_.break_());
      ((Buffer)this.volatile_).position(this.super_ * this.return_.break_());
      this.volatile_.put(var1);
      this.super_ = this.super_ + var1.limit() / this.return_.break_();
      this.new_ = this.new_ + var1.limit();
      if (rrbb_3.rs()) {
         rrdk_1.throws_(this);
      }
   }

   @Override
   public rje_3 class_(rje_3 var1) {
      this.float_.break_(var1.class_(), var1.break_(), var1.byte_());
      return this.float_;
   }

   private static void class_(ByteBuffer var0, jZ_2 var1, int var2, ByteBuffer var3) {
      int var4 = var1.break_();
      int var5 = var0.limit();
      ((Buffer)var0).rewind();
      ((Buffer)var3).clear();

      for (byte var6 = 0; var6 < var2; var6 += 4) {
         ((Buffer)var0).limit((var6 + 3) * var4);
         ((Buffer)var0).position(var6 * var4);
         var3.put(var0);
         ((Buffer)var0).limit((var6 + 1) * var4);
         ((Buffer)var0).position(var6 * var4);
         var3.put(var0);
         ((Buffer)var0).limit((var6 + 2 + 2) * var4);
         ((Buffer)var0).position((var6 + 2) * var4);
         var3.put(var0);
      }

      ((Buffer)var0).limit(var5);
      ((Buffer)var0).rewind();
      ((Buffer)var3).flip();
   }

   @Override
   public rrxF_2 class_(xc_3 var1, rfH_2 var2) {
      if (this.implements_ == null) {
         this.implements_ = new rrxF_2(var1, var2);
         return this.implements_;
      } else {
         this.implements_.class_(var1, var2);
         return this.implements_;
      }
   }

   private static float class_(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5) {
      float var7 = var0.get(var5);
      float var8 = var0.get(var5 + 1);
      float var9 = var0.get(var5 + 2);
      int var6 = var5 + var4;
      float var10 = var0.get(var6);
      float var11 = var0.get(var6 + 1);
      float var12 = var0.get(var6 + 2);
      var6 += var4;
      float var13 = var0.get(var6);
      float var14 = var0.get(var6 + 1);
      float var15 = var0.get(var6 + 2);
      var6 += var4;
      float var16 = var0.get(var6);
      float var17 = var0.get(var6 + 1);
      float var18 = var0.get(var6 + 2);
      float var19 = (var7 + var10 + var13 + var16) * 0.25F - var1;
      float var20 = (var8 + var11 + var14 + var17) * 0.25F - var2;
      float var21 = (var9 + var12 + var15 + var18) * 0.25F - var3;
      return var19 * var19 + var20 * var20 + var21 * var21;
   }

   private static void class_(int[] var0, int var1, int var2, float[] var3, int[] var4) {
      int var5 = var2 - var1;
      if (var5 < 16) {
         class_(var0, var1, var2, var3);
      } else {
         int var6 = var1 + var2 >>> 1;
         class_(var4, var1, var6, var3, var0);
         class_(var4, var6, var2, var3, var0);
         if (Floats.compare(var3[var4[var6]], var3[var4[var6 - 1]]) <= 0) {
            System.arraycopy(var4, var1, var0, var1, var5);
         } else {
            int var7 = var1;
            int var8 = var1;

            for (int var9 = var6; var7 < var2; var7++) {
               if (var9 < var2 && (var8 >= var6 || Floats.compare(var3[var4[var9]], var3[var4[var8]]) > 0)) {
                  var0[var7] = var4[var9++];
               } else {
                  var0[var7] = var4[var8++];
               }
            }
         }
      }
   }

   private static void class_(int[] var0, int var1, int var2, float[] var3) {
      int var4 = var1;

      while (++var4 < var2) {
         int var5 = var0[var4];
         int var6 = var4;

         for (int var7 = var0[var4 - 1]; Floats.compare(var3[var7], var3[var5]) < 0; var7 = var0[var6 - 1]) {
            var0[var6] = var7;
            if (var1 == var6 - 1) {
               var6--;
               break;
            }

            var6--;
         }

         var0[var6] = var5;
      }
   }

   @Override
   public void class_(int var1, byte var2) {
      this.volatile_.put(this.new_ + var1, var2);
   }

   private void class_(jZ_2 var1) {
      if (this.return_ != var1) {
         this.return_ = var1;
         boolean var2 = var1 == ju_3.implements_;
         boolean var3 = var1 == ju_3.private_;
         this.public_ = var2 || var3;
         this.goto_ = var2;
      }
   }

   @Override
   public Ok_1 class_(float var1, float var2) {
      if (this.char_ != null && this.throw_ != null) {
         var1 = this.char_.byte_(var1);
         var2 = this.char_.protected_(var2);
         this.throw_[this.super_ / 4] = this.char_;
      }

      return OW.super.class_(var1, var2);
   }

   public void class_(int var1, jZ_2 var2) {
      if (this.while_) {
         throw new IllegalStateException("Already building!");
      } else {
         this.while_ = true;
         this.synchronized_ = var1;
         this.class_(var2);
         this.this_ = (jv_3)var2.byte_().get(0);
         this.else_ = 0;
         ((Buffer)this.volatile_).clear();
         if (rrbb_3.rs()) {
            rrdk_1.break_(this);
         }

         if (rrbb_3.w()) {
            this.try_();
         }

         if (rrMh_1.class_()) {
            if (this.finally_ == null) {
               this.finally_ = this.extends_;
            }

            this.finally_.clear();
         } else if (this.finally_ != null) {
            this.finally_ = null;
         }
      }
   }

   public void class_(le_3 var1) {
      ((Buffer)var1.class_).clear();
      int var2 = var1.class_.capacity();
      this.throws_(var2);
      ((Buffer)this.volatile_).limit(this.volatile_.capacity());
      ((Buffer)this.volatile_).position(this.int_);
      this.volatile_.put(var1.class_);
      ((Buffer)this.volatile_).clear();
      jZ_2 var3 = var1.break_;
      this.class_(var3);
      this.super_ = var2 / var3.break_();
      this.new_ = this.int_ + this.super_ * var3.break_();
      if (var1.byte_ != null) {
         if (this.throw_ == null) {
            this.throw_ = this.interface_;
         }

         if (this.throw_ == null || this.throw_.length < this.instanceof_()) {
            this.throw_ = new fj_3[this.instanceof_()];
         }

         fj_3[] var4 = var1.byte_;
         System.arraycopy(var4, 0, this.throw_, 0, var4.length);
      } else {
         if (this.throw_ != null) {
            this.interface_ = this.throw_;
         }

         this.throw_ = null;
      }
   }

   @Override
   public void class_(int var1, float var2) {
      this.volatile_.putFloat(this.new_ + var1, var2);
   }

   @Override
   public void class_(int var1, short var2) {
      this.volatile_.putShort(this.new_ + var1, var2);
   }

   private static void class_(FloatBuffer var0, int var1, int var2, int var3) {
      int var4 = var3 + var1 * var2;
      var0.limit(var4 + var2);
      var0.position(var4);
   }

   @Override
   public float[] break_(float var1, float var2, float var3, float var4) {
      this.void_[0] = var1;
      this.void_[1] = var2;
      this.void_[2] = var3;
      this.void_[3] = var4;
      return this.void_;
   }

   public void break_(HU var1) {
      this.try_ = var1;
      this.instanceof_ = true;
   }

   @Override
   public rje_3 break_(float var1, float var2, float var3) {
      this.float_.break_(var1, var2, var3);
      return this.float_;
   }

   @Override
   public void break_(fj_3 var1) {
      if (this.finally_ != null && var1 != null && var1.try_() && var1.continue_() >= 0) {
         this.finally_.set(var1.continue_());
      }

      if (this.throw_ != null) {
         this.char_ = var1;
      }
   }

   @Override
   public Ok_1 break_(int var1, int var2, int var3, int var4) {
      if (this.class_) {
         throw new IllegalStateException();
      } else {
         return OW.super.break_(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean break_() {
      return this.throw_ != null;
   }

   private void throws_(int var1) {
      if (this.new_ + var1 > this.volatile_.capacity()) {
         int var2 = this.volatile_.capacity();
         int var3 = var2 + case_(var1);
         native_.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", var2, var3);
         ByteBuffer var4 = Hb_1.class_(var3);
         ((Buffer)this.volatile_).position(0);
         var4.put(this.volatile_);
         ((Buffer)var4).rewind();
         this.volatile_ = var4;
         this.import_ = this.volatile_.asIntBuffer();
         this.short_ = this.volatile_.asFloatBuffer();
         if (this.throw_ != null) {
            fj_3[] var5 = this.throw_;
            int var6 = this.instanceof_();
            this.throw_ = new fj_3[var6];
            System.arraycopy(var5, 0, this.throw_, 0, Math.min(var5.length, this.throw_.length));
            this.interface_ = null;
         }
      }
   }

   public void finally_() {
      if (!this.while_) {
         throw new IllegalStateException("Not building!");
      } else {
         this.while_ = false;
         rrxm_3 var1 = this.abstract_.class_(this.super_, this.try_, this.throw_);
         this.final_.add(new lU_2(this.return_, this.super_, this.synchronized_, var1));
         this.try_ = null;
         this.instanceof_ = false;
         if (this.throw_ != null) {
            this.interface_ = this.throw_;
         }

         this.throw_ = null;
         this.char_ = null;
         this.int_ = this.int_ + this.super_ * this.return_.break_();
         this.super_ = 0;
         this.this_ = null;
         this.else_ = 0;
      }
   }

   @Override
   public void catch_() {
      ImmutableList var1 = this.return_.byte_();
      int var2 = var1.size();

      do {
         if (++this.else_ >= var2) {
            this.else_ -= var2;
         }

         this.new_ = this.new_ + this.this_.protected_();
         this.this_ = (jv_3)var1.get(this.else_);
      } while (this.this_.break_() == jL_2.PADDING);

      if (this.class_ && this.this_.break_() == jL_2.COLOR) {
         OW.super.break_(this.break_, this.byte_, this.protected_, this.throws_);
      }
   }

   private FloatBuffer catch_(int var1) {
      if (this.const_ == null || this.const_.capacity() < var1) {
         this.const_ = Hb_1.byte_(var1);
      }

      return this.const_;
   }

   public Pair<lU_2, ByteBuffer> extends_() {
      lU_2 var1 = this.final_.get(this.package_++);
      ((Buffer)this.volatile_).position(this.continue_);
      this.continue_ = this.continue_ + var1.byte_() * var1.break_().break_();
      ((Buffer)this.volatile_).limit(this.continue_);
      if (this.package_ == this.final_.size() && this.super_ == 0) {
         this.native_();
      }

      ByteBuffer var2 = this.volatile_.slice();
      var2.order(this.volatile_.order());
      ((Buffer)this.volatile_).clear();
      if (var1.byte_ == 7 && rrbb_3.rI()) {
         if (this.long_ == null) {
            this.long_ = Hb_1.class_(this.volatile_.capacity() * 2);
         }

         if (this.long_.capacity() < this.volatile_.capacity() * 2) {
            this.long_ = Hb_1.class_(this.volatile_.capacity() * 2);
         }

         jZ_2 var3 = var1.break_();
         int var4 = var1.byte_();
         class_(var2, var3, var4, this.long_);
         int var5 = var4 * 6 / 4;
         lU_2 var6 = new lU_2(var3, var5, 4);
         return Pair.of(var6, this.long_);
      } else {
         return Pair.of(var1, var2);
      }
   }

   public int goto_() {
      return this.int_ / 4;
   }

   private static int case_(int var0) {
      int var1 = 2097152;
      if (var0 == 0) {
         return var1;
      } else {
         if (var0 < 0) {
            var1 *= -1;
         }

         int var2 = var0 % var1;
         return var2 == 0 ? var0 : var0 + var1 - var2;
      }
   }

   @Override
   public jv_3 case_() {
      if (this.this_ == null) {
         throw new IllegalStateException("BufferBuilder not started");
      } else {
         return this.this_;
      }
   }

   public FloatBuffer continue_() {
      return this.short_;
   }

   public rrxq_3[] else_() {
      return this.strictfp_;
   }

   public le_3 implements_() {
      ((Buffer)this.volatile_).limit(this.new_);
      ((Buffer)this.volatile_).position(this.int_);
      ByteBuffer var1 = ByteBuffer.allocate(this.super_ * this.return_.break_());
      var1.put(this.volatile_);
      ((Buffer)this.volatile_).clear();
      fj_3[] var2 = this.while_();
      return new le_3(var1, this.return_, var2);
   }

   private int instanceof_() {
      return this.volatile_.capacity() / this.return_.break_();
   }

   public ByteBuffer new_() {
      return this.volatile_;
   }

   public int package_() {
      return this.synchronized_;
   }

   public jZ_2 return_() {
      return this.return_;
   }

   public IntBuffer super_() {
      return this.import_;
   }

   private void try_() {
      if (this.instanceof_ && this.try_ != null && this.throw_ == null && this.while_) {
         if (this.super_ > 0) {
            int var1 = this.synchronized_;
            jZ_2 var2 = this.return_;
            HU var3 = this.try_;
            boolean var4 = this.instanceof_;
            this.try_.class_(this, 0, 0, 0);
            this.class_(var1, var2);
            this.try_ = var3;
            this.instanceof_ = var4;
         }

         this.throw_ = this.interface_;
         if (this.throw_ == null || this.throw_.length < this.instanceof_()) {
            this.throw_ = new fj_3[this.instanceof_()];
         }
      }
   }

   private fj_3[] while_() {
      if (this.throw_ == null) {
         return null;
      } else {
         int var1 = this.super_ / 4;
         fj_3[] var2 = new fj_3[var1];
         System.arraycopy(this.throw_, 0, var2, 0, var1);
         return var2;
      }
   }

   public int public_() {
      return this.int_;
   }

   public void protected_(float var1, float var2, float var3) {
      ((Buffer)this.volatile_).clear();
      FloatBuffer var4 = this.volatile_.asFloatBuffer();
      int var5 = this.return_.break_();
      int var6 = this.return_.class_() * 4;
      int var7 = this.int_ / 4;
      int var8 = this.super_ / 4;
      int var9 = this.return_.class_();
      float[] var10 = new float[var8];
      int[] var11 = new int[var8];

      for (int var12 = 0; var12 < var8; var11[var12] = var12++) {
         var10[var12] = class_(var4, var1, var2, var3, var9, var7 + var12 * var5);
      }

      class_(var11, var10);
      BitSet var22 = new BitSet();
      MemoryStack var13 = MemoryStack.stackPush();

      try {
         FloatBuffer var14 = var13.mallocFloat(var9 * 4);

         for (int var15 = var22.nextClearBit(0); var15 < var11.length; var15 = var22.nextClearBit(var15 + 1)) {
            int var16 = var11[var15];
            if (var16 != var15) {
               class_(var4, var16, var6, var7);
               var14.clear();
               var14.put(var4);
               int var17 = var16;

               for (int var18 = var11[var16]; var17 != var15; var18 = var11[var18]) {
                  class_(var4, var18, var6, var7);
                  FloatBuffer var19 = var4.slice();
                  class_(var4, var17, var6, var7);
                  var4.put(var19);
                  var22.set(var17);
                  var17 = var18;
               }

               class_(var4, var15, var6, var7);
               var14.flip();
               var4.put(var14);
            }

            var22.set(var15);
         }
      } catch (Throwable var21) {
         if (var13 != null) {
            try {
               var13.close();
            } catch (Throwable var20) {
               var21.addSuppressed(var20);
            }
         }

         throw var21;
      }

      if (var13 != null) {
         var13.close();
      }
   }

   @Override
   public Hd_1 protected_() {
      return this.default_;
   }

   protected void private_() {
      this.throws_(this.return_.break_());
   }

   public boolean final_() {
      return this.while_;
   }

   public void volatile_() {
      this.int_ = 0;
      this.continue_ = 0;
      this.new_ = 0;
      this.final_.clear();
      this.package_ = 0;
      this.char_ = null;
   }

   public rje_3 synchronized_() {
      return this.boolean_;
   }

   public void native_() {
      if (this.int_ != this.continue_) {
         native_.warn("Bytes mismatch " + this.int_ + " " + this.continue_);
      }

      this.volatile_();
   }
}
