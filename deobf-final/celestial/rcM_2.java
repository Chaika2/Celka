package celestial;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcM_2 extends rcx_3<rch_3> {
   public static final rcv_3<rcM_2> class_ = new rcO_2();
   private byte[] break_;

   @Override
   public rcZ_2 byte_() {
      byte[] var1 = new byte[this.break_.length];
      System.arraycopy(this.break_, 0, var1, 0, this.break_.length);
      return new rcM_2(var1);
   }

   public rcM_2(byte[] var1) {
      this.break_ = var1;
   }

   public rcM_2(List<Byte> var1) {
      this(class_(var1));
   }

   @Override
   public int size() {
      return this.break_.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcM_2 && Arrays.equals(this.break_, ((rcM_2)var1).break_);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[B;");

      for (int var2 = 0; var2 < this.break_.length; var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.break_[var2]).append('B');
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.break_);
   }

   @Override
   public void clear() {
      this.break_ = new byte[0];
   }

   public rch_3 class_(int var1, rch_3 var2) {
      byte var3 = this.break_[var1];
      this.break_[var1] = var2.private_();
      return rch_3.class_(var3);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeInt(this.break_.length);
      var1.write(this.break_);
   }

   private static byte[] class_(List<Byte> var0) {
      byte[] var1 = new byte[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Byte var3 = (Byte)var0.get(var2);
         var1[var2] = var3 == null ? 0 : var3;
      }

      return var1;
   }

   public rch_3 class_(int var1) {
      return rch_3.class_(this.break_[var1]);
   }

   @Override
   public byte class_() {
      return 7;
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("B").class_(catch_);
      rVi_1 var4 = new rgN_2("[").class_(var3).break_(";");

      for (int var5 = 0; var5 < this.break_.length; var5++) {
         rVi_1 var6 = new rgN_2(String.valueOf(this.break_[var5])).class_(case_);
         var4.break_(" ").class_(var6).class_(var3);
         if (var5 != this.break_.length - 1) {
            var4.break_(",");
         }
      }

      var4.break_("]");
      return var4;
   }

   @Override
   public boolean class_(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.break_[var1] = ((rcK_2)var2).private_();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rcv_3<rcM_2> break_() {
      return class_;
   }

   @Override
   public boolean break_(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.break_ = ArrayUtils.add(this.break_, var1, ((rcK_2)var2).private_());
         return true;
      } else {
         return false;
      }
   }

   public rch_3 break_(int var1) {
      byte var2 = this.break_[var1];
      this.break_ = ArrayUtils.remove(this.break_, var1);
      return rch_3.class_(var2);
   }

   public void break_(int var1, rch_3 var2) {
      this.break_ = ArrayUtils.add(this.break_, var1, var2.private_());
   }

   @Override
   public byte throws_() {
      return 1;
   }

   public byte[] protected_() {
      return this.break_;
   }
}
