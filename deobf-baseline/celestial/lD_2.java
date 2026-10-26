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
   private static final Logger id_native = LogManager.getLogger();
   private ByteBuffer id_volatile;
   private final List<lU_2> id_final = Lists.newArrayList();
   private int id_package = 0;
   private int id_int = 0;
   private int id_new = 0;
   private int id_continue = 0;
   private int id_super;
   private jv_3 id_this;
   private int id_else;
   private int id_synchronized;
   private jZ_2 id_return;
   private boolean id_public;
   private boolean id_goto;
   private boolean id_while;
   private HU id_try;
   private boolean id_instanceof;
   private fj_3[] id_throw = null;
   private fj_3[] id_interface = null;
   private fj_3 id_char = null;
   private final rrxu_3 id_abstract = new rrxu_3();
   public rrdk_1 id_private;
   public rrxF_2 id_implements = null;
   public BitSet id_finally = null;
   public BitSet id_extends = new BitSet();
   private ByteBuffer id_long;
   private final rje_3 id_float = new rje_3();
   private final float[] id_void = new float[4];
   private final int[] id_static = new int[4];
   private IntBuffer id_import;
   private FloatBuffer id_short;
   private Hd_1 id_default;
   private FloatBuffer id_const;
   private rrxq_3[] id_strictfp;
   private final rje_3 id_boolean = new rje_3();

   @Override
   public HU id_byte() {
      return this.id_try;
   }

   @Override
   public void id_byte(float var1, float var2, float var3) {
      this.id_boolean.id_break(var1, var2, var3);
   }

   @Override
   public int[] id_byte(int var1, int var2, int var3, int var4) {
      this.id_static[0] = var1;
      this.id_static[1] = var2;
      this.id_static[2] = var3;
      this.id_static[3] = var4;
      return this.id_static;
   }

   public int id_int() {
      return this.id_super;
   }

   public lD_2(int var1) {
      this.id_volatile = Hb_1.id_class(var1 * 4);
      this.id_import = this.id_volatile.asIntBuffer();
      this.id_short = this.id_volatile.asFloatBuffer();
      rrdk_1.id_class(this);
   }

   public int id_this() {
      return this.id_super * this.id_return.id_class();
   }

   @Override
   public void id_class() {
      if (this.id_else != 0) {
         throw new IllegalStateException("Not filled all elements of the vertex");
      } else {
         this.id_super++;
         this.id_private();
         if (rrbb_3.rs()) {
            rrdk_1.id_protected(this);
         }
      }
   }

   private static void id_class(int[] var0, float[] var1) {
      id_class(var0, 0, var0.length, var1, Arrays.copyOf(var0, var0.length));
   }

   @Override
   public void id_class(HU var1) {
      this.id_try = var1;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_instanceof = var1;
      if (rrbb_3.w()) {
         this.id_try();
      }
   }

   @Override
   public void id_class(fj_3 var1) {
      if (this.id_finally != null && var1 != null && var1.id_try() && var1.id_continue() >= 0) {
         this.id_finally.set(var1.id_continue());
      }

      if (this.id_throw != null) {
         int var2 = this.id_super / 4;
         this.id_throw[var2] = var1;
      }
   }

   @Override
   public void id_class(
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
      if (this.id_class) {
         throw new IllegalStateException();
      } else {
         if (this.id_public) {
            this.id_class(0, var1);
            this.id_class(4, var2);
            this.id_class(8, var3);
            this.id_class(12, (byte)((int)(var4 * 255.0F)));
            this.id_class(13, (byte)((int)(var5 * 255.0F)));
            this.id_class(14, (byte)((int)(var6 * 255.0F)));
            this.id_class(15, (byte)((int)(var7 * 255.0F)));
            this.id_class(16, var8);
            this.id_class(20, var9);
            byte var15;
            if (this.id_goto) {
               this.id_class(24, (short)(var10 & 65535));
               this.id_class(26, (short)(var10 >> 16 & 65535));
               var15 = 28;
            } else {
               var15 = 24;
            }

            this.id_class(var15, (short)(var11 & 65535));
            this.id_class(var15 + 2, (short)(var11 >> 16 & 65535));
            this.id_class(var15 + 4, OW.id_class(var12));
            this.id_class(var15 + 5, OW.id_class(var13));
            this.id_class(var15 + 6, OW.id_class(var14));
            this.id_new = this.id_new + this.id_return.id_break();
            this.id_class();
         } else {
            super.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
         }
      }
   }

   @Override
   public Ok_1 id_class(int var1) {
      if (this.id_class) {
         throw new IllegalStateException();
      } else {
         return this.id_break(var1 >> 16 & 0xFF, var1 >> 8 & 0xFF, var1 & 0xFF, var1 >> 24 & 0xFF);
      }
   }

   public void id_class(Hd_1 var1) {
      this.id_default = var1;
   }

   public void id_class(float var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11) {
      if (this.id_return.id_break() != ju_3.id_goto.id_break()) {
         throw new IllegalStateException("Invalid text vertex format: " + this.id_return);
      } else {
         this.id_class(0, var1);
         this.id_class(4, var2);
         this.id_class(8, var3);
         this.id_class(12, (byte)var4);
         this.id_class(13, (byte)var5);
         this.id_class(14, (byte)var6);
         this.id_class(15, (byte)var7);
         this.id_class(16, var8);
         this.id_class(20, var9);
         this.id_class(24, (short)var10);
         this.id_class(26, (short)var11);
         this.id_new = this.id_new + this.id_return.id_break();
         this.id_class();
      }
   }

   @Override
   public void id_class(rrxq_3[] var1) {
      this.id_strictfp = var1;
   }

   public void id_class(ByteBuffer var1) {
      if (rrbb_3.rs()) {
         rrdk_1.id_class(this, var1);
      }

      this.id_throws(var1.limit() + this.id_return.id_break());
      ((Buffer)this.id_volatile).position(this.id_super * this.id_return.id_break());
      this.id_volatile.put(var1);
      this.id_super = this.id_super + var1.limit() / this.id_return.id_break();
      this.id_new = this.id_new + var1.limit();
      if (rrbb_3.rs()) {
         rrdk_1.id_throws(this);
      }
   }

   @Override
   public rje_3 id_class(rje_3 var1) {
      this.id_float.id_break(var1.id_class(), var1.id_break(), var1.id_byte());
      return this.id_float;
   }

   private static void id_class(ByteBuffer var0, jZ_2 var1, int var2, ByteBuffer var3) {
      int var4 = var1.id_break();
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
   public rrxF_2 id_class(xc_3 var1, rfH_2 var2) {
      if (this.id_implements == null) {
         this.id_implements = new rrxF_2(var1, var2);
         return this.id_implements;
      } else {
         this.id_implements.id_class(var1, var2);
         return this.id_implements;
      }
   }

   private static float id_class(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5) {
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

   private static void id_class(int[] var0, int var1, int var2, float[] var3, int[] var4) {
      int var5 = var2 - var1;
      if (var5 < 16) {
         id_class(var0, var1, var2, var3);
      } else {
         int var6 = var1 + var2 >>> 1;
         id_class(var4, var1, var6, var3, var0);
         id_class(var4, var6, var2, var3, var0);
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

   private static void id_class(int[] var0, int var1, int var2, float[] var3) {
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
   public void id_class(int var1, byte var2) {
      this.id_volatile.put(this.id_new + var1, var2);
   }

   private void id_class(jZ_2 var1) {
      if (this.id_return != var1) {
         this.id_return = var1;
         boolean var2 = var1 == ju_3.id_implements;
         boolean var3 = var1 == ju_3.id_private;
         this.id_public = var2 || var3;
         this.id_goto = var2;
      }
   }

   @Override
   public Ok_1 id_class(float var1, float var2) {
      if (this.id_char != null && this.id_throw != null) {
         var1 = this.id_char.id_byte(var1);
         var2 = this.id_char.id_protected(var2);
         this.id_throw[this.id_super / 4] = this.id_char;
      }

      return OW.super.id_class(var1, var2);
   }

   public void id_class(int var1, jZ_2 var2) {
      if (this.id_while) {
         throw new IllegalStateException("Already building!");
      } else {
         this.id_while = true;
         this.id_synchronized = var1;
         this.id_class(var2);
         this.id_this = (jv_3)var2.id_byte().get(0);
         this.id_else = 0;
         ((Buffer)this.id_volatile).clear();
         if (rrbb_3.rs()) {
            rrdk_1.id_break(this);
         }

         if (rrbb_3.w()) {
            this.id_try();
         }

         if (rrMh_1.id_class()) {
            if (this.id_finally == null) {
               this.id_finally = this.id_extends;
            }

            this.id_finally.clear();
         } else if (this.id_finally != null) {
            this.id_finally = null;
         }
      }
   }

   public void id_class(le_3 var1) {
      ((Buffer)var1.id_class).clear();
      int var2 = var1.id_class.capacity();
      this.id_throws(var2);
      ((Buffer)this.id_volatile).limit(this.id_volatile.capacity());
      ((Buffer)this.id_volatile).position(this.id_int);
      this.id_volatile.put(var1.id_class);
      ((Buffer)this.id_volatile).clear();
      jZ_2 var3 = var1.id_break;
      this.id_class(var3);
      this.id_super = var2 / var3.id_break();
      this.id_new = this.id_int + this.id_super * var3.id_break();
      if (var1.id_byte != null) {
         if (this.id_throw == null) {
            this.id_throw = this.id_interface;
         }

         if (this.id_throw == null || this.id_throw.length < this.id_instanceof()) {
            this.id_throw = new fj_3[this.id_instanceof()];
         }

         fj_3[] var4 = var1.id_byte;
         System.arraycopy(var4, 0, this.id_throw, 0, var4.length);
      } else {
         if (this.id_throw != null) {
            this.id_interface = this.id_throw;
         }

         this.id_throw = null;
      }
   }

   @Override
   public void id_class(int var1, float var2) {
      this.id_volatile.putFloat(this.id_new + var1, var2);
   }

   @Override
   public void id_class(int var1, short var2) {
      this.id_volatile.putShort(this.id_new + var1, var2);
   }

   private static void id_class(FloatBuffer var0, int var1, int var2, int var3) {
      int var4 = var3 + var1 * var2;
      var0.limit(var4 + var2);
      var0.position(var4);
   }

   @Override
   public float[] id_break(float var1, float var2, float var3, float var4) {
      this.id_void[0] = var1;
      this.id_void[1] = var2;
      this.id_void[2] = var3;
      this.id_void[3] = var4;
      return this.id_void;
   }

   public void id_break(HU var1) {
      this.id_try = var1;
      this.id_instanceof = true;
   }

   @Override
   public rje_3 id_break(float var1, float var2, float var3) {
      this.id_float.id_break(var1, var2, var3);
      return this.id_float;
   }

   @Override
   public void id_break(fj_3 var1) {
      if (this.id_finally != null && var1 != null && var1.id_try() && var1.id_continue() >= 0) {
         this.id_finally.set(var1.id_continue());
      }

      if (this.id_throw != null) {
         this.id_char = var1;
      }
   }

   @Override
   public Ok_1 id_break(int var1, int var2, int var3, int var4) {
      if (this.id_class) {
         throw new IllegalStateException();
      } else {
         return OW.super.id_break(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean id_break() {
      return this.id_throw != null;
   }

   private void id_throws(int var1) {
      if (this.id_new + var1 > this.id_volatile.capacity()) {
         int var2 = this.id_volatile.capacity();
         int var3 = var2 + id_case(var1);
         id_native.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", var2, var3);
         ByteBuffer var4 = Hb_1.id_class(var3);
         ((Buffer)this.id_volatile).position(0);
         var4.put(this.id_volatile);
         ((Buffer)var4).rewind();
         this.id_volatile = var4;
         this.id_import = this.id_volatile.asIntBuffer();
         this.id_short = this.id_volatile.asFloatBuffer();
         if (this.id_throw != null) {
            fj_3[] var5 = this.id_throw;
            int var6 = this.id_instanceof();
            this.id_throw = new fj_3[var6];
            System.arraycopy(var5, 0, this.id_throw, 0, Math.min(var5.length, this.id_throw.length));
            this.id_interface = null;
         }
      }
   }

   public void id_finally() {
      if (!this.id_while) {
         throw new IllegalStateException("Not building!");
      } else {
         this.id_while = false;
         rrxm_3 var1 = this.id_abstract.id_class(this.id_super, this.id_try, this.id_throw);
         this.id_final.add(new lU_2(this.id_return, this.id_super, this.id_synchronized, var1));
         this.id_try = null;
         this.id_instanceof = false;
         if (this.id_throw != null) {
            this.id_interface = this.id_throw;
         }

         this.id_throw = null;
         this.id_char = null;
         this.id_int = this.id_int + this.id_super * this.id_return.id_break();
         this.id_super = 0;
         this.id_this = null;
         this.id_else = 0;
      }
   }

   @Override
   public void id_catch() {
      ImmutableList var1 = this.id_return.id_byte();
      int var2 = var1.size();

      do {
         if (++this.id_else >= var2) {
            this.id_else -= var2;
         }

         this.id_new = this.id_new + this.id_this.id_protected();
         this.id_this = (jv_3)var1.get(this.id_else);
      } while (this.id_this.id_break() == jL_2.PADDING);

      if (this.id_class && this.id_this.id_break() == jL_2.COLOR) {
         OW.super.id_break(this.id_break, this.id_byte, this.id_protected, this.id_throws);
      }
   }

   private FloatBuffer id_catch(int var1) {
      if (this.id_const == null || this.id_const.capacity() < var1) {
         this.id_const = Hb_1.id_byte(var1);
      }

      return this.id_const;
   }

   public Pair<lU_2, ByteBuffer> id_extends() {
      lU_2 var1 = this.id_final.get(this.id_package++);
      ((Buffer)this.id_volatile).position(this.id_continue);
      this.id_continue = this.id_continue + var1.id_byte() * var1.id_break().id_break();
      ((Buffer)this.id_volatile).limit(this.id_continue);
      if (this.id_package == this.id_final.size() && this.id_super == 0) {
         this.id_native();
      }

      ByteBuffer var2 = this.id_volatile.slice();
      var2.order(this.id_volatile.order());
      ((Buffer)this.id_volatile).clear();
      if (var1.id_byte == 7 && rrbb_3.rI()) {
         if (this.id_long == null) {
            this.id_long = Hb_1.id_class(this.id_volatile.capacity() * 2);
         }

         if (this.id_long.capacity() < this.id_volatile.capacity() * 2) {
            this.id_long = Hb_1.id_class(this.id_volatile.capacity() * 2);
         }

         jZ_2 var3 = var1.id_break();
         int var4 = var1.id_byte();
         id_class(var2, var3, var4, this.id_long);
         int var5 = var4 * 6 / 4;
         lU_2 var6 = new lU_2(var3, var5, 4);
         return Pair.of(var6, this.id_long);
      } else {
         return Pair.of(var1, var2);
      }
   }

   public int id_goto() {
      return this.id_int / 4;
   }

   private static int id_case(int var0) {
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
   public jv_3 id_case() {
      if (this.id_this == null) {
         throw new IllegalStateException("BufferBuilder not started");
      } else {
         return this.id_this;
      }
   }

   public FloatBuffer id_continue() {
      return this.id_short;
   }

   public rrxq_3[] id_else() {
      return this.id_strictfp;
   }

   public le_3 id_implements() {
      ((Buffer)this.id_volatile).limit(this.id_new);
      ((Buffer)this.id_volatile).position(this.id_int);
      ByteBuffer var1 = ByteBuffer.allocate(this.id_super * this.id_return.id_break());
      var1.put(this.id_volatile);
      ((Buffer)this.id_volatile).clear();
      fj_3[] var2 = this.id_while();
      return new le_3(var1, this.id_return, var2);
   }

   private int id_instanceof() {
      return this.id_volatile.capacity() / this.id_return.id_break();
   }

   public ByteBuffer id_new() {
      return this.id_volatile;
   }

   public int id_package() {
      return this.id_synchronized;
   }

   public jZ_2 id_return() {
      return this.id_return;
   }

   public IntBuffer id_super() {
      return this.id_import;
   }

   private void id_try() {
      if (this.id_instanceof && this.id_try != null && this.id_throw == null && this.id_while) {
         if (this.id_super > 0) {
            int var1 = this.id_synchronized;
            jZ_2 var2 = this.id_return;
            HU var3 = this.id_try;
            boolean var4 = this.id_instanceof;
            this.id_try.id_class(this, 0, 0, 0);
            this.id_class(var1, var2);
            this.id_try = var3;
            this.id_instanceof = var4;
         }

         this.id_throw = this.id_interface;
         if (this.id_throw == null || this.id_throw.length < this.id_instanceof()) {
            this.id_throw = new fj_3[this.id_instanceof()];
         }
      }
   }

   private fj_3[] id_while() {
      if (this.id_throw == null) {
         return null;
      } else {
         int var1 = this.id_super / 4;
         fj_3[] var2 = new fj_3[var1];
         System.arraycopy(this.id_throw, 0, var2, 0, var1);
         return var2;
      }
   }

   public int id_public() {
      return this.id_int;
   }

   public void id_protected(float var1, float var2, float var3) {
      ((Buffer)this.id_volatile).clear();
      FloatBuffer var4 = this.id_volatile.asFloatBuffer();
      int var5 = this.id_return.id_break();
      int var6 = this.id_return.id_class() * 4;
      int var7 = this.id_int / 4;
      int var8 = this.id_super / 4;
      int var9 = this.id_return.id_class();
      float[] var10 = new float[var8];
      int[] var11 = new int[var8];

      for (int var12 = 0; var12 < var8; var11[var12] = var12++) {
         var10[var12] = id_class(var4, var1, var2, var3, var9, var7 + var12 * var5);
      }

      id_class(var11, var10);
      BitSet var22 = new BitSet();
      MemoryStack var13 = MemoryStack.stackPush();

      try {
         FloatBuffer var14 = var13.mallocFloat(var9 * 4);

         for (int var15 = var22.nextClearBit(0); var15 < var11.length; var15 = var22.nextClearBit(var15 + 1)) {
            int var16 = var11[var15];
            if (var16 != var15) {
               id_class(var4, var16, var6, var7);
               var14.clear();
               var14.put(var4);
               int var17 = var16;

               for (int var18 = var11[var16]; var17 != var15; var18 = var11[var18]) {
                  id_class(var4, var18, var6, var7);
                  FloatBuffer var19 = var4.slice();
                  id_class(var4, var17, var6, var7);
                  var4.put(var19);
                  var22.set(var17);
                  var17 = var18;
               }

               id_class(var4, var15, var6, var7);
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
   public Hd_1 id_protected() {
      return this.id_default;
   }

   protected void id_private() {
      this.id_throws(this.id_return.id_break());
   }

   public boolean id_final() {
      return this.id_while;
   }

   public void id_volatile() {
      this.id_int = 0;
      this.id_continue = 0;
      this.id_new = 0;
      this.id_final.clear();
      this.id_package = 0;
      this.id_char = null;
   }

   public rje_3 id_synchronized() {
      return this.id_boolean;
   }

   public void id_native() {
      if (this.id_int != this.id_continue) {
         id_native.warn("Bytes mismatch " + this.id_int + " " + this.id_continue);
      }

      this.id_volatile();
   }
}
