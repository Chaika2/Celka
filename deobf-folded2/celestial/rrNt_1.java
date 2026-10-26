package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNt_1 extends rrNw_1 {
   private static short[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;

   public rrNV id_byte() {
      this.id_finally();
      return (rrNV)this.id_class[0];
   }

   public rrNt_1(rdn_3 var1) {
      super(var1);
      this.id_finally();
   }

   public rrNt_1(rdn_3 var1, String var2, int var3) {
      super(var1, var2, var3);
      this.id_finally();
   }

   public rrNt_1(rJY var1, String var2, int var3) {
      super(var1, var2, var3);
      this.id_finally();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-40, -24, -73, 12, -18, 117, 37, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrNV var1) {
      this.id_finally();
      this.id_class[0] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4165677108383829384L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -446287462;
   }

   public void id_class(List<rrNt_1> var1) {
      this.id_finally();
      this.id_class[1] = var1;
   }

   public List<rJY> id_class() {
      this.id_finally();
      return (List<rJY>)this.id_class[2];
   }

   public void id_break(List<rJY> var1) {
      this.id_finally();
      this.id_class[2] = var1;
   }

   public List<rrNt_1> id_break() {
      this.id_finally();
      return (List<rrNt_1>)this.id_class[1];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_implements() {
      id_protected = new byte[]{3};
   }

   private static void id_private() {
      id_byte = new short[]{0, 1, 2, 0, 1, 2};
   }
}
