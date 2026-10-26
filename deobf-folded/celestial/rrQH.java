package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrQH extends vm_3 {
   private static byte[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;
   public Object[] id_class;

   public rrQH(rgP_2 var1, vm_3 var2, vm_3 var3) {
      super(var1);
      this.id_package();
      this.id_class[id_case[0]] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, -25, -39, 21, -96, 6, -122, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7217574025071726421L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -338405534;
   }

   private static void id_finally() {
      id_case = new short[]{0, 1, 2, 3, 2, 1, 0};
   }

   private void id_package() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[2] = id_catch[0];
         var1[3] = id_catch[1];
      }
   }

   @Override
   public void id_private() {
      this.id_package();
      super.id_private();
      if ((Boolean)this.id_class[2] && (Boolean)this.id_class[3]) {
         this.id_volatile();
      }
   }

   private static void id_final() {
      id_catch = new boolean[2];
   }

   @Override
   public void id_volatile() {
      this.id_package();
      super.id_volatile();
      id_import.id_break(this.id_class[2] ? (vm_3)this.id_class[1] : (vm_3)this.id_class[id_case[6]]);
   }

   private static void id_native() {
      id_throws = new byte[]{4, 2, 3};
   }

   @Override
   public void v_() {
      super.v_();
   }
}
