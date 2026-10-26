package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjD_2 implements Cloneable {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;

   public String id_byte() {
      return (String)this.id_class[id_break[18]];
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, 25, 22, 115, 63, 21, 13, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrjD_2(String var1, eX_2 var2, String var3) {
      this.id_throws();
      this.id_class[id_break[0]] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrjD_2 var2 = (rrjD_2)var1;
         return Objects.equals((String)this.id_class[id_break[8]], (String)var2.id_class[id_break[9]])
               && Objects.equals((String)this.id_class[2], (String)var2.id_class[2])
            ? true
            : id_byte[4];
      } else {
         return id_byte[2];
      }
   }

   @Override
   public String toString() {
      return (String)this.id_class[id_break[14]]
         + " | X: "
         + (int)((eX_2)this.id_class[1]).id_class()
         + " Y: "
         + (int)((eX_2)this.id_class[1]).id_break()
         + " Z: "
         + (int)((eX_2)this.id_class[1]).id_byte();
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[2];
      var10000[id_byte[5]] = (String)this.id_class[id_break[12]];
      var10000[1] = (String)this.id_class[2];
      return Objects.hash(var10000);
   }

   public void id_class(eX_2 var1) {
      this.id_class[1] = var1;
   }

   public rrjD_2 id_class() {
      try {
         return (rrjD_2)super.clone();
      } catch (CloneNotSupportedException var2) {
         return new rrjD_2((String)this.id_class[id_break[5]], (eX_2)this.id_class[1], (String)this.id_class[2]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1875300324;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1649271334732665355L;
   }

   public void id_class(String var1) {
      this.id_class[id_break[21]] = var1;
   }

   public boolean id_break(String var1) {
      return (String)this.id_class[2] == null ? true : ((String)this.id_class[2]).equals(var1);
   }

   public eX_2 id_break() {
      return (eX_2)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_protected = new byte[]{2, 3};
   }

   private static void id_case() {
      id_break = new short[]{0, 1, 2, 2, 2, 0, 1, 2, 0, 0, 2, 2, 0, 2, 0, 1, 1, 1, 0, 1, 2, 0, 1, 2};
   }

   public void id_protected(String var1) {
      this.id_class[2] = var1;
   }

   public String id_protected() {
      return (String)this.id_class[2];
   }

   private static void id_private() {
      id_byte = new boolean[]{true, true, false, true, false, false, true};
   }
}
