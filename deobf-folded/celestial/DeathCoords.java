package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DeathCoords extends Module {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;

   public DeathCoords() {
      super(id_break[0], id_break[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   private String id_this() {
      String var1 = id_break[5];
      int var2 = 1;

      while (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_throws[4]]).id_protected(var1)) {
         String var10000 = id_break[6];
         Object[] var10001 = new Object[1];
         var10001[id_byte[7]] = ++var2;
         var1 = String.format(var10000, var10001);
      }

      return var1;
   }

   private void id_class(String var1, rja_3 var2) {
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[1]]).id_class(new rrtd_3(this.id_final(), var1, 5000));
      rVi_1 var3 = rgv_3.id_class(
         rrfu_3.id_break((Module)this).id_class(rgF_2.GRAY).id_break(var1).id_class(new rgN_2(id_break[4]).id_class(rgF_2.RED)),
         new rgl_3(() -> this.id_class(var2))
      );
      rrfu_3.id_class(var3);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8789248249881075358L;
   }

   private void id_class(rja_3 var1) {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_throws[3]])
         .id_class(new rrjD_2(this.id_this(), var1.id_else(), rrfp_3.id_throws()), true);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1069388033;
   }

   @EventTarget
   public void id_class(rrAG var1) {
      rja_3 var2 = var1.id_class().id_finally();
      String var10000 = id_break[2];
      Object[] var10001 = new Object[3];
      var10001[id_byte[0]] = var2.b_();
      var10001[1] = var2.c_();
      var10001[2] = var2.d_();
      String var3 = String.format(var10000, var10001);
      var10000 = id_break[3];
      var10001 = new Object[1];
      var10001[id_byte[3]] = var3;
      String var4 = String.format(var10000, var10001);
      this.id_class(var4, var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, 18, 8, -24, 82, 85, 30, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_throws = new short[]{4, 0, 5000, 0, 0};
   }

   private static void id_else() {
      id_break = new String[]{
         new String("Death Coords"),
         new String("Отображает координаты вашей\nсмерти"),
         new String("X: %d Y: %d Z: %d"),
         new String("Ваши координаты смерти: %s"),
         new String(" (Нажмите, чтобы создать точку)"),
         new String("Точка смерти"),
         new String("Точка смерти %d")
      };
   }

   private static void id_new() {
      id_protected = new byte[]{3, 2};
   }

   private static void id_super() {
      id_byte = new boolean[]{false, true, true, false, true, true, true, false};
   }
}
