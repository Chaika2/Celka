package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Pf_1 {
   private static short[] shortsc81ab00368b8322fb29ceba592eaabc7;
   private static byte[] bytesc81ab00368b8322fb29ceba592eaabc7;
   public static Object[] staticFieldsc81ab00368b8322fb29ceba592eaabc7;
   private static boolean[] booleansc81ab00368b8322fb29ceba592eaabc7;
   public Object[] fieldsc81ab00368b8322fb29ceba592eaabc7;
   private static String[] stringsc81ab00368b8322fb29ceba592eaabc7;

   private static void id_byte() {
      stringsc81ab00368b8322fb29ceba592eaabc7 = new String[]{
         new String("ANARCHY"), new String("an"), new String("GRIEF"), new String("grief"), new String("HUB"), new String("hub")
      };
   }

   private Pf_1(String var3) {
      this.id_protected();
      this.fieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[3]] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7301198556421369123L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 172970651;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, -121, -108, -6, 82, 125, -118, 92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.fieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[2]];
   }

   public boolean id_break() {
      return this != (Pf_1)staticFieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[1]]
         ? booleansc81ab00368b8322fb29ceba592eaabc7[0]
         : booleansc81ab00368b8322fb29ceba592eaabc7[1];
   }

   private static void id_throws() {
      bytesc81ab00368b8322fb29ceba592eaabc7 = new byte[]{3, 2, 2, 2, 4, 3, 5};
   }

   private static void id_catch() {
      shortsc81ab00368b8322fb29ceba592eaabc7 = new short[]{4, 2, 0, 0, 0, 1, 2};
   }

   private static void id_case() {
      booleansc81ab00368b8322fb29ceba592eaabc7 = new boolean[]{true, false, false, true, false, false, true, true, true};
   }

   private void id_protected() {
      if (this.fieldsc81ab00368b8322fb29ceba592eaabc7 == null) {
         this.fieldsc81ab00368b8322fb29ceba592eaabc7 = new Object[booleansc81ab00368b8322fb29ceba592eaabc7[8]];
         Object[] var1 = this.fieldsc81ab00368b8322fb29ceba592eaabc7;
      }
   }

   private static void id_private() {
      Object[] var0 = new Object[]{
         new Pf_1(stringsc81ab00368b8322fb29ceba592eaabc7[1]),
         new Pf_1(stringsc81ab00368b8322fb29ceba592eaabc7[3]),
         new Pf_1(stringsc81ab00368b8322fb29ceba592eaabc7[5]),
         null,
         null
      };
      var0[3] = new Pf_1[]{(Pf_1)var0[0], (Pf_1)var0[1], (Pf_1)var0[2]};
      var0[4] = new Pf_1[]{(Pf_1)var0[0], (Pf_1)var0[1], (Pf_1)var0[2]};
      staticFieldsc81ab00368b8322fb29ceba592eaabc7 = var0;
   }
}
