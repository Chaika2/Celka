package celestial;

import java.util.Arrays;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class rrky_1 {
   private String id_class;
   private int id_break = 0;
   private int[] id_byte = new int[]{-1};
   private static final int id_protected = -1;
   private static final int id_throws = Integer.MIN_VALUE;

   public String id_byte() {
      return this.id_class;
   }

   public void id_byte(int var1) {
      if (this.id_break != var1) {
         this.id_break = var1;
         this.id_class();
         this.id_class(var1);
      }
   }

   public rrky_1(String var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return this.id_class;
   }

   private void id_class() {
      if (this.id_break >= this.id_byte.length) {
         int[] var1 = new int[this.id_break * 2];
         Arrays.fill(var1, Integer.MIN_VALUE);
         System.arraycopy(this.id_byte, 0, var1, 0, this.id_byte.length);
         this.id_byte = var1;
      }
   }

   protected abstract void id_class(int var1);

   protected abstract void id_break();

   public int id_throws() {
      if (this.id_break <= 0) {
         return -1;
      } else {
         int var1 = this.id_byte[this.id_break];
         if (var1 == Integer.MIN_VALUE) {
            var1 = ARBShaderObjects.glGetUniformLocationARB(this.id_break, this.id_class);
            this.id_byte[this.id_break] = var1;
         }

         return var1;
      }
   }

   protected static final void id_finally() {
      rrdZ.rP();
   }

   public void id_catch() {
      this.id_byte[this.id_break] = -1;
   }

   public boolean id_case() {
      return this.id_throws() >= 0;
   }

   protected void id_implements() {
      if (rrdZ.id_catch(this.id_class) != 0) {
         this.id_catch();
      }
   }

   public int id_protected() {
      return this.id_break;
   }

   public void id_private() {
      this.id_break = 0;
      this.id_byte = new int[]{-1};
      this.id_break();
   }
}
