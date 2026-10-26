package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAA extends Om_1 {
   private static short[] id_byte;
   private static byte[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;
   private static boolean[] id_throws;

   public rrAA() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6374671208483873368L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 44, -120, 24, 38, -11, -122, 110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAA id_class(rym_3<rdn_3> var0, rpm_3 var1) {
      ((rrAA)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      rrAA var10000 = (rrAA)id_class[id_byte[2]];
      rdb_3 var7 = ((rdn_3)var0.id_break()).id_break();
      var10000.id_break[id_byte[3]] = var7;
      ((rrAA)id_class[id_byte[4]]).id_break[id_byte[5]] = var1;
      ((rrAA)id_class[id_byte[6]]).id_class(id_throws[0]);
      return (rrAA)id_class[id_byte[7]];
   }

   public rym_3<rdn_3> id_class() {
      this.id_private();
      return (rym_3<rdn_3>)this.id_break[id_byte[8]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -964565279;
   }

   public rdb_3 id_break() {
      this.id_private();
      return (rdb_3)this.id_break[id_byte[9]];
   }

   private static void id_throws() {
      id_protected = new byte[]{3};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrAA()};
      id_class = var0;
   }

   private static void id_implements() {
      id_throws = new boolean[]{false, false, true};
   }

   public rpm_3 id_protected() {
      this.id_private();
      return (rpm_3)this.id_break[id_byte[10]];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[0]];
         Object[] var1 = this.id_break;
      }
   }
}
