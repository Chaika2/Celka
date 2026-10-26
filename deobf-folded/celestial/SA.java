package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SA {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new byte[]{3};
   }

   public SA(SL var1) {
      this.id_protected();
      ST var6 = new ST(var1);
      this.id_class[id_break[0]] = var6;
      SH var7 = new SH(var1);
      this.id_class[1] = var7;
      Sy_1 var8 = new Sy_1(var1);
      this.id_class[2] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, 19, 50, 118, -95, -107, 75, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8213477524900685627L;
   }

   public Optional<Sv_1> id_class() {
      rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[1];
      if (var1 != null) {
         return switch (((int[])Sn_1.id_class[id_break[4]])[var1.ordinal()]) {
            case 1 -> Optional.of((ST)this.id_class[id_break[5]]);
            case 2, 3 -> Optional.of((SH)this.id_class[1]);
            case 4 -> Optional.of((Sy_1)this.id_class[2]);
            default -> Optional.empty();
         };
      } else {
         return Optional.empty();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2113712183;
   }

   private static void id_break() {
      id_break = new short[]{0, 1, 2, 1, 0, 0, 1, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }
}
