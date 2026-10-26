package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PI {
   public static Object[] id_class;
   private static boolean[] id_byte;
   public Object[] id_break;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static short[] id_case;

   private static void id_byte() {
      id_case = new short[]{0, 3, 0, 1, 0, 1};
   }

   public PI(Pf_1 var1, String var2) {
      this.id_private();
      this.id_break[id_case[4]] = var1;
      this.id_break[1] = var2;
   }

   static {
      ntfClinit();
   }

   public Pf_1 id_class() {
      return (Pf_1)this.id_break[id_case[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1157381242;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, 44, -117, 102, 126, -25, 91, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3938501422209975708L;
   }

   public String id_break() {
      return (String)this.id_break[1];
   }

   public static PI id_break(String var0) {
      if (rql_3.id_break(var0)) {
         return null;
      } else {
         Matcher var1 = ((Pattern)id_class[id_case[0]]).matcher(var0);
         if (var1.find()) {
            String var2 = var1.group(1);
            String var3 = var1.group(2);
            Pf_1[] var4 = (Pf_1[])Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[3];
            int var5 = var4.length;

            for (int var6 = id_byte[1]; var6 < var5; var6++) {
               Pf_1 var7 = var4[var6];
               if (var7.id_class().equalsIgnoreCase(var2)) {
                  return new PI(var7, var3);
               }
            }
         }

         return null;
      }
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false, false, true};
   }

   private static void id_catch() {
      id_throws = new byte[]{2, 2};
   }

   private static void id_case() {
      id_protected = new String[]{new String("(an|grief|hub)(\\d*)")};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{Pattern.compile(id_protected[0], 0)};
      id_class = var0;
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }
}
