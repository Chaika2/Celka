package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ex_1 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static String[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_protected = new String[]{new String("help"), new String("help")};
   }

   Ex_1(C_interface var1, String var2, sS_2 var3) {
      this.id_catch();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_throws = new short[]{0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 2, 0, 0, 2, 0, 1, 2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5129902981880732907L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 632551811;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 123, 78, 75, -65, 102, 94, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new byte[]{3};
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true, false, true, false};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   void id_case() {
      LinkedList var1 = ((sS_2)this.id_class[2]).id_byte();

      try {
         if (!((C_interface)this.id_class[id_throws[4]]).id_case() && !var1.isEmpty()) {
            String var2 = ((C_import)var1.get(id_byte[0])).id_break().toLowerCase();
            if (var2.equals(id_protected[0])) {
               C_interface var10000 = (C_interface)this.id_class[id_throws[5]];
               rVi_1[] var10001 = new rVi_1[id_byte[1]];
               var10001[id_byte[2]] = ((C_interface)this.id_class[id_throws[6]]).id_class();
               var10000.id_class(var10001);
               return;
            }
         }

         x_1 var5 = ((C_interface)this.id_class[id_throws[7]]).id_byte();
         if (var5 == null) {
            ((C_interface)this.id_class[id_throws[8]]).id_class((String)this.id_class[id_throws[9]], (sS_2)this.id_class[id_throws[10]]);
         } else {
            var5.id_class((C_interface)this.id_class[id_throws[11]], var1);
         }
      } catch (Throwable var4) {
         Object var3 = var4 instanceof m_1 ? (m_1)var4 : new u_1(var4);
         ((m_1)var3).id_class((C_interface)this.id_class[0], var1);
      }
   }

   Stream<String> id_protected() {
      try {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[id_byte[3]];
         var10001[id_byte[4]] = id_protected[1];
         Stream var1 = var10000.id_break(var10001).id_class(((sS_2)this.id_class[id_throws[13]]).id_implements()).id_protected();
         Stream var2 = ((C_interface)this.id_class[id_throws[14]]).id_break((String)this.id_class[id_throws[15]], (sS_2)this.id_class[id_throws[16]]);
         return Stream.concat(var2, var1);
      } catch (Throwable var3) {
         return Stream.empty();
      }
   }
}
