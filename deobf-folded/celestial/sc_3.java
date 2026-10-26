package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sc_3 implements rz_3 {
   private static short[] id_byte;
   private static String[] id_protected;
   public Object[] id_break;
   private static byte[] id_throws;
   private static boolean[] id_case;
   private static double[] id_catch;

   @Override
   public boolean id_byte() {
      return ((boolean[])this.id_break[id_byte[2]])[id_case[0]];
   }

   public sc_3(sN_2 var1, boolean[] var2, C_case var3) {
      this.id_extends();
      this.id_break[id_byte[0]] = var2;
      this.id_break[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, -25, -40, -67, -105, 97, -110, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3840941602236639511L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -136541320;
   }

   @Override
   public String id_class() {
      return id_protected[0];
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      ((C_case)this.id_break[1]).id_new().id_class();
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
   }

   private static void id_finally() {
      id_catch = new double[1];
   }

   @Override
   public boolean id_catch() {
      return true;
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   @Override
   public double id_case() {
      return id_catch[0];
   }

   private static void id_implements() {
      id_case = new boolean[]{false, true};
   }

   @Override
   public void id_protected() {
   }

   private static void id_private() {
      id_throws = new byte[]{2};
   }

   private static void id_volatile() {
      id_protected = new String[]{new String("Pause/Resume Commands")};
   }

   private static void id_native() {
      id_byte = new short[]{0, 1, 0, 1, 1};
   }
}
