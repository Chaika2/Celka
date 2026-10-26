package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class t_1 extends Om_1 {
   private static byte[] id_byte;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_protected;
   private static boolean[] id_throws;

   public t_1() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public void id_class(w_1 var1) {
      this.id_private();
      this.id_break[id_protected[12]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3027554824261916388L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 663355300;
   }

   public void id_class(PX var1) {
      this.id_private();
      this.id_break[id_protected[13]] = var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 125, 44, -8, 59, 96, -70, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public PX id_class() {
      this.id_private();
      return (PX)this.id_break[id_protected[11]];
   }

   public static t_1 id_class(w_1 var0, PX var1) {
      ((t_1)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      ((t_1)id_class[id_protected[2]]).id_break[id_protected[3]] = var1;
      ((t_1)id_class[id_protected[4]]).id_class(id_throws[0]);
      return (t_1)id_class[id_protected[5]];
   }

   public t_1 id_break(w_1 var1) {
      PX var2 = this.id_byte() ? ((cb_3)id_import.id_class[id_protected[6]]).id_goto() : ((cb_3)id_import.id_class[id_protected[7]]).rO();
      t_1 var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[8]]).id_finally().id_class(id_class(var1, var2));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[9]]).id_class(var3);
      return var3;
   }

   public w_1 id_break() {
      this.id_private();
      return (w_1)this.id_break[id_protected[10]];
   }

   private static void id_throws() {
      id_byte = new byte[]{2};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new t_1()};
      id_class = var0;
   }

   private static void id_case() {
      id_throws = new boolean[]{false, false, true};
   }

   private static void id_protected() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 57, 57, 0, 0, 0, 1, 0, 1};
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
      }
   }
}
