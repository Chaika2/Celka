package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrte_3 {
   public Object[] id_class;
   private static short[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;

   public static rrti_3 id_byte() {
      return new rrti_3();
   }

   public rrte_3(rrti_3 var1) {
      this.id_implements();
      Pattern var6 = (Pattern)var1.id_class[id_break[0]];
      this.id_class[id_break[1]] = var6;
      List var7 = (List)var1.id_class[id_break[2]];
      this.id_class[id_break[3]] = var7;
      rrta_3 var8 = (rrta_3)var1.id_class[id_break[4]];
      this.id_class[id_break[5]] = var8;
      String var9 = (String)var1.id_class[id_break[6]];
      this.id_class[id_break[7]] = var9;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, -24, -68, -77, 18, -93, 55, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.id_class[id_break[13]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -678139722;
   }

   public static rrte_3 id_class(Pattern var0) {
      return new rrti_3().id_class(var0).id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6933898524958402093L;
   }

   public rrtU_2 id_break(String var1) {
      if ((Pattern)this.id_class[id_break[8]] != null && !((Pattern)this.id_class[id_break[9]]).matcher(var1).matches()) {
         return rrtU_2.id_class(id_byte[0]);
      } else {
         for (rrwr_3 var3 : (List)this.id_class[id_break[10]]) {
            rrtU_2 var4 = var3.id_break(var1);
            if (!var4.id_byte()) {
               return var4;
            }
         }

         return rrtU_2.id_class();
      }
   }

   public Pattern id_break() {
      return (Pattern)this.id_class[id_break[12]];
   }

   public rrta_3 id_throws() {
      return (rrta_3)this.id_class[id_break[11]];
   }

   private static void id_catch() {
      id_byte = new String[]{new String("")};
   }

   private static void id_case() {
      id_protected = new byte[]{4};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }

   public List<rrwr_3> id_protected() {
      return (List<rrwr_3>)this.id_class[id_break[14]];
   }

   private static void id_private() {
      id_break = new short[]{1, 1, 3, 3, 0, 0, 2, 2, 1, 1, 3, 0, 1, 2, 3};
   }
}
