package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmi_3 {
   private static byte[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static boolean[] id_throws;

   public rdn_3 id_byte() {
      return (rdn_3)this.id_class[id_protected[15]];
   }

   public rrmi_3() {
      this.id_implements();
      Integer var5 = Integer.valueOf(id_break[5]);
      this.id_class[id_protected[10]] = var5;
      rdb_3 var6 = rdy_3.id_class;
      this.id_class[id_protected[11]] = var6;
      rdn_3 var7 = rdn_3.id_break;
      this.id_class[id_protected[12]] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return id_throws[2];
      } else if (!(var1 instanceof rrmi_3 var2)) {
         return id_throws[3];
      } else if (!var2.id_class(this)) {
         return id_throws[4];
      } else if (this.id_break() != var2.id_break()) {
         return id_throws[5];
      } else {
         rdb_3 var3 = this.id_protected();
         rdb_3 var4 = var2.id_protected();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            rdn_3 var5 = this.id_byte();
            rdn_3 var6 = var2.id_byte();
            return (var5 == null ? var6 == null : var5.equals(var6)) ? id_throws[8] : id_throws[7];
         } else {
            return id_throws[6];
         }
      }
   }

   @Override
   public String toString() {
      return "SavedItemData(savedSlot=" + this.id_break() + ", savedItem=" + this.id_protected() + ", savedStack=" + this.id_byte() + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = id_break[6];
      int var2 = id_throws[9];
      var2 = var2 * id_break[7] + this.id_break();
      rdb_3 var3 = this.id_protected();
      var2 = var2 * id_break[8] + (var3 == null ? id_break[9] : var3.hashCode());
      rdn_3 var4 = this.id_byte();
      return var2 * id_break[10] + (var4 == null ? id_break[11] : var4.hashCode());
   }

   public boolean id_class() {
      return this.id_class[id_protected[3]] != id_break[0] && (rdb_3)this.id_class[id_protected[4]] != rdy_3.id_class ? id_throws[0] : id_throws[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 85, 102, -52, 126, 67, 81, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class(Object var1) {
      return var1 instanceof rrmi_3;
   }

   public void id_class(rdn_3 var1) {
      this.id_class[id_protected[18]] = var1;
   }

   public void id_class(rdn_3 var1, int var2) {
      Integer var7 = var2;
      this.id_class[id_protected[0]] = var7;
      rdb_3 var8 = var1.id_break();
      this.id_class[id_protected[1]] = var8;
      rdn_3 var9 = var1.id_implements();
      this.id_class[id_protected[2]] = var9;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6652828080369116964L;
   }

   public int id_class(boolean var1, String... var2) {
      if (!this.id_class()) {
         return id_break[1];
      } else {
         HashSet var3 = new HashSet();
         var3.add(id_byte[0]);
         if (var2 != null && var2.length > 0) {
            var3.addAll(Arrays.asList(var2));
         }

         int var4 = rrfY_2.id_class((rdn_3)this.id_class[id_protected[5]], (rdb_3)this.id_class[id_protected[6]], var3);
         return var1 ? (var4 >= 0 && var4 < id_break[2] ? var4 + id_break[3] : var4) : var4;
      }
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_class[id_protected[16]] = var6;
   }

   public void id_class(rdb_3 var1) {
      this.id_class[id_protected[17]] = var1;
   }

   public int id_break() {
      return (Integer)this.id_class[id_protected[13]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1996420802;
   }

   public void id_throws() {
      Integer var5 = Integer.valueOf(id_break[4]);
      this.id_class[id_protected[7]] = var5;
      rdb_3 var6 = rdy_3.id_class;
      this.id_class[id_protected[8]] = var6;
      rdn_3 var7 = rdn_3.id_break;
      this.id_class[id_protected[9]] = var7;
   }

   private static void id_finally() {
      id_byte = new String[]{new String("Damage")};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void id_case() {
      id_break = new byte[]{-1, -1, 9, 36, -1, -1, 59, 59, 59, 43, 59, 43, 3};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[12]];
         Object[] var1 = this.id_class;
         var1[id_throws[10]] = Integer.valueOf(id_throws[11]);
      }
   }

   public rdb_3 id_protected() {
      return (rdb_3)this.id_class[id_protected[14]];
   }

   private static void id_private() {
      id_throws = new boolean[]{true, false, true, false, false, false, false, false, true, true, false, false};
   }
}
