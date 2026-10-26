package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNF {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   public List<rrNA> id_byte() {
      return (List<rrNA>)this.id_class[id_protected[14]];
   }

   public rrNF(rrNW var1, rrNd_1 var2) {
      this.id_protected();
      ArrayList var7 = new ArrayList();
      this.id_class[id_protected[0]] = var7;
      this.id_class[id_protected[1]] = var2;
      rrNL var9 = (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_protected[2]];
      this.id_class[id_protected[3]] = var9;
      ((List)this.id_class[id_protected[4]]).add(new rrNn_1(var1));
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_break[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNF var2 = (rrNF)var1;
         return Objects.equals((rrNd_1)this.id_class[id_protected[7]], (rrNd_1)var2.id_class[id_protected[8]])
               && (rrNL)this.id_class[id_protected[9]] == (rrNL)var2.id_class[id_protected[10]]
            ? id_break[2]
            : id_break[3];
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_byte[0]];
      var10000[id_break[4]] = (rrNd_1)this.id_class[id_protected[11]];
      var10000[id_break[5]] = (rrNL)this.id_class[id_protected[12]];
      return Objects.hash(var10000);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 176594816;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{90, 1, -41, -104, 26, -2, -71, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrNL var1) {
      this.id_class[id_protected[5]] = var1;

      for (rrNA var3 : (List)this.id_class[id_protected[6]]) {
         var3.id_class(this);
      }
   }

   public rrNL id_class() {
      return (rrNL)this.id_class[id_protected[15]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5227389519647535236L;
   }

   public rrNd_1 id_break() {
      return (rrNd_1)this.id_class[id_protected[13]];
   }

   private static void id_throws() {
      id_byte = new byte[]{2, 3};
   }

   private static void id_catch() {
      id_break = new boolean[]{true, false, true, false, false, true};
   }

   private static void id_case() {
      id_protected = new short[]{1, 0, 0, 2, 1, 2, 1, 0, 0, 2, 2, 0, 2, 0, 1, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }
}
