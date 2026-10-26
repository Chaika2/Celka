package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MS implements PP, Ps_1 {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_throws;

   @Override
   public rjG_2 id_byte() {
      return Ph_1.id_class(this.id_catch(), this.id_protected(), this.id_native().id_case());
   }

   private static void id_int() {
      id_throws = new short[]{0, 57, 0, 56, 0};
   }

   public MS(C_class var1) {
      this.id_continue();
      this.id_class[id_throws[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 308757507;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6484411511757351161L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, -1, 72, 88, -99, -110, 43, -93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public QY id_throws() {
      return b_;
   }

   @Override
   public cb_3 id_catch() {
      return (cb_3)b_.id_class[id_throws[1]];
   }

   @Override
   public rYB id_case() {
      return (gm_3)b_.id_class[id_throws[3]];
   }

   private void id_continue() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_new() {
      id_break = new boolean[]{true};
   }

   @Override
   public C_return id_package() {
      return C_throws.id_class().id_break().id_implements().id_class();
   }

   @Override
   public PX id_protected() {
      return ((C_class)this.id_class[id_throws[4]]).id_private().id_protected().orElseGet(() -> Ps_1.super.id_protected());
   }

   @Override
   public PE id_native() {
      return (Ms_1)Ms_1.staticFields347bd646f08b343d83dca157cd270e07[id_throws[2]];
   }
}
