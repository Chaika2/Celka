package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryP extends rryB {
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static double[] id_throws;
   private static long[] id_case;

   @Override
   public rfl_3 id_byte() {
      this.id_int();
      return (rfl_3)this.id_class[1];
   }

   private void id_int() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[5] = 0L;
      }
   }

   public rryP(Sz_1 var1, rfl_3 var2) {
      this.id_int();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      rjU_2 var9 = ((rfl_3)this.id_class[1]).id_case();
      this.id_class[2] = var9;
      rdn_3 var10 = new rdn_3(rdy_3.Jd);
      this.id_class[3] = var10;
      String var11 = ((Sz_1)this.id_class[0]).id_byte() + " пласт";
      this.id_class[4] = var11;
      Long var12 = ((rfl_3)this.id_class[1]).id_byte() <= 2.0
         ? ((Sz_1)this.id_class[0]).id_break().getAsLong()
         : ((Sz_1)this.id_class[0]).id_protected().getAsLong();
      this.id_class[5] = var12;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{116, -64, 12, -48, 69, -66, 60, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4783319154897070753L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1897164488;
   }

   @Override
   public rjU_2 id_class() {
      this.id_int();
      return (rjU_2)this.id_class[2];
   }

   @Override
   public rdn_3 id_break() {
      this.id_int();
      return (rdn_3)this.id_class[3];
   }

   @Override
   public long id_throws() {
      this.id_int();
      return (Long)this.id_class[5];
   }

   @Override
   public String id_case() {
      this.id_int();
      return (String)this.id_class[4];
   }

   private static void id_continue() {
      id_throws = new double[]{2.0};
   }

   private static void id_new() {
      id_byte = new byte[]{6, 5};
   }

   private static void id_package() {
      id_protected = new short[]{0, 1, 1, 2, 3, 0, 4, 1, 0, 0, 5, 1, 4, 5, 0, 2, 3};
   }

   private static void id_super() {
      id_case = new long[1];
   }

   public Sz_1 id_protected() {
      this.id_int();
      return (Sz_1)this.id_class[0];
   }
}
