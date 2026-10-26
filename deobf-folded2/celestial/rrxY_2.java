package celestial;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.lwjgl.BufferUtils;

public class rrxY_2 {
   private String id_class;
   private final int id_break;
   private final int id_byte;
   private final IntBuffer id_protected;
   private int[] id_throws;
   private IntBuffer id_case;

   public rrxY_2 id_byte(int var1) {
      this.id_case();
      ((Buffer)this.id_protected).position(var1);
      return this;
   }

   public int id_byte() {
      return this.id_protected.capacity();
   }

   public rrxY_2(String var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = IntBuffer.wrap(new int[var3]);
   }

   @Override
   public String toString() {
      return this.id_class
         + ": "
         + rrWs_1.id_class(this.id_protected)
         + ", mapping: "
         + rrki_1.id_class(this.id_throws)
         + ", glDrawBuffers: "
         + rrWs_1.id_class(this.id_case);
   }

   public int id_class(int var1) {
      return this.id_protected.get(var1);
   }

   private static int[] id_class(IntBuffer var0, int var1, int var2) {
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
            int var7 = id_class(var10, var2, var3);
            if (var7 < 0) {
               throw new RuntimeException("Too many draw buffers, mapping: " + rrki_1.id_class(var3));
            }

            var3[var10] = var7;
         }
      }

      return var3;
   }

   private static int id_class(int var0, int var1, int[] var2) {
      if (var0 < var1) {
         return var0;
      } else if (var2[var0] >= 0) {
         return var2[var0];
      } else {
         for (int var3 = 0; var3 < var1; var3++) {
            if (!rrki_1.id_class(var2, var3)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private static IntBuffer id_class(IntBuffer var0, int[] var1) {
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

   public String id_class(boolean var1) {
      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < this.id_protected.limit(); var3++) {
         int var4 = this.id_protected.get(var3);
         int var5 = var4 - 36064;
         if (var1) {
            int[] var6 = this.id_protected();
            if (var5 >= 0 && var5 < var6.length) {
               var5 = var6[var5];
            }
         }

         String var7 = this.id_catch(var5);
         var2.append(var7);
      }

      return var2.toString();
   }

   public rrxY_2 id_class(int var1, int var2) {
      this.id_case();
      this.id_protected.put(var1, var2);
      return this;
   }

   public int id_class() {
      return this.id_protected.position();
   }

   public int id_break() {
      return this.id_protected.limit();
   }

   public rrxY_2 id_break(int var1) {
      this.id_case();
      this.id_protected.put(var1);
      return this;
   }

   public IntBuffer id_throws() {
      if (this.id_case == null) {
         this.id_case = id_class(this.id_protected, this.id_protected());
      }

      return this.id_case;
   }

   public rrxY_2 id_throws(int var1) {
      for (int var2 = 0; var2 < this.id_protected.limit(); var2++) {
         this.id_protected.put(var2, var1);
      }

      this.id_case();
      return this;
   }

   private String id_catch(int var1) {
      return var1 >= 0 && var1 < this.id_break ? var1 + "" : "N";
   }

   public int id_case(int var1) {
      for (int var2 = 0; var2 < this.id_break(); var2++) {
         if (this.id_class(var2) == var1) {
            return var2;
         }
      }

      return -1;
   }

   private void id_case() {
      this.id_throws = null;
      this.id_case = null;
   }

   public int[] id_protected() {
      if (this.id_throws == null) {
         this.id_throws = id_class(this.id_protected, this.id_break, this.id_byte);
      }

      return this.id_throws;
   }

   public rrxY_2 id_protected(int var1) {
      this.id_case();
      ((Buffer)this.id_protected).limit(var1);
      return this;
   }
}
