package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzK_2 extends rrzA_2 {
   private static byte[] id_protected;
   private static long[] id_throws;
   public Object[] id_byte;
   private static short[] id_case;
   private static boolean[] id_catch;

   public rrzK_2(rrzf_3 var1, rrzY_2 var2) {
      super(var2.id_class[id_case[0]] > id_throws[0] ? (int)((Long)var2.id_class[id_case[1]]).longValue() : id_case[2], id_catch[0]);
      this.id_private();
      this.id_byte[id_case[3]] = var1;
      this.id_byte[id_case[4]] = var2;
      if ((Long)var2.id_class[id_case[5]] == id_throws[1]) {
         Long var9 = System.currentTimeMillis();
         var2.id_class[id_case[6]] = var9;
      }

      if ((Integer)var2.id_class[id_case[7]] == id_protected[0]) {
         Integer var10 = (Integer)var1.id_break[id_case[8]];
         var2.id_class[id_case[9]] = var10;
      }

      Integer var11 = Integer.valueOf(id_protected[1]);
      var2.id_class[id_case[10]] = var11;
      if (((rrzC_2)var1.id_break[id_case[11]]).id_class()) {
         Integer var12 = (Integer)var2.id_class[id_case[12]] | id_case[13];
         var2.id_class[id_case[14]] = var12;
      }
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 971816897;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5717085891434347488L;
   }

   @Override
   public void close() throws IOException {
      this.id_private();
      super.id_break();

      try {
         if (this.isOpen()) {
            try (OutputStream var1 = ((rrzf_3)this.id_byte[id_case[15]]).id_break((rrzY_2)this.id_byte[id_case[16]])) {
               var1.write(this.id_class());
            }

            super.close();
            return;
         }
      } finally {
         super.id_byte();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, -90, -23, -26, -104, -118, -24, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_catch = new boolean[1];
   }

   private static void id_catch() {
      id_throws = new long[]{0L, -1L};
   }

   private static void id_case() {
      id_case = new short[]{12, 12, 8192, 1, 0, 7, 7, 6, 10, 6, 4, 2, 4, 2048, 4, 1, 0};
   }

   private static void id_protected() {
      id_protected = new byte[]{-1, 8, 2};
   }

   private void id_private() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_protected[2]];
         Object[] var1 = this.id_byte;
      }
   }
}
