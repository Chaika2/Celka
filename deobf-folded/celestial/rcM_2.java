package celestial;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcM_2 extends rcx_3<rch_3> {
   public static final rcv_3<rcM_2> id_class = new rcO_2();
   private byte[] id_break;

   @Override
   public rcZ_2 id_byte() {
      byte[] var1 = new byte[this.id_break.length];
      System.arraycopy(this.id_break, 0, var1, 0, this.id_break.length);
      return new rcM_2(var1);
   }

   public rcM_2(byte[] var1) {
      this.id_break = var1;
   }

   public rcM_2(List<Byte> var1) {
      this(id_class(var1));
   }

   @Override
   public int size() {
      return this.id_break.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcM_2 && Arrays.equals(this.id_break, ((rcM_2)var1).id_break);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[B;");

      for (int var2 = 0; var2 < this.id_break.length; var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.id_break[var2]).append('B');
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.id_break);
   }

   @Override
   public void clear() {
      this.id_break = new byte[0];
   }

   public rch_3 id_class(int var1, rch_3 var2) {
      byte var3 = this.id_break[var1];
      this.id_break[var1] = var2.id_private();
      return rch_3.id_class(var3);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeInt(this.id_break.length);
      var1.write(this.id_break);
   }

   private static byte[] id_class(List<Byte> var0) {
      byte[] var1 = new byte[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Byte var3 = (Byte)var0.get(var2);
         var1[var2] = var3 == null ? 0 : var3;
      }

      return var1;
   }

   public rch_3 id_class(int var1) {
      return rch_3.id_class(this.id_break[var1]);
   }

   @Override
   public byte id_class() {
      return 7;
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("B").id_class(id_catch);
      rVi_1 var4 = new rgN_2("[").id_class(var3).id_break(";");

      for (int var5 = 0; var5 < this.id_break.length; var5++) {
         rVi_1 var6 = new rgN_2(String.valueOf(this.id_break[var5])).id_class(id_case);
         var4.id_break(" ").id_class(var6).id_class(var3);
         if (var5 != this.id_break.length - 1) {
            var4.id_break(",");
         }
      }

      var4.id_break("]");
      return var4;
   }

   @Override
   public boolean id_class(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.id_break[var1] = ((rcK_2)var2).id_private();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rcv_3<rcM_2> id_break() {
      return id_class;
   }

   @Override
   public boolean id_break(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.id_break = ArrayUtils.add(this.id_break, var1, ((rcK_2)var2).id_private());
         return true;
      } else {
         return false;
      }
   }

   public rch_3 id_break(int var1) {
      byte var2 = this.id_break[var1];
      this.id_break = ArrayUtils.remove(this.id_break, var1);
      return rch_3.id_class(var2);
   }

   public void id_break(int var1, rch_3 var2) {
      this.id_break = ArrayUtils.add(this.id_break, var1, var2.id_private());
   }

   @Override
   public byte id_throws() {
      return 1;
   }

   public byte[] id_protected() {
      return this.id_break;
   }
}
