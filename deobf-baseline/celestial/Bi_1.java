package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bi_1 extends Bn_1 implements By_1 {
   public Object[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_case;

   public Bi_1() {
      super(id_protected[0], (Pattern[])Bl_1.id_class[id_case[0]]);
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4251921814201771696L;
   }

   @Override
   public String id_class() {
      this.id_catch();
      return (Sr_1)this.id_byte[id_case[4]] == null ? null : ((Sr_1)this.id_byte[id_case[5]]).id_class();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1671928312;
   }

   @Override
   public void id_throws(String var1) {
      this.id_catch();
      super.id_throws(var1);
      Sr_1 var6 = Sr_1.id_break(var1);
      this.id_byte[id_case[1]] = var6;
      if ((Sr_1)this.id_byte[id_case[2]] != null) {
         this.id_protected(((Sr_1)this.id_byte[id_case[3]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_finally() {
      id_throws = new boolean[]{true};
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 56, 36, -99, -63, 40, 37, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_catch() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_throws[0]];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_implements() {
      id_case = new short[]{17, 0, 0, 0, 0, 0};
   }

   private static void id_private() {
      id_protected = new String[]{new String("Загадочный маяк")};
   }
}
