package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFK {
   public Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static String[] id_case;
   public static Object[] id_break;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public rrFK() {
      this.id_throws();
      rgP_2 var5 = rgP_2.id_byte(id_case[0]);
      this.id_class[id_throws[0]] = var5;
      rrFD var6 = (rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[id_throws[1]];
      this.id_class[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 204323302;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, -86, -7, 31, -49, 30, -13, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7327561169185998678L;
   }

   public static rrFK id_class(rrFD var0, rgP_2 var1) {
      ((rrFK)id_break[id_throws[3]]).id_class[id_throws[4]] = var1;
      ((rrFK)id_break[id_throws[5]]).id_class[1] = var0;
      return (rrFK)id_break[id_throws[7]];
   }

   public rrFD id_class() {
      return (rrFD)this.id_class[1];
   }

   public static void id_class(rrFD var0, rgP_2 var1, rud_3 var2) {
      rrFK var3 = id_class(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[8]]).id_finally().id_class(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[9]]).id_class(var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[10]]).id_byte().id_class(var3);
      rrfp_3.id_break(var0 == (rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[id_throws[11]] ? rrfp_3.id_break() : null, var2);
      rrfc_3.id_class();
   }

   public rgP_2 id_break() {
      return (rgP_2)this.id_class[id_throws[12]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_case = new String[]{new String("")};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrFK()};
      id_break = var0;
   }

   private static void id_protected() {
      id_throws = new short[]{0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1};
   }

   private static void id_private() {
      id_protected = new boolean[]{false, true};
   }
}
