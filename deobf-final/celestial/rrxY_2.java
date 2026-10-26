package celestial;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.lwjgl.BufferUtils;

public class rrxY_2 {
   private String class_;
   private final int break_;
   private final int byte_;
   private final IntBuffer protected_;
   private int[] throws_;
   private IntBuffer case_;

   public rrxY_2 byte_(int var1) {
      this.case_();
      ((Buffer)this.protected_).position(var1);
      return this;
   }

   public int byte_() {
      return this.protected_.capacity();
   }

   public rrxY_2(String var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = IntBuffer.wrap(new int[var3]);
   }

   @Override
   public String toString() {
      return this.class_
         + ": "
         + rrWs_1.class_(this.protected_)
         + ", mapping: "
         + rrki_1.class_(this.throws_)
         + ", glDrawBuffers: "
         + rrWs_1.class_(this.case_);
   }

   public int class_(int var1) {
      return this.protected_.get(var1);
   }

   private static int[] class_(IntBuffer var0, int var1, int var2) {
      int[] var3 = new int[var1];
      Arrays.fill(var3, -1);

      for (int var4 = 0; var4 < var0.limit(); var4++) {
         int var5 = var0.get(var4);
         int var6 = var5 - 36064;
         if (var6 >= 0 && var6 < var2) {
            var3[var6] = var6;
         }
      }

      for (int var8 = 0; var8 < var0.limit(); var8++) {
         int var9 = var0.get(var8);
         int var10 = var9 - 36064;
         if (var10 >= var2 && var10 < var1) {
            int var7 = class_(var10, var2, var3);
            if (var7 < 0) {
               throw new RuntimeException("Too many draw buffers, mapping: " + rrki_1.class_(var3));
            }

            var3[var10] = var7;
         }
      }

      return var3;
   }

   private static int class_(int var0, int var1, int[] var2) {
      if (var0 < var1) {
         return var0;
      } else if (var2[var0] >= 0) {
         return var2[var0];
      } else {
         for (int var3 = 0; var3 < var1; var3++) {
            if (!rrki_1.class_(var2, var3)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private static IntBuffer class_(IntBuffer var0, int[] var1) {
      IntBuffer var2 = BufferUtils.createIntBuffer(var0.capacity());

      for (int var3 = 0; var3 < var0.limit(); var3++) {
         int var4 = var0.get(var3);
         int var5 = var4 - 36064;
         int var6 = 0;
         if (var5 >= 0 && var5 < var1.length) {
            var6 = 36064 + var1[var5];
         }

         var2.put(var3, var6);
      }

      ((Buffer)var2).limit(var0.limit());
      ((Buffer)var2).position(var0.position());
      return var2;
   }

   public String class_(boolean var1) {
      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < this.protected_.limit(); var3++) {
         int var4 = this.protected_.get(var3);
         int var5 = var4 - 36064;
         if (var1) {
            int[] var6 = this.protected_();
            if (var5 >= 0 && var5 < var6.length) {
               var5 = var6[var5];
            }
         }

         String var7 = this.catch_(var5);
         var2.append(var7);
      }

      return var2.toString();
   }

   public rrxY_2 class_(int var1, int var2) {
      this.case_();
      this.protected_.put(var1, var2);
      return this;
   }

   public int class_() {
      return this.protected_.position();
   }

   public int break_() {
      return this.protected_.limit();
   }

   public rrxY_2 break_(int var1) {
      this.case_();
      this.protected_.put(var1);
      return this;
   }

   public IntBuffer throws_() {
      if (this.case_ == null) {
         this.case_ = class_(this.protected_, this.protected_());
      }

      return this.case_;
   }

   public rrxY_2 throws_(int var1) {
      for (int var2 = 0; var2 < this.protected_.limit(); var2++) {
         this.protected_.put(var2, var1);
      }

      this.case_();
      return this;
   }

   private String catch_(int var1) {
      return var1 >= 0 && var1 < this.break_ ? var1 + "" : "N";
   }

   public int case_(int var1) {
      for (int var2 = 0; var2 < this.break_(); var2++) {
         if (this.class_(var2) == var1) {
            return var2;
         }
      }

      return -1;
   }

   private void case_() {
      this.throws_ = null;
      this.case_ = null;
   }

   public int[] protected_() {
      if (this.throws_ == null) {
         this.throws_ = class_(this.protected_, this.break_, this.byte_);
      }

      return this.throws_;
   }

   public rrxY_2 protected_(int var1) {
      this.case_();
      ((Buffer)this.protected_).limit(var1);
      return this;
   }
}
