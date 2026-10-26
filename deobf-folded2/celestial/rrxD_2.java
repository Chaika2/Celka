package celestial;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.lwjgl.BufferUtils;

public class rrxD_2 {
   private String id_class;
   private IntBuffer id_break;
   private IntBuffer id_byte;
   private boolean[] id_protected;
   private boolean[] id_throws;

   public int id_byte() {
      return this.id_break.limit();
   }

   public int id_byte(int var1) {
      return this.id_class(var1, this.id_protected[var1]);
   }

   public rrxD_2(String var1, int var2) {
      this.id_class = var1;
      this.id_break = BufferUtils.createIntBuffer(var2);
      this.id_byte = BufferUtils.createIntBuffer(var2);
      this.id_protected = new boolean[var2];
      this.id_throws = new boolean[var2];
   }

   @Override
   public String toString() {
      return this.id_class
         + ", A: "
         + rrWs_1.id_class(this.id_break)
         + ", B: "
         + rrWs_1.id_class(this.id_byte)
         + ", flips: ["
         + rrki_1.id_class(this.id_protected, this.id_byte())
         + "], changed: ["
         + rrki_1.id_class(this.id_throws, this.id_byte())
         + "]";
   }

   private int id_class(int var1, boolean var2) {
      IntBuffer var3 = var2 ? this.id_byte : this.id_break;
      return var3.get(var1);
   }

   public int id_class() {
      return this.id_break.capacity();
   }

   public int id_class(boolean var1, int var2) {
      return var1 ? this.id_byte(var2) : this.id_protected(var2);
   }

   public rrxD_2 id_class(int var1) {
      ((Buffer)this.id_break).position(var1);
      ((Buffer)this.id_byte).position(var1);
      return this;
   }

   public int id_break() {
      return this.id_break.position();
   }

   public rrxD_2 id_break(int var1) {
      ((Buffer)this.id_break).limit(var1);
      ((Buffer)this.id_byte).limit(var1);
      return this;
   }

   public void id_throws(int var1) {
      this.id_protected[var1] = !this.id_protected[var1];
      this.id_throws[var1] = true;
   }

   public void id_throws() {
      MT.id_class(this.id_break);
      MT.id_class(this.id_byte);
   }

   public void id_catch(int var1) {
      int var2 = this.id_byte();

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_break.put(var3, var1);
         this.id_byte.put(var3, var1);
      }
   }

   public rrxD_2 id_catch() {
      this.id_class(0);
      this.id_break(this.id_class());
      return this;
   }

   public void id_case() {
      MT.id_break(this.id_break);
      MT.id_break(this.id_byte);
      this.id_protected();
   }

   public boolean id_case(int var1) {
      return this.id_throws[var1];
   }

   public int id_protected(int var1) {
      return this.id_class(var1, !this.id_protected[var1]);
   }

   public void id_protected() {
      Arrays.fill(this.id_protected, false);
      Arrays.fill(this.id_throws, false);
   }
}
